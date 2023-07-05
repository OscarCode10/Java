<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DashBoard de Facebook</title>
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="assets/css/dashboard11.css">
</head>
<body>
    <aside class="aside active" id="aside">
        <div class="head">
            <div class="profile">
                <p>Menu de Opciones de Facebook</p>
            </div>
            <i class='bx bx-menu' id="menu"></i>
        </div>
        <div class="options">            
            <div>  
                <i class='bx bx-plus' ></i>
                <a href="publicacion?publicacion=dMenuP"><span class="option">Publicaciones</span></a>
            </div>
        </div>
    </aside>
    <!--<center><p><%=new String ("Bienvenido Usuario Oscar") %></p></center>-->
    <script src="assets/js/dashboard.js"></script>
    <h1 class="titu-dash">DashBoard de Facebook</h1>
    <a href="usuario?usuario=Cerrar Sesion"><input type="submit" value="Cerrar Sesión" class="bot-cerrar"></a>
    <a href="publicacion?publicacion=crearP"><input type="submit" value="Crear Publicación" class="bot-crear"></a>
    <a href="publicacion?publicacion=verP"><input type="submit" value="Ver Publicación" class="bot-ver"></a>
    <div>
        <form action="publicacion" method="post">
            <h1>Crear Publicación</h1>
            <input class="input" type="text" name="publi" placeholder="Texto de publicación">
            <input class="input" type="text" name="num" placeholder="numero de publicación">
            <input class="iniciar" type="submit" name="publicacion" value="Crear Publicacion">
        </form>
    </div>
    <!--<script>
        alert(`La publicación se ha creado correctamente y dice: <%=request.getAttribute("publi")%>`);
    </script>-->
    <!--<p>
        <%!
        private String coment;

        public String verComentario(String comenta){
        coment="Me gusta tu foto";
        return coment;
        }
        %>
    </p>
    <center><p><%=new String ("Este es tu comentario: "+verComentario("")) %></p></center>-->
</body>
</html>