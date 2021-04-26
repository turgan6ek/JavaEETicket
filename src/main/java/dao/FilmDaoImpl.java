package dao;

import ConfigDB.ConnProvider;
import entity.Film;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDaoImpl implements FilmDao{
    static Connection conn;
    static PreparedStatement pst;
    private static final String INSERT_SQL = "INSERT INTO films(film_name, duration_min, genre, pegi, film_description, film_trailer) values(?, ?, ?, ?, ?,?) ";

    @Override
    public List<Film> getFilms() {
        List<Film> films = new ArrayList<>();
        try {
            conn = ConnProvider.getConn();
            pst = conn.prepareStatement("SELECT * FROM films ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Film film = new Film();
                film.setFilmID(rs.getInt(1));
                film.setFilmName(rs.getString(2));
                film.setDuration(rs.getInt(3));
                film.setGenre(rs.getString(4));
                film.setPegi(rs.getString(5));
                film.setDescription(rs.getString(6));
                film.setTrailer(rs.getString(7));
                films.add(film);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return films;
    }

    @Override
    public void insertAFilm(Film film) {
        if (film != null) {
            try (PreparedStatement ps = conn.prepareStatement(INSERT_SQL, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, film.getFilmName());
                ps.setInt(2, film.getDuration());
                ps.setString(3, film.getGenre());
                ps.setString(4, film.getPegi());
                ps.setString(5, film.getDescription());
                ps.setString(6, film.getTrailer());
                int numRowsAffected = ps.executeUpdate();
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        film.setFilmID(rs.getInt(1));
                    }
                } catch (Exception s) {
                    s.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Film getFilmByID(Integer id) {
        Film film = new Film();
        try {
            conn = ConnProvider.getConn();
            pst = conn.prepareStatement("SELECT * FROM films WHERE film_id = ?");
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                film.setFilmID(rs.getInt(1));
                film.setFilmName(rs.getString(2));
                film.setDuration(rs.getInt(3));
                film.setGenre(rs.getString(4));
                film.setPegi(rs.getString(5));
                film.setDescription(rs.getString(6));
                film.setTrailer(rs.getString(7));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return film;
    }
}
