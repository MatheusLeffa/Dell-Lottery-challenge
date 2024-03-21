package com.dell.lottery.service;

import com.dell.lottery.model.BetModel;
import lombok.Getter;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Matheus Leffa Hilbert
 */
public class BetRecorderTM extends AbstractTableModel {
    @Getter
    private List<BetModel> betsList = new ArrayList<>();
    private final String[] TABLE_COLUMNS = {"Nome", "CPF", "Aposta", "ID aposta"};
    private Integer betId = 1000;

    // Salva a aposta na lista de aposta "betsList".
    public void saveBet(BetModel betModel) throws RuntimeException {
        if (isBetDuplicated(betModel)) {
            throw new RuntimeException("Esta aposta já foi registrada neste CPF!");
        }
        betModel.setBetID(betId++);
        betsList.add(betModel);
        fireTableDataChanged();
    }

    // Valida se a aposta já existe registrada no mesmo CPF.
    private boolean isBetDuplicated(BetModel betModel) {
        for (BetModel bet : betsList) {
            if (betModel.getCpf().equals(bet.getCpf()) && betModel.getChosenNumbers().equals(bet.getChosenNumbers())) {
                return true;
            }
        }
        return false;
    }

    // Apaga a lista de apostas, e reseta o betId para 1000.
    public void resetBetsList() {
        betId = 1000;
        betsList.clear();
        fireTableDataChanged();
    }

    // Abaixo métodos implementados da interface "Table Model", que esta classe herdou da "AbstractTableModel".
    // Precisamos destes métodos para implementar as tabelas (JTable) no Java Swing (GUI).
    @Override
    public int getRowCount() {
        return betsList.size();
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
