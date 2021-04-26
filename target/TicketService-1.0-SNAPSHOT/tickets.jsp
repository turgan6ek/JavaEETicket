<%@ page import="dao.TicketDao" %>
<%@ page import="dao.TicketDaoImpl" %>
<%@ page import="entity.Ticket" %>
<%@ page import="entity.Film" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tickets</title>
    <link rel="stylesheet" href="css/ticket.css">
</head>
<body>
<%@include file="header.jsp"%>
<div class="container text-center">
    <br>
    <br>
    <!-- Logo -->
    <div class="logo">
        <h1><b>Your Tickets:</b></h1>
    </div>

</div>
<div style="margin: 50px auto; width: 80%">
    <div class="row row-cols-1 row-cols-md-3">
        <%
            TicketDao ticketDao = new TicketDaoImpl();
            List<Ticket> ticketList;
            ticketList = ticketDao.getMyTickets(user.getUser_id());
            for(Ticket ticket: ticketList) {
        %>
        <div class="card">
            <img src="<%=ticket.getFilm().getTrailer()%>">
            <div class="descriptions">
            <h1><%=ticket.getFilm().getFilmName()%>></h1>
            <p>
            Bought at: <%=ticket.getStartDate()%>
            </p>
                <p>
                    Duration: <%=ticket.getFilm().getDuration()%>
                </p>
                <p>
                    Price: <%=ticket.getPrice()%>
                </p>
        </div>
        </div>
        <%
            }
        %>

    </div>
    <%
        if (ticketList.size() == 0) {
    %>
    <div class="logo">
        <h1><b>You have no tickets</b></h1>
    </div>
    <%
        }
    %>
</div>
</body>
</html>
