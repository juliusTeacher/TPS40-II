package matematica;

import javax.swing.JOptionPane;

public class frmOperaciones extends javax.swing.JFrame {

    public frmOperaciones() {
        initComponents();
        txtResultado.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumero1 = new javax.swing.JLabel();
        lblNumero2 = new javax.swing.JLabel();
        txtNumero1 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operaciones Matemáticas 1.0");

        lblNumero1.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        lblNumero1.setForeground(new java.awt.Color(0, 0, 255));
        lblNumero1.setText("Número 1:");

        lblNumero2.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        lblNumero2.setForeground(new java.awt.Color(204, 0, 51));
        lblNumero2.setText("Número 2:");

        btnSuma.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        btnSuma.setText("+");
        btnSuma.setToolTipText("Suma");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        btnResta.setText("-");
        btnResta.setToolTipText("Resta");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMultiplicacion.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        btnMultiplicacion.setText("*");
        btnMultiplicacion.setToolTipText("Multiplicación");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnDivision.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        btnDivision.setText("/");
        btnDivision.setToolTipText("División");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(153, 153, 0));
        lblResultado.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero1)
                            .addComponent(lblNumero2)
                            .addComponent(lblResultado))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnSuma)
                        .addGap(37, 37, 37)
                        .addComponent(btnResta)
                        .addGap(28, 28, 28)
                        .addComponent(btnMultiplicacion)
                        .addGap(28, 28, 28)
                        .addComponent(btnDivision)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero1)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero2)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuma)
                    .addComponent(btnResta)
                    .addComponent(btnMultiplicacion)
                    .addComponent(btnDivision))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultado)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        if((txtNumero1.getText().equals("")) || (txtNumero2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Digite los números");
            limpiar_txt();
        }
        else{
            float a, b, suma;
            a = Float.parseFloat(txtNumero1.getText());
            b = Float.parseFloat(txtNumero2.getText());
            suma = a + b;
            txtResultado.setText(Float.toString(suma));
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
        if((txtNumero1.getText().equals("")) || (txtNumero2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Digite los números");
            limpiar_txt();
        }
        else{
            float a, b, resta;
            a = Float.parseFloat(txtNumero1.getText());
            b = Float.parseFloat(txtNumero2.getText());
            resta = a - b;
            txtResultado.setText(Float.toString(resta));
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        // TODO add your handling code here:
        if((txtNumero1.getText().equals("")) || (txtNumero2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Digite los números");
            limpiar_txt();
        }
        else{
            float a, b, multiplicacion;
            a = Float.parseFloat(txtNumero1.getText());
            b = Float.parseFloat(txtNumero2.getText());
            multiplicacion = a * b;
            txtResultado.setText(Float.toString(multiplicacion));
        }
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
        if((txtNumero1.getText().equals("")) || (txtNumero2.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Digite los números");
            limpiar_txt();
        }
        else{
            float a, b, division;
            a = Float.parseFloat(txtNumero1.getText());
            b = Float.parseFloat(txtNumero2.getText());
            if(b == 0){
                txtResultado.setText("Error!!!");
            }
            else{
                division = a / b;
                txtResultado.setText(Float.toString(division));
            }
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    /* 
        Función para limpiar las cajas de texto
    */
    
    private void limpiar_txt(){
        txtNumero1.setText(null);
        txtNumero2.setText(null);
        txtNumero1.requestFocus();
    }
    
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
            java.util.logging.Logger.getLogger(frmOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmOperaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}