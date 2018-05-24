<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Signin</title>

    <!-- Bootstrap core CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
          rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.servletContext.contextPath}/css/signin.css" rel="stylesheet">
  </head>

  <body class="text-center">
    <form class="form-signin"
          action="${pageContext.servletContext.contextPath}/IngresoServlet"
          >
      <img class="mb-4" src="http://www.construccionenacero.com/sites/construccionenacero.com/files/noticia/bc_07-16_n_5_copia.png" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Ingreso</h1>
     
         
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
    </form>
  </body>
</html>

