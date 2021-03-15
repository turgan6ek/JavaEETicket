<%@ page import="dao.AccountDao" %>
<%@ page import="dao.AccountDAOImpl" %>
<%@ page import="entity.Account" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <%
        AccountDao accountDao = new AccountDAOImpl();
        String username = (String) session.getAttribute("username");
        Account account = accountDao.getAccount(username);
        PrintWriter print = response.getWriter();
    %>
    <jsp:include page="header.jsp"></jsp:include>
    <div style="margin: 50px auto; width: 80%; border: #000000 solid 1px">
        <h3>Username: <%=account.getUsername()%></h3>
        <h3>Phone Number: <%=account.getPhone_num()%></h3>
        <h3>Email: <%=account.getEmail()%></h3>
    </div>
</body>
</html>
