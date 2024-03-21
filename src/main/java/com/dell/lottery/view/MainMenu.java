package com.dell.lottery.view;

import com.dell.lottery.service.BetRecorderTM;

import javax.swing.*;

/**
 * @author Matheus Leffa Hilbert
 */
public class MainMenu extends javax.swing.JFrame {
    private final BetRecorderTM BET_RECORDER;

    // Construtor. Cria o JFrame MainMenu, cria a instância do objeto BetRecorderTM e a atribui ao Table Model da tabela de apostas.
    public MainMenu() {
        initComponents();
        BET_RECORDER = new BetRecorderTM();
        tb_Bets.setModel(BET_RECORDER);
    }

    /**
     * Esse método gera a GUI. Ele é implementado pelo .form criado no NetBeans para criar a interface visual do usuário.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Bets = new javax.swing.JTable();
        btnExecutarSorteio = new javax.swing.JButton();
        btnApostar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnResetApostas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Loteria Dell");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("$$$  Loteria Dell  $$$");
        jLabel1.setToolTipText("");

        tb_Bets.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_Bets.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Nome", "CPF", "Aposta", "ID Aposta"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_Bets);
        if (tb_Bets.getColumnModel().getColumnCount() > 0) {
            tb_Bets.getColumnModel().getColumn(1).setPreferredWidth(25);
            tb_Bets.getColumnModel().getColumn(2).setPreferredWidth(30);
            tb_Bets.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        btnExecutarSorteio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnExecutarSorteio.setForeground(new java.awt.Color(255, 255, 0));
        btnExecutarSorteio.setText("Executar Sorteio!");
        btnExecutarSorteio.setToolTipText("Executa o sorteio e apuração dos vencedores.");
        btnExecutarSorteio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarSorteioActionPerformed(evt);
            }
        });

        btnApostar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnApostar.setForeground(new java.awt.Color(255, 255, 0));
        btnApostar.setText("Apostar!");
        btnApostar.setToolTipText("Vai para a página de cadastro de apostas.");
        btnApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApostarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setText("Apostas Realizadas");

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("Fecha o programa.");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnResetApostas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnResetApostas.setText("Resetar Apostas");
        btnResetApostas.setToolTipText("Apaga a lista de apostas realizadas.");
        btnResetApostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetApostasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnApostar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(123, 123, 123)
                                .addComponent(btnExecutarSorteio)
                                .addGap(35, 35, 35))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addGap(124, 124, 124))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnResetApostas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(252, 252, 252)
                                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1))
                                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnApostar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                        .addComponent(btnExecutarSorteio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnResetApostas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método do botão "Apostar!", ele abre a tela de cadastro de apostas.
    private void btnApostarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        BetCreationScreen betCreationScreen = new BetCreationScreen(this, BET_RECORDER);
        betCreationScreen.setVisible(true);
    }

    // Método do botão "ExecutarSorteio", ele só executa a fase de sorteio se a lista de apostas não estiver vazia e
    // após confirmação do usuário. E Abre a janela do sorteio.
    private void btnExecutarSorteioActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (BET_RECORDER.getBetsList().isEmpty()) {
                throw new RuntimeException("Deve haver apostas registradas para seguir para a fase de sorteio!");
            }
            if (confirmationDialog("Quer seguir para o sorteio e apuração dos vencedores?", "Confirmação")) {
                PrizeScreen prizeScreen = new PrizeScreen(this, BET_RECORDER);
                this.setVisible(false);
                prizeScreen.setVisible(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método do botão "X" de fechar o menu principal, ele confirma o fechamento do programa.
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        if (confirmationDialog("Tem certeza que quer finalizar o programa?", "Quer sair?")) {
            System.exit(0);
        }
    }

    // Método do botão "Sair" de fechar a aplicação, ele confirma o fechamento do programa.
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        if (confirmationDialog("Tem certeza que quer finalizar o programa?", "Quer sair?")) {
            System.exit(0);
        }
    }

    // Método do botão "Resetar apostas", ele limpa a lista de apostas.
    private void btnResetApostasActionPerformed(java.awt.event.ActionEvent evt) {
        BET_RECORDER.resetBetsList();
    }

    // Abre uma janela de confirmação, com mensagem e titulo como parâmetros.
    private boolean confirmationDialog(String question, String title) {
        int confirmation = JOptionPane.showConfirmDialog(this, question, title, JOptionPane.YES_NO_OPTION);
        return confirmation == JOptionPane.YES_OPTION;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApostar;
    private javax.swing.JButton btnExecutarSorteio;
    private javax.swing.JButton btnResetApostas;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Bets;
    // End of variables declaration//GEN-END:variables
}
