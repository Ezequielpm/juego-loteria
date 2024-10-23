/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorMenuPrincipal;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ezequielpena
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    ControladorMenuPrincipal objControladorMenuPrincipal;
    FondoPanel fondo = new FondoPanel();
    public MenuPrincipal() {
//        this.setContentPane(fondo);
        initComponents();
        objControladorMenuPrincipal = new ControladorMenuPrincipal(this);
//        this.setLocationRelativeTo(this);
        
//        this.setBounds(0, 0, 800, 600);
//        this.jPanel1.setBounds(0, 0, 800, 600);
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
        jPanel3 = new javax.swing.JPanel();
        botonPlay = new javax.swing.JButton();
        botonProfile = new javax.swing.JButton();
        botonSettings = new javax.swing.JButton();
        botonAbout = new javax.swing.JButton();
        botonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setSize(new java.awt.Dimension(800, 600));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        botonPlay.setBackground(new java.awt.Color(255, 255, 51));
        botonPlay.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        botonPlay.setText("Play");
        botonPlay.setBorder(null);
        botonPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPlay.setFocusTraversalKeysEnabled(false);
        botonPlay.setFocusable(false);

        botonProfile.setBackground(new java.awt.Color(255, 255, 51));
        botonProfile.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        botonProfile.setText("Profile");
        botonProfile.setBorder(null);
        botonProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonProfile.setFocusable(false);

        botonSettings.setBackground(new java.awt.Color(255, 255, 51));
        botonSettings.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        botonSettings.setText("Settings");
        botonSettings.setBorder(null);
        botonSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSettings.setFocusable(false);

        botonAbout.setBackground(new java.awt.Color(255, 255, 51));
        botonAbout.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        botonAbout.setText("About us");
        botonAbout.setBorder(null);
        botonAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAbout.setFocusable(false);

        botonExit.setBackground(new java.awt.Color(255, 255, 51));
        botonExit.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        botonExit.setText("Exit");
        botonExit.setBorder(null);
        botonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonExit.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(botonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(botonPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(botonProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(botonSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(botonAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(botonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @param args the command line arguments
     */
    
    /*Agregar opcion de actualizar cartas, es decir que sea dinamico*/
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonAbout;
    public javax.swing.JButton botonExit;
    public javax.swing.JButton botonPlay;
    public javax.swing.JButton botonProfile;
    public javax.swing.JButton botonSettings;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel{
        private Image imagen;
    @Override
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("/clases/imagen/pngegg.png")).getImage();
        g.drawImage(imagen, 0, 0, 500,500,this);
        setOpaque(false);
        super.paint(g);
    }
   }

}
