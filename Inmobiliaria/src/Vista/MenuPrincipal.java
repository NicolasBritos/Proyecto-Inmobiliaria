/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Modelo.Boleta;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Britos
 */
public class MenuPrincipal extends javax.swing.JFrame {
 Controlador controlador = new Controlador ();
 Boleta boletaEncontrada = new Boleta();
 SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy",Locale.US);
 Date fecha1 = new Date();
 Date fecha2 = new Date ();
 Date fechaActual = new Date ();
 Date fechaBoleta = new Date ();
    /**
     * Creates new form Menu
     */
    public MenuPrincipal(Controlador controlador) {
         this.controlador=controlador;
           initComponents();
    }
    
    public Controlador getMiControlador() {
        return controlador;
    }

    public void setMiControlador(Controlador controlador) {
        this.controlador = controlador;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_idBoleta = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_recargoProp = new javax.swing.JTextField();
        txt_recargoFijo = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        txt_fechaActual = new javax.swing.JTextField();
        txt_venc1 = new javax.swing.JTextField();
        txt_venc2 = new javax.swing.JTextField();
        btn_pagar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_fechaBoleta = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menu_crearLocador = new javax.swing.JMenuItem();
        menu_crearLocatario = new javax.swing.JMenuItem();
        menu_crearGarante = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menu_buscarLocador = new javax.swing.JMenuItem();
        menu_buscarLocatario = new javax.swing.JMenuItem();
        menu_buscarGarante = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inmobiliaria");

        jLabel1.setText("Id Boleta");

        jLabel2.setText("Fecha de Hoy");

        jLabel3.setText("Vencimiento 2");

        jLabel4.setText("Vencimiento 1");

        jLabel5.setText("Dni");

        jLabel6.setText("Nombre");

        jLabel7.setText("Recargo Prop.");

        jLabel8.setText("Recargo Fijo");

        jLabel9.setText("Total");

        jLabel10.setText("Pagado");

        txt_dni.setEditable(false);

        txt_nombre.setEditable(false);

        txt_recargoProp.setEditable(false);

        txt_recargoFijo.setEditable(false);

        txt_total.setEditable(false);

        txt_estado.setEditable(false);

        txt_fechaActual.setEditable(false);

        txt_venc1.setEditable(false);

        txt_venc2.setEditable(false);

        btn_pagar.setText("Pagar");
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });

        jLabel11.setText("Fecha Boleta");

        txt_fechaBoleta.setEditable(false);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_idBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txt_dni)
                    .addComponent(txt_nombre)
                    .addComponent(txt_recargoProp)
                    .addComponent(txt_recargoFijo)
                    .addComponent(txt_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_pagar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_venc1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_venc2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txt_fechaBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(txt_idBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_fechaBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_venc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txt_recargoProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_venc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_recargoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btn_pagar)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Nuevo");

        jMenu3.setText("Crear Contrato");

        jMenuItem1.setText("Alquiler");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Venta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenu1.add(jMenu3);

        jMenu6.setText("Crear Cliente");

        menu_crearLocador.setText("Locador");
        menu_crearLocador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_crearLocadorActionPerformed(evt);
            }
        });
        jMenu6.add(menu_crearLocador);

        menu_crearLocatario.setText("Locatario");
        menu_crearLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_crearLocatarioActionPerformed(evt);
            }
        });
        jMenu6.add(menu_crearLocatario);

        menu_crearGarante.setText("Garante");
        menu_crearGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_crearGaranteActionPerformed(evt);
            }
        });
        jMenu6.add(menu_crearGarante);

        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Buscar");

        jMenu4.setText("Buscar Contrato");

        jMenuItem3.setText("Contrato de Alquiler");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("Contrato de Venta");
        jMenu4.add(jMenuItem4);

        jMenu2.add(jMenu4);

        jMenu5.setText("Cliente");

        menu_buscarLocador.setText("Locador");
        menu_buscarLocador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buscarLocadorActionPerformed(evt);
            }
        });
        jMenu5.add(menu_buscarLocador);

        menu_buscarLocatario.setText("Locatario");
        menu_buscarLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buscarLocatarioActionPerformed(evt);
            }
        });
        jMenu5.add(menu_buscarLocatario);

        menu_buscarGarante.setText("Garante");
        menu_buscarGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buscarGaranteActionPerformed(evt);
            }
        });
        jMenu5.add(menu_buscarGarante);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menu_buscarGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buscarGaranteActionPerformed
     BuscarGarante nuevoGarante = new BuscarGarante(this);
        nuevoGarante.setVisible(true);
           nuevoGarante.setLocationRelativeTo(null);      
        
        
    }//GEN-LAST:event_menu_buscarGaranteActionPerformed

    private void menu_buscarLocadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buscarLocadorActionPerformed
        BuscarLocador buscarLocador = new BuscarLocador(this);
        buscarLocador.setVisible(true);
           buscarLocador.setLocationRelativeTo(null);
             
        
    }//GEN-LAST:event_menu_buscarLocadorActionPerformed

    private void menu_crearGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_crearGaranteActionPerformed
        NuevoGarante nuevoGarante = new NuevoGarante(this);
        nuevoGarante.setVisible(true);
           nuevoGarante.setLocationRelativeTo(null);
        
        
        
    }//GEN-LAST:event_menu_crearGaranteActionPerformed

    private void menu_crearLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_crearLocatarioActionPerformed
       NuevoLocatario nuevolocatario = new NuevoLocatario(this);
        nuevolocatario.setVisible(true);
           nuevolocatario.setLocationRelativeTo(null);
    }//GEN-LAST:event_menu_crearLocatarioActionPerformed

    private void menu_buscarLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buscarLocatarioActionPerformed
        BuscarLocatario buscarlocatario = new BuscarLocatario(this);
        buscarlocatario.setVisible(true);
        buscarlocatario.setLocationRelativeTo(null);
    }//GEN-LAST:event_menu_buscarLocatarioActionPerformed

    private void menu_crearLocadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_crearLocadorActionPerformed
        NuevoLocador nuevoLocador = new NuevoLocador(this);
        nuevoLocador.setVisible(true);
           nuevoLocador.setLocationRelativeTo(null);
    }//GEN-LAST:event_menu_crearLocadorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    NuevoAlquiler nuevoAlquiler = new NuevoAlquiler(this);
        nuevoAlquiler.setVisible(true);
           nuevoAlquiler.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       NuevoVenta nuevoVenta = new NuevoVenta(this);
        nuevoVenta.setVisible(true);
           nuevoVenta.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
      int id = parseInt(txt_idBoleta.getText());
      String estado;
     try {
         boletaEncontrada = controlador.BuscarBoleta(id);
         fecha1 = boletaEncontrada.getPrimerVencimiento();
         fecha2 = boletaEncontrada.getSegundoVencimiento();
         fechaBoleta = boletaEncontrada.getFechaBoleta();
         txt_dni.setText(Integer.toString(boletaEncontrada.getDniLocatario()));
         txt_nombre.setText(boletaEncontrada.getNombreLocatario());
         txt_recargoProp.setText(Double.toString(boletaEncontrada.getRecargoProporcional()));
           txt_recargoFijo.setText(Double.toString(boletaEncontrada.getRecargoFijo()));
           txt_total.setText(Double.toString(boletaEncontrada.getTotal()));
           txt_venc1.setText(sdf.format(boletaEncontrada.getPrimerVencimiento()));
           txt_venc2.setText(sdf.format(boletaEncontrada.getSegundoVencimiento()));
          txt_fechaActual.setText(sdf.format(fechaActual));
          txt_fechaBoleta.setText(sdf.format(boletaEncontrada.getFechaBoleta()));
                    if (boletaEncontrada.isEstadoPago() == false){
              estado = "NO";
          }else{
              estado = "SI";}
          txt_estado.setText(estado);
     } catch (Exception ex) {
         Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed
         
        
    }//GEN-LAST:event_btn_pagarActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_pagar;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem menu_buscarGarante;
    private javax.swing.JMenuItem menu_buscarLocador;
    private javax.swing.JMenuItem menu_buscarLocatario;
    private javax.swing.JMenuItem menu_crearGarante;
    private javax.swing.JMenuItem menu_crearLocador;
    private javax.swing.JMenuItem menu_crearLocatario;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_fechaActual;
    private javax.swing.JTextField txt_fechaBoleta;
    private javax.swing.JTextField txt_idBoleta;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_recargoFijo;
    private javax.swing.JTextField txt_recargoProp;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_venc1;
    private javax.swing.JTextField txt_venc2;
    // End of variables declaration//GEN-END:variables
}
