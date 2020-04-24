/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sgdp.telas;

import br.com.sgdp.dal.ModuloConexao;
import java.sql.*;
import java.util.Date;
import java.text.DateFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author Carla
 */
public class TelaPrincipalCsi extends javax.swing.JFrame {

    Connection conexao = null;

    /**
     * Creates new form TelaPrincipalCsi
     */
    public TelaPrincipalCsi() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSairSistema = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        desktopCsi = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuFuncCadastro = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CSI Sistema de Gerenciamento de Departamento Pessoal");
        setBackground(new java.awt.Color(153, 0, 0));
        setExtendedState(6);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 1050));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSairSistema.setText("Sair do Sistema");
        btnSairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairSistemaActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sgdp/imagens/CSI Technology Logo 111x65.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblData.setForeground(new java.awt.Color(204, 204, 204));
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData.setText("Data");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(btnSairSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lblUsuario)
                .addGap(43, 43, 43)
                .addComponent(lblData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(btnSairSistema)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout desktopCsiLayout = new javax.swing.GroupLayout(desktopCsi);
        desktopCsi.setLayout(desktopCsiLayout);
        desktopCsiLayout.setHorizontalGroup(
            desktopCsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1081, Short.MAX_VALUE)
        );
        desktopCsiLayout.setVerticalGroup(
            desktopCsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu3.setText("Cadastros");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenu1.setText("Funcionário");

        menuFuncCadastro.setText("Cadastro");
        menuFuncCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(menuFuncCadastro);

        jMenuItem5.setText("Cargos");
        jMenu1.add(jMenuItem5);

        jMenuItem4.setText("Funções");
        jMenu1.add(jMenuItem4);

        jMenuItem10.setText("Jornada de Trabalho");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Horários");
        jMenu1.add(jMenuItem11);

        jMenu3.add(jMenu1);

        jMenu2.setText("Empresa");

        jMenuItem6.setText("Cadastro");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Filiais");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Centro de Custo");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Fiscais");
        jMenu2.add(jMenuItem9);

        jMenu3.add(jMenu2);

        jMenuItem1.setText("Sindicato");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Transporte");
        jMenu3.add(jMenuItem2);

        jMenu9.setText("Benefícios");

        jMenuItem12.setText("Vale Transporte");
        jMenu9.add(jMenuItem12);

        jMenuItem13.setText("Vale Alimentação");
        jMenu9.add(jMenuItem13);

        jMenuItem14.setText("Vale Refeição");
        jMenu9.add(jMenuItem14);

        jMenuItem15.setText("Assistência Médica");
        jMenu9.add(jMenuItem15);

        jMenuItem16.setText("Assistência Odontológica");
        jMenu9.add(jMenuItem16);

        jMenu3.add(jMenu9);

        jMenu5.setText("Eventos");
        jMenu5.setEnabled(false);
        jMenu3.add(jMenu5);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Relatório");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu4);

        jMenu7.setText("Ajuda");
        jMenu7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem3.setText("Sobre");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuBar2.add(jMenu7);

        jMenu8.setText("Folha");
        jMenu8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopCsi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktopCsi))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1300, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        //Date data = new Date();
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    private void btnSairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairSistemaActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null, "Tem Certeza que quer sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
    }//GEN-LAST:event_btnSairSistemaActionPerformed

    private void menuFuncCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncCadastroActionPerformed
        // TODO add your handling code here:
        TelaFuncionario cadastro = new TelaFuncionario();
        cadastro.setVisible(true);
        desktopCsi.add(cadastro);
    }//GEN-LAST:event_menuFuncCadastroActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         TelaCadastroEmpresa cadastroemp = new TelaCadastroEmpresa();
         cadastroemp.setVisible(true);
         desktopCsi.add(cadastroemp);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalCsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalCsi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSairSistema;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JDesktopPane desktop1;
    private javax.swing.JDesktopPane desktopCsi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    public static javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem menuFuncCadastro;
    // End of variables declaration//GEN-END:variables
}
