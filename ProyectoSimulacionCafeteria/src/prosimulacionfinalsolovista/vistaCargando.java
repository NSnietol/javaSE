/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosimulacionfinalsolovista;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.generadorMixto.Generador;
import logica.generadorMixto.Respuesta;

/**
 *
 * @author NS
 */
public class vistaCargando extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public vistaCargando() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        Class clazz;
        try {
            clazz = Class.forName("com.sun.awt.AWTUtilities");
            Method method = clazz.getMethod("setWindowOpaque", java.awt.Window.class, Boolean.TYPE);
            method.invoke(clazz, this, false);
            
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            
        }
        hilo.start();
       
        
    }
    
    
    
    Thread hilo = new Thread(){
        @Override
        public void run() {
            
            
            
             try {
            Thread.sleep(3500);
        } catch (InterruptedException ex) {
            Logger.getLogger(vistaCargando.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.JDialog.setDefaultLookAndFeelDecorated(true);
        org.jvnet.substance.SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeSilver2007Skin"); // Setencia que aplica el skin Creme de Substance
        org.jvnet.substance.SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSteelBlueTheme"); // Tema 
        tablaCorridas a = new tablaCorridas();
        a.setVisible(true);
        dispose();
            
        }
            
            
            
            };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/ajax-loader.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vistaCargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaCargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaCargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaCargando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                /*  
                javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
                javax.swing.JDialog.setDefaultLookAndFeelDecorated(true);
                org.jvnet.substance.SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlueSteelSkin"); // Setencia que aplica el skin Creme de Substance
                org.jvnet.substance.SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSteelBlueTheme"); // Tema

                 */
                new vistaCargando().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
