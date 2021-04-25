<%@ page import="java.util.ArrayList" %>
<%@ page import="entity.Film" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.FilmDao" %>
<%@ page import="dao.FilmDaoImpl" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="entity.Account" %>
<%@ page import="dao.AccountDAOImpl" %>
<%@ page import="dao.AccountDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Films</title>
    <link href="css/film.css" rel="stylesheet">
</head>
<body>
<%@include file="header.jsp"%>
    <div style="margin: 50px auto; width: 80%">
        <div class="row row-cols-1 row-cols-md-3">
           <%
                FilmDao filmDao = new FilmDaoImpl();
                List<Film> filmList;
                filmList = filmDao.getFilms();
                for(Film film: filmList) {
            %>
            <a href="/film?id=<%=film.getFilmID()%>">
                <div class="profile-card-2"><img src="<%=film.getTrailer()%>" width="300" height="500">
                    <div class="profile-name"><%=film.getFilmName()%></div>
                    <div class="profile-username"><%=film.getGenre()%>></div>
                </div>
            </a>
            <%
                }
            %>

        </div>
        <%
            if (user.getRolenum() == 1) { %>
        <div class="form-group">
            <a href="add.jsp"><button type="submit" class="btn btn-primary btn-block" name = "submit" value="register"> Add Film </button></a>
        </div> <!-- form-group// -->
        <%
            }
        %>

    </div>
</body>
</html>
