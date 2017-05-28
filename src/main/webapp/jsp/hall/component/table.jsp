<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="col-md-8 col-md-offset-2">
    <table class="table table-striped table-bordered">
        <tr>
            <th class="col-md-1">Id</th>
            <th class="col-md-8">Назва</th>
            <th class="col-md-3">Операції</th>
        </tr>
        <c:forEach items="${filmHallList}" var="hall">
            <tr>
                <td>${hall.id}</td>
                <td>${hall.name}</td>
                <td>
                    <div class="col-md-6">
                        <a href="/hall/edit/${hall.id}">Редагувати</a>
                    </div>
                    <div class="col-md-6">
                        <a href="/hall/delete/${hall.id}">Видалити</a>
                    </div>
            </tr>
        </c:forEach>
    </table>
</div>