/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DF_presentacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author deleo
 */
public class frm_listado_admin extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form frm_listado_admin
     */
    public frm_listado_admin() {
        initComponents();
        MostrarAdmin("");
    }
    
    public void RefrescarTabla(){ 
        try{
            model.setColumnCount(0); 
            model.setRowCount(0); 
            tabla_admin.revalidate();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error" + ex);
        }
    
    }
    
    
    public void MostrarAdmin (String admin){
          
        String sql = "" +  admin; 
        Statement st;
        MyConnetion cc = new MyConnetion();
        Connection cn = MyConnetion.getConnection();
        RefrescarTabla();
      model.addColumn("ID");  
        model.addColumn("Nombre");
        model.addColumn("Telefono");
        model.addColumn("direccion");
        
        tabla_admin.setModel(model); 
      
        String [] dato = new String[7];
          if(admin.equals("")){ 
            sql = "Select * from `admin`"; 
        }
          else {
          sql = "select * from `admin` where `id_admin` = '" + txt_id_admin.getText()+ "'"+ " or nombre = '" + txt_administrador.getText()+ "'" + "or telefono = '" + txt_telefono.getText() +"'" + "or cedula = '" + txt_cedula.getText() +"'";
          }
        try{
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql); 
            while(rs.next()) 
            {  

            dato[0] =rs.getString(1);
            dato[1] =rs.getString(2);
            dato[2] =rs.getString(3);
            dato[3] =rs.getString(4);
            dato[4] =rs.getString(5);
            dato[5] =rs.getString(6);
            dato[6] =rs.getString(7);

                model.addRow(dato);
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error" + e);
        }
    }
    
    public void Limpiar(){  
         txt_id_admin.setText("");
         txt_administrador.setText("");
         txt_telefono.setText("");
         txt_cedula.setText("");
     }
     
    public void EliminarAdmin(String id) {
        String sql = "delete from admin where id_admin = " + id;
        Statement st;
         Connection cn = MyConnetion.getConnection();
        try {
            st = cn.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"Error" + e);
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

        panel_listado_admin = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_admin = new javax.swing.JLabel();
        txt_id_admin = new javax.swing.JTextField();
        lbl_nombre_admin = new javax.swing.JLabel();
        txt_administrador = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_cedula = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        lbl_logo = new javax.swing.JLabel();
        btn_vaciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_admin = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_listado_admin.setBackground(new java.awt.Color(255, 255, 255));
        panel_listado_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(94, 141, 147));
        lbl_titulo.setText("Lista de Administradores:");
        panel_listado_admin.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 31, -1, -1));

        lbl_admin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_admin.setForeground(new java.awt.Color(81, 124, 164));
        lbl_admin.setText("id del administrador:");
        panel_listado_admin.add(lbl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        panel_listado_admin.add(txt_id_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 117, -1));

        lbl_nombre_admin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_nombre_admin.setForeground(new java.awt.Color(81, 124, 164));
        lbl_nombre_admin.setText("Nombre:");
        panel_listado_admin.add(lbl_nombre_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));
        panel_listado_admin.add(txt_administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 102, -1));

        lbl_telefono.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_telefono.setForeground(new java.awt.Color(81, 124, 164));
        lbl_telefono.setText("Telefono:");
        panel_listado_admin.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));
        panel_listado_admin.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 107, -1));

        lbl_cedula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(81, 124, 164));
        lbl_cedula.setText("Cedula:");
        panel_listado_admin.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));
        panel_listado_admin.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 88, -1));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-eliminar-32.png"))); // NOI18N
        btn_eliminar.setToolTipText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        panel_listado_admin.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 50, 40));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-salida-32.png"))); // NOI18N
        btn_salir.setToolTipText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        panel_listado_admin.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 469, -1, -1));

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-búsqueda-32.png"))); // NOI18N
        btn_buscar.setToolTipText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        panel_listado_admin.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 469, -1, -1));

        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-imprimir-32.png"))); // NOI18N
        btn_imprimir.setToolTipText("Imprimir");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        panel_listado_admin.add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, -1, -1));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lo.png"))); // NOI18N
        lbl_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoMouseClicked(evt);
            }
        });
        panel_listado_admin.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btn_vaciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-empty-48.png"))); // NOI18N
        btn_vaciar.setToolTipText("Vaciar");
        btn_vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vaciarActionPerformed(evt);
            }
        });
        panel_listado_admin.add(btn_vaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 107, 52, -1));

        tabla_admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_admin);

        panel_listado_admin.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 720, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_listado_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_listado_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        //         este boton permite eliminar un empleado registrado en la base de datos
        String id = tabla_admin.getValueAt(tabla_admin.getSelectedRow(), 0).toString();
        Connection cn = MyConnetion.getConnection();
        EliminarAdmin(id);
        MostrarAdmin("");

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // Este es el boton que permite salir a menu de los listados
        frm_listas mf = new frm_listas(); // aqui estamos creando un mf nuevo
        mf.setVisible(true); // esto es para que la pantalla del main pueda ser visible y la otra desaparesca
        mf.pack();
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // Este boton permite buscar un empleado registrado en la base de datos
        MostrarAdmin("Administrador");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        //        Este es el boton que permite imprimir el listado de empleados
        //  Aqui definimos una variable que se llama outfile y esta es igual al lugar donde tenemos el archivo que queremos mostrar
        String outFile = "C:\\Users\\jim3j\\OneDrive\\Documentos\\NetBeansProjects\\Dental_Friends\\src\\Reportes\\empleado.pdf";

        Connection cn=MyConnetion.getConnection(); // definimos una nueva conexion y le ponemos el nombre de cn
        try{

            JasperReport jr = (JasperReport) JRLoader.loadObject(frm_listado_empleado.class.getResource("/Reportes/empleado.jasper"));
            // creamos un nuevo jasper report y ejecutamos una libreria que nos perimite cargar un reporte de jasper ya guardado en una carpeta
            Map parametros = new HashMap<>();
            parametros.put("Titulo", "Reporte Administradores");

            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        }
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex); // usamos este catch para que muestre cualquier error que tenga la impresion del codigo
        }
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void lbl_logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoMouseClicked
        // Este evento es para volver a poner todos los registros
//        MostrarEmpleados("");
    }//GEN-LAST:event_lbl_logoMouseClicked

    private void btn_vaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vaciarActionPerformed
        // Este boton sirve para vaciar todos los textfield
        Limpiar();
    }//GEN-LAST:event_btn_vaciarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_listado_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_listado_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_listado_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_listado_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_listado_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_vaciar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_admin;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_nombre_admin;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel panel_listado_admin;
    private javax.swing.JTable tabla_admin;
    private javax.swing.JTextField txt_administrador;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_id_admin;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
