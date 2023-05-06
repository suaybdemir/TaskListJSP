<%@ page import ="com.example.webdemo.FonkSinif" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="author" content="Suayb Demir">
    <meta name="description" content="This page is my first jsp page">
    <title>Hello World</title>
</head>
<body>
50 ile 35 sayisinin ortalamasi: <%= FonkSinif.ortalama(50,35) %>
<pre>

<%= request.getHeader("User-agent")%>

<%= request.getLocalAddr()%>

<%= request.getLocale()%>
</pre>
</body>
</html>
