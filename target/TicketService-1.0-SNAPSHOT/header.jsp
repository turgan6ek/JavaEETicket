
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title></title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <style>
        body {
            background: #eeeeee;
            font-family: 'Varela Round', sans-serif;
        }
        .navbar {
            color: #fff;
            background: black !important;
            padding: 5px 16px;
            border-radius: 0;
            border: none;
            box-shadow: 0 0 4px rgba(0,0,0,.1);
        }
        .navbar img {
            border-radius: 50%;
            width: 36px;
            height: 36px;
            margin-right: 10px;
        }
        .navbar .navbar-brand {
            color: white;
            padding-left: 0;
            padding-right: 50px;
            font-size: 24px;
        }
        .navbar .navbar-brand:hover, .navbar .navbar-brand:focus {
            color: #fff;
        }
        .navbar .navbar-brand i {
            font-size: 25px;
            margin-right: 5px;
        }
        .search-box {
            position: relative;
        }
        .search-box input {
            padding-right: 35px;
            min-height: 38px;
            border: none;
            background: #faf7fd;
            border-radius: 3px !important;
        }
        .search-box input:focus {
            background: #fff;
            box-shadow: none;
        }
        .search-box .input-group-addon {
            min-width: 35px;
            border: none;
            background: transparent;
            position: absolute;
            right: 0;
            z-index: 9;
            padding: 10px 7px;
            height: 100%;
        }
        .search-box i {
            color: #a0a5b1;
            font-size: 19px;
        }
        .navbar .nav-item i {
            font-size: 18px;
        }
        .navbar .nav-item span {
            position: relative;
            top: 3px;
        }
        .navbar .navbar-nav > a {
            color: #efe5ff;
            padding: 8px 15px;
            font-size: 14px;
        }
        .navbar .navbar-nav > a:hover, .navbar .navbar-nav > a:focus {
            color: #fff;
            text-shadow: 0 0 4px rgba(255,255,255,0.3);
        }
        .navbar .navbar-nav > a > i {
            display: block;
            text-align: center;
        }
        .navbar .dropdown-item i {
            font-size: 16px;
            min-width: 22px;
        }
        .navbar .dropdown-item .material-icons {
            font-size: 21px;
            line-height: 16px;
            vertical-align: middle;
            margin-top: -2px;
        }
        .navbar .nav-item.open > a, .navbar .nav-item.open > a:hover, .navbar .nav-item.open > a:focus {
            color: #fff;
            background: none !important;
        }
        .navbar .dropdown-menu {
            border-radius: 1px;
            border-color: #e5e5e5;
            box-shadow: 0 2px 8px rgba(0,0,0,.05);
        }
        .navbar .dropdown-menu a {
            color: #777 !important;
            padding: 8px 20px;
            line-height: normal;
            font-size: 15px;
        }
        .navbar .dropdown-menu a:hover, .navbar .dropdown-menu a:focus {
            color: #333 !important;
            background: transparent !important;
        }
        .navbar .navbar-nav .active a, .navbar .navbar-nav .active a:hover, .navbar .navbar-nav .active a:focus {
            color: #fff;
            text-shadow: 0 0 4px rgba(255,255,255,0.2);
            background: transparent !important;
        }
        .navbar .navbar-nav .user-action {
            padding: 9px 15px;
            font-size: 15px;
        }
        .navbar .navbar-toggle {
            border-color: #fff;
        }
        .navbar .navbar-toggle .icon-bar {
            background: #fff;
        }
        .navbar .navbar-toggle:focus, .navbar .navbar-toggle:hover {
            background: transparent;
        }
        .navbar .navbar-nav .open .dropdown-menu {
            background: #faf7fd;
            border-radius: 1px;
            border-color: #faf7fd;
            box-shadow: 0 2px 8px rgba(0,0,0,.05);
        }
        .navbar .divider {
            background-color: #e9ecef !important;
        }
        @media (min-width: 1200px){
            .form-inline .input-group {
                width: 350px;
                margin-left: 30px;
            }
        }
        @media (max-width: 1199px){
            .navbar .navbar-nav > a > i {
                display: inline-block;
                text-align: left;
                min-width: 30px;
                position: relative;
                top: 4px;
            }
            .navbar .navbar-collapse {
                border: none;
                box-shadow: none;
                padding: 0;
            }
            .navbar .navbar-form {
                border: none;
                display: block;
                margin: 10px 0;
                padding: 0;
            }
            .navbar .navbar-nav {
                margin: 8px 0;
            }
            .navbar .navbar-toggle {
                margin-right: 0;
            }
            .input-group {
                width: 100%;
            }
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-xl navbar-dark bg-dark">
    <a href="index.jsp" class="navbar-brand"><i class="fa fa-film"></i>Kino<b>Park</b></a>
    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
        <span class="navbar-toggler-icon"></span>
    </button>
    <!-- Collection of nav links, forms, and other content for toggling -->
    <div id="navbarCollapse" class="collapse navbar-collapse justify-content-start">

        <div class="navbar-nav ml-auto">
            <a href="index.jsp" class="nav-item nav-link active"><i class="fa fa-home"></i><span>Main</span></a>
            <a href="films.jsp" class="nav-item nav-link active"><i class="fa fa-film"></i><span>Films</span></a>
            <a href="about.jsp" class="nav-item nav-link active"><i class="fa fa-info"></i><span>About</span></a>
            <div class="nav-item dropdown" style="padding-top: 5px">
                <jsp:useBean id="user" scope="session" class="entity.Account"></jsp:useBean>
                <%! String username;%>
                <%
                    username = user.getUsername();
                    if (user.getUsername() == null) {
                        username = "Guest";
                    }
                %>
                <a href="#" data-toggle="dropdown" class="nav-item nav-link dropdown-toggle user-action"><%=username%><b class="caret"></b></a>
                <div class="dropdown-menu">
                    <%
                    if (user.getUsername() != null) {%>
                    <a href="profile.jsp" class="dropdown-item"><i class="fa fa-user-o"></i> Profile</a>
                    <a href="tickets.jsp" class="dropdown-item"><i class="fa fa-calendar-o"></i> Tickets</a>
                    <div class="divider dropdown-divider"></div>

                    <a href="logout" class="dropdown-item"><i class="material-icons">&#xE8AC;</i> Logout</a>

                    <%
                    } else {
                    %>
                    <a href="login.jsp" class="dropdown-item"><i class="material-icons">&#xE8AC;</i> Login</a>
                    <a href="register.jsp" class="dropdown-item"><i class="material-icons">&#xE8AC;</i> Register</a>
                    <%}
                    %>
                    </div>
            </div>
        </div>
    </div>
</nav>
</body>
</html>