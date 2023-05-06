<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="author"
        content="Suayb Demir">
  <link rel="stylesheet" href="main.css">
  <meta name="description" content="My first jsp forum web page">
  <title>Forum Insurance</title>
</head>
<body>
<main>
  <article id="Forum">
    <table>
      <caption><h1><i>User</i> Informations</h1></caption>
      <thead>
      <th scope="col">&nbsp;</th>
      <th scope="col">Details</th>
      </thead>
      <tbody>
      <tr scope="row">
        <td>First Name</td>
        <td>${param.firstName}</td>
      </tr>
      <tr scope="row">
        <td>Last Name</td>
        <td>${param.lastName}</td>
      </tr>
      <tr scope="row">
        <td>Telephone Number</td>
        <td>${param.phone}</td>
      </tr>
      <tr scope="row">
        <td>Favourite Coffee</td>
        <td>${param.cofee}</td>
      </tr>
      <tr scope="row">
        <td>Favourite Day in Mid-Week</td>
        <td><%= request.getParameter("mid-week")%></td>
      </tr>
      <tr scope="row">
        <td>Favourite Day in Weekend</td>
        <td><%= request.getParameter("weekend")%></td>
      </tr>
      </tbody>
      <tfoot>
      <tr id="date">
        <td>&nbsp;</td>
        <td><time datetime="2023-05-06"><small><em>05/06/2023</em></small></time></td>
      </tr>
      </tfoot>
    </table>
  </article>
</main>
</body>
</html>
