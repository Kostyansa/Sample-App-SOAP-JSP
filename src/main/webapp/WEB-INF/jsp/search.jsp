<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>


<html lang="en">

    <head>
        <title>Search</title>
        <link href="../CSS/main.css" rel="stylesheet" type="text/css"><meta charset="utf-8"/>
     </head>

<body>
    <form action="/search?p=1&l=10" method="POST">
        <input type="text" id="name" name="name">
        <input type="submit" value="Submit">
    </form>
    <section class="search section-class">
        <table class="item-table">
            <c:forEach var="item" items="${items}">
                <tr>
                    <td>"${item.name}"</td>
                    <td>"${item.description}"</td>
                    <td>"${item.price}"</td>
                </tr>
            </c:forEach>
        </table>
        <div>
            .
            <c:forEach var="page" items="${pages}">
                ${page}.
            </c:forEach>
        </div>
    </section>
</body>

</html>
