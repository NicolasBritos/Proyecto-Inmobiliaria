<%@page import="java.util.Locale"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Controlador.Controlador"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Boleta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<% Controlador controlador = new Controlador();
int dni = (Integer) session.getAttribute("dni");
 List<Boleta> lista= controlador.ObtenerBoletas(dni);
 SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy",Locale.US);
 %>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <h1>Boletas de <%= session.getAttribute ("usuario") %></h1>
                <p>Dni : <%= session.getAttribute("dni") %> </p>
                <p>//////////////////////////////////////////////// </p>
                <% int nro = 1; %>
                <% String estadoPago = "";%>
                <%for (Boleta boleta : lista){  %> 
                 <%boolean estado = boleta.isEstadoPago();%>
                 <% if (estado == true){
                 estadoPago = "SI";
                 %>
                 <%}else
                estadoPago ="NO";
                %>
               <p> Boleta: <%= nro +" (id boleta: "+ boleta.getIdBoleta()+")" %>   </p> 
               <p> Nombre : <%= boleta.getNombreLocatario()  %> </p>
               <p> Monto : <%= boleta.getTotal() %> </p>
               <p> Fecha:   <%=sdf.format(boleta.getFechaBoleta())%>  </p>
               <p> Pagado: <%=estadoPago%>   </p>
               <p> Descripcion: <%=boleta.getDescripcion()%>   </p>
               <p> ////////////////////////////////////////////////  </p>
               <% nro = nro+1; %>
               <%}%>
                                   
                         </body>
</html>
