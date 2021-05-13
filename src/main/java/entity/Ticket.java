package entity;

import java.util.Date;

public class Ticket {
    private Integer ticketID;
    private Film film;
    private Account account;

    public Ticket(Integer ticketID, Film film, Account account) {
        this.ticketID = ticketID;
        this.film = film;
        this.account = account;
    }

    public Ticket(Film film, Account account) {
        this(null, film, account);
    }

    public int getTicketID() {
        return ticketID;
    }

    public Ticket() {
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
