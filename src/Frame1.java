/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mokleters
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        jLabel1 = new javax.swing.JLabel();
        PilihKue = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Harga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BBayar = new javax.swing.JButton();
        BHutang = new javax.swing.JButton();
        Hutang = new javax.swing.JLabel();
        Bayar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Lemon = new javax.swing.JCheckBox();
        Vanila = new javax.swing.JCheckBox();
        Coklat = new javax.swing.JCheckBox();
        Keju = new javax.swing.JCheckBox();
        Kopi = new javax.swing.JCheckBox();
        Mint = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Bahan = new javax.swing.JTextField();
        Jumlah = new javax.swing.JTextField();
        Proses = new javax.swing.JTextField();
        Pemasok = new javax.swing.JTextField();
        TampilBayar = new javax.swing.JLabel();
        TampilHutang = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel1.setText("Cake On Point");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        PilihKue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Donat", "Cupcake", "Bolu", "Brownies" }));
        PilihKue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihKueActionPerformed(evt);
            }
        });
        getContentPane().add(PilihKue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel3.setText("Jumlah");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel5.setText("Harga");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        Harga.setEditable(false);
        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });
        getContentPane().add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 140, -1));

        jLabel6.setText("Pilih Kue");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        BBayar.setText("Bayar");
        BBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBayarActionPerformed(evt);
            }
        });
        getContentPane().add(BBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        BHutang.setText("Hutang");
        BHutang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHutangActionPerformed(evt);
            }
        });
        getContentPane().add(BHutang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        Hutang.setText("Rp. - ");
        getContentPane().add(Hutang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        Bayar.setText("Rp. ");
        getContentPane().add(Bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel10.setText("Nama Pemasok");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        Lemon.setText("Lemon");
        Lemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LemonActionPerformed(evt);
            }
        });
        getContentPane().add(Lemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        Vanila.setText("Vanila");
        Vanila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VanilaActionPerformed(evt);
            }
        });
        getContentPane().add(Vanila, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        Coklat.setText("Coklat");
        Coklat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoklatActionPerformed(evt);
            }
        });
        getContentPane().add(Coklat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        Keju.setText("Keju");
        Keju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KejuActionPerformed(evt);
            }
        });
        getContentPane().add(Keju, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        Kopi.setText("Kopi");
        Kopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KopiActionPerformed(evt);
            }
        });
        getContentPane().add(Kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        Mint.setText("Mint");
        Mint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MintActionPerformed(evt);
            }
        });
        getContentPane().add(Mint, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel11.setText("Varian Rasa");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel13.setText("Proses Pembuatan");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel14.setText("Bahan");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        Bahan.setEditable(false);
        Bahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BahanActionPerformed(evt);
            }
        });
        getContentPane().add(Bahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 140, -1));

        Jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahActionPerformed(evt);
            }
        });
        getContentPane().add(Jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 140, -1));

        Proses.setEditable(false);
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 140, -1));

        Pemasok.setEditable(false);
        Pemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PemasokActionPerformed(evt);
            }
        });
        getContentPane().add(Pemasok, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 140, -1));
        getContentPane().add(TampilBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));
        getContentPane().add(TampilHutang, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 440));

        setBounds(0, 0, 457, 476);
    }// </editor-fold>//GEN-END:initComponents

    private void PilihKueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihKueActionPerformed
        if(PilihKue.getSelectedItem().equals("Donat")){
           Proses.setText(" Digoreng");
           Bahan.setText(" Tepung terigu, Kentang, Gula, Mentega, Susu");
           Pemasok.setText(" Kak Nico ");
           Harga.setText("8000");
       }
        else if(PilihKue.getSelectedItem().equals("Cupcake")){
           Proses.setText(" Dioven");
           Bahan.setText(" Tepung terigu, Gula, Mentega, Telur, Pengembang, Susu");
           Pemasok.setText(" Kak Aji ");
           Harga.setText("10000");
       }
        else if(PilihKue.getSelectedItem().equals("Bolu")){
           Proses.setText(" Dipanggang");
           Bahan.setText(" Tepung terigu, Gula, Mentega, Telur");
           Pemasok.setText(" Kak Jalu ");
           Harga.setText("18000");
        }
        else if(PilihKue.getSelectedItem().equals("Brownies")){
           Proses.setText(" Dikukus");
           Bahan.setText("  Tepung terigu, Gula, Mentega, Telur, Pengembang");
           Pemasok.setText(" Mas Krisna ");
           Harga.setText("25000");
        }
    }//GEN-LAST:event_PilihKueActionPerformed

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaActionPerformed

    private void LemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LemonActionPerformed

    private void VanilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VanilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VanilaActionPerformed

    private void CoklatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoklatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoklatActionPerformed

    private void KejuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KejuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KejuActionPerformed

    private void KopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KopiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KopiActionPerformed

    private void MintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MintActionPerformed

    private void BahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BahanActionPerformed

    private void JumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahActionPerformed

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProsesActionPerformed

    private void PemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PemasokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PemasokActionPerformed

    private void BBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBayarActionPerformed
        int h1 = Integer.parseInt(Harga.getText());
        int h2 = Integer.parseInt(Jumlah.getText());
        int x = h1*h2;

        TampilBayar.setText(String.valueOf(x));
    }//GEN-LAST:event_BBayarActionPerformed

    private void BHutangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHutangActionPerformed
        int h1 = Integer.parseInt(Harga.getText());
        int h2 = Integer.parseInt(Jumlah.getText());
        int x = h1*h2;

        TampilHutang.setText(String.valueOf(x));
    }//GEN-LAST:event_BHutangActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBayar;
    private javax.swing.JButton BHutang;
    private javax.swing.JTextField Bahan;
    private javax.swing.JLabel Bayar;
    private javax.swing.JCheckBox Coklat;
    private javax.swing.JTextField Harga;
    private javax.swing.JLabel Hutang;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JCheckBox Keju;
    private javax.swing.JCheckBox Kopi;
    private javax.swing.JCheckBox Lemon;
    private javax.swing.JCheckBox Mint;
    private javax.swing.JTextField Pemasok;
    private javax.swing.JComboBox<String> PilihKue;
    private javax.swing.JTextField Proses;
    private javax.swing.JLabel TampilBayar;
    private javax.swing.JLabel TampilHutang;
    private javax.swing.JCheckBox Vanila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
