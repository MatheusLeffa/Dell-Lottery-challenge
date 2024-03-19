package com.dell.lottery.model;

import com.dell.lottery.utils.Utils;
import lombok.Getter;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Getter
public class PrizeDraw extends AbstractTableModel {

    private List<BetModel> winnersList;
    private HashSet<Integer> winningNumbers;
    private final List<BetModel> betsList;
    private final String[] tableColumns = {"Nome", "CPF", "Aposta", "ID aposta"};

    public PrizeDraw(List<BetModel> betsList) {
        this.betsList = betsList;
        this.winnersList = new ArrayList<>();
        this.winningNumbers = new HashSet<>();
        prizeValidation();
    }

    private void prizeValidation() {
        winningNumbers.clear();

        while (!thereIsWinners()) {
            if (winningNumbers.size() < 5) {
                while (winningNumbers.size() < 5) {
                    winningNumbers.add(Utils.getRandomPrizeNumber());
                }
            } else if (winningNumbers.size() < 30) {
                winningNumbers.add(Utils.getRandomPrizeNumber());
            } else {
                throw new RuntimeException("Não houveram vencedores.");
            }
        }
    }

    private boolean thereIsWinners() {
        for (BetModel bet : betsList) {
            List<Integer> betNumbers = Utils.stringToIntegerList(bet.getChosenNumbers());

            if (!winningNumbers.containsAll(betNumbers)) {
                return false;
            } else {
                winnersList.add(bet);
            }
        }
        return true;
    }

    @Override
    public int getRowCount() {
        return winnersList.size();
    }

    @Override
    public int getColumnCount() {
        return tableColumns.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return tableColumns[columnIndex];
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
