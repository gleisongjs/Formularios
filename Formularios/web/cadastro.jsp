<%-- 
    Document   : index
    Created on : 27/04/2017, 09:17:08
    Author     : Gleisongjs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
        <link href="public/css/bootstrap.min.css" rel="stylesheet">
        <link href="public/css/bootstrap-select.min.css" rel="stylesheet">
        <link href="public/css/style.css" rel="stylesheet">
        <link href="public/css/costumizado.css" rel="stylesheet">
        <link href="public/stylesheets/locastyle.css" rel="stylesheet" type="text/css">
        <script src="public/js/jquery.min.js" type="text/javascript"></script>
    </head>
    <body>

        <!-- Formulário de Cadastro -->
        <div class="container">
            <div class="view-form">                            
                <form action="#SV" name="cadastrasv" class="form-horizontal" method="post">
                    <input type="hidden" id="id" name="id"/>
                    <div class="panel panel-default">
                        <div class="panel-heading"> Dados Pessoais</div>
                        <div class="panel-body">                       
                            <div class="form-group">
                                <label for="nome" class="control-label col-md-2"><span class="obrigatorio">*</span> Nome</label>
                                <div class="col-md-4">           
                                    <input type="text" class="form-control" name="nome" maxlength="100" placeholder="Nome" required>
                                </div>

                                <label for="sexo" class="control-label col-md-2"><span class="obrigatorio">*</span> Sexo</label>
                                <div class="col-md-4">           
                                    <input type="text" class="form-control" name="sexo" maxlength="14" placeholder="Sexo" required>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="telefone" class="control-label col-md-2"><span class="obrigatorio">*</span> Telefone</label>
                                <div class="col-md-4">           
                                    <input type="text" class="form-control" name="telefone" maxlength="14" placeholder="Telefone" required>
                                </div>
                                <label for="whatsapp" class="control-label col-md-2"> WhatsApp</label>
                                <div class="col-md-4">
                                    <input  type="text" class="form-control" maxlength="14" name="whatsapp" placeholder="WhatsApp" required />
                                </div>
                            </div> 

                            <div class="form-group">
                                <label for="Endereço" class="control-label col-md-2"> Endereço completo</label>
                                <div class="col-md-4">
                                    <input  type="text" class="form-control" maxlength="100" name="endereco" placeholder="Endereço completo" required />
                                </div>

                                <label for="foto" class="control-label col-md-2"> Foto</label>
                                <div class="col-md-4">
                                    <input  type="file" class="form-control"  name="foto"  required />
                                </div>

                            </div>                           
                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">Acesso</div>
                        <div class="panel-body">
                            <div class="form-group">
                                <label for="email" class="control-label col-md-2"><span class="obrigatorio">*</span> E-mail</label>
                                <div class="col-md-4">
                                    <input type="text" class="form-control" name="email" maxlength="100" placeholder="email@exemplo.com" required />
                                </div> 
                            </div>                          

                            <div class="form-group">
                                <label for="senha" class="control-label col-md-2"><span class="obrigatorio">*</span> Senha</label>
                                <div class="col-md-4">
                                    <input type="password" class="form-control" name="senha" maxlength="14" placeholder="Senha" required/>
                                </div>
                                <label for="confirmaSenha" class="control-label col-md-2"><span class="obrigatorio">*</span> Confirmar Senha</label>
                                <div class="col-md-4">
                                    <input type="password" class="form-control" name="confirmar_senha"  maxlength="14" placeholder="Confirmar Senha" required/>
                                </div>
                                <br/><br/><br/><br/><br/><br/>

                                <!-- BOTÕES DE AÇÕES -->
                                <div class="form-group">
                                    <div style="alignment-adjust: central" ><center>
                                            <span id="load"></span>
                                            <input type="submit" name="btnsubmit" class="btn btn-success" aria-label="Left Align">
                                            <input type="reset" name="btnreset" class="btn btn-danger" aria-label="Right Align">
                                        </center>

                                    </div>
                                    <div class="col-md-12" style="text-align: right">
                                        <span class="obrigatorio">*</span> Campos Obrigatórios
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div> 
        </div>
    </body>
</html>
