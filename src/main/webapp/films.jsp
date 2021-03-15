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
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
    <div style="margin: 50px auto; width: 80%">
        <div class="row row-cols-1 row-cols-md-3">
            <%
                FilmDao filmDao = new FilmDaoImpl();
                List<Film> filmList = new ArrayList<>();
                filmList = filmDao.getFilms();
                response.setContentType("text/html");
                AccountDao accountDao = new AccountDAOImpl();
                String username = (String) session.getAttribute("username");
                Account account = accountDao.getAccount(username);
                for(Film film: filmList) {
            %>
            <div class="card h-50 w-50" style="width: 18rem; margin: 20px">
                <img class="card-img-top" src="<%=film.getTrailer()%>" alt="Card image cap">
                <div class="card-body">

                    <h4>
                        Name : <%=film.getFilmName()%>
                    </h4>
                    <h5>
                        Duration : <%=film.getDuration()%>
                    </h5>
                    <h5>
                        Genre :<%=film.getGenre()%>
                    </h5>
                    <h5>
                        Pegi : <%=film.getPegi()%>
                    </h5>
                    <p class="card-text">
                        <%=
                            film.getDescription()
                        %></p>
                    <div>
                        <form action="">
                            <a><button type="submit" class="btn btn-primary btn-block" name = "submit" value="login" > Buy ticket </button></a>
                        </form>

                    </div> <!-- form-group// -->
                </div>
            </div>
            <%
                }
            %>

        </div>
        <%
            if (account.getRolenum() == 1) { %>
        <div class="form-group">
            <a><button type="submit" class="btn btn-primary btn-block" name = "submit" value="register"> Add Film </button></a>
        </div> <!-- form-group// -->
        <%
            }
        %>

    </div>
</body>
</html>
