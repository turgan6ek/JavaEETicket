/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-04-24 23:55:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class film_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String username;
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1619285561177L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background: #eeeeee;\r\n");
      out.write("            font-family: 'Varela Round', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            background: black !important;\r\n");
      out.write("            padding: 5px 16px;\r\n");
      out.write("            border-radius: 0;\r\n");
      out.write("            border: none;\r\n");
      out.write("            box-shadow: 0 0 4px rgba(0,0,0,.1);\r\n");
      out.write("        }\r\n");
      out.write("        .navbar img {\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            width: 36px;\r\n");
      out.write("            height: 36px;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-brand {\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding-left: 0;\r\n");
      out.write("            padding-right: 50px;\r\n");
      out.write("            font-size: 24px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-brand:hover, .navbar .navbar-brand:focus {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-brand i {\r\n");
      out.write("            font-size: 25px;\r\n");
      out.write("            margin-right: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        .search-box {\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("        .search-box input {\r\n");
      out.write("            padding-right: 35px;\r\n");
      out.write("            min-height: 38px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            background: #faf7fd;\r\n");
      out.write("            border-radius: 3px !important;\r\n");
      out.write("        }\r\n");
      out.write("        .search-box input:focus {\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            box-shadow: none;\r\n");
      out.write("        }\r\n");
      out.write("        .search-box .input-group-addon {\r\n");
      out.write("            min-width: 35px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            background: transparent;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            right: 0;\r\n");
      out.write("            z-index: 9;\r\n");
      out.write("            padding: 10px 7px;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        .search-box i {\r\n");
      out.write("            color: #a0a5b1;\r\n");
      out.write("            font-size: 19px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .nav-item i {\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .nav-item span {\r\n");
      out.write("            position: relative;\r\n");
      out.write("            top: 3px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-nav > a {\r\n");
      out.write("            color: #efe5ff;\r\n");
      out.write("            padding: 8px 15px;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-nav > a:hover, .navbar .navbar-nav > a:focus {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            text-shadow: 0 0 4px rgba(255,255,255,0.3);\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-nav > a > i {\r\n");
      out.write("            display: block;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .dropdown-item i {\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            min-width: 22px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .dropdown-item .material-icons {\r\n");
      out.write("            font-size: 21px;\r\n");
      out.write("            line-height: 16px;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            margin-top: -2px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .nav-item.open > a, .navbar .nav-item.open > a:hover, .navbar .nav-item.open > a:focus {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            background: none !important;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .dropdown-menu {\r\n");
      out.write("            border-radius: 1px;\r\n");
      out.write("            border-color: #e5e5e5;\r\n");
      out.write("            box-shadow: 0 2px 8px rgba(0,0,0,.05);\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .dropdown-menu a {\r\n");
      out.write("            color: #777 !important;\r\n");
      out.write("            padding: 8px 20px;\r\n");
      out.write("            line-height: normal;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .dropdown-menu a:hover, .navbar .dropdown-menu a:focus {\r\n");
      out.write("            color: #333 !important;\r\n");
      out.write("            background: transparent !important;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-nav .active a, .navbar .navbar-nav .active a:hover, .navbar .navbar-nav .active a:focus {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            text-shadow: 0 0 4px rgba(255,255,255,0.2);\r\n");
      out.write("            background: transparent !important;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-nav .user-action {\r\n");
      out.write("            padding: 9px 15px;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-toggle {\r\n");
      out.write("            border-color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-toggle .icon-bar {\r\n");
      out.write("            background: #fff;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-toggle:focus, .navbar .navbar-toggle:hover {\r\n");
      out.write("            background: transparent;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .navbar-nav .open .dropdown-menu {\r\n");
      out.write("            background: #faf7fd;\r\n");
      out.write("            border-radius: 1px;\r\n");
      out.write("            border-color: #faf7fd;\r\n");
      out.write("            box-shadow: 0 2px 8px rgba(0,0,0,.05);\r\n");
      out.write("        }\r\n");
      out.write("        .navbar .divider {\r\n");
      out.write("            background-color: #e9ecef !important;\r\n");
      out.write("        }\r\n");
      out.write("        @media (min-width: 1200px){\r\n");
      out.write("            .form-inline .input-group {\r\n");
      out.write("                width: 350px;\r\n");
      out.write("                margin-left: 30px;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        @media (max-width: 1199px){\r\n");
      out.write("            .navbar .navbar-nav > a > i {\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                min-width: 30px;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                top: 4px;\r\n");
      out.write("            }\r\n");
      out.write("            .navbar .navbar-collapse {\r\n");
      out.write("                border: none;\r\n");
      out.write("                box-shadow: none;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("            }\r\n");
      out.write("            .navbar .navbar-form {\r\n");
      out.write("                border: none;\r\n");
      out.write("                display: block;\r\n");
      out.write("                margin: 10px 0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("            }\r\n");
      out.write("            .navbar .navbar-nav {\r\n");
      out.write("                margin: 8px 0;\r\n");
      out.write("            }\r\n");
      out.write("            .navbar .navbar-toggle {\r\n");
      out.write("                margin-right: 0;\r\n");
      out.write("            }\r\n");
      out.write("            .input-group {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-xl navbar-dark bg-dark\">\r\n");
      out.write("    <a href=\"index.jsp\" class=\"navbar-brand\"><i class=\"fa fa-film\"></i>Kino<b>Park</b></a>\r\n");
      out.write("    <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <!-- Collection of nav links, forms, and other content for toggling -->\r\n");
      out.write("    <div id=\"navbarCollapse\" class=\"collapse navbar-collapse justify-content-start\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar-nav ml-auto\">\r\n");
      out.write("            <a href=\"index.jsp\" class=\"nav-item nav-link active\"><i class=\"fa fa-home\"></i><span>Main</span></a>\r\n");
      out.write("            <a href=\"films.jsp\" class=\"nav-item nav-link active\"><i class=\"fa fa-film\"></i><span>Films</span></a>\r\n");
      out.write("            <a href=\"about.jsp\" class=\"nav-item nav-link active\"><i class=\"fa fa-info\"></i><span>About</span></a>\r\n");
      out.write("            <div class=\"nav-item dropdown\" style=\"padding-top: 5px\">\r\n");
      out.write("                ");
      entity.Account user = null;
      synchronized (session) {
        user = (entity.Account) _jspx_page_context.getAttribute("user", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (user == null){
          user = new entity.Account();
          _jspx_page_context.setAttribute("user", user, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");

                    username = user.getUsername();
                    if (user.getUsername() == null) {
                        username = "Guest";
                    }
                
      out.write("\r\n");
      out.write("                <a href=\"#\" data-toggle=\"dropdown\" class=\"nav-item nav-link dropdown-toggle user-action\">");
      out.print(username);
      out.write("<b class=\"caret\"></b></a>\r\n");
      out.write("                <div class=\"dropdown-menu\">\r\n");
      out.write("                    ");

                    if (user.getUsername() != null) {
      out.write("\r\n");
      out.write("                    <a href=\"profile.jsp\" class=\"dropdown-item\"><i class=\"fa fa-user-o\"></i> Profile</a>\r\n");
      out.write("                    <a href=\"tickets.jsp\" class=\"dropdown-item\"><i class=\"fa fa-calendar-o\"></i> Tickets</a>\r\n");
      out.write("                    <div class=\"divider dropdown-divider\"></div>\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"logout\" class=\"dropdown-item\"><i class=\"material-icons\">&#xE8AC;</i> Logout</a>\r\n");
      out.write("\r\n");
      out.write("                    ");

                    } else {
                    
      out.write("\r\n");
      out.write("                    <a href=\"login.jsp\" class=\"dropdown-item\"><i class=\"material-icons\">&#xE8AC;</i> Login</a>\r\n");
      out.write("                    <a href=\"register.jsp\" class=\"dropdown-item\"><i class=\"material-icons\">&#xE8AC;</i> Register</a>\r\n");
      out.write("                    ");
}
                    
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      entity.Film film = null;
      synchronized (session) {
        film = (entity.Film) _jspx_page_context.getAttribute("film", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (film == null){
          film = new entity.Film();
          _jspx_page_context.setAttribute("film", film, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<div class=\"card mb-3\" style=\"width: 70%; margin: auto;\">\r\n");
      out.write("    <img class=\"card-img-top\" src=\"");
      out.print(film.getTrailer());
      out.write("\" alt=\"Card image cap\">\r\n");
      out.write("    <div class=\"card-body\">\r\n");
      out.write("        <h5 class=\"card-title\">");
      out.print(film.getFilmName());
      out.write("</h5>\r\n");
      out.write("        <p class=\"card-text\">");
      out.print(film.getDescription());
      out.write("</p>\r\n");
      out.write("        <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"/buyTicket?userID=");
      out.print(user.getUser_id());
      out.write("&filmID=");
      out.print(film.getFilmID());
      out.write("\" class=\"btn btn-primary\">Go somewhere</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
