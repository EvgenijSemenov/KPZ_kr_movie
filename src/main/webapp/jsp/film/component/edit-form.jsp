<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page contentType="text/html; charset=UTF-8" %>
   <div class="col-md-8 col-md-offset-2">
   <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Редагувати фільм</h3>
            <a href="/film/delete/${film.id}"> Видалити</a>
        </div>
        <form action="/film/update" method="post"  role="form">

        <div class="panel-body">
            <input type="hidden" name="id" value="${film.id}">

            <label for="name" class="control-label col-xs-4">Ім'я:</label>
            <input type="text" name="name" id="name" class="form-control" placeholder="Пірати Карибського моря: Помста Салазара" value="${film.name}" required="true"/>

            <label for="director" class="control-label col-xs-4">Режисер:</label>
            <input type="text" name="director" id="director" class="form-control" placeholder="Хоакім Роннінґ,	Еспен Сандберґ" value="${film.director}" required="true"/>

            <label for="cast" class="control-label col-xs-4">В ролях:</label>
            <input type="text" name="cast" id="cast" class="form-control" placeholder="Джонні Депп, Кая Скоделаріо, Брентон Туєйтес, Орландо Блум" value="${film.cast}" required="true"/>

            <label for="ageLimit" class="control-label col-xs-10">Вікові обмеження:</label>
            <input type="text" name="ageLimit" id="ageLimit" class="form-control" placeholder="12" value="${film.ageLimit}" required="true"/>

            <label for="description" class="control-label col-xs-4">Опис:</label>
            <textarea name="description" id="description" class="form-control" rows="6" placeholder="Вічний щасливчик капітан Джек Воробей переживає важкі часи, адже удача його покинула. Колись дуже давно в молодості Джек Спарроу знищив лютого іспанського борця з піратами капітана Салазара. Цей страшний капітан утік разом зі своєю командою з Диявольського трикутника, щоб знищити всіх піратів, особливо Горобця. Єдиний шанс Джека вижити – знайти легендарний тризуб Посейдона. Цей неймовірно сильний артефакт дозволить своєму господареві бути володарем усіх морів. І допоможуть у цьому капітану Джеку Горобцю його нові друзі – Генрі й Каріна Сміт. Неймовірні пригоди Джека Спарроу тривають!" required="true">${film.description}</textarea>

            <label for="posterUrl" class="control-label col-xs-10">URL зображення:</label>
            <input type="text" name="posterUrl" id="posterUrl" class="form-control" placeholder="http://cherkassy.multiplex.ua/Images/Upload/Пірати_карибського_моря_3Д.jpg" value="${film.posterUrl}" required="true"/>

            <label for="trailerUrl" class="control-label col-xs-10">URL трейлера:</label>
            <input type="text" name="trailerUrl" id="trailerUrl" class="form-control" placeholder="https://www.youtube.com/watch?v=muyqPJN07yE" value="${film.trailerUrl}" required="true"/>
            <br>
            <button type="submit" class="btn btn-primary btn-md pull-right">Зберегти</button>
        </div>
    </form>
    </div>
</div>