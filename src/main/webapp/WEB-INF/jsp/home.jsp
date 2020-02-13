<html>
    <head>
        <title>Work</title>
        <link href="../CSS/work.css" rel="stylesheet" type="text/css"><meta charset="utf-8"/>
    </head>

    <body>
        <div class="header">
            <div class="item"></div>
            <c:if test = "${user.position.equals('admin')}">
                <a href="/home/add"><div class="item">Добавить смену</div></a>
            </c:if>
            <div class="item-center">Something to do with the transport company</div>
            <div class="item"><a href="/logout">Выход</a></div>
        </div>
    </body>
</html>
