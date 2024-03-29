/*
 * Michael Botros
 * September 24th, 2019
 * This program prompts the user for a desired pizza diameter. It then calculates the costs and displays it and shows a tiny message depending on the pizza size.
 */

/**
 *
 * @author mibot3117
 */
public class putridPizzaFrame extends javax.swing.JFrame {

    /**
     * Creates new form putridPizzaFrame
     */
    public putridPizzaFrame() {
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

        lblTitle1 = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        pizzaPanel = new javax.swing.JPanel();
        lblDiameter = new javax.swing.JLabel();
        txtDiameter = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblTaxes = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();
        lblSubtotalResult = new javax.swing.JLabel();
        lblGrandTotalResult = new javax.swing.JLabel();
        lblTaxesResult = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblResultPhrase = new javax.swing.JLabel();

        lblTitle1.setFont(new java.awt.Font("Rafika", 0, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(0, 102, 0));
        lblTitle1.setText("Mike's Poignant Pizza");

        lblTitle2.setFont(new java.awt.Font("Rafika", 0, 24)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(0, 102, 0));
        lblTitle2.setText("Mike's Poignant Pizza");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pizzaPanel.setBackground(new java.awt.Color(204, 255, 204));

        lblDiameter.setFont(new java.awt.Font("Rafika", 0, 18)); // NOI18N
        lblDiameter.setForeground(new java.awt.Color(0, 102, 0));
        lblDiameter.setText("Pizza Diameter(Cm):");

        txtDiameter.setFont(new java.awt.Font("Rafika", 0, 14)); // NOI18N

        btnCalculate.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 51, 51));
        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Rafika", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 102, 0));
        lblTitle.setText("Mike's Poignant Pizza");

        lblSubtotal.setFont(new java.awt.Font("Rafika", 0, 14)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(255, 51, 51));
        lblSubtotal.setText("Subtotal($):");

        lblTaxes.setFont(new java.awt.Font("Rafika", 0, 14)); // NOI18N
        lblTaxes.setForeground(new java.awt.Color(255, 51, 51));
        lblTaxes.setText("Taxes($):");

        lblGrandTotal.setFont(new java.awt.Font("Rafika", 0, 14)); // NOI18N
        lblGrandTotal.setForeground(new java.awt.Color(255, 51, 51));
        lblGrandTotal.setText("Grand Total($):");

        lblSubtotalResult.setFont(new java.awt.Font("Rafika", 0, 14)); // NOI18N
        lblSubtotalResult.setForeground(new java.awt.Color(255, 51, 51));

        lblGrandTotalResult.setFont(new java.awt.Font("Rafika", 0, 14)); // NOI18N
        lblGrandTotalResult.setForeground(new java.awt.Color(255, 51, 51));

        lblTaxesResult.setFont(new java.awt.Font("Rafika", 0, 14)); // NOI18N
        lblTaxesResult.setForeground(new java.awt.Color(255, 51, 51));

        lblImage.setIcon(new javax.swing.ImageIcon("Y:\\BFV36537_CC2017_2IngredintDough4Ways-FB.jpg")); // NOI18N

        lblResultPhrase.setFont(new java.awt.Font("Rafika", 0, 10)); // NOI18N
        lblResultPhrase.setForeground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout pizzaPanelLayout = new javax.swing.GroupLayout(pizzaPanel);
        pizzaPanel.setLayout(pizzaPanelLayout);
        pizzaPanelLayout.setHorizontalGroup(
            pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pizzaPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pizzaPanelLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(36, 36, 36))
                    .addGroup(pizzaPanelLayout.createSequentialGroup()
                        .addGroup(pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblResultPhrase, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pizzaPanelLayout.createSequentialGroup()
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTaxes)
                                    .addComponent(lblSubtotal)
                                    .addComponent(lblGrandTotal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubtotalResult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGrandTotalResult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTaxesResult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalculate))))
                        .addContainerGap(29, Short.MAX_VALUE))))
            .addGroup(pizzaPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lblDiameter)
                .addGap(18, 18, 18)
                .addComponent(txtDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pizzaPanelLayout.setVerticalGroup(
            pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pizzaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiameter)
                    .addComponent(txtDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pizzaPanelLayout.createSequentialGroup()
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubtotal)
                            .addComponent(lblSubtotalResult, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTaxes)
                            .addComponent(lblTaxesResult, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGrandTotal)
                            .addComponent(lblGrandTotalResult, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblResultPhrase, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pizzaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pizzaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        
        //declaring all constants and variables
        final double DIAMETER1 = 15;
        final double DIAMETER2 = 20;
        final double DIAMETER3 = 40;
        final double PIZZA_LABOR = 0.75;
        final double PIZZA_RENT = 0.99;
        final double DIAMETER_RATE = 0.50;
        final double TAX_RATE = 0.13;
        double taxes;
        double subtotal;
        double grandTotal;
        
        //fetching pizza diameter from the text box in the GUI.
        double diameter = Double.parseDouble(txtDiameter.getText());
        
        //The following statements use comparison operators to determine which message will be displayed depending on the pizza diameter.
        if (diameter >=1 && diameter <= DIAMETER1){
            
            lblResultPhrase.setText("We are going to make you a cute little pizza!");
            
        } else if (diameter > DIAMETER1 && diameter <= DIAMETER2) {
            
            lblResultPhrase.setText("You've discovered an easter egg!");
            
        } else if (diameter > DIAMETER2 && diameter <= DIAMETER3) {
            
            lblResultPhrase.setText("This will be delicious!");
            
        } else if (diameter > DIAMETER3) {
            
            lblResultPhrase.setText("Whoa, big pizza! You might need a truck to get this home!");
            
        }
        
        //calculating the cost to make the pizza
        subtotal = PIZZA_LABOR + PIZZA_RENT + (diameter * DIAMETER_RATE);
        taxes = subtotal * TAX_RATE;
        grandTotal = taxes + subtotal;
        
        //rounding all the final values to be displayed
        subtotal = subtotal * 100;
        subtotal = Math.round(subtotal);
        subtotal = subtotal/100;
        
        taxes = taxes * 100;
        taxes = Math.round(taxes);
        taxes = taxes/100;
        
        grandTotal = grandTotal * 100;
        grandTotal = Math.round(grandTotal);
        grandTotal = grandTotal/100;
        
        //displaying the costs to the user through the GUI
        lblGrandTotalResult.setText(grandTotal + "$");
        lblSubtotalResult.setText(subtotal + "$");
        lblTaxesResult.setText(taxes + "$");
        
    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(putridPizzaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(putridPizzaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(putridPizzaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(putridPizzaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new putridPizzaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel lblDiameter;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblGrandTotalResult;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblResultPhrase;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblSubtotalResult;
    private javax.swing.JLabel lblTaxes;
    private javax.swing.JLabel lblTaxesResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JPanel pizzaPanel;
    private javax.swing.JTextField txtDiameter;
    // End of variables declaration//GEN-END:variables
}
