/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemafinanceiro.view;

import br.com.sistemafinanceiro.util.MenssagensUtil;
import javax.swing.JFrame;

/**
 *
 * @author joão pedro
 */
public class InnicioJFrame extends javax.swing.JFrame {

    /**
     * Creates new form InnicioJFrame
     */
    public InnicioJFrame() {
        initComponents();
        setProperties();
    }
    private void setProperties(){
        menuIdioma.setText(MenssagensUtil.getString("msg.menu.idioma"));
        labelTitulo.setText(MenssagensUtil.getString(MenssagensUtil.MSG_TITULO_INICIO));
        buttonSaidas.setText(MenssagensUtil.getString(MenssagensUtil.MSG_BUTTON_SAIDAS));
        buttonEntradas.setText(MenssagensUtil.getString(MenssagensUtil.MSG_BUTTON_ENTRADAS));
        buttonFechamento.setText(MenssagensUtil.getString(MenssagensUtil.MSG_BUTTON_FECHAMENTO));
        menuRelatorio.setText(MenssagensUtil.getString(MenssagensUtil.MSG_MENU_RELATORIO));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        labelTitulo = new javax.swing.JLabel();
        buttonSaidas = new javax.swing.JButton();
        buttonEntradas = new javax.swing.JButton();
        buttonFechamento = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuIdioma = new javax.swing.JMenu();
        menuItemptBR = new javax.swing.JMenuItem();
        menuItemenUS = new javax.swing.JMenuItem();
        menuItemesES = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setText("SISTEMA FINANCEIRO");

        buttonSaidas.setText("SAIDAS");
        buttonSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaidasActionPerformed(evt);
            }
        });

        buttonEntradas.setText("ENTRADAS");
        buttonEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntradasActionPerformed(evt);
            }
        });

        buttonFechamento.setText("FECHAMENTO");
        buttonFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFechamentoActionPerformed(evt);
            }
        });

        menuIdioma.setText("IDIOMAS");

        menuItemptBR.setText("pt - BR ");
        menuItemptBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemptBRActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemptBR);

        menuItemenUS.setText("en - US");
        menuItemenUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemenUSActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemenUS);

        menuItemesES.setText("es - ES");
        menuItemesES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemesESActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemesES);

        jMenuBar1.add(menuIdioma);

        menuRelatorio.setText("RELATORIOS");

        jMenuItem5.setText("Saidas");
        menuRelatorio.add(jMenuItem5);

        jMenuItem6.setText("Entradas");
        menuRelatorio.add(jMenuItem6);

        jMenuItem7.setText("Fechamentos");
        menuRelatorio.add(jMenuItem7);

        jMenuBar1.add(menuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(buttonSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(buttonEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(buttonFechamento)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        buttonSaidas.getAccessibleContext().setAccessibleName("saidas");
        buttonFechamento.getAccessibleContext().setAccessibleName("fechamento");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaidasActionPerformed
        // TODO add your handling code here:
        
        SaidasJFrame janela = new SaidasJFrame();
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
        
    }//GEN-LAST:event_buttonSaidasActionPerformed

    private void buttonEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntradasActionPerformed
        // TODO add your handling code here:
        EntradasJFrame janela = new EntradasJFrame();
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }//GEN-LAST:event_buttonEntradasActionPerformed

    private void buttonFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFechamentoActionPerformed
        // TODO add your handling code here:
        FechamentoJFrame janela = new FechamentoJFrame();
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }//GEN-LAST:event_buttonFechamentoActionPerformed

    private void menuItemptBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemptBRActionPerformed
        // TODO add your handling code here:
        MenssagensUtil.setLocale(MenssagensUtil.LOCALE_PT_BR);
        setProperties();
    }//GEN-LAST:event_menuItemptBRActionPerformed

    private void menuItemenUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemenUSActionPerformed
        // TODO add your handling code here:
        MenssagensUtil.setLocale(MenssagensUtil.LOCALE_EN_US);
        setProperties();
    }//GEN-LAST:event_menuItemenUSActionPerformed

    private void menuItemesESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemesESActionPerformed
        // TODO add your handling code here:
        MenssagensUtil.setLocale(MenssagensUtil.LOCALE_ES_ES);
        setProperties();
    }//GEN-LAST:event_menuItemesESActionPerformed

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
            java.util.logging.Logger.getLogger(InnicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InnicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InnicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InnicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InnicioJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEntradas;
    private javax.swing.JButton buttonFechamento;
    private javax.swing.JButton buttonSaidas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JMenu menuIdioma;
    private javax.swing.JMenuItem menuItemenUS;
    private javax.swing.JMenuItem menuItemesES;
    private javax.swing.JMenuItem menuItemptBR;
    private javax.swing.JMenu menuRelatorio;
    // End of variables declaration//GEN-END:variables
}
