/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4miniproject;


import javax.swing.JOptionPane;

public class GassolineCalculation extends javax.swing.JFrame {

    static final double PTT[] = {36.50, 33.24, 41.54, 41.54, 29.34};
    static final double BCP[] = {37.74, 35.24, 42.64, 28.99};
    static final double SHELL[] = {37.34, 35.04, 41.84, 28.20};
    static final double ESSO[] = {37.03, 35.34, 41.55, 29.10};
    
    public GassolineCalculation() {
        initComponents();
    }
    int i=0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdbPTT = new javax.swing.JRadioButton();
        rdbBCP = new javax.swing.JRadioButton();
        rdbShell = new javax.swing.JRadioButton();
        rdbEsso = new javax.swing.JRadioButton();
        cbxCarType = new javax.swing.JComboBox<>();
        cbxOilType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnTax = new javax.swing.JButton();
        btnReceipt = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarTotal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("เติมน้ำมัน");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("เลือกปั้ม");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ประเภทรถ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ประเภทน้ำมัน");

        buttonGroup1.add(rdbPTT);
        rdbPTT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbPTT.setText("ปตท");

        buttonGroup1.add(rdbBCP);
        rdbBCP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbBCP.setText("บางจาก");

        buttonGroup1.add(rdbShell);
        rdbShell.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbShell.setText("เชลล์");

        buttonGroup1.add(rdbEsso);
        rdbEsso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbEsso.setText("เอสโซ่");

        cbxCarType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxCarType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pickup", "Sedan" }));
        cbxCarType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCarTypeActionPerformed(evt);
            }
        });

        cbxOilType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxOilType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasohol95", "Gasohol91", "Benzin91" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("จำนวนเงิน");

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("บาท");

        btnTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTax.setText("พิมพ์ใบกำกับภาษี");
        btnTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxActionPerformed(evt);
            }
        });

        btnReceipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReceipt.setText("พิมพ์ใบเสร็จรับเงิน");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tarTotal.setColumns(20);
        tarTotal.setRows(5);
        jScrollPane2.setViewportView(tarTotal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(rdbPTT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdbBCP)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdbShell)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rdbEsso))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(cbxCarType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTax)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(37, 37, 37)
                                                .addComponent(cbxOilType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnReceipt)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(btnClear)
                                .addGap(97, 97, 97)
                                .addComponent(btnExit)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdbPTT)
                    .addComponent(rdbBCP)
                    .addComponent(rdbShell)
                    .addComponent(rdbEsso))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxCarType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbxOilType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTax)
                    .addComponent(btnReceipt))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
        // TODO add your handling code here:
        i=1;
        String AmoutLen = txtAmount.getText();
        if (AmoutLen.length() > 0) {
            String CarType = (String) cbxCarType.getSelectedItem();
            double OilPrice = 0;
            if (rdbPTT.isSelected()) {
                String Brand = "PTT";
                Camnal(CarType, OilPrice, Brand);
            } else if (rdbBCP.isSelected()) {
                String Brand = "BCP";
                Camnal(CarType, OilPrice, Brand);
            } else if (rdbShell.isSelected()) {
                String Brand = "SHELL";
                Camnal(CarType, OilPrice, Brand);
            } else if (rdbEsso.isSelected()) {
                String Brand = "ESSO";
                Camnal(CarType, OilPrice, Brand);
            }
          
        }
    }//GEN-LAST:event_btnReceiptActionPerformed

    private void btnTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxActionPerformed
           i=0;
        String AmoutLen = txtAmount.getText();
        if (AmoutLen.length() > 0) {
            String CarType = (String) cbxCarType.getSelectedItem();
            double OilPrice = 0;
            if (rdbPTT.isSelected()) {
                String Brand = "PTT";
                Camnal(CarType, OilPrice, Brand);
            } else if (rdbBCP.isSelected()) {
                String Brand = "BCP";
                Camnal(CarType, OilPrice, Brand);
            } else if (rdbShell.isSelected()) {
                String Brand = "SHELL";
                Camnal(CarType, OilPrice, Brand);
            } else if (rdbEsso.isSelected()) {
                String Brand = "ESSO";
                Camnal(CarType, OilPrice, Brand);
            }
        }
    }//GEN-LAST:event_btnTaxActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(rootPane, "Exit?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void cbxCarTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCarTypeActionPerformed
        // TODO add your handling code here:
String CarTypeSe = (String)
cbxCarType.getSelectedItem();
        if (CarTypeSe == "Sedan") {
            cbxOilType.removeItem("Diesel");
            cbxOilType.removeItem("Diesel");
            cbxOilType.removeItem("Gasohol 95");
            cbxOilType.removeItem("Gasohol 91");
            cbxOilType.removeItem("Benzin 91");
            cbxOilType.addItem("Gasohol 95");
            cbxOilType.addItem("Gasohol 91");
            cbxOilType.addItem("Benzin 91");
        }
        if (CarTypeSe == "Pickup") {
            cbxOilType.removeItem("Gasohol 95");
            cbxOilType.removeItem("Gasohol 91");
            cbxOilType.removeItem("Benzin 91");
            cbxOilType.removeItem("Diesel");
            cbxOilType.addItem("Diesel");
            cbxOilType.setSelectedItem("Diesel");
        }

    }//GEN-LAST:event_cbxCarTypeActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tarTotal.setText("");
        cbxCarType.setSelectedItem("Seden");
        cbxOilType.setSelectedItem("Gasohol 95");
        txtAmount.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
     

    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == '.')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAmountKeyTyped

 public void Camnal(String CarType, double OilPrice, String Brand) throws NumberFormatException {
        if (CarType == "Sedan") {
            String OilType = (String) cbxOilType.getSelectedItem();
            if (OilType == "Gasohol 95") {
                if (Brand == "PTT") {
                    OilPrice = PTT[0];
                } else if (Brand == "BCP") {
                    OilPrice = BCP[0];
                } else if (Brand == "SHELL") {
                    OilPrice = SHELL[0];
                } else if (Brand == "ESSO") {
                    OilPrice = ESSO[0];
                }
            } else if (OilType == "Gasohol 91") {
                if (Brand == "PTT") {
                    OilPrice = PTT[1];
                } else if (Brand == "BCP") {
                    OilPrice = BCP[1];
                } else if (Brand == "SHELL") {
                    OilPrice = SHELL[1];
                } else if (Brand == "ESSO") {
                    OilPrice = ESSO[1];
                }
            } else if (OilType == "Benzin 91") {
                if (Brand == "PTT") {
                    OilPrice = PTT[2];
                } else if (Brand == "BCP") {
                    OilPrice = BCP[2];
                } else if (Brand == "SHELL") {
                    OilPrice = SHELL[2];
                } else if (Brand == "ESSO") {
                    OilPrice = ESSO[2];
                }
            }
 Camnal2(OilPrice, Brand, OilType);
        } else if (CarType == "Pickup") {
            String OilType = "Diesel";
            if (Brand == "PTT") {
                OilPrice = PTT[3];
            } else if (Brand == "BCP") {
                OilPrice = BCP[3];
            } else if (Brand == "SHELL") {
                OilPrice = SHELL[3];
            } else if (Brand == "ESSO") {
                OilPrice = ESSO[3];
            }
            Camnal2(OilPrice, Brand, OilType);
        }
 }
     public void Camnal2(double OilPrice, String Brand, String OilType) throws NumberFormatException {
        String AmountString = txtAmount.getText();
        double AmountDouble = Double.valueOf(AmountString);
        double Litre = AmountDouble / OilPrice;
        double AmountPrice = AmountDouble / 1.07;
        double VAT = AmountDouble - AmountPrice;
        double Litre2 = (double) (Math.round(Litre * 100.0) / 100.0);
        double AmountPrice2 = (double) (Math.round(AmountPrice * 100.0) / 100.0);
        double VAT2 = (double) (Math.round(VAT * 100.0) / 100.0);
        if(i==0){tarTotal.setText("                  " + Brand + " Gas Station\n"
                + "                     Tax Invoice\n"
                + "-----------------------------------------------------------\n"
                + OilType + "-E10     " + Litre2 + " Litre     " + AmountDouble + " Baht\n"
                + "\n"
                + "Amount       : " + AmountPrice2 + "\n"
                + "VAT 7%       : " + VAT2 + "\n"
                + "Total Amount  : " + AmountDouble);}
        else if(i==1){
            tarTotal.setText("                  " + Brand + " Gas Station\n"
                + "                     Tax Invoice\n"
                + "-----------------------------------------------------------\n"
                + OilType + "-E10     " + Litre2 + " Litre     " + AmountDouble + " Baht\n");
        }
    }
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
            java.util.logging.Logger.getLogger(GassolineCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GassolineCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GassolineCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GassolineCalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GassolineCalculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnTax;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCarType;
    private javax.swing.JComboBox<String> cbxOilType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbBCP;
    private javax.swing.JRadioButton rdbEsso;
    private javax.swing.JRadioButton rdbPTT;
    private javax.swing.JRadioButton rdbShell;
    private javax.swing.JTextArea tarTotal;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
