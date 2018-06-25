/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.felipe.form;

import br.com.felipe.singleton.SApresentacao;
import br.edu.felipe.objeto.Apresentacao;
import javax.swing.JOptionPane;

/**
 *
 * @author SATC
 */
public class FrmAvaliacao extends javax.swing.JFrame {

    Apresentacao apr = SApresentacao.getInstance().getApresentacoes().get(SApresentacao.getInstance().getApresentacoes().size());

    public FrmAvaliacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnApr = new javax.swing.JButton();
        BtnReq = new javax.swing.JButton();
        BtnJurad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Avaliação");

        BtnApr.setText("Detalhes da Apresentação");
        BtnApr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAprActionPerformed(evt);
            }
        });

        BtnReq.setText("Adicionar Requisito");
        BtnReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReqActionPerformed(evt);
            }
        });

        BtnJurad.setText("Adicionar Jurado");
        BtnJurad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJuradActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(BtnApr)
                    .addComponent(BtnReq)
                    .addComponent(BtnJurad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(BtnApr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnReq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnJurad)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAprActionPerformed
        JOptionPane.showMessageDialog(this, SApresentacao.getInstance().getApresentacoes().get(SApresentacao.getInstance().getApresentacoes().size()).toString());


    }//GEN-LAST:event_BtnAprActionPerformed

    private void BtnReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReqActionPerformed
        FrmRequisito newreq = new FrmRequisito();
        newreq.setVisible(true);
    }//GEN-LAST:event_BtnReqActionPerformed

    private void BtnJuradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJuradActionPerformed
FrmJurados frmjur = new FrmJurados();
frmjur.setVisible(true);
    }//GEN-LAST:event_BtnJuradActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAvaliacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApr;
    private javax.swing.JButton BtnJurad;
    private javax.swing.JButton BtnReq;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
