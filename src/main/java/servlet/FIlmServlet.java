package servlet;

import dao.FilmDao;
import dao.FilmDaoImpl;
import entity.Film;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(
        urlPatterns = {"/film"}
        )
public class FIlmServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FilmDao filmDao = new FilmDaoImpl();
        Integer id = Integer.valueOf(req.getParameter("id"));
        Film film = filmDao.getFilmByID(id);
        req.getSession().setAttribute("film", film);
        req.getRequestDispatcher("film.jsp").forward(req, resp);
    }
}
