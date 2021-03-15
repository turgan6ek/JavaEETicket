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
        session.setAttribute(account.getUsername(), "name");
        session.setAttribute(account.getPhone_num(), "phone");
        session.setAttribute(account.getEmail(), "email");
    %>
    <jsp:include page="header.jsp"></jsp:include>
    <div style="margin: auto; width: 80%; border: #000000 solid 1px">
        <h3>Username: ${name}</h3>
        <h3>Phone Number: ${phone}</h3>
        <h3>Email: ${email}</h3>
    </div>
</body>
</html>
