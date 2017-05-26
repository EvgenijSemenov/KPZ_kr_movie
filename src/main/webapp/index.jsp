<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <%@ page contentType="text/html; charset=UTF-8" %>
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <link rel="stylesheet" href="../css/style.css">
    </head>
    <body>
        <div class="row">
            <nav class="navbar navbar-inverse">
                <div class="col-md-2 col-md-offset-1">
                    <img alt="Logo" src="../images/logo.png">
                </div>
                <div class="col-md-4">
                    <h2 class="text-primary">Багатозальний кінотеатр</h2>
                </div>
                <div class="col-md-4 col-md-offset-1">
                    <ul class="nav navbar-nav">
                        <li><a href="#">Головна</a></li>
                        <li><a href="#">Сеанси</a></li>
                    </ul>
                </div>
            </nav>
        </div>
        <div class="row">
            <div class="panel panel-default col-md-10 col-md-offset-1">
                <ul class="nav navbar-nav">
                    <li><a href="/film/add">Додати фільм</a></li>
                </ul>
            </div>
        </div>
        <div class="container">
            <c:forEach items="${film}" var="filmList">
              <div class="panel panel-default">
                <div class="panel-heading">
                  <h3 class="panel-title">${film.name}</h3>
                </div>
                <div class="panel-body">
                  ${film.description}
                </div>
              </div>
            </c:forEach>

        </div>
    </body>
</html>