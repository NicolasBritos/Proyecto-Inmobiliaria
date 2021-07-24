<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset ="utf-8">
    <title>Login</title>
    <link rel= "stylesheet"  type= "text/css" href="CSS/main.css">
   </head>
   <body>
  
<div class="login-box">
    <img class="logo" src= "IMG/logo.jpg" alt= "logodachary">
    <h1>Loguear</h1>

<!--Formulario-->
    <form action="SvTest" method="GET"> 
       <!-- Usuario--> 
        <label for= "usuario">Usuario</label>
        <input type="text" placeholder="Ingrese el Usuario" name="usuario">

        <!--Contraseña-->
<label for= "contraseña">Contraseña</label>
<input type = "password" placeholder= "Ingrese Contraseña" name="password">
<input type= "submit" value="Enviar">
      
    </form>
</div>
    
   </body>
</html>
