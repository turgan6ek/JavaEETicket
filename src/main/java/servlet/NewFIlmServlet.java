package servlet;

import dao.AccountDAOImpl;
import dao.AccountDao;
import dao.FilmDao;
import dao.FilmDaoImpl;
import entity.Account;
import entity.Film;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@WebServlet(
        urlPatterns = {"/newFilm"}
)
public class NewFIlmServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FilmDao filmDao = new FilmDaoImpl();
        String name = req.getParameter("name");
        String genre = req.getParameter("genre");
        String trailer = req.getParameter("trailer");
        String pegi = req.getParameter("pegi");
        String description = req.getParameter("description");
        Integer duration = Integer.valueOf(req.getParameter("duration"));
        String price = req.getParameter("price");
        String date = req.getParameter("date");
        Film film = new Film();
        film.setFilmName(name);
        film.setGenre(genre);
        film.setDescription(description);
        film.setTrailer(trailer);
        film.setPegi(pegi);
        film.setDuration(duration);
        film.setPrice(Double.valueOf(price));
        LocalDateTime dateTime = LocalDateTime.parse(date);
        film.setStartDate(Timestamp.valueOf(dateTime));
        filmDao.insertAFilm(film);
        req.getRequestDispatcher("films.jsp").forward(req, resp);
    }
}
