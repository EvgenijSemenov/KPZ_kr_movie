<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="col-md-8 col-md-offset-2">
   <div class="panel panel-default">
        <div class="panel-heading">
               <span class="panel-title">Додати фільм</span>
        </div>
        <form action="/hall" method="post"  role="form">
            <div class="panel-body">
                <label for="name" class="control-label col-xs-4">Ім'я:</label>
                <input type="text" name="name" id="name" class="form-control" placeholder="Пірати Карибського моря: Помста Салазара" required="true"/>
                <br>
                <button type="submit" class="btn btn-primary btn-md pull-right">Додати</button>
            </div>
        </form>
   </div>
</div>