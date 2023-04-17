/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menus;

import Jogos_Mult.Acerte_Numero;
import Jogos_Mult.Forca;
import Jogos_Mult.Impa_Ou_Par;
import Jogos_Mult.Jokenpo;
import Jogos_Mult.Quiz;
import Jogos_Solo.Jogo_Da_Velha;

/**
 *
 * @author Zile
 */
public class Menu_Multplayer extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Multplayer
     */
    public Menu_Multplayer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        mult_menu = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        btn_acertenum = new javax.swing.JToggleButton();
        btn_forca = new javax.swing.JToggleButton();
        btn_quiz = new javax.swing.JToggleButton();
        btn_velha = new javax.swing.JToggleButton();
        btn_jokenpo = new javax.swing.JToggleButton();
        btn_impapar = new javax.swing.JToggleButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 400));
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecione Um Jogo");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mult_menu.setText("Menu");
        mult_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mult_menuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Multplayer");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_acertenum.setText("Acerte o Numero");
        btn_acertenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acertenumActionPerformed(evt);
            }
        });

        btn_forca.setText("Forca");
        btn_forca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forcaActionPerformed(evt);
            }
        });

        btn_quiz.setText("Quiz");
        btn_quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quizActionPerformed(evt);
            }
        });

        btn_velha.setText("Jogo Da Velha");
        btn_velha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_velhaActionPerformed(evt);
            }
        });

        btn_jokenpo.setText("Jokenpo");
        btn_jokenpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jokenpoActionPerformed(evt);
            }
        });

        btn_impapar.setText("Impa Ou Par");
        btn_impapar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_impaparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_forca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_acertenum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_quiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_jokenpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_impapar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_velha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(mult_menu)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(btn_acertenum)
                .addGap(18, 18, 18)
                .addComponent(btn_quiz)
                .addGap(18, 18, 18)
                .addComponent(btn_velha)
                .addGap(18, 18, 18)
                .addComponent(btn_forca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_impapar)
                .addGap(18, 18, 18)
                .addComponent(btn_jokenpo)
                .addGap(18, 18, 18)
                .addComponent(mult_menu)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mult_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mult_menuActionPerformed
        // TODO add your handling code here:

        // fecha a janela atual
        this.dispose();

        // cria e exibe a janela "solo"
        Menu_Principal Menu_Principal = new Menu_Principal();
        Menu_Principal.setVisible(true);
    }//GEN-LAST:event_mult_menuActionPerformed

    private void btn_acertenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acertenumActionPerformed
        Acerte_Numero jogo = new Acerte_Numero();

        // Chame o método iniciarJogo do objeto
        Acerte_Numero.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_btn_acertenumActionPerformed

    private void btn_forcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forcaActionPerformed
        Forca jogo = new Forca();

        // Chame o método iniciarJogo do objeto
        Forca.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_btn_forcaActionPerformed

    private void btn_quizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quizActionPerformed
        // TODO add your handling code here:
        Impa_Ou_Par jogo = new Impa_Ou_Par();

        // Chame o método iniciarJogo do objeto
        Impa_Ou_Par.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_btn_quizActionPerformed

    private void btn_velhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_velhaActionPerformed
        // TODO add your handling code here:
        Jogo_Da_Velha jogo = new Jogo_Da_Velha();

        // Chame o método iniciarJogo do objeto
        Jogo_Da_Velha.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_btn_velhaActionPerformed

    private void btn_jokenpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jokenpoActionPerformed
        // TODO add your handling code here:
        Jokenpo jogo = new Jokenpo();

        // Chame o método iniciarJogo do objeto
        Jokenpo.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_btn_jokenpoActionPerformed

    private void btn_impaparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_impaparActionPerformed
        // TODO add your handling code here:
        Quiz jogo = new Quiz();

        // Chame o método iniciarJogo do objeto
        Quiz.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_btn_impaparActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Multplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Multplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Multplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Multplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Multplayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_acertenum;
    private javax.swing.JToggleButton btn_forca;
    private javax.swing.JToggleButton btn_impapar;
    private javax.swing.JToggleButton btn_jokenpo;
    private javax.swing.JToggleButton btn_quiz;
    private javax.swing.JToggleButton btn_velha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JToggleButton mult_menu;
    // End of variables declaration//GEN-END:variables
}
