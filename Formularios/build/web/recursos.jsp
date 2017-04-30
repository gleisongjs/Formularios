<%-- 
    Document   : recursos
    Created on : 30/04/2017, 21:55:44
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

                <form action="#" name="plantaododia" class="form-horizontal" method="post">

                    <div class="panel panel-default">
                        <div class="panel-heading"> Plantão do dia</div>
                        <div class="panel-body">
                            <div class="form-group">

                                <label for="especialista" class="control-label col-md-1"> Especialista </label>
                                <div class="col-md-3">           
                                    <input type="text" class="form-control" name="especialista" maxlength="100" placeholder="Médico, Psicologo, Dentista..." required>
                                </div>

                                <label for="especialidade" class="control-label col-md-2"> Especialidade </label>
                                <div class="col-md-3">           
                                    <input type="text" class="form-control" name="especialidade" maxlength="100" placeholder="Clínico, Pediatra, Cardiologista..." required>
                                </div>


                                <label for="dropdown" class="control-label col-md-1"> </label>
                                <div class="col-md-2">
                                    <div class="dropdown">
                                        <button class="btn btn-primary dropdown-toggle" type="button" id="dropDown1"
                                                data-toggle="dropdown" aria-expanded="true"> Período <span class="caret"></span></button>
                                        <ul class="dropdown-menu" role="menu-item" aria-labelledby="dropDown1">
                                            <li role="presentation"><a role="menu-item" href="#" tabindex="-1"> Dia </a></li>
                                            <li role="presentation"><a role="menu-item" href="#" tabindex="-1"> Noite </a></li>
                                            <li role="presentation"><a role="menu-item" href="#" tabindex="-1"> Manhã </a></li>
                                            <li role="presentation"><a role="menu-item" href="#" tabindex="-1"> Tarde </a></li>

                                        </ul>
                                    </div>

                                </div>

                            </div> 

                            <br/>
                            <br/>
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
                <form action="#" name="topoSV" class="form-horizontal" method="post">

                    <div class="panel panel-default">
                        <div class="panel-heading"><span class="glyphicon glyphicon-edit"></span> Recursos Disponíveis</div>
                        <div class="panel-body">
                            <div class="form-group">

                                <label for="modelo" class="control-label col-md-2">Profissionais: </label>
                                <div class="col-md-10">
                                    <input type="text" class="form-control" name="titulo"  maxlength="50"  required />
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


                            <br/>
                            <br/>

                            <div class="form-group">

                                <label for="modelo" class="control-label col-md-2">Medicamentos: </label>
                                <div class="col-md-10">
                                    <input type="text" class="form-control" name="medecamentos"  maxlength="50"  required />
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

                            <br/>
                            <br/>

                            <div class="form-group">

                                <label for="modelo" class="control-label col-md-2">Exames: </label>
                                <div class="col-md-10">
                                    <input type="text" class="form-control" name="exames"  maxlength="50"  required />
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

                            <br/>
                            <br/>

                            <div class="form-group">

                                <label for="modelo" class="control-label col-md-2">Vacinas: </label>
                                <div class="col-md-10">
                                    <input type="text" class="form-control" name="vacinas"  maxlength="50"  required />
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

                            <br/>
                            <br/>
                        </div>
                    </div>
                </form>

                <form action="#" name="topoSV" class="form-horizontal" method="post">

                    <div class="panel panel-default">
                        <div class="panel-heading"><span class="glyphicon glyphicon-map-marker"></span> Localização </div>
                        <div class="panel-body">
                            <div class="form-group">

                                <label for="modelo" class="control-label col-md-2">Localização: </label>
                                <div class="col-md-10">
                                    <input type="text" class="form-control" name="localizacao"  maxlength="50" placeholder="ex: -16.3371453,-48.9542698" required />
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