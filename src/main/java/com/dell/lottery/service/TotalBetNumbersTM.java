package com.dell.lottery.service;

import com.dell.lottery.model.BetModel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Matheus Leffa Hilbert
 */
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

    // Atribui ordenadamente todos os números escolhidos nas apostas e a quantidade de suas ocorrências ao LinkedHashMap<Integer, Integer> betNumbersAmount.
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

    // Ordena o Map "betNumbersAmount", ordenando os conjuntos de values iguais de forma decrescente.
    private void orderBetNumbersAmount() {
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(betNumbersAmount.entrySet());

        sortedEntries.sort((entry1, entry2) -> {
            int compareByValue = entry2.getValue().compareTo(entry1.getValue());
            if (compareByValue != 0) {
                return compareByValue;
            } else {
                return entry2.getKey().compareTo(entry1.getKey());
            }
        });

        betNumbersAmount = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            betNumbersAmount.put(entry.getKey(), entry.getValue());
        }
    }

    // Implanta os dados do Map "betNumbersAmount" no Array bi-dimensional de Object "data".
    private void setTableData() {
        this.data = new Object[betNumbersAmount.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : betNumbersAmount.entrySet()) {
            data[index][0] = entry.getKey();
            data[index][1] = entry.getValue();
            index++;
        }
    }

    // Abaixo métodos implementados da interface "Table Model", que esta classe herdou da "AbstractTableModel".
    // Precisamos destes métodos para implementar as tabelas (JTable) no Java Swing (GUI).
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
