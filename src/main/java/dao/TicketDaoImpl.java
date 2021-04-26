package dao;

import ConfigDB.ConnProvider;
import entity.Account;
import entity.Film;
import entity.Ticket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TicketDaoImpl implements TicketDao{
    AccountDao accountDao = new AccountDAOImpl();
    FilmDao filmDao = new FilmDaoImpl();
    static Connection conn;
    static PreparedStatement pst;
    private static final String INSERT_SQL = "INSERT INTO tickets(user_id, film_id , start_date, price) values(?, ?, now(), ?) ";
    @Override
    public List<Ticket> getMyTickets(Integer userID) {
        List<Ticket> tickets = new ArrayList<>();
        try {
            conn = ConnProvider.getConn();
            pst = conn.prepareStatement("SELECT * FROM tickets WHERE user_id = ?");
            pst.setInt(1,userID);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setTicketID(rs.getInt(1));
                Account account = accountDao.getAccount(rs.getInt(2));
                ticket.setAccount(account);
                Film film = filmDao.getFilmByID(rs.getInt(3));
                ticket.setFilm(film);
                ticket.setStartDate(rs.getTimestamp(4));
                ticket.setPrice(rs.getDouble(5));
                tickets.add(ticket);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return tickets;
    }

    @Override
    public Ticket getTicketById(Integer id) {
        return null;
    }

    @Override
    public void newTicket(Ticket ticket) {
        if (ticket != null) {
            try (PreparedStatement ps = conn.prepareStatement(INSERT_SQL, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, ticket.getAccount().getUser_id());
                ps.setInt(2, ticket.getFilm().getFilmID());
                ps.setDouble(3, ticket.getPrice());
                int numRowsAffected = ps.executeUpdate();
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        ticket.setTicketID(rs.getInt(1));
                    }
                } catch (Exception s) {
                    s.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
