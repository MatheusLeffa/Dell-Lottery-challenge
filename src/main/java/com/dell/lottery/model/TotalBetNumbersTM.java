package com.dell.lottery.model;

import javax.swing.table.AbstractTableModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalBetNumbersTM extends AbstractTableModel {

    private List<BetModel> betsList;
    private Map<Integer, Integer> betNumbersAmount;
    private Object[][] data;
    private final String[] TABLE_COLUMNS = {"Número", "Quantidade"};


    public TotalBetNumbersTM(List<BetModel> betsList) {
        this.betsList = betsList;
        setBetNumbersAmount();
        setTableData();
        fireTableDataChanged();
    }

    private void setBetNumbersAmount() {
        this.betNumbersAmount = new LinkedHashMap<>();

        for (BetModel bet : betsList) {
            String[] numbersStringArray = (bet.getChosenNumbers()).replaceAll("[^0-9,]", "").split(",");
            for (String numberStr : numbersStringArray) {
                int number = Integer.parseInt(numberStr.trim());
                betNumbersAmount.put(number, betNumbersAmount.getOrDefault(number, 0) + 1);
            }
        }
        orderBetNumbersAmount();
    }

    private void orderBetNumbersAmount() {
        betNumbersAmount = betNumbersAmount.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    private void setTableData() {
        this.data = new Object[betNumbersAmount.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : betNumbersAmount.entrySet()) {
            data[index][0] = entry.getKey();
            data[index][1] = entry.getValue();
            index++;
        }
    }

    @Override
    public int getRowCount() {
        return data.length;
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
        return data[rowIndex][columnIndex];
    }
}
