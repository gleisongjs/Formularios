<%-- 
    Document   : unidades.jsp
    Created on : 27/03/2017, 21:55:25
    Author     : Gleisongjs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="ls-theme-blue" lang="pt-br">
    <head>
        <title>Sistema Consultar</title>
        <meta charset="utf-8">
        <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="CarSell APP" content="Essa aplicação será utilizada na avaliação da 3º VA, na disciplina de Programação e Tecnologia para Web">
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
    </head>
    <body>
            <div class="container col-md-12">
               
                <div class="view-form">  

                    <form action="#" name="unidadeSv" class="form-horizontal" method="post">

                        <div class="panel panel-default">
                            <div class="panel-heading"> Inserir Unidade de Saúde</div>
                            <div class="panel-body">
                                <div class="form-group">

                                    <label for="nome" class="control-label col-md-2"> Nome: </label>
                                    <div class="col-md-4">
                                        <input type="text" class="form-control" name="nome"  maxlength="50"  required />
                                    </div>

                                    <label for="imagem" class="control-label col-md-2"> Imagem:  </label>
                                    <div class="col-md-4">
                                        <input type="file" class="form-control" name="imagem"    required />
                                    </div>

                                </div> 

                                <div class="form-group">
                                    
                                     <label for="descricao" class="control-label col-md-2"> Endereço:  </label>
                                    <div class="col-md-4">
                                        <input type="text" class="form-control" name="descricao"    required />
                                    </div>
                                     
                                     <label for="descricao" class="control-label col-md-2"> Telefone:  </label>
                                    <div class="col-md-4">
                                        <input type="text" class="form-control" name="telefone"    required />
                                    </div>
                                     
                                </div> 
                                
                                <div class="form-group">
                                    
                                     <label for="descricao" class="control-label col-md-2"> Email:  </label>
                                    <div class="col-md-4">
                                        <input type="text" class="form-control" name="email"    required />
                                    </div>
                                     
                                     <label for="descricao" class="control-label col-md-2"> http//:  </label>
                                    <div class="col-md-4">
                                        <input type="text" class="form-control" name="site"    required />
                                    </div>
                                     
                                </div> 
                                
                                <div class="form-group">
                                                                                                             
                                    <label for="descricao" class="control-label col-md-2"> Descrição:  </label>
                                    <div class="col-md-10">
                                        <input type="text" class="form-control" name="descricao"    required />
                                    </div>
                                </div> 
                                
                                <br/>
                                <br/>
                                
                                <!-- BOTÕES DE AÇÕES -->
                                <div class="form-group">
                                    <div style="alignment-adjust: central" ><center>
                                            <span id="load"></span>
                                            <input type="submit" name="btnsubmit" class="btn btn-success" aria-label="Left Align">
                                            <input type="reset" name="btnreset" class="btn btn-danger" aria-label="Right Align">
                                        </center>
                                    </div>
                                    <div class="col-md-9" style="text-align: right"></div>
                                </div>

                            </div>
                        </div>
                    </form>    
            </div>
            </div>
</body>
</html>


