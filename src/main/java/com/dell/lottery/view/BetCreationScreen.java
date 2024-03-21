package com.dell.lottery.view;

import com.dell.lottery.model.BetModel;
import com.dell.lottery.service.BetRecorderTM;
import com.dell.lottery.utils.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author Matheus Leffa Hilbert
 */
public class BetCreationScreen extends javax.swing.JFrame {

    private final MainMenu MAIN_MENU;
    private final BetRecorderTM BET_RECORDER;
    private LinkedHashSet<String> listOfNumbers;


    // Construtor. Cria o JFrame "Cadastro de aposta"
    public BetCreationScreen(MainMenu MAIN_MENU, BetRecorderTM BET_RECORDER) {
        initComponents();
        this.MAIN_MENU = MAIN_MENU;
        this.BET_RECORDER = BET_RECORDER;
        listOfNumbers = new LinkedHashSet<>();
    }

    /**
     * Esse método gera a GUI. Ele é implementado pelo .form criado no NetBeans para criar a interface visual do usuário.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCadastroAposta = new javax.swing.JLabel();
        btnRevisarApostas = new javax.swing.JButton();
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

        btnRevisarApostas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRevisarApostas.setText("Revisar apostas");
        btnRevisarApostas.setToolTipText("Volta a tela de menu principal.");
        btnRevisarApostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarApostasActionPerformed(evt);
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
                                        .addComponent(txtNome)
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
                                                .addComponent(labelCadastroAposta, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                                .addGap(50, 50, 50))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(btnApagarNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(90, 90, 90))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(txtNumerosEscolhidos)
                                                .addGap(20, 20, 20))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnRevisarApostas, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnConfirmarAposta))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnEscolherNumeros)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnEscolherNumerosAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelCadastroAposta, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnEscolherNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                        .addComponent(btnEscolherNumerosAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addComponent(btnApagarNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addComponent(txtNumerosEscolhidos, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRevisarApostas, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                        .addComponent(btnConfirmarAposta, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Método do botão "Surpresinha", ele gera 5 numeros de aposta aleatórios.
    private void btnEscolherNumerosAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {
        listOfNumbers.clear();

        while (listOfNumbers.size() < 5) {
            listOfNumbers.add(String.valueOf(Math.round(Math.random() * 49) + 1));
        }

        txtNumerosEscolhidos.setText(listOfNumbers.toString());

    }

    // Método do botão "Escolher números", ele deixa o usuário escolher os 5 numeros da aposta.
    // Antes de atribuir os números a listOfNumbers ele valida se os valores são válidos.
    private void btnEscolherNumerosActionPerformed(java.awt.event.ActionEvent evt) {
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
                if (Utils.containsNonNumeric(chosenNumber))
                    throw new RuntimeException("Deve ser informado somente números!");
                if (Utils.isNumberStringOutOfBetRange(chosenNumber))
                    throw new RuntimeException("Deve ser escolhido números de 1 a 50!");

                listOfNumbers.add(chosenNumber);
                iterator++;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (chosenNumber != null) {
            txtNumerosEscolhidos.setText(listOfNumbers.toString());
        }

    }

    // Método do botão "apagar numeros", ele os valores da lista "listOfNumbers" e limpa o campo txtNumerosEscolhidos.
    private void btnApagarNumerosActionPerformed(java.awt.event.ActionEvent evt) {
        txtNumerosEscolhidos.setText("");
        listOfNumbers.clear();
    }

    // Método do botão "Confirmar Aposta", ele confirma os valores dos campos do formulário e se é válido o registo da aposta.
    private void btnConfirmarApostaActionPerformed(ActionEvent evt) {
        String name = txtNome.getText();
        String cpf = txtCpf.getText();
        String chosenNumbers = listOfNumbers.toString();

        if (betConfirmation()) {
            try {
                if (name.isEmpty() || !Utils.isValidCpf(cpf) || listOfNumbers.isEmpty()) {
                    throw new RuntimeException("Alguns dos campos do formulário não foram preenchidos!");
                }
                if (!isCpfAvailable(name, cpf)) {
                    throw new RuntimeException("Este CPF já está em uso por outra pessoa!");
                }

                BetModel betModel = new BetModel(name, cpf, chosenNumbers);
                BET_RECORDER.saveBet(betModel);

                JOptionPane.showMessageDialog(this, "Aposta registrada com sucesso!");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage() + "\n", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Abre uma janela confirmando o registro da aposta.
    private boolean betConfirmation() {
        int confirmation = JOptionPane.showConfirmDialog(this, "Confirmar o registro da aposta?", "Confirmação", JOptionPane.YES_NO_OPTION);
        return confirmation == JOptionPane.YES_OPTION;
    }

    // Valida se o CPF esta disponível. A lógica é o CPF ser único.
    private boolean isCpfAvailable(String name, String cpf) {
        for (BetModel bet : BET_RECORDER.getBetsList()) {
            if (cpf.equals(bet.getCpf())) {
                return name.equals(bet.getName());
            }
        }
        return true;
    }

    // Volta para o menu principal pelo botão "RevisarApostas"
    private void btnRevisarApostasActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        MAIN_MENU.setVisible(true);
    }

    // Volta para o menu principal pelo botão "X" de fechar a janela
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        this.dispose();
        MAIN_MENU.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarNumeros;
    private javax.swing.JButton btnConfirmarAposta;
    private javax.swing.JButton btnEscolherNumeros;
    private javax.swing.JButton btnEscolherNumerosAleatorios;
    private javax.swing.JButton btnRevisarApostas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCadastroAposta;
    private javax.swing.JLabel lableNome;
    private javax.swing.JLabel lableNome1;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumerosEscolhidos;
    // End of variables declaration//GEN-END:variables
}
