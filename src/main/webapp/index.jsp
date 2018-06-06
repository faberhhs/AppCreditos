<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Signin Template for Bootstrap</title>

        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath}/css/signin.css" rel="stylesheet">
    </head>

    <body class="text-center">
        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#">AppCreditos</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/ServletUsuario?accion=listar">
                            Listar Creditos<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/ServletUsuario?accion=masUtiliza">
                            Credito Mas Utilizado</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/ServletUsuario?accion=creditoAcumulado">
                            Credito Acumulado</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/ServletUsuario?accion=prestaMas">
                            Quien Presta Mas?</a>
                    </li>
                </ul>
            </div>
        </nav>
        <form class="form-signin"
              action="${pageContext.servletContext.contextPath}/ServletUsuario" 
              method="post">
            <img class="mb-4" src="http://www.jave.cl/res/img/creditonuevo.jpg" alt="" width="72" height="72">
            <h1 class="h3 mb-3 font-weight-normal">Registrar Credito</h1>
            <label for="inputCredito" class="sr-only">Numero Credito</label>
            <input type="text" id="inputEmail" name="txtnumcredito" class="form-control" placeholder="Numero Credito" required autofocus>
            <label for="inputDocumento" class="sr-only">Documento</label>
            <input type="text" id="inputPassword" name="txtdocumento" class="form-control" placeholder="Documento" required>
            <label for="inputNombre" class="sr-only">Nombre Completo</label>
            <input type="text" id="inputPassword" name="txtnombre" class="form-control" placeholder="Nombre" required>
            <label for="inputMonto" class="sr-only">Monto</label>
            <input type="text" id="inputPassword" name="txtmonto" class="form-control" placeholder="Monto" required>
            <select name="txttitrabajador" id="inputState" class="form-control" required>
                <option value="">Tipo Trabajador</option>
                <option value="inpendiente">Inpendiente</option>
                <option value="dependiente" >Dependiente</option>
            </select>

            <select name="txtticredito" id="inputState" class="form-control" required>
                <option value="">Tipo Credito</option> 
                <option value="vivienda">Vivienda</option>
                <option value="estudio" >Estudio</option>
                <option value="libre" >Libre Inversion</option>
            </select>

            <select name="txttrabaja" id="inputState" class="form-control" required>
                <option value="">Trabaja?</option>
                <option value="si">Si</option>
                <option value="no" >No</option>
            </select>
            <button name="accion" value="crear" type="submit" 
                    class="btn btn-primary">
                Registrar 
            </button>
            <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
        </form>
    </body>
</html>

