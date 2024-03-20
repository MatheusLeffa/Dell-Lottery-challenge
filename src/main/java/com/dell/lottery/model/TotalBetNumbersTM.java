package com.dell.lottery.model;

import com.dell.lottery.utils.Utils;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TotalBetNumbersTM extends AbstractTableModel {

    private List<BetModel> betsList;
    private List<Integer> totalBetNumbers;
    private List<Integer> betNumbersAmount;
    private final String[] TABLE_COLUMNS = {"Número", "Quantidade"};


    public TotalBetNumbersTM(List<BetModel> betsList) {
        this.betsList = betsList;
        this.totalBetNumbers = new ArrayList<>();
        this.betNumbersAmount = new ArrayList<>();
        totalBetsNumbers();
        totalBetsNumbersAmount();
        fireTableDataChanged();
    }

    private void totalBetsNumbers() {
        List<Integer> betNumbers = Utils.stringToIntegerList(betsList);
        for (Integer betNumber : betNumbers) {
            if (!totalBetNumbers.contains(betNumber)) {
                totalBetNumbers.add(betNumber);
            }
        }
        System.out.println(totalBetNumbers);
    }

    private void totalBetsNumbersAmount() {
        List<Integer> betNumbers = Utils.stringToIntegerList(betsList);
        int count = 0;

        for (Integer uniqueBetNumber : totalBetNumbers) {
            for (Integer betNumber : betNumbers) {
                if (uniqueBetNumber.equals(betNumber)) {
                    count++;
                }
            }
            betNumbersAmount.add(count);
            count = 0;
        }
        System.out.println(betNumbersAmount);
    }

    @Override
    public int getRowCount() {
        return totalBetNumbers.size();
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
        Integer betNumber = totalBetNumbers.get(rowIndex);
        Integer betNumberOccurrences = betNumbersAmount.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> betNumber;
            case 1 -> betNumberOccurrences;
            default -> throw new RuntimeException("Index da coluna não existe.");
        };
    }
}
