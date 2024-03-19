package com.dell.lottery.model;

import lombok.Getter;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class PrizeDraw extends AbstractTableModel {

    @Getter
    private List<BetModel> winnersList;
    private List<Integer> winningNumbers;
    private List<BetModel> betsList;
    private final String[] tableColumns = {"Nome", "CPF", "Aposta", "ID aposta"};

    public PrizeDraw(List<BetModel> betsList) {
        this.betsList = betsList;
        this.winnersList = new ArrayList<>();
        this.winningNumbers = new ArrayList<>();
    }

    public void prizeDraw(){
        do {
            drawWinningNumbers();
        }
    }

    private List<Integer> drawWinningNumbers() {
        this.winnersList = new ArrayList<>();
        int iterator = 0;

        do {
            winnersList.add(String.valueOf(Math.round(Math.random() * 49) + 1));
            iterator--;
        } while ();
    }

    private List<BetModel> findTheWinners(List<BetModel> betsList, List<Integer> winnersNumbers) {
        betsList.contains()
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
