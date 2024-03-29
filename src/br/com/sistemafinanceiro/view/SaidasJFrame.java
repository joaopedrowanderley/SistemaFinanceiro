/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemafinanceiro.view;

import br.com.sistemafinanceiro.dao.SaidasDAO;
import br.com.sistemafinanceiro.model.Saidas;
import br.com.sistemafinanceiro.util.MenssagensUtil;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joão pedro
 */
public class SaidasJFrame extends javax.swing.JFrame {
    
    Saidas saidaSelecionada = new Saidas(); 
    
    

    public Saidas getSaidaSelecionada() {
        return saidaSelecionada;
    }

    public void setSaidaSelecionada(Saidas saidaSelecionada) {
        this.saidaSelecionada = saidaSelecionada;
    }
    SaidasDAO dao = new SaidasDAO(); 
    
    public SaidasJFrame() {
        initComponents();
        setProperties();
    }
    private void setProperties(){
        //menuIdioma.setText(MensagensUtil.getString("msg.menu.idioma"));
        labelTitulo.setText(MenssagensUtil.getString(MenssagensUtil.MSG_TITULO_SAIDAS));
        buttonInserir.setText(MenssagensUtil.getString(MenssagensUtil.MSG_BUTTON_INSERIR));
        buttonEditar.setText(MenssagensUtil.getString(MenssagensUtil.MSG_BUTTON_EDITAR));
        buttonExcluir.setText(MenssagensUtil.getString(MenssagensUtil.MSG_BUTTON_EXCLUIR));
        preencherTabela(null);
    }
    /*SaidasJFrame(InnicioJFrame aThis) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSaidas = new javax.swing.JTable();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setText("SAIDAS");

        tableSaidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableSaidas);

        buttonEditar.setText("EDITAR");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonExcluir.setText("REMOVER");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonInserir.setText("INSERIR");
        buttonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(buttonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(376, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(253, Short.MAX_VALUE)
                    .addComponent(buttonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        buttonEditar.getAccessibleContext().setAccessibleName("editar");
        buttonEditar.getAccessibleContext().setAccessibleDescription("");
        buttonExcluir.getAccessibleContext().setAccessibleName("remover");
        buttonInserir.getAccessibleContext().setAccessibleName("inserir");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirActionPerformed
        // TODO add your handling code here
        SaidaJFrame janela = new SaidaJFrame(this);
         janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }//GEN-LAST:event_buttonInserirActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        // TODO add your handling code here:
        if(saidaSelecionada != null){
            
            SaidaJFrame janela = new SaidaJFrame(this);
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janela.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, MenssagensUtil.getString(MenssagensUtil.MSG_ERRO_EXCLUIR));
        }
    
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // TODO add your handling code here:
        if (saidaSelecionada != null) {
            try {

                int op = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir " + saidaSelecionada.getDescricao(), "Excluir", JOptionPane.OK_CANCEL_OPTION);
                if (op == JOptionPane.OK_OPTION) {
                    dao.remover(saidaSelecionada);
                    preencherTabela(null);
                    saidaSelecionada = null;
                }

            } catch (Exception ex) {

            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma saida!");
        }
        
    }//GEN-LAST:event_buttonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(SaidasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaidasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaidasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaidasJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaidasJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonInserir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableSaidas;
    // End of variables declaration//GEN-END:variables

    void preencherTabela(List<Saidas> param) {
        try {

            List<Saidas> lista = (param == null) ? dao.listar() : param;

            DefaultTableModel model = new DefaultTableModel();

            model.setColumnCount(4);
            model.setColumnIdentifiers(new String[]{
                MenssagensUtil.getString(MenssagensUtil.MSG_TABELA_CODIGO), 
                MenssagensUtil.getString(MenssagensUtil.MSG_TABELA_DESCRICAO), 
                MenssagensUtil.getString(MenssagensUtil.MSG_TABELA_DATA),
                MenssagensUtil.getString(MenssagensUtil.MSG_TABELA_VALOR)});
              model.setRowCount(lista.size());

            for (int i = 0; i < lista.size(); i++) {
                model.setValueAt(lista.get(i).getCodigo(), i, 0);
                model.setValueAt(lista.get(i).getDescricao(), i, 1);
               model.setValueAt(lista.get(i).getData(), i, 2); 
                model.setValueAt(lista.get(i).getValor(), i, 3);
                
            }

            tableSaidas.setModel(model);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void tableSaidasMouseClicked(java.awt.event.MouseEvent evt) {                                           

        // retorna a linha da tabela onde o clique ocorreu
        int row = tableSaidas.rowAtPoint(evt.getPoint());
        // retorna o código do cliente selecionado
        int codigo = (int) tableSaidas.getModel().getValueAt(row, 0);

        try {
            saidaSelecionada = dao.buscar(codigo);

            System.out.println(saidaSelecionada);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
