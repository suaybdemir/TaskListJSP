<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1">
    <tr>
        <th>İsim</th>
        <th>Soyisim</th>
        <th>Eposta</th>
    </tr>

    <c:forEach var="ogrenci" items="${ogrenci_listesi}">
        <tr>
            <td> ${ogrenci.isim}</td>
            <td> ${ogrenci.soyisim}</td>
            <td> ${ogrenci.eposta}</td>
        </tr>

    </c:forEach>
</table>


</body>
</html>
