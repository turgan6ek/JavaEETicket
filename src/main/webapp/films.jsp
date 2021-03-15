<%@ page import="java.util.ArrayList" %>
<%@ page import="entity.Film" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.FilmDao" %>
<%@ page import="dao.FilmDaoImpl" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Films</title>
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
    <div style="margin: 50px auto; width: 70%">
        <div class="card-deck">
            <%
                FilmDao filmDao = new FilmDaoImpl();
                List<Film> filmList = new ArrayList<>();
                filmList = filmDao.getFilms();
                response.setContentType("text/html");

                // Actual logic goes here.
                PrintWriter printWriter = response.getWriter();
                for(Film film: filmList) {
            %>
            <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="<%printWriter.println(film.getTrailer());%>" alt="Card image cap">
                <div class="card-body">
                    <h4>
                        <%printWriter.println(film.getFilmName());%>
                    </h4>
                    <h5>
                        <%printWriter.println(" Duration: " + film.getDuration() + " min");%>
                    </h5>
                    <h5>
                        <%printWriter.println(" Genre: " + film.getGenre() + " min");%>
                    </h5>
                    <h5>
                        <%printWriter.println(" Pegi: " + film.getPegi() + " min");%>
                    </h5>
                    <p class="card-text"><%System.out.printf(film.getDescription());%></p>
                </div>
            </div>
            <%
                }
            %>
        </div>
    </div>
</body>
</html>
