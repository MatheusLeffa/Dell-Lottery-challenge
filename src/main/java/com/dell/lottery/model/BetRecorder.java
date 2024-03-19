package com.dell.lottery.model;

import lombok.Getter;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class BetRecorder extends AbstractTableModel {
    @Getter
    private static List<BetModel> betsList = new ArrayList<>();
    private final String[] tableColumns = {"Nome", "CPF", "Aposta", "ID aposta"};
    private Integer betId = 1000;


    public void saveBet(BetModel betModel) throws RuntimeException {
        if (isBetDuplicated(betModel)) {
            throw new RuntimeException("Esta aposta já foi registrada.");
        }
        betModel.setBetID(betId++);
        betsList.add(betModel);
        fireTableDataChanged();
    }

    private boolean isBetDuplicated(BetModel betModel) {
        for (BetModel bet : betsList) {
            if (betModel.getCpf().equals(bet.getCpf()) && betModel.getChosenNumbers().equals(bet.getChosenNumbers())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getRowCount() {
        return betsList.size();
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
        BetModel bet = betsList.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> bet.getName();
            case 1 -> bet.getCpf();
            case 2 -> bet.getChosenNumbers();
            case 3 -> bet.getBetID();
            default -> throw new RuntimeException("Index da coluna não existe.");
        };
    }
}
