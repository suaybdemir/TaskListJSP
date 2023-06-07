<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h2>Öğrenci Ekleme Formu</h2>
<form action="ogrenciEkle" method="post">
    <div class="form-check">
        <label class="form-label" for="isimicin">İsim</label>
        <input type="text" name="isim" class="form-check-input" id="isimicin">

    </div>
    <div class="form-check">
        <label class="form-label" for="soyisimicin">Soyisim</label>
        <input type="text" name="soyisim" class="form-check-input" id="soyisimicin">

    </div>

    <div class="form-group">
        <label for="exampleInputEmail1">Eposta</label>
        <input type="email" name="eposta" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">

    </div>


    <button type="submit" class="btn btn-primary">Gönder</button>
</form>


</body>
</html>
