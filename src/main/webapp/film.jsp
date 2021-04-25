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
<jsp:include page="header.jsp"></jsp:include>
<body class="antialiased bg-gray-200 font-sans">
<div class="flex items-center justify-center min-h-screen">
    <div class="max-w-md md:max-w-2xl px-2">
        <div class="bg-white shadow-xl rounded-lg overflow-hidden md:flex">
            <div class="bg-cover bg-bottom h-56 md:h-auto md:w-56" style="background-image: url(<%=film.getTrailer()%>)">
            </div>
            <div>
                <div class="p-4 md:p-5">
                    <p class="font-bold text-xl md:text-2xl"><%=film.getFilmName()%></p>
                    <p class="text-gray-700 md:text-lg"><%=film.getDescription()%></p>
                </div>
                <div class="p-4 md:p-5 bg-gray-100">
                    <div class="sm:flex sm:justify-between sm:items-center">
                        <div>
                            <div class="text-lg text-gray-700"><span class="text-gray-900 font-bold"><%=film.getGenre()%></span> </div>
                            <div class="flex items-center">
                                <div class="text-gray-600 ml-2 text-sm md:text-base mt-1">Duration: <%=film.getDuration()%> min</div>
                            </div>
                        </div>
                        <a href="/buyTicket?id=<%=film.getFilmID()%>"
                           class="mt-3 sm:mt-0 py-2 px-5 md:py-3 md:px-6 bg-indigo-700 hover:bg-indigo-600 font-bold text-white md:text-lg rounded-lg shadow-md">

                        </a>
                    </div>
                    <div class="mt-3 text-gray-600 text-sm md:text-base">*Pegi: <%=film.getPegi()%></div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
