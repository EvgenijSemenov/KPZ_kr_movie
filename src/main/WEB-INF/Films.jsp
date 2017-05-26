<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Фільми</title>
  <meta name="discription" content="Кінотеатр">
  <meta charset="utf-8">
  <link href="styles/styles.css" rel="stylesheet" type="text/css">
</head>
<body>

<c:forEach items="${studList}" var="stud">
  <div id="film_block">

      <%--<img src="${stud.url.urlOfFilm}" heigth="400" width="300" id="film_pic">--%>

    <input type="image" src="${stud.url.urlOfFilm}" name="imginfo" heigth="400" width="300" id="film_pic" style="float: left;">
    <a href="${stud.url.urlOfImage}?id=${stud.films.id}" src="${stud.url.urlOfFilm}" heigth="400" width="300" id="film_pic"></a>
    <div id="info">
      <h1>${stud.films.nameOfFilm}</h1>
      <p>Время:${stud.time}</p>
      <p>Жанр:${stud.genre.name}</p>
      <p>Про фильм:${stud.premiere.nameOfVariant}</p>

      <p>Продолжительность:${stud.durationOfFilm}</p>
      <p>Зал:${stud.hall.hallName}</p>
      <p>Описание:${stud.informationOfFilm}</p>
      <p>Трейлер:${stud.actors.nameOfActors}</p>
    </div>
  </div>
</c:forEach>

</body>
</html>
