<%-- 
    Document   : login
    Created on : 28/04/2017, 15:16:26
    Author     : Gleisongjs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
        <meta charset="utf-8">
        <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="Casa Conectada" content="Sistema Água para Layla">

        <!-- inserindo o bootstrap-->
        <link href="public/css/bootstrap.min.css" rel="stylesheet">
        <link href="public/css/bootstrap-select.min.css" rel="stylesheet">
        <link href="public/css/style.css" rel="stylesheet">
        <link href="public/css/costumizado.css" rel="stylesheet">

        <link href="public/stylesheets/locastyle.css" rel="stylesheet" type="text/css">
        <link rel="icon" sizes="192x192" href="images/portal.png">
        <link rel="apple-touch-icon" href="public/img//portal.png">
        <!-- Ele funciona da mesma com toda a versão do jQuery 1.x para 2.x -->
        <script src="public/js/jquery-1.9.1.min.js" type="text/javascript"></script>
        <script src="public/js/jquery.min.js" type="text/javascript"></script>
        <script src="public/js/bootstrap/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container col-md-12">

            <div class="container" align="center">
                <img class="img-circle" id="logo" src="public/img/logologin.jpg">

            </div>

            <!-- Begin # DIV Form -->
            <div id="div-forms">

                <!-- Begin # Login Form -->
                <div class="container col-md-4">
                </div>

                <div class="container col-md-4">

                    <form id="login-form"  align="center">
                        <input id="login_username" class="form-control" type="text" placeholder="Email" required>
                        <br/>
                        <input id="login_password" class="form-control" type="password" placeholder="senha" required>
                        <br/>
                        <button type="submit" class="btn btn-primary btn-lg btn-block">Entrar</button>
                    </form>
                </div>
                <div class ="container col-md-4"></div>
            </div>
        </div>

        <div class ="container" align="center">
            <button id="login_lost_btn" type="button" class="btn btn-link">Esqueceu a senha?</button> || 
            <a href = "cadastro.jsp" <button id="login_register_btn" type="button" class="btn btn-link">Cadastre-se</button></a>
        </div>
    </body>
</html>
