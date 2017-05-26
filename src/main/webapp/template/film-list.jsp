<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="col-md-8 col-md-offset-2">
    <c:forEach items="${filmList}" var="film">
        <div class="panel panel-default">
            <div class="panel-heading">
                <a class="panel-title" href="/film/${film.id}">${film.name}</a>
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
                        <p>${fn:substring(film.description, 0, 300)}${fn:length(film.description) > 300 ? "..." : ""}</p>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
</div>