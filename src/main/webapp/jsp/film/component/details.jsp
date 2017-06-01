<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="col-md-8 col-md-offset-2">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">
                ${film.name}
            </h3>
            <a href="/film/edit/${film.id}">Редагувати </a>
            <a href="/film/delete/${film.id}"> Видалити</a>
        </div>
        <div class="panel-body">
            <div class="col-md-2">
                <img alt="${film.name}" src="${film.posterUrl}">
            </div>
            <div class="col-md-10">
                <div class="col-md-4">
                    <p><strong>Режисер:</strong> ${film.director}</p>
                </div>
                <div class="col-md-4">
                    <p><strong>В ролях:</strong> ${film.cast}</p>
                </div>
                <div class="col-md-4">
                    <p><strong>Вікові обмеження:</strong> ${film.ageLimit}</p>
                </div>
                <div class="col-md-12">
                    <p>${film.description}</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-8 col-md-offset-3">
                <div class="embed-responsive embed-responsive-16by9">
                    <iframe class="embed-responsive-item" src="${film.trailerUrl}"></iframe>
                </div>
            </div>
        </div>
    </div>
</div>