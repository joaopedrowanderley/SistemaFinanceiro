/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemafinanceiro.view;

import br.com.sistemafinanceiro.dao.SaidasDAO;
import br.com.sistemafinanceiro.model.Saidas;
import br.com.sistemafinanceiro.util.DateUtil;
import br.com.sistemafinanceiro.util.MenssagensUtil;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author joão pedro
 */
public class SaidaJFrame extends javax.swing.JFrame {

    private SaidasJFrame principal ; 
    private SaidasDAO dao = new SaidasDAO();
    //private Saidas saida = new Saidas();
    /*Locale pt = new Locale ("pt", "BR");
    NumberFormat nf = NumberFormat.getInstance (pt);*/
    
    public SaidaJFrame(SaidasJFrame parent) {
        this.principal = parent;
        initComponents();
        preencherDados();
        setProperties();
    }
    private void setProperties(){
        
        labelTitulo.setText(MenssagensUtil.getString(MenssagensUtil.MSG_TITULO_CADASTRARSAIDAS));
        labelDescricao.setText(MenssagensUtil.getString(MenssagensUtil.MSG_TABELA_DESCRICAO));
        labelValor.setText(MenssagensUtil.getString(MenssagensUtil.MSG_TABELA_VALOR));
        labelData.setText(MenssagensUtil.getString(MenssagensUtil.MSG_TABELA_DATA));
        buttonSalvar.setText(MenssagensUtil.getString(MenssagensUtil.MSG_BUTTON_SALVAR));
        buttonCancelar.setText(MenssagensUtil.getString(MenssagensUtil.MSG_BUTTON_CANCELAR));
    }
    private void preencherDados() {
        Saidas selecionada = principal.getSaidaSelecionada();

        if (selecionada != null) {
            labelTitulo.setText("Editar Saidas");
            textDescricao.setText(selecionada.getDescricao());
            textData.setText(DateUtil.dateToString(selecionada.getData()));
        } else {
            labelTitulo.setText("Nova saida");
        }
    }

    /*SaidaJFrame(SaidasJFrame aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        textDescricao = new javax.swing.JTextField();
        textData = new javax.swing.JTextField();
        textValor = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setText("CADASTRAR SAIDAS");

        labelDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDescricao.setText("Descrição");

        labelData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelData.setText("Data");

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelValor.setText("Valor");

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescricao)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelData))
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelValor)
                                .addComponent(textValor)))))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelTitulo)
                .addGap(35, 35, 35)
                .addComponent(labelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(labelValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        try {
             Saidas saida =  principal.getSaidaSelecionada();

            if (saida != null) {
                //saida = new Saidas();
                String descricao = textDescricao.getText();
                Date data = DateUtil.stringToDate(textData.getText());
                float valor = Float.parseFloat(textValor.getText());
                // validar!
                saida.setDescricao(descricao);
                saida.setValor(valor);
                saida.setData(data);
               dao.editar(saida);
                principal.setSaidaSelecionada(null);
                
            } else {
                saida = new Saidas();
                //dao = new SaidasDAO();
                String descricao = textDescricao.getText();
                Date data = DateUtil.stringToDate(textData.getText());
                float valor = Float.parseFloat(textValor.getText());
                // validar!
                saida.setDescricao(descricao);
                saida.setData(data);
                saida.setValor(valor);
                dao.inserir(saida);
                
          }
            principal.preencherTabela(null);
            dispose();
            
      } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, MenssagensUtil.getString(MenssagensUtil.MSG_ERRO_SALVAR));
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(SaidaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaidaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaidaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaidaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaidaJFrame().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTextField textData;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
