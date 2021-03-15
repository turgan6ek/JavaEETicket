<%@ page import="dao.AccountDao" %>
<%@ page import="dao.AccountDAOImpl" %>
<%@ page import="entity.Account" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <%
        AccountDao accountDao = new AccountDAOImpl();
        Account account = accountDao.getAccount((String)session.getAttribute("username"));

    %>
    <jsp:include page="header.jsp"></jsp:include>

</body>
</html>
