/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DF_presentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Alian Peralta
 */
public class frm_factura extends javax.swing.JFrame {

    /**
     * Creates new form frm_factura
     */
    public frm_factura() {
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

        panel_factura = new javax.swing.JPanel();
        lbl_nombre_empresa = new javax.swing.JLabel();
        txt_nombre_empresa = new javax.swing.JTextField();
        lbl_fecha = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        lbl_subtotal = new javax.swing.JLabel();
        lbl_descuento = new javax.swing.JLabel();
        cmb_tipo_pago = new javax.swing.JComboBox<>();
        txt_subtotal = new javax.swing.JTextField();
        lbl_impuesto = new javax.swing.JLabel();
        txt_impuesto = new javax.swing.JTextField();
        lbl_tipo_pago = new javax.swing.JLabel();
        txt_descuento = new javax.swing.JTextField();
        lbl_servicio = new javax.swing.JLabel();
        txt_nombre_empleado = new javax.swing.JTextField();
        lbl_nombre_empleado = new javax.swing.JLabel();
        lbl_nombre_paciente = new javax.swing.JLabel();
        txt_nombre_paciente = new javax.swing.JTextField();
        btn_fact = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        lbl_subtitulo = new javax.swing.JLabel();
        cmb_servicios = new javax.swing.JComboBox<>();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturación");
        setPreferredSize(new java.awt.Dimension(770, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_factura.setBackground(new java.awt.Color(255, 255, 255));

        lbl_nombre_empresa.setBackground(java.awt.Color.white);
        lbl_nombre_empresa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_nombre_empresa.setForeground(new java.awt.Color(81, 124, 164));
        lbl_nombre_empresa.setText("Nombre empresa:");

        txt_nombre_empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_empresaActionPerformed(evt);
            }
        });

        lbl_fecha.setBackground(java.awt.Color.white);
        lbl_fecha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_fecha.setForeground(new java.awt.Color(81, 124, 164));
        lbl_fecha.setText("Fecha:");

        lbl_subtotal.setBackground(java.awt.Color.white);
        lbl_subtotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_subtotal.setForeground(new java.awt.Color(81, 124, 164));
        lbl_subtotal.setText("Subtotal:");

        lbl_descuento.setBackground(java.awt.Color.white);
        lbl_descuento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_descuento.setForeground(new java.awt.Color(81, 124, 164));
        lbl_descuento.setText("Descuento:");

        cmb_tipo_pago.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmb_tipo_pago.setForeground(new java.awt.Color(81, 124, 164));
        cmb_tipo_pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Credito" }));

        lbl_impuesto.setBackground(java.awt.Color.white);
        lbl_impuesto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_impuesto.setForeground(new java.awt.Color(81, 124, 164));
        lbl_impuesto.setText("Impuesto:");

        lbl_tipo_pago.setBackground(java.awt.Color.white);
        lbl_tipo_pago.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_tipo_pago.setForeground(new java.awt.Color(81, 124, 164));
        lbl_tipo_pago.setText("Tipo de pago:");

        lbl_servicio.setBackground(java.awt.Color.white);
        lbl_servicio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_servicio.setForeground(new java.awt.Color(81, 124, 164));
        lbl_servicio.setText("Servicio ofrecidos:");

        lbl_nombre_empleado.setBackground(java.awt.Color.white);
        lbl_nombre_empleado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_nombre_empleado.setForeground(new java.awt.Color(81, 124, 164));
        lbl_nombre_empleado.setText("Nombre del empleado:");

        lbl_nombre_paciente.setBackground(java.awt.Color.white);
        lbl_nombre_paciente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_nombre_paciente.setForeground(new java.awt.Color(81, 124, 164));
        lbl_nombre_paciente.setText("Nombre del paciente:");

        btn_fact.setBackground(new java.awt.Color(255, 255, 255));
        btn_fact.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_fact.setForeground(new java.awt.Color(94, 141, 147));
        btn_fact.setText("Facturar");
        btn_fact.setToolTipText("");
        btn_fact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_factActionPerformed(evt);
            }
        });

        lbl_titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(94, 141, 147));
        lbl_titulo.setText("Dental Friends ");

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lo.png"))); // NOI18N

        lbl_subtitulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_subtitulo.setForeground(new java.awt.Color(94, 141, 147));
        lbl_subtitulo.setText("Facturación ");

        cmb_servicios.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmb_servicios.setForeground(new java.awt.Color(81, 124, 164));
        cmb_servicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brakets", "Caries", "Blanquiamiento", "Limpieza", " " }));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-salida-32.png"))); // NOI18N
        btn_salir.setToolTipText("Salir al menu principal");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_facturaLayout = new javax.swing.GroupLayout(panel_factura);
        panel_factura.setLayout(panel_facturaLayout);
        panel_facturaLayout.setHorizontalGroup(
            panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facturaLayout.createSequentialGroup()
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(lbl_subtitulo)
                                .addGap(122, 122, 122)
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_impuesto)
                                    .addComponent(txt_impuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_servicio))))
                        .addGap(37, 37, 37)
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_tipo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nombre_empleado)
                            .addComponent(lbl_tipo_pago)))
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lbl_logo))
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(lbl_titulo))
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nombre_empresa)
                                    .addComponent(txt_nombre_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_subtotal)
                                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_descuento)
                                    .addComponent(lbl_fecha)))
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nombre_paciente)
                                    .addComponent(txt_nombre_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(btn_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_facturaLayout.setVerticalGroup(
            panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facturaLayout.createSequentialGroup()
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbl_titulo)
                        .addGap(25, 25, 25)
                        .addComponent(lbl_fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_descuento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lbl_nombre_empresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_subtotal))
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lbl_logo)))
                .addGap(25, 25, 25)
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_impuesto)
                            .addComponent(lbl_tipo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_impuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_tipo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_subtitulo))
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbl_servicio))
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbl_nombre_empleado)
                        .addGap(18, 18, 18)
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addComponent(lbl_nombre_paciente)
                                .addGap(13, 13, 13)
                                .addComponent(txt_nombre_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_facturaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        getContentPane().add(panel_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_factActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_factActionPerformed
        // Este es el boton que permite facturar una factura
        JOptionPane.showMessageDialog(null,"Facturaste una factura correctamente");
    }//GEN-LAST:event_btn_factActionPerformed

    private void txt_nombre_empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_empresaActionPerformed
        // Este es el texfield del nombre de la empresa  desde aqui lo podemos modificar
    }//GEN-LAST:event_txt_nombre_empresaActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // Este es el boton que permite salir al menu principal o el main
        frm_main mf = new frm_main(); // aqui estamos creando un mf nuevo
        mf.setVisible(true); // esto es para que la pantalla del main pueda ser visible y la otra desaparesca
        mf.pack();
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(frm_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fact;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_servicios;
    private javax.swing.JComboBox<String> cmb_tipo_pago;
    private javax.swing.JLabel lbl_descuento;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_impuesto;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nombre_empleado;
    private javax.swing.JLabel lbl_nombre_empresa;
    private javax.swing.JLabel lbl_nombre_paciente;
    private javax.swing.JLabel lbl_servicio;
    private javax.swing.JLabel lbl_subtitulo;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_tipo_pago;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel panel_factura;
    private javax.swing.JTextField txt_descuento;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_impuesto;
    private javax.swing.JTextField txt_nombre_empleado;
    private javax.swing.JTextField txt_nombre_empresa;
    private javax.swing.JTextField txt_nombre_paciente;
    private javax.swing.JTextField txt_subtotal;
    // End of variables declaration//GEN-END:variables
}
