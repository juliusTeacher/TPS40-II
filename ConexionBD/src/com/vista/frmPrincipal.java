package com.vista;

import com.modelo.Usuarios;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {
    
    Usuarios usu;

    public frmPrincipal() {
        initComponents(); 
    }
    
    frmPrincipal(Usuarios usu){
        initComponents();
        setLocationRelativeTo(null);  
        this.usu = usu;
        
        lblRol.setText(usu.getNombre());
        lblTipoRol.setText(usu.getNombre_tipo());    
        
        if(usu.getId_tipo() == 1){
            MnuProductos.setVisible(true);
            MnuInventario.setVisible(true);
        }
        else{
            MnuProductos.setEnabled(false);
            MnuInventario.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRol = new javax.swing.JLabel();
        lblTipoRol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuClientes = new javax.swing.JMenu();
        miRegistroCliente = new javax.swing.JMenuItem();
        MnuProductos = new javax.swing.JMenu();
        miRegistrarProducto = new javax.swing.JMenuItem();
        MnuInventario = new javax.swing.JMenu();
        MnuFacturacion = new javax.swing.JMenu();
        miGenerarFactura = new javax.swing.JMenuItem();
        MnuSalida = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRol.setText("jLabel1");

        lblTipoRol.setText("jLabel2");

        MnuClientes.setText("Clientes");

        miRegistroCliente.setText("Registrar Cliente");
        MnuClientes.add(miRegistroCliente);

        jMenuBar1.add(MnuClientes);

        MnuProductos.setText("Productos");

        miRegistrarProducto.setText("Registrar Producto");
        MnuProductos.add(miRegistrarProducto);

        jMenuBar1.add(MnuProductos);

        MnuInventario.setText("Inventario");
        jMenuBar1.add(MnuInventario);

        MnuFacturacion.setText("Facturación");

        miGenerarFactura.setText("Generar Factura");
        MnuFacturacion.add(miGenerarFactura);

        jMenuBar1.add(MnuFacturacion);

        MnuSalida.setText("Salida");

        miSalir.setText("Salir...");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        MnuSalida.add(miSalir);

        jMenuBar1.add(MnuSalida);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoRol, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(546, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblTipoRol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(306, 306, 306))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"¿Desea salir de la aplicación?", "Salir...", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION){
            frmLogin vista = new frmLogin();
            vista.setVisible(true);
            vista.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }//GEN-LAST:event_miSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnuClientes;
    private javax.swing.JMenu MnuFacturacion;
    private javax.swing.JMenu MnuInventario;
    private javax.swing.JMenu MnuProductos;
    private javax.swing.JMenu MnuSalida;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTipoRol;
    private javax.swing.JMenuItem miGenerarFactura;
    private javax.swing.JMenuItem miRegistrarProducto;
    private javax.swing.JMenuItem miRegistroCliente;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
