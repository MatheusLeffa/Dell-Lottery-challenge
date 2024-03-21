package com.dell.lottery.view;

import com.dell.lottery.model.BetModel;
import com.dell.lottery.service.BetRecorderTM;
import com.dell.lottery.service.PrizeDrawTM;
import com.dell.lottery.service.TotalBetNumbersTM;

import javax.swing.*;
import java.util.List;

/**
 * @author Matheus Leffa Hilbert
 */
public class PrizeScreen extends javax.swing.JFrame {

    private final MainMenu MAIN_MENU;
    private final PrizeDrawTM PRIZE_DRAW;
    private final TotalBetNumbersTM TOTAL_BET_NUMBERS;


    // Construtor. Cria o JFrame "Tela de sorteio, atribui o Table Model das tabelas tb_Winners, tb_Bets e tb_TotalBetNumbers.
    public PrizeScreen(MainMenu mainMenu, BetRecorderTM betRecorderTM) {
        initComponents();
        this.MAIN_MENU = mainMenu;
        this.PRIZE_DRAW = new PrizeDrawTM(betRecorderTM.getBetsList());
        this.TOTAL_BET_NUMBERS = new TotalBetNumbersTM(betRecorderTM.getBetsList());
        tb_Bets.setModel(betRecorderTM);
        tb_Winners.setModel(PRIZE_DRAW);
        tb_TotalBetNumbers.setModel(TOTAL_BET_NUMBERS);
    }

    /**
     * Esse método gera a GUI. Ele é implementado pelo .form criado no NetBeans para criar a interface visual do usuário.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumerosSorteados = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_Winners = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_TotalBetNumbers = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnRefazerSorteio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Bets = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Sorteio");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }

            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel4.setText("Números Sorteados");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setText("Total de Números Apostados");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setText("Apostas Vencedoras");

        txtNumerosSorteados.setEditable(false);
        txtNumerosSorteados.setBackground(new java.awt.Color(70, 73, 75));
        txtNumerosSorteados.setColumns(30);
        txtNumerosSorteados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumerosSorteados.setLineWrap(true);
        txtNumerosSorteados.setRows(3);
        txtNumerosSorteados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tb_Winners.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_Winners.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "1", "2", "3", "4"
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
        jScrollPane3.setViewportView(tb_Winners);

        tb_TotalBetNumbers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tb_TotalBetNumbers.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String[]{
                        "Número", "Quantidade"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_TotalBetNumbers);

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar ao Menu");
        btnVoltar.setToolTipText("Volta a tela de menu principal.");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnRefazerSorteio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRefazerSorteio.setText("Refazer o sorteio");
        btnRefazerSorteio.setToolTipText("Realiza o sorteio novamente.");
        btnRefazerSorteio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefazerSorteioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setText("Apostas Realizadas");

        tb_Bets.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb_Bets.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "1", "2", "3", "4"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(140, 140, 140)
                                                                                .addComponent(jLabel5))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(20, 20, 20)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(btnVoltar)
                                                                                                .addGap(174, 174, 174)
                                                                                                .addComponent(btnRefazerSorteio)))))
                                                                .addGap(70, 70, 70))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGap(138, 138, 138)
                                                                                .addComponent(jLabel6))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGap(20, 20, 20)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(txtNumerosSorteados, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2)))
                                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtNumerosSorteados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnVoltar)
                                                        .addComponent(btnRefazerSorteio)))
                                        .addComponent(jScrollPane2))
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método para executar o sorteio/apuração ao abrir a janela de sorteio.
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        executeThePrizeDraw();
    }

    // Método do botão "Refazer Sorteio", ele executa novamente executeThePrizeDraw().
    private void btnRefazerSorteioActionPerformed(java.awt.event.ActionEvent evt) {
        executeThePrizeDraw();
    }

    // Método que realiza os retornos da apuração do sorteio. A lógica do sorteio ocorre no método estático "PRIZE_DRAW.prizeNumbersAndValidation()".
    // Se for localizado um vencedor ele reseta o valor do prêmio com o método estático "PRIZE_DRAW.resetPrizeValue()".
    private void executeThePrizeDraw() {
        if (PRIZE_DRAW.prizeNumbersAndValidation()) {
            txtNumerosSorteados.setText(PRIZE_DRAW.getPrizeNumbers().toString());
            if (PRIZE_DRAW.getWinnersList().size() > 1) {
                JOptionPane.showMessageDialog(this, "Parabéns " + winnersNamesAndCpf() + "!\nVocês ganharam na " + PRIZE_DRAW.getRounds() + "º rodada!\nO prêmio de: " + PRIZE_DRAW.getPrizeValue() + " será divido entre todos os participantes.\nFavor entrar em contato com a Dell para a retirada do prêmio.");
            } else {
                JOptionPane.showMessageDialog(this, "Parabéns " + winnersNamesAndCpf() + "!\nVocê ganhou na " + PRIZE_DRAW.getRounds() + "º rodada!\nVocê recebeu o prêmio de: " + PRIZE_DRAW.getPrizeValue() + " sozinho(a)!\nFavor entrar em contato com a Dell para a retirada do prêmio.");
            }
            PRIZE_DRAW.resetPrizeValue();
        } else {
            txtNumerosSorteados.setText(PRIZE_DRAW.getPrizeNumbers().toString());
            JOptionPane.showMessageDialog(this, "Não houveram vencedores.\nO prêmio acumulou para: " + PRIZE_DRAW.getPrizeValue());
        }
    }

    // Retorna uma String com o nome e CPF dos vencedores. O formato é "Nome (CPF)"
    private String winnersNamesAndCpf() {
        String strNomes = "";
        List<BetModel> betWinners = PRIZE_DRAW.getWinnersList();
        for (BetModel bet : betWinners) {
            if (betWinners.size() > 1) {
                strNomes += (bet.getName() + " (" + bet.getCpf() + "), ");
            } else {
                strNomes += (bet.getName() + " (" + bet.getCpf() + ")");
            }
        }
        return strNomes;
    }

    // Volta para o menu principal pelo botão "Voltar ao Menu"
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        MAIN_MENU.setVisible(true);
    }

    // Volta para o menu principal pelo botão "X" de fechar a janela
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        this.dispose();
        MAIN_MENU.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefazerSorteio;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb_Bets;
    private javax.swing.JTable tb_TotalBetNumbers;
    private javax.swing.JTable tb_Winners;
    private javax.swing.JTextArea txtNumerosSorteados;
    // End of variables declaration//GEN-END:variables
}
