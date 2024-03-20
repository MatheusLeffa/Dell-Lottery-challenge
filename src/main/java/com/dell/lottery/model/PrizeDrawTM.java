package com.dell.lottery.model;

import com.dell.lottery.utils.Utils;
import lombok.Getter;

import javax.swing.table.AbstractTableModel;
import java.text.NumberFormat;
import java.util.*;

@Getter
public class PrizeDrawTM extends AbstractTableModel {

    private Integer prizeValue = 100000;
    private List<BetModel> winnersList;
    private HashSet<Integer> prizeNumbers;
    private List<BetModel> betsList;
    private final String[] TABLE_COLUMNS = {"Nome", "CPF", "Aposta", "  ID aposta"};

    public PrizeDrawTM(List<BetModel> betsList) {
        this.betsList = betsList;
        winnersList = new ArrayList<>();
        prizeNumbers = new HashSet<>();
    }

    public boolean prizeNumbersAndValidation() {
        winnersList.clear();
        prizeNumbers.clear();

        while (winnersList.isEmpty()) {
            if (prizeNumbers.size() < 5) {
                while (prizeNumbers.size() < 5) {
                    prizeNumbers.add(Utils.getRandomPrizeNumber());
                }
            } else if (prizeNumbers.size() < 30) {
                prizeNumbers.add(Utils.getRandomPrizeNumber());
            } else {
                fireTableDataChanged();
                accumulatePrize();
                return false;
            }
            updateWinnersList();
        }
        fireTableDataChanged();
        return true;
    }

    private void updateWinnersList() {
        for (BetModel bet : betsList) {
            HashSet<Integer> betNumbers = Utils.stringToIntegerHashSet(bet.getChosenNumbers());

            if (prizeNumbers.containsAll(betNumbers)) {
                winnersList.add(bet);
            }
        }
    }

    /* Regra de acumulação do prêmio.
    Se não houver vencedores na rodada, será somado no valor do prêmio R$10.000 * o número de apostadores.*/
    private void accumulatePrize() {
        Set<String> cpfUnique = new HashSet<>();

        for (BetModel bet : betsList){
            cpfUnique.add(bet.getCpf());
        }

        this.prizeValue += cpfUnique.size() * 10000;
    }

    public String getPrizeValue() {
        NumberFormat formater = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formater.format(this.prizeValue);
    }

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
