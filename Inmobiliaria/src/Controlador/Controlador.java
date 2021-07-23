/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAOIMP.*;
import Modelo.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Britos
 */
public class Controlador {
   public  Inmueble recibido = new Inmueble ();
    
    // Se instancian las clases DAO
BoletaDAOImp boletaDAO = new BoletaDAOImp ();
ContratoAlquilerDAOImp contratoalquilerDAO = new ContratoAlquilerDAOImp ();
ContratoVentaDAOImp contratoventaDAO = new ContratoVentaDAOImp ();
ContratoDAOImp contratoDAO= new ContratoDAOImp ();
CronogramaPagosDAOImp cronogramapagosDAO = new CronogramaPagosDAOImp ();
CuotaDAOImp cuotaDAO= new CuotaDAOImp ();
DireccionDAOImp direccionDAO = new DireccionDAOImp ();
GaranteDAOImp garanteDAO = new GaranteDAOImp ();
InmuebleDAOImp inmuebleDAO= new InmuebleDAOImp ();
LocadorDAOImp  locadorDAO= new LocadorDAOImp ();
LocatarioDAOImp locatarioDAO = new LocatarioDAOImp ();
PersonaDAOImp personaDAO= new PersonaDAOImp ();
    
/////////////////////////////////////////////////////////////////////


//Creacion de listas

    List<Boleta> ListBoletas = new LinkedList();
    List<Locatario> ListLocatarios= new LinkedList();
    List<Contrato> ListContratos = new LinkedList();
    List<ContratoVenta> ListVentas = new LinkedList();
    List<ContratoAlquiler> ListAlquileres = new LinkedList();
    List<CronogramaPagos> ListCronogramas = new LinkedList();
    List<Cuota> ListCuotas = new LinkedList();
    List<Direccion> ListDirecciones = new LinkedList();
    List<Garante> ListGarantes = new LinkedList();
    List<Inmueble> ListInmuebles = new LinkedList();
    List<Locador> ListLocadores = new LinkedList();
    List<Persona> ListPersonas = new LinkedList();
    
/////////////////////////////////////////////////////////////////    

////////////CREACION DE LOCADOR, LOCATARIO Y GARANTE
    
public void CrearLocador (int dni, String tipoDocumento, String apellido, String nombre, String estadoCivil, String telefono, String email, Date fechaNacimiento ) throws Exception{
    
   Direccion direccion = UltimaDireccion();
  Locador locador = new Locador (dni, tipoDocumento, apellido, nombre, estadoCivil, telefono, email, fechaNacimiento, direccion);
    locadorDAO.registrar(locador);
      
}

public void CrearGarante (String tipoActividad, byte[] comprobante, int dni, String tipoDocumento, String apellido, String nombre, String estadoCivil, String telefono, String email, Date fechaNacimiento ) throws Exception{
       Direccion direccion = UltimaDireccion();
  Garante garante = new Garante (tipoActividad, comprobante,  dni,  tipoDocumento,  apellido,  nombre,  estadoCivil,  telefono,  email,  fechaNacimiento,  direccion);
    garanteDAO.registrar(garante);
  
    }

public void CrearLocatario (String usuario, String password, String tipoActividad, byte[] comprobante, int dni, String tipoDocumento, String apellido, String nombre, String estadoCivil, String telefono, String email, Date fechaNacimiento ) throws Exception{
  Direccion direccion = UltimaDireccion();
  Locatario locatario = new Locatario (usuario, password,  tipoActividad, comprobante,  dni,  tipoDocumento,  apellido,  nombre,  estadoCivil,  telefono,  email,  fechaNacimiento,  direccion);
   locatarioDAO.registrar(locatario);
  
    }
////////////////////////////////////////////////////////////////////

///////////BUSQUEDA DE LOCADOR/LOCATARIO/GARANTE/ CONTRATOS

public Garante BuscarGarante (int dniBuscado) throws Exception{
        ListGarantes = garanteDAO.listar();
       Garante retorno = new Garante();
        Garante unaPersona = new Garante();
        for (int contador = 0; contador <= ListGarantes.size(); contador++){
            unaPersona = ListGarantes.get(contador);     
            int codigo = unaPersona.getDni();
                if (dniBuscado==codigo){                       
                    retorno= unaPersona; 
                    contador = (ListGarantes.size()+1);  //fuerza para salir del bucle
                }
        }
        return retorno;
    }

public Locatario BuscarLocatario (int dniBuscado) throws Exception{
        ListLocatarios = locatarioDAO.listar();
       Locatario retorno = new Locatario();
       Locatario unaPersona = new Locatario();
        for (int contador = 0; contador <= ListLocatarios.size(); contador++){
            unaPersona = ListLocatarios.get(contador);     
            int codigo = unaPersona.getDni();
                if (dniBuscado==codigo){                       
                    retorno= unaPersona; 
                    contador = (ListLocatarios.size()+1);  //fuerza para salir del bucle
                }
        }
        return retorno;
    }


public Locador BuscarLocador (int dniBuscado) throws Exception{
        ListLocadores = locadorDAO.listar();
       Locador retorno = new Locador();
        Locador unaPersona = new Locador();
        for (int contador = 0; contador <= ListLocadores.size(); contador++){
            unaPersona = ListLocadores.get(contador);     
            int codigo = unaPersona.getDni();
                if (dniBuscado==codigo){                       
                    retorno= unaPersona; 
                    contador = (ListLocadores.size()+1);  //fuerza para salir del bucle
                }
        }
        return retorno;
    }

///////////////////////////////////////////////////////////

////////ACTUALIZACION LOCADOR, GARANTE, LOCATARIO

public void EditarGarante (Garante garante) throws Exception{
    garanteDAO.actualizar(garante);
    
}

public void EditarLocador (Locador locador) throws Exception{
   locadorDAO.actualizar(locador);
    
}


public void EditarLocatario (Locatario locatario) throws Exception{
locatarioDAO.actualizar(locatario);
    
} 

/////////////////////////////////////////ELIMINAR GARANTE, LOCADOR, LOCATARIO
public void  EliminarCliente (int dni, String tipo) throws Exception{
    if (tipo =="locatario"){
    locatarioDAO.eliminar(dni);
    }
    if (tipo =="locador"){
        locadorDAO.eliminar(dni);
    }
    if (tipo == "garante"){
        garanteDAO.eliminar(dni);
    }
    
}
public void  EliminarLocador (int dni) throws Exception{
    locadorDAO.eliminar(dni);
    
}
public void  EliminarGarante (int dni) throws Exception{
    garanteDAO.eliminar(dni);
    
}

///////CREACION , BUSQUEDA Y ELIMINACION DE DIRECCION
public void CrearDireccion(String calle, String numero, int piso, String barrio, String localidad, int codigoPostal ) throws Exception{
        ListDirecciones = direccionDAO.listar();
        int idDireccion=0;
        if(ListDirecciones.size()== 0){
            idDireccion=1;
        }
        else{
            for(Direccion unaDireccion:ListDirecciones){
              idDireccion = unaDireccion.getIdDireccion()+1;  
            }
        }
        Direccion direccion = new Direccion(idDireccion, calle, numero, piso, barrio, localidad, codigoPostal);
                direccionDAO.registrar(direccion);
    
    
}
public Direccion BuscarDireccion (int idDireccion) throws Exception{
        ListDirecciones = direccionDAO.listar();
       Direccion retorno = new Direccion();
       Direccion unaDireccion = new Direccion();
        for (int contador = 0; contador <= ListDirecciones.size(); contador++){
            unaDireccion = ListDirecciones.get(contador);     
            int codigo = unaDireccion.getIdDireccion();
                if (idDireccion==codigo){                       
                    retorno= unaDireccion; 
                    contador = (ListDirecciones.size()+1);   //fuerza para salir del bucle
                }
        }
        return retorno;
    }

public void EditarDireccion(Direccion direccion)throws Exception{
    direccionDAO.actualizar(direccion);
    }


public Direccion UltimaDireccion () throws Exception{
    ListDirecciones = direccionDAO.listar();
    Direccion direccion=null;
     for(Direccion unaDireccion:ListDirecciones){
              direccion = unaDireccion;
     }
    return direccion;
}

public void EliminarDireccion(int id) throws Exception{
    direccionDAO.eliminar(id);
}
//////////////////////////////////////////////////////////////////////


/////////////////////////Crear Inmueble y buscar ultimo registro de inmueble

public void CrearInmueble(String tipoInmueble, String calle, String numero, int piso, String barrio, String localidad, int codigoPostal ) throws Exception{
   CrearDireccion(calle,  numero, piso, barrio, localidad, codigoPostal);
   Direccion ultima = UltimaDireccion();
    ListInmuebles = inmuebleDAO.listar();
        int idInmueble=0;
        if(ListInmuebles.size()== 0){
            idInmueble=1;
        }
        else{
            for(Inmueble unInmueble:ListInmuebles){
              idInmueble = unInmueble.getIdInmueble()+1;  
            }
        }
        Inmueble inmueble = new Inmueble(idInmueble, tipoInmueble, ultima);
                inmuebleDAO.registrar(inmueble);
                                    }

public Inmueble UltimoInmueble () throws Exception{
    ListInmuebles = inmuebleDAO.listar();
    Inmueble inmueble=null;
     for(Inmueble unInmueble :ListInmuebles){
              inmueble = unInmueble;
     }
    return inmueble;
}

public Inmueble BuscarInmueble (int id) throws Exception{
      ListInmuebles = inmuebleDAO.listar();
       Inmueble retorno = new Inmueble();
       Inmueble unInmueble = new Inmueble();
        for (int contador = 0; contador <= ListInmuebles.size(); contador++){
            unInmueble = ListInmuebles.get(contador);     
            int codigo = unInmueble.getIdInmueble();
                if (id==codigo){                       
                    retorno= unInmueble; 
                    contador = (ListInmuebles.size()+1);   //fuerza para salir del bucle
                }
        }
        return retorno;
    
}

/////////////////////////////////////////////////

///////////////////Contratos

public void CrearAlquiler (int dniGarante, int dniLocador,int dniLocatario,String nombreLocatario, int idInmueble,  double montoAlquiler, double recargoProporcional, double montoComision,
       int tipoPagoComision, double montoAranceles, double recargoFijo, Date fechaContrato, Date fechaFinalizacion,int fechaPago1, int fechaPago2, int duracion) throws Exception{
    String tipoPago ="";
 ContratoAlquiler contratoAlquiler = new ContratoAlquiler();  
Inmueble inmueble = BuscarInmueble(idInmueble);
Locador locador = BuscarLocador(dniLocador);
Locatario locatario = BuscarLocatario(dniLocatario);
Garante garante = BuscarGarante(dniGarante);
 double montoSinComision = (montoAlquiler+montoAranceles);
 if (tipoPagoComision == 0){
    tipoPago = "(Pago unico)";
 }else{
     tipoPago = "(Pago mensual)";
 }
 String itemsBoleta = ("Monto alquiler : $"+ montoAlquiler +  "\nMonto Aranceles : $"+ montoAranceles + "\n Monto Comision : $" + montoComision +" "+tipoPago );  
List<Boleta> boletasAlquiler = new LinkedList();
boletasAlquiler = CrearBoletas(dniLocatario, nombreLocatario,fechaContrato, fechaPago1, fechaPago2, recargoFijo, recargoProporcional, montoSinComision, tipoPagoComision, montoComision, duracion, itemsBoleta);
   contratoAlquiler.setAranceles(montoAranceles);
   contratoAlquiler.setBoletas(boletasAlquiler);
    contratoAlquiler.setComision(montoComision);
    contratoAlquiler.setDuracion(duracion);
    contratoAlquiler.setFechaContrato(fechaContrato);
    contratoAlquiler.setFechaFinalizacion(fechaFinalizacion);
    contratoAlquiler.setGarante(garante);
    contratoAlquiler.setInmueble(inmueble);
     contratoAlquiler.setLocador(locador);
    contratoAlquiler.setLocatario(locatario);
    contratoAlquiler.setMontoAlquiler(montoAlquiler);
    if (fechaPago1 == 0){
    contratoAlquiler.setPrimerFechaPago(02);
    }else{
        contratoAlquiler.setPrimerFechaPago(04);
}
    if (fechaPago2 == 0){
        contratoAlquiler.setSegundaFechaPago(07);
    }else{
        contratoAlquiler.setSegundaFechaPago(10);
    }
    contratoAlquiler.setRecargoFijo(recargoFijo);
    contratoAlquiler.setRecargoProporcional(recargoProporcional);
        contratoalquilerDAO.registrar(contratoAlquiler);        
}

////////////////////////////////


public void CrearVenta (int dniLocador,int  dniLocatario, String nombreLocatario, int idInmueble, double montoTotal, double recargoProporcional, double montoComision,
                   int tipoPagoComision, double recargoFijo, Date fechaContrato , int fechaPago1, int fechaPago2, CronogramaPagos cronograma) throws Exception{
String tipoPago ="";
 ContratoVenta contratoVenta = new ContratoVenta();  
Inmueble inmueble = BuscarInmueble(idInmueble);
Locador locador = BuscarLocador(dniLocador);
Locatario locatario = BuscarLocatario(dniLocatario);
int cantCuotas = cronograma.getCuotas();
 if (tipoPagoComision == 0){
    tipoPago = "(Pago unico)";
 }else{
     tipoPago = "(Pago mensual)";
 }
 String itemsBoleta = ("Monto Venta : $"+ montoTotal+  "\n Monto Comision : $" + montoComision +" "+tipoPago );  
List<Boleta> boletasVenta = new LinkedList();
    boletasVenta = CrearBoletas(dniLocatario, nombreLocatario,fechaContrato, fechaPago1, fechaPago2, recargoFijo, recargoProporcional, montoTotal, tipoPagoComision, montoComision, cantCuotas , itemsBoleta);
    contratoVenta.setBoletas(boletasVenta);
     contratoVenta.setComision(montoComision);
      contratoVenta.setFechaContrato(fechaContrato);
      contratoVenta.setInmueble(inmueble);
      contratoVenta.setLocador(locador);
     contratoVenta.setLocatario(locatario);
     contratoVenta.setMontoVenta(montoTotal);
     contratoVenta.setCronograma(cronograma);
       contratoVenta.setRecargoFijo(recargoFijo);
     contratoVenta.setRecargoProporcional(recargoProporcional);
          contratoventaDAO.registrar(contratoVenta);        
}


public void CrearCronograma (int cantCuotas, int vencimiento1, int vencimiento2) throws Exception{
     CronogramaPagos  cronograma = new CronogramaPagos ();
      cronograma.setCuotas(cantCuotas);
    if (vencimiento1 == 0){
     cronograma.setPrimerFechaPago(02);
    }else{
        cronograma.setPrimerFechaPago(04);
}
    if (vencimiento2 == 0){
        cronograma.setSegundaFechaPago(07);
    }else{
        cronograma.setSegundaFechaPago(10);
    }
    cronogramapagosDAO.registrar(cronograma);
    
}

public CronogramaPagos UltimoCronograma () throws Exception{
    ListCronogramas = cronogramapagosDAO.listar();
    CronogramaPagos cronograma=null;
     for(CronogramaPagos unCronograma :ListCronogramas){
              cronograma= unCronograma;
     }
    return cronograma;
}








/////////////////////////////////////////////Boleta

public List<Boleta> CrearBoletas (int dniLocatario, String nombreLocatario, Date fechaContrato, int fechaPago1, int fechaPago2, double recargoFijo, double recargoProporcional, double monto, int tipoPagoComision, double montoComision, int duracion, String descripcionBoleta) throws Exception{
     List<Boleta> ListBoletasCreadas = new LinkedList();
     Date fecha = new Date();
     Date Vencimiento1 = new Date();
     Date Vencimiento2 = new Date ();
     boolean pagado = false;
     for (int i=0; i<duracion; i++){
       if (tipoPagoComision==0 && i == 0){
           fecha = SumarMeses(fechaContrato,i);
           Vencimiento1 = CalcularVencimiento (fecha,fechaPago1);
           Vencimiento2 = CalcularVencimiento (fecha, fechaPago2);
           double montoComisionUnica = monto+montoComision;
           Boleta boleta = new Boleta ();
           boleta.setDniLocatario(dniLocatario);
           boleta.setNombreLocatario(nombreLocatario);
           boleta.setTotal(montoComisionUnica);
           boleta.setDescripcion(descripcionBoleta);
           boleta.setEstadoPago(pagado);
           boleta.setFechaBoleta(fecha);
           boleta.setPrimerVencimiento(Vencimiento1);
           boleta.setSegundoVencimiento(Vencimiento2);
           boleta.setRecargoFijo(recargoFijo);
           boleta.setRecargoProporcional(recargoProporcional);
           boletaDAO.registrar(boleta);
             ListBoletasCreadas.add(boleta);
       }else if (tipoPagoComision == 0 && i !=0){
           fecha = SumarMeses(fechaContrato,i);
           Vencimiento1 = CalcularVencimiento (fecha,fechaPago1);
           Vencimiento2 = CalcularVencimiento (fecha, fechaPago2);
           Boleta boleta = new Boleta ();
           boleta.setDniLocatario(dniLocatario);
           boleta.setNombreLocatario(nombreLocatario);
           boleta.setTotal(monto);
           boleta.setDescripcion(descripcionBoleta);
           boleta.setEstadoPago(pagado);
           boleta.setFechaBoleta(fecha);
           boleta.setPrimerVencimiento(Vencimiento1);
           boleta.setSegundoVencimiento(Vencimiento2);
           boleta.setRecargoFijo(recargoFijo);
           boleta.setRecargoProporcional(recargoProporcional);
           boletaDAO.registrar(boleta);
           ListBoletasCreadas.add(boleta);
                }
    if (tipoPagoComision == 1){
           fecha = SumarMeses(fechaContrato,i);
           Vencimiento1 = CalcularVencimiento (fecha,fechaPago1);
           Vencimiento2 = CalcularVencimiento (fecha, fechaPago2);
           double montoComisionMensual = monto+(montoComision%duracion);
           Boleta boleta = new Boleta ();
           boleta.setTotal(montoComisionMensual);
           boleta.setDescripcion(descripcionBoleta);
           boleta.setEstadoPago(pagado);
           boleta.setFechaBoleta(fecha);
           boleta.setPrimerVencimiento(Vencimiento1);
           boleta.setSegundoVencimiento(Vencimiento2);
           boleta.setRecargoFijo(recargoFijo);
           boleta.setRecargoProporcional(recargoProporcional);
           boletaDAO.registrar(boleta);
           ListBoletasCreadas.add(boleta);
    }
        
    }
    return ListBoletasCreadas;
}










/////////////////////////////////////////////////Metodo para convertir una ruta en Imagen

public byte[] ObtenerImagen(String ruta){
    File imagen = new File(ruta);
    try{
        byte[] comprobante = new byte [(int) imagen.length()];
        InputStream input = new FileInputStream(imagen);
        input.read(comprobante);
        return comprobante;
               }catch (Exception ex){
        return null;
    }
    
    
    
}

//////////////////Metodos Fechas

  public static Date SumarMeses (Date fecha, int meses) {
        Date retorno = new Date();
        try {
            Calendar c1 = Calendar.getInstance();
            c1.setTime(fecha);
            c1.add(Calendar.MONTH, meses);
            c1.set(Calendar.DAY_OF_MONTH, 1);
           retorno = c1.getTime();
           return retorno;
        } catch (Exception e) {
            return null;
        }
    }

   public static Date CalcularVencimiento (Date fecha, int dias) {
        Date retorno = new Date();
        try {
            Calendar c1 = Calendar.getInstance();
            c1.setTime(fecha);
           c1.set(Calendar.DAY_OF_MONTH, dias);
           retorno = c1.getTime();
           return retorno;
        } catch (Exception e) {
            return null;
        }
    }


/////////Calcular total Boleta
   
   public double PagarBoleta(Date fechaActual, Date vencimiento1, Date vencimiento2,double monto, double recargoProp, double recargoFijo){
       double retorno = monto;
       int diasMora= 0;
       if (fechaActual.after(vencimiento1) && fechaActual.before(vencimiento2)){
           monto = monto + recargoFijo;
           retorno = monto;   
                  }
       if (fechaActual.after(vencimiento2)){
           diasMora = (int) ( fechaActual.getTime() - vencimiento2.getTime() );
          monto = monto+ recargoFijo + (diasMora*recargoProp);          
          retorno = monto;   
       }       
              
    return retorno;   
   }
   
   public Boleta BuscarBoleta (int id) throws Exception{
      ListBoletas= boletaDAO.listar();
       Boleta retorno = new Boleta();
       Boleta unaBoleta = new Boleta();
        for (int contador = 0; contador <= ListBoletas.size(); contador++){
            unaBoleta = ListBoletas.get(contador);     
            int codigo = unaBoleta.getIdBoleta();
                if (id==codigo){                       
                    retorno= unaBoleta; 
                    contador = (ListBoletas.size()+1);   //fuerza para salir del bucle
                }
        }
        return retorno;
    
}






}
