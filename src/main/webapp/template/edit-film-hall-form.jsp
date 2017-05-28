<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="col-md-8 col-md-offset-2">
   <div class="panel panel-default">
        <div class="panel-heading">
               <span class="panel-title">Редагувати зал</span>
        </div>
        <form action="/hall/update" method="post"  role="form">
            <div class="panel-body">
                <input type="hidden" name="id" value="${filmHall.id}">
                <label for="name" class="control-label col-xs-4">Назва:</label>
                <input type="text" name="name" id="name" class="form-control" value="${filmHall.name}" required="true"/>
                <br>
                <button type="submit" class="btn btn-primary btn-md pull-right">Зберегти</button>
            </div>
        </form>
   </div>
</div>