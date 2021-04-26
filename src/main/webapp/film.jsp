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

</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
<br>
<br>
<br>
    <div class="container" style="width: 70%; margin: auto">
        <div class="card mb-3" >
            <div class="row no-gutters">
                <div class="col-md-4">
                    <img src="<%=film.getTrailer()%>" class="card-img" alt="...">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title"><%=film.getFilmName()%></h5>
                        <p class="card-text">Duration: <%=film.getDuration()%> Genre: <%=film.getFilmName()%></p>
                        <p class="card-text"><%=film.getDescription()%></p>
                        <p class="card-text"><small class="text-muted">*Pegi: <%=film.getPegi()%></small></p>
                        <a href="${pageContext.request.contextPath}/buyTicket?id=<%=film.getFilmID()%>" class="btn btn-primary">Buy Ticket</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
