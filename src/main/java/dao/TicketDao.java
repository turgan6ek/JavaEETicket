package dao;

import entity.Ticket;

import java.util.List;

public interface TicketDao {
    List<Ticket> getMyTickets(Integer userID);
    Ticket getTicketById(Integer id);
    void newTicket(Ticket ticket);
}
