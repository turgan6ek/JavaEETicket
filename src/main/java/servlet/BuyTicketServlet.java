package servlet;

import dao.FilmDao;
import dao.FilmDaoImpl;
import dao.TicketDao;
import dao.TicketDaoImpl;
import entity.Account;
import entity.Film;
import entity.Ticket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(urlPatterns =
        {
                "/buyTicket"
        },
        name = "TicketServlet")
public class BuyTicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FilmDao filmDao = new FilmDaoImpl();
        Integer id = Integer.valueOf(req.getParameter("id"));
        Film film = filmDao.getFilmByID(id);
        TicketDao ticketDao = new TicketDaoImpl();
        Account account = (Account) req.getSession().getAttribute("user");
        Ticket ticket = new Ticket();
        ticket.setPrice(1400.00);
        ticket.setStartDate(new Date());
        ticket.setFilm(film);
        ticket.setAccount(account);
        ticketDao.newTicket(ticket);
        req.getRequestDispatcher("tickets.jsp").forward(req, resp);
    }
}
