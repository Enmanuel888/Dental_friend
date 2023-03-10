/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DF_presentacion;

import static DF_presentacion.frm_main.main;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Alian Peralta
 */
public class frm_empleado extends javax.swing.JFrame {

    /**
     * Creates new form frm_empleado
     */
    public frm_empleado() {
        initComponents();
    }
    public boolean RevisarPaciente(String usuario){
          PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `empleado` WHERE `nombre` =?";
        try {
            ps = MyConnetion.getConnection().prepareStatement(query);
            ps.setString(1, usuario);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                checkUser = true;
            }
        }   catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        return checkUser;
    }
public void Limpiar(){
    try{
       String nom = txt_nombre.getText();
        String ape = txt_apellido.getText();
        String sex =  String.valueOf(cmb_sex.getSelectedIndex());
        String dir = txt_direccion.getText();
        String tel = txt_telefono.getText();
        String sal = txt_salario.getText();
        

    
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null,"error"+ ex);
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

        panel_empleado = new javax.swing.JPanel();
        txt_salario = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        lbl_ape = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        lbl_tel = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_dire1 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        cmb_sex = new javax.swing.JComboBox<>();
        Sexo = new javax.swing.JLabel();
        lbl_salario = new javax.swing.JLabel();
        btn_regiemp = new javax.swing.JButton();
        lbl_titu = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        lbl_cedula = new javax.swing.JLabel();
        txt_cedu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de empleado");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_empleado.setBackground(new java.awt.Color(255, 255, 255));
        panel_empleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_empleado.add(txt_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 123, -1));

        lbl_nombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(81, 124, 164));
        lbl_nombre.setText("Nombre:");
        panel_empleado.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lbl_ape.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_ape.setForeground(new java.awt.Color(81, 124, 164));
        lbl_ape.setText("Apellido:");
        panel_empleado.add(lbl_ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));
        panel_empleado.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 130, -1));
        panel_empleado.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 114, -1));

        lbl_tel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_tel.setForeground(new java.awt.Color(81, 124, 164));
        lbl_tel.setText("Telefono:");
        panel_empleado.add(lbl_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));
        panel_empleado.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 130, -1));

        lbl_dire1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_dire1.setForeground(new java.awt.Color(81, 124, 164));
        lbl_dire1.setText("Direccion:");
        panel_empleado.add(lbl_dire1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        panel_empleado.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 123, -1));

        cmb_sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        cmb_sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_sexActionPerformed(evt);
            }
        });
        panel_empleado.add(cmb_sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 160, -1));

        Sexo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Sexo.setForeground(new java.awt.Color(81, 124, 164));
        Sexo.setText("Sexo:");
        panel_empleado.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        lbl_salario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_salario.setForeground(new java.awt.Color(81, 124, 164));
        lbl_salario.setText("Salario:");
        panel_empleado.add(lbl_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        btn_regiemp.setBackground(new java.awt.Color(255, 255, 255));
        btn_regiemp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_regiemp.setForeground(new java.awt.Color(94, 141, 147));
        btn_regiemp.setText("Registrar");
        btn_regiemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 141, 147)));
        btn_regiemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regiempActionPerformed(evt);
            }
        });
        panel_empleado.add(btn_regiemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 122, 44));

        lbl_titu.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_titu.setForeground(new java.awt.Color(94, 141, 147));
        lbl_titu.setText("Registro de empleado:");
        panel_empleado.add(lbl_titu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lo.png"))); // NOI18N
        panel_empleado.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-salida-32.png"))); // NOI18N
        btn_salir.setToolTipText("Salir al menu principal");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        panel_empleado.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 70, 60));

        lbl_cedula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(81, 124, 164));
        lbl_cedula.setText("Cedula:");
        panel_empleado.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        panel_empleado.add(txt_cedu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 130, -1));

        getContentPane().add(panel_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regiempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regiempActionPerformed
        // Este es el boton que permite registrar un empleado 
    
        
        //Boton para registrar datos nuevos a la BD
      
        String nom = txt_nombre.getText();
        String ape = txt_apellido.getText();
        String sex =  String.valueOf(cmb_sex.getSelectedItem());
        String dir = txt_direccion.getText();
        String tel = txt_telefono.getText();
        String sal = txt_salario.getText();
        String cedu = txt_cedu.getText();

        
        
           
        if(nom.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Agrega un nombre");
        }
        
        else if(ape.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Agrega un apellido");
        }      
        else if(sex.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Agrege su tipo de sexo");
        }
        else if(dir.equals(""))
        {
            
           JOptionPane.showMessageDialog(null, "Agrege su  direccion");
        }
        else if(tel.equals(""))
        {
         JOptionPane.showMessageDialog(null, "Agrege su  telefono");  
        }
        else if(sal.equals(""))
        {
        JOptionPane.showMessageDialog(null, "Agrege su salario");    
        }
    
        else{
        PreparedStatement ps;
        String query = "INSERT INTO `empleado`(`id_empleado`, `nombre`, `apellido`, `sexo`, `direccion`, `telefono`,`salario`,`cedula`) VALUES (0,?,?,?,?,?,?,?)";
        try {
            ps = MyConnetion.getConnection().prepareStatement(query);
            
            ps.setString(1, nom);
            ps.setString(2, ape);
            ps.setString(3, sex);
            ps.setString(4, dir);
            ps.setString(5, tel);
            ps.setString(6, sal);
            ps.setString(7, cedu);
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Nuevo Empleado Agregado");
                Limpiar();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
    }//GEN-LAST:event_btn_regiempActionPerformed
    }
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
            // Este es el boton que permite salir al menu principal o el main
        frm_main mf = new frm_main(); // aqui estamos creando un mf nuevo
        mf.setVisible(true); // esto es para que la pantalla del main pueda ser visible y la otra desaparesca
        mf.pack();
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void cmb_sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_sexActionPerformed

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
            java.util.logging.Logger.getLogger(frm_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sexo;
    private javax.swing.JButton btn_regiemp;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_sex;
    private javax.swing.JLabel lbl_ape;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_dire1;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_salario;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JLabel lbl_titu;
    private javax.swing.JPanel panel_empleado;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedu;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
