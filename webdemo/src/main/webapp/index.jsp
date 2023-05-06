<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
4+9=<%= 4 + 9 %>
<%= new String("Merhaba Dünya").toUpperCase()%>
<br>
<hr>
<%
for(int i=0;i<5;i++)
        {
        out.println("Merhaba"+i+"<br>");
        }
%>

<h3><%= ortalama(65,98)%></h3>

</body>
</html>

<%!
    double ortalama(int s1,int s2)
    {
        double d1 = (s1+s2)/2;
        return d1;
    }
%>