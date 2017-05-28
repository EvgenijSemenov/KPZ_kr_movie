<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<c:if test="${fn:length(film.filmCommentList) gt 0}">


<div class="col-md-8 col-md-offset-2">
        <div class="panel panel-default">
            <div class="panel-heading">
                <span>Коментарі</span>
            </div>
            <div class="panel-body">
                <c:forEach items="${film.filmCommentList}" var="comment">
                    <div class="col-md-3">
                        <span>Автор: ${comment.authorName}</span>
                    </div>
                    <div class="col-md-9">
                        <span>Дата: ${comment.createDate}</span>
                    </div>
                    <div class="col-md-12">
                        <p>${comment.comment}</p>
                    </div>
                </c:forEach>
            </div>
        </div>

</div>
</c:if>