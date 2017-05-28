<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="col-md-8 col-md-offset-2">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Додати коментар</h3>
        </div>
        <div class="panel-body">
            <form action="/film-comment" method="post"  role="form">
                <input type="hidden" name="filmId" value="${film.id}">

                <label for="authorName" class="control-label col-xs-4">Ім'я:</label>
                <input type="text" name="authorName" id="authorName" class="form-control" placeholder="Антон" required="true"/>

                <label for="comment" class="control-label col-xs-4">Коментар:</label>
                <textarea name="comment" id="comment" class="form-control" rows="3" required required="true"></textarea>
                <br>
                <button type="submit" class="btn btn-primary btn-md pull-right">Додати</button>
            </form>
        </div>
    </div>
</div>