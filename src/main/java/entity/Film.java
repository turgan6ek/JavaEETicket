package entity;

import java.util.Date;

public class Film {
    private Integer filmID;
    private String filmName;
    private int duration;
    private String genre;
    private String pegi;
    private String description;
    private String trailer;
    private Double price;
    private Date startDate;

    public Film(Integer filmID, String filmName, int duration, String genre, String pegi, String description, String trailer, Double price, Date startDate) {
        this.filmID = filmID;
        this.filmName = filmName;
        this.duration = duration;
        this.genre = genre;
        this.pegi = pegi;
        this.description = description;
        this.trailer = trailer;
        this.price = price;
        this.startDate = startDate;
    }
    public Film(String filmName, int duration, String genre, String pegi, String description, String trailer, Double price, Date startDate) {
        this(null, filmName, duration, genre, pegi, description, trailer, price, startDate);
    }
    public int getFilmID() {
        return filmID;
    }
    public Film(){}
    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPegi() {
        return pegi;
    }

    public void setPegi(String pegi) {
        this.pegi = pegi;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public void setFilmID(Integer filmID) {
        this.filmID = filmID;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
