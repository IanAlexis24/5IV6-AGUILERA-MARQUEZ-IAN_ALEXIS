package clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() throws Exception {
        initComponents();
        jTextArea2.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea2.setLineWrap(true);
    }

    SecretKey key = KeyGenerator.getInstance("DES").generateKey();
    
    DES des = new DES(key);
    AES aes = new AES();
    
    byte[] hidden = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(648, 342));
        setMinimumSize(new java.awt.Dimension(648, 342));
        setPreferredSize(new java.awt.Dimension(648, 342));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 190, 100);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(440, 120, 190, 100);

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("CIFRADO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 130, 100, 23);

        jLabel2.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel2.setText("DES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 100, 60, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel3.setText("AES");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 170, 80, 34);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setText("DESCIFRADO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 130, 110, 25);

        jButton3.setBackground(new java.awt.Color(0, 255, 0));
        jButton3.setText("CIFRADO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(210, 200, 100, 25);

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setText("DESCIFRADO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(320, 200, 110, 25);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 250, 190, 40);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("INTRODUCE LA CADENA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 80, 160, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("AQUI APARECERA TU CADENA ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 100, 220, 20);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("iNTRODUCE LA CLAVE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 230, 180, 16);

        jLabel7.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel7.setText("ELIGE EL METODO DE CIFRADO");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 70, 250, 21);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 2, 36)); // NOI18N
        jLabel8.setText("CIFRADOS DES Y AES");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 10, 400, 50);

        jLabel10.setText("Aguilera Márquez Ian");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(500, 240, 150, 16);

        jLabel11.setText("5IV6");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(550, 260, 48, 16);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("QUE QUIERAS CIFRAR");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 100, 150, 18);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/CIFRADOS.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cad = jTextArea1.getText();
        try {
            String encryptedDES = des.encryptDES(cad);
            jTextArea2.setText(encryptedDES);
        } catch (Exception ex) {
            jTextArea2.setText("Debido a un fallo interno, no se pudo encriptar");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String cade = jTextArea1.getText();
        try {
            String decryptedDES = des.decryptDES(cade);
            jTextArea2.setText(decryptedDES);
        } catch (Exception ex) {
            jTextArea2.setText("Debido a un fallo interno, no se pudo desencriptar");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String caden = jTextArea1.getText();
        String llaves = jTextField1.getText();
        try {
            String encryptedAES = aes.encryptAES(llaves, caden);
            jTextArea2.setText(encryptedAES);
            hidden = aes.encryptAESHidden(llaves, caden);
        } catch (Exception ex) {
            jTextArea2.setText("Tu llave debe tener una longitud de 16, 24 o 32 caracteres");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String llavesita = jTextField1.getText();
        try {
            String decryptedAES = aes.decryptAES(llavesita, hidden);
            jTextArea2.setText(decryptedAES);
        } catch (Exception ex) {
            jTextArea2.setText("Tu llave debe tener una longitud de 16, 24 o 32 caracteres");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
