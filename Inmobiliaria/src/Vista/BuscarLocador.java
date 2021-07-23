/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Direccion;
import Modelo.Locador;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Britos
 */
public class BuscarLocador extends javax.swing.JFrame {
     private MenuPrincipal miMenu;
    private  int dniE = 0;
    private int idD= 0 ;
    private Locador encontrado = new Locador ();
    private Direccion encontrada = new Direccion();

    /**
     * Creates new form MenuBuscarLocador
     */
    public BuscarLocador(MenuPrincipal miMenuPrincipal) {
        initComponents();
        this.miMenu = miMenuPrincipal;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        txt_dni = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_estadoCivil = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_calle = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        txt_piso = new javax.swing.JTextField();
        txt_barrio = new javax.swing.JTextField();
        txt_localidad = new javax.swing.JTextField();
        txt_codigoPostal = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jDate_fecha = new com.toedter.calendar.JDateChooser();
        cmb_tipoDocumento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Locador");

        jLabel1.setText("Nro. Documento");

        jLabel2.setText("Tipo documento");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Estado civil");

        jLabel6.setText("Fecha de nacimiento");

        jLabel7.setText("Email");

        jLabel8.setText("Domicilio");

        jLabel9.setText("Telefono");

        btn_editar.setText("Editar");
        btn_editar.setEnabled(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        txt_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dniActionPerformed(evt);
            }
        });

        txt_apellido.setEditable(false);
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });

        txt_nombre.setEditable(false);

        txt_estadoCivil.setEditable(false);

        txt_email.setEditable(false);

        txt_telefono.setEditable(false);

        jLabel10.setText("Datos Personales");

        jLabel11.setText("Calle");

        jLabel12.setText("Numero");

        jLabel13.setText("Piso");

        jLabel14.setText("Barrio");

        jLabel15.setText("Localidad");

        jLabel16.setText("Codigo Postal");

        txt_calle.setEditable(false);

        txt_numero.setEditable(false);

        txt_piso.setEditable(false);

        txt_barrio.setEditable(false);

        txt_localidad.setEditable(false);

        txt_codigoPostal.setEditable(false);

        btn_buscar.setText("Buscar ");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");
        btn_guardar.setEnabled(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jDate_fecha.setEnabled(false);

        cmb_tipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Pasaporte", "CIF" }));
        cmb_tipoDocumento.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txt_calle)
                                    .addComponent(txt_numero)
                                    .addComponent(txt_piso)
                                    .addComponent(txt_barrio)
                                    .addComponent(txt_localidad)
                                    .addComponent(txt_codigoPostal)
                                    .addComponent(jDate_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar)
                    .addComponent(btn_editar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_tipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir)))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_buscar)
                    .addComponent(cmb_tipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDate_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_barrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_codigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_editar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_guardar)
                        .addComponent(btn_eliminar)
                        .addComponent(btn_salir)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
         ////////// habilita los campos para la edicion
            txt_dni.setEditable(false);
            txt_nombre.setEditable(true);
            txt_apellido.setEditable(true);
            jDate_fecha.setEnabled(true);
            cmb_tipoDocumento.setEnabled(true);
            txt_telefono.setEditable(true);
            txt_email.setEditable(true);
            txt_estadoCivil.setEditable(true);
            txt_calle.setEditable(true);
            txt_numero.setEditable(true);
            txt_piso.setEditable(true);
            txt_barrio.setEditable(true);
            txt_localidad.setEditable(true);
            txt_codigoPostal.setEditable(true);
         ///////////habilita el boton "Guardar"
                btn_guardar.setEnabled(true);
          /////////Deshabilita el botón " Eliminar "
            btn_eliminar.setEnabled(false);
              /////////Deshabilita el botón " Editar "
            btn_editar.setEnabled(false);
              /////////Deshabilita el botón " Buscar "
            btn_buscar.setEnabled(false);
           
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dniActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try{
            int dni =parseInt(txt_dni.getText());
            encontrado =this.miMenu.getMiControlador().BuscarLocador(dni);
       dniE=encontrado.getDni();
       idD= encontrado.getDomicilio().getIdDireccion();
       encontrada= encontrado.getDomicilio();
            txt_dni.setText(String.valueOf(encontrado.getDni()));
            txt_nombre.setText(String.valueOf(encontrado.getNombre()));
            txt_apellido.setText(String.valueOf(encontrado.getApellido()));
            jDate_fecha.setDate(encontrado.getFechaNacimiento());
            /////////switch case para el comboBox de tipoDocumento
            switch (String.valueOf(encontrado.getTipoDocumento())){
                case "DNI": cmb_tipoDocumento.setSelectedIndex(0);
                break;
                case "Pasaporte":  cmb_tipoDocumento.setSelectedIndex(1);
                break;
                case "CIF": cmb_tipoDocumento.setSelectedIndex(2);
            }
            ///////////////
            txt_telefono.setText(String.valueOf(encontrado.getTelefono()));
            txt_email.setText(String.valueOf(encontrado.getEmail()));
            txt_estadoCivil.setText(String.valueOf(encontrado.getEstadoCivil()));
            txt_calle.setText(String.valueOf(encontrada.getCalle()));
            txt_numero.setText(String.valueOf(encontrada.getNumero()));
            txt_piso.setText(String.valueOf(encontrada.getPiso()));
            txt_barrio.setText(String.valueOf(encontrada.getBarrio()));
            txt_localidad.setText(String.valueOf(encontrada.getLocalidad()));
            txt_codigoPostal.setText(String.valueOf(encontrada.getCodPostal()));
            /////////Si encuentra el dni, habilita el botón " Eliminar "
            btn_eliminar.setEnabled(true);
             /////////Habilita el botón " Editar "
            btn_editar.setEnabled(true);
                                }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "El Dni no existe\n"+"("+ ex +")");
        }
   
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
                  ////////////Obtiene nuevos datos de la persona  
         encontrado.setDni(parseInt(txt_dni.getText()));
         encontrado.setApellido(txt_apellido.getText());
         encontrado.setNombre(txt_nombre.getText());
         encontrado.setTipoDocumento((String) cmb_tipoDocumento.getSelectedItem());
         encontrado.setTelefono(txt_telefono.getText());
         encontrado.setEmail(txt_email.getText());
         encontrado.setFechaNacimiento(jDate_fecha.getDate());
         encontrado.setEstadoCivil(txt_estadoCivil.getText());
          /////////////Obtiene datos de la Direccion
         encontrada.setCalle(txt_calle.getText());
        encontrada.setNumero(txt_numero.getText());
        encontrada.setPiso(parseInt(txt_piso.getText()));
        encontrada.setBarrio(txt_barrio.getText());
        encontrada.setLocalidad(txt_localidad.getText());
        encontrada.setCodPostal(parseInt(txt_codigoPostal.getText()));
              ////////////Llama al Controlador para Actualizar los datos en la BD.
    try {
        ///////////////Actualiza la direccion en la BD
         miMenu.controlador.EditarDireccion(encontrada);
        JOptionPane.showMessageDialog(null, "Editado Correctamente"); 
         ///////////// Setea la direccion en la persona actualizada
        encontrado.setDomicilio(encontrada);
    } catch (Exception ex) {
        Logger.getLogger(BuscarLocador.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        /////////////Actualiza el Garante en la BD
                miMenu.controlador.EditarLocador(encontrado);
    } catch (Exception ex) {
        Logger.getLogger(BuscarLocador.class.getName()).log(Level.SEVERE, null, ex);
    }
         ////////////// Despues de guardar, bloquea los campos nuevamente y limpia los campos (Excepto dni)
            txt_dni.setEditable(true);
            txt_nombre.setEditable(false);
            txt_apellido.setEditable(false);
            jDate_fecha.setEnabled(false);
            cmb_tipoDocumento.setEnabled(false);
            txt_telefono.setEditable(false);
            txt_email.setEditable(false);
            txt_estadoCivil.setEditable(false);
            txt_calle.setEditable(false);
            txt_numero.setEditable(false);
            txt_piso.setEditable(false);
            txt_barrio.setEditable(false);
            txt_localidad.setEditable(false);
            txt_codigoPostal.setEditable(false);
            ///////////////////////
            txt_nombre.setText("");
            txt_apellido.setText("");
           jDate_fecha.setCalendar(null);
           txt_telefono.setText("");
            txt_email.setText("");
            txt_estadoCivil.setText("");
            txt_calle.setText("");
            txt_numero.setText("");
            txt_piso.setText("");
            txt_barrio.setText("");
            txt_localidad.setText("");
            txt_codigoPostal.setText("");
           ///////////Deshabilita el boton "Guardar" nuevamente 
           btn_guardar.setEnabled(false);
           /////////Deshabilita el botón " Eliminar "
            btn_eliminar.setEnabled(false);
            /////////Habilita el botón " Buscar "
            btn_buscar.setEnabled(true);
            //////////Habilita el campo "Dni"
            txt_dni.setEditable(true);
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
      try {
            miMenu.controlador.EliminarCliente(dniE, "locador");
            miMenu.controlador.EliminarDireccion(idD);
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
             txt_nombre.setText("");
            txt_apellido.setText("");
            jDate_fecha.setCalendar(null);
           txt_telefono.setText("");
            txt_email.setText("");
            txt_estadoCivil.setText("");
            txt_calle.setText("");
            txt_numero.setText("");
            txt_piso.setText("");
            txt_barrio.setText("");
            txt_localidad.setText("");
            txt_codigoPostal.setText("");
            btn_eliminar.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error ("+ ex +")");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_tipoDocumento;
    private com.toedter.calendar.JDateChooser jDate_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_barrio;
    private javax.swing.JTextField txt_calle;
    private javax.swing.JTextField txt_codigoPostal;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_estadoCivil;
    private javax.swing.JTextField txt_localidad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_piso;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
