<%--
  Created by IntelliJ IDEA.
  User: turga
  Date: 15.03.2021
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="user" class="entity.Account" scope="session"></jsp:useBean>
<jsp:useBean id="film" class="entity.Film" scope="session"></jsp:useBean>
<html>
<head>
    <title><%=film.getFilmName()%></title>
    <style>
        .card-img-top {
            width: 100%;
            height: 30vw;
            object-fit: cover;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<br>
<br>
<br>
<div class="card mb-3" style="width: 70%; margin: auto;">
    <img class="card-img-top" src="<%=film.getTrailer()%>" alt="Card image cap">
    <div class="card-body">
        <h5 class="card-title"><%=film.getFilmName()%></h5>
        <h6 class="card-subtitle mb-2">Genre: <%=film.getGenre()%>      Duration: <%=film.getDuration()%></h6>
        <p class="card-text"><%=film.getDescription()%></p>
        <h6 class="card-subtitle mb-2 text-muted">PEGI: <%=film.getPegi()%></h6>

        <a href="/buyTicket?userID=<%=user.getUser_id()%>&filmID=<%=film.getFilmID()%>" class="btn btn-primary">Go somewhere</a>
    </div>
</div>
</body>
</html>
