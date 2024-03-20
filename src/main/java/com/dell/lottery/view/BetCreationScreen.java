/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dell.lottery.view;

import com.dell.lottery.model.BetModel;
import com.dell.lottery.model.BetRecorderTM;
import com.dell.lottery.utils.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.HashSet;

import static com.dell.lottery.utils.Utils.containsNonNumeric;
import static com.dell.lottery.utils.Utils.isOutOfBetRange;

/**
 * @author mathe
 */
public class BetCreationScreen extends javax.swing.JFrame {

    private final MainMenu MAIN_MENU;
    private final BetRecorderTM BET_RECORDER;
    private HashSet<String> listOfNumbers;


    /**
     * Creates new form BetRecorder
     */
    public BetCreationScreen(MainMenu MAIN_MENU, BetRecorderTM BET_RECORDER) {
        initComponents();
        this.MAIN_MENU = MAIN_MENU;
        this.BET_RECORDER = BET_RECORDER;
        listOfNumbers = new HashSet<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCadastroAposta = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnConfirmarAposta = new javax.swing.JButton();
        txtNumerosEscolhidos = new javax.swing.JTextField();
        btnEscolherNumerosAleatorios = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lableNome1 = new javax.swing.JLabel();
        lableNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        btnEscolherNumeros = new javax.swing.JButton();
        btnApagarNumeros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Aposta");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labelCadastroAposta.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        labelCadastroAposta.setForeground(new java.awt.Color(102, 255, 102));
        labelCadastroAposta.setText("Cadastro de aposta");

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar ao Menu");
        btnVoltar.setToolTipText("Volta a tela de menu principal.");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConfirmarAposta.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnConfirmarAposta.setForeground(new java.awt.Color(102, 255, 102));
        btnConfirmarAposta.setText("Cadastrar aposta!");
        btnConfirmarAposta.setToolTipText("Cadastra a aposta acima preenchida.");
        btnConfirmarAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarApostaActionPerformed(evt);
            }
        });

        txtNumerosEscolhidos.setEditable(false);
        txtNumerosEscolhidos.setBackground(new java.awt.Color(126, 215, 126));
        txtNumerosEscolhidos.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtNumerosEscolhidos.setForeground(new java.awt.Color(0, 0, 0));
        txtNumerosEscolhidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumerosEscolhidos.setToolTipText("Lista de números");
        txtNumerosEscolhidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEscolherNumerosAleatorios.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnEscolherNumerosAleatorios.setForeground(new java.awt.Color(255, 255, 0));
        btnEscolherNumerosAleatorios.setText("Surpresinha!");
        btnEscolherNumerosAleatorios.setToolTipText("Escolhe os números aleatoriamente.");
        btnEscolherNumerosAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolherNumerosAleatoriosActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Dados do Apostador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        lableNome1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lableNome1.setText("CPF:");

        lableNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lableNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lableNome)
                                        .addComponent(lableNome1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(txtCpf))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lableNome)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lableNome1)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102))
        );

        btnEscolherNumeros.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnEscolherNumeros.setForeground(new java.awt.Color(255, 255, 0));
        btnEscolherNumeros.setText("Escolher números");
        btnEscolherNumeros.setToolTipText("Escolher os números da aposta.");
        btnEscolherNumeros.setAutoscrolls(true);
        btnEscolherNumeros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEscolherNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolherNumerosActionPerformed(evt);
            }
        });

        btnApagarNumeros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnApagarNumeros.setText("Apagar números");
        btnApagarNumeros.setToolTipText("Apaga todos os números preenchidos.");
        btnApagarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarNumerosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(labelCadastroAposta, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                                .addGap(50, 50, 50))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(btnApagarNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                                .addGap(90, 90, 90))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(txtNumerosEscolhidos, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                .addGap(20, 20, 20))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                                                .addGap(49, 49, 49)
                                                                .addComponent(btnConfirmarAposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnEscolherNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnEscolherNumerosAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelCadastroAposta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnEscolherNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addComponent(btnEscolherNumerosAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addComponent(btnApagarNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addComponent(txtNumerosEscolhidos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(btnConfirmarAposta, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEscolherNumerosAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolherNumerosAleatoriosActionPerformed
        listOfNumbers.clear();

        while (listOfNumbers.size() < 5) {
            listOfNumbers.add(String.valueOf(Math.round(Math.random() * 49) + 1));
        }

        txtNumerosEscolhidos.setText(listOfNumbers.toString());

    }//GEN-LAST:event_btnEscolherNumerosAleatoriosActionPerformed

    private void btnEscolherNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolherNumerosActionPerformed
        String chosenNumber = null;
        int iterator = 1;
        listOfNumbers.clear();

        JOptionPane.showMessageDialog(this, "Digite 5 números de 1 a 50.");
        while (iterator <= 5) {
            try {
                chosenNumber = JOptionPane.showInputDialog(this, listOfNumbers + "\nEscolha o " + iterator + "º número.");
                if (chosenNumber == null) break;
                if (listOfNumbers.contains(chosenNumber)) throw new RuntimeException("Este número já foi informado!");
                if (chosenNumber.isEmpty()) throw new RuntimeException("Deve ser informado pelo menos um número!");
                if (containsNonNumeric(chosenNumber)) throw new RuntimeException("Deve ser informado somente números!");
                if (isOutOfBetRange(chosenNumber)) throw new RuntimeException("Deve ser escolhido números de 1 a 50!");

                listOfNumbers.add(chosenNumber);
                iterator++;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (chosenNumber != null) {
            txtNumerosEscolhidos.setText(listOfNumbers.toString());
        }

    }//GEN-LAST:event_btnEscolherNumerosActionPerformed

    private void btnApagarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarNumerosActionPerformed
        txtNumerosEscolhidos.setText("");
        listOfNumbers.clear();
    }//GEN-LAST:event_btnApagarNumerosActionPerformed

    private void btnConfirmarApostaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnConfirmarApostaActionPerformed
        String name = txtNome.getText();
        String cpf = txtCpf.getText();
        String chosenNumbers = listOfNumbers.toString();

        if (betConfirmation()) {
            try {
                if (name.isEmpty() || !Utils.isValidCpf(cpf) || listOfNumbers.isEmpty()) {
                    throw new RuntimeException("Alguns dos campos do formulário não foram preenchidos!");
                }

                BetModel betModel = new BetModel(name, cpf, chosenNumbers);
                BET_RECORDER.saveBet(betModel);

                JOptionPane.showMessageDialog(this, "Aposta registrada com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(this, "Aposta não foi registrada.");
            }
        }

    }//GEN-LAST:event_btnConfirmarApostaActionPerformed

    private boolean betConfirmation() {
        int confirmation = JOptionPane.showConfirmDialog(this, "Confirmar o registro da aposta?", "Confirmação", JOptionPane.YES_NO_OPTION);
        return confirmation == JOptionPane.YES_OPTION;
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        MAIN_MENU.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        MAIN_MENU.setVisible(true);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarNumeros;
    private javax.swing.JButton btnConfirmarAposta;
    private javax.swing.JButton btnEscolherNumeros;
    private javax.swing.JButton btnEscolherNumerosAleatorios;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCadastroAposta;
    private javax.swing.JLabel lableNome;
    private javax.swing.JLabel lableNome1;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumerosEscolhidos;
    // End of variables declaration//GEN-END:variables
}
