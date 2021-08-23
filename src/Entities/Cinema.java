package Entities;

import java.util.List;

public class Cinema {
    private Integer cinemaId;
    private String cinemaName;
    private String cinemaLocation;
    private List<Movie> movies;
    private Integer movieId;
    private List<CinemaSeat> cinemaSeats;
    private Integer cinemaSeatId;

    public Cinema(Integer cinemaId, String cinemaName, String cinemaLocation, List<Movie> movies, Integer movieId, Integer cinemaSeatId) {
        this.cinemaId = cinemaId;
        this.cinemaName = cinemaName;
        this.cinemaLocation = cinemaLocation;
        this.movies = movies;
        this.movieId = movieId;
    }

    public Cinema() {
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaLocation() {
        return cinemaLocation;
    }

    public void setCinemaLocation(String cinemaLocation) {
        this.cinemaLocation = cinemaLocation;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public List<CinemaSeat> getCinemaSeats() {
        return cinemaSeats;
    }

    public void setCinemaSeats(List<CinemaSeat> cinemaSeats) {
        this.cinemaSeats = cinemaSeats;
    }

    public Integer getCinemaSeatId() {
        return cinemaSeatId;
    }

    public void setCinemaSeatId(Integer cinemaSeatId) {
        this.cinemaSeatId = cinemaSeatId;
    }
}
