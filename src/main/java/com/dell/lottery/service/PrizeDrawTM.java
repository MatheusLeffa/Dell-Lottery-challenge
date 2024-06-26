package com.dell.lottery.service;

import com.dell.lottery.model.BetModel;
import com.dell.lottery.utils.Utils;
import lombok.Getter;

import javax.swing.table.AbstractTableModel;
import java.text.NumberFormat;
import java.util.*;

/**
 * @author Matheus Leffa Hilbert
 */
@Getter
public class PrizeDrawTM extends AbstractTableModel {

    private int rounds;
    private Integer prizeValue = 100000;
    private List<BetModel> winnersList;
    private HashSet<Integer> prizeNumbers;
    private List<BetModel> betsList;
    private final String[] TABLE_COLUMNS = {"Nome", "CPF", "Aposta", "  ID aposta"};

    public PrizeDrawTM(List<BetModel> betsList) {
        this.betsList = betsList;
        this.winnersList = new ArrayList<>();
        this.prizeNumbers = new HashSet<>();
    }

    // Algoritimo do sorteio dos números premiados, e de forma intercambiada é realizado a apuração dos vencedores.
    // É gerado 5 números premiados, apurado os vencedores, e se não houver vencedor, é gerado +1 numero até no máximo 30 números, ou 25 rodadas.
    public boolean prizeNumbersAndValidation() {
        winnersList.clear();
        prizeNumbers.clear();

        while (winnersList.isEmpty()) {
            if (prizeNumbers.size() < 5) {
                while (prizeNumbers.size() < 5) {
                    prizeNumbers.add(getRandomPrizeNumber());
                }
            } else if (prizeNumbers.size() < 30) {
                prizeNumbers.add(getRandomPrizeNumber());
            } else {
                fireTableDataChanged();
                accumulatePrize();
                rounds = prizeNumbers.size() - 5;
                return false;
            }
            updateWinnersList();
        }
        fireTableDataChanged();
        rounds = prizeNumbers.size() - 5;
        return true;
    }

    // Gera um número aleatório entre 1 e 50.
    private int getRandomPrizeNumber() {
        return (int) (Math.round(Math.random() * 49) + 1);
    }

    // Faz a apuração dos vencedores do sorteio.
    private void updateWinnersList() {
        for (BetModel bet : betsList) {
            ArrayList<Integer> betNumbers = Utils.stringNumberToIntegerList(bet.getChosenNumbers());

            if (prizeNumbers.containsAll(betNumbers)) {
                winnersList.add(bet);
            }
        }
        winnersList.sort(Comparator.comparing(BetModel::getName));
    }

    // Algorítimo de acumulação do prêmio.
    // Se não houver vencedores na rodada, será somado no valor do prêmio: 10.000 * o número de apostadores.
    private void accumulatePrize() {
        Set<String> cpfUnique = new HashSet<>();

        for (BetModel bet : betsList) {
            cpfUnique.add(bet.getCpf());
        }
        this.prizeValue += cpfUnique.size() * 10000;
    }

    // Retorna o valor do prêmio, formatado para a moeda Real Brasileiro.
    public String getPrizeValue() {
        NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formater.format(this.prizeValue);
    }

    // Reseta o valor do prêmio para R$ 100.000,00
    public void resetPrizeValue() {
        this.prizeValue = 100000;
    }

    // Abaixo métodos implementados da interface "Table Model", que esta classe herdou da "AbstractTableModel".
    // Precisamos destes métodos para implementar as tabelas (JTable) no Java Swing (GUI).
    @Override
    public int getRowCount() {
        return winnersList.size();
    }

    @Override
    public int getColumnCount() {
        return TABLE_COLUMNS.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return TABLE_COLUMNS[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BetModel winner = winnersList.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> winner.getName();
            case 1 -> winner.getCpf();
            case 2 -> winner.getChosenNumbers();
            case 3 -> winner.getBetID();
            default -> throw new RuntimeException("Index da coluna não existe.");
        };
    }
}
