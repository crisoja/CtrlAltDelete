package Entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Movie {
    private Integer movieId;
    private String movieName;
    private Time movieScreeningTime;
    private Date movieScreeningDate;
    private String movieDetails; // directed by, and other details
    private List<String> movieCastAndCrews;
    private String movieSypnosis;
    private List<String> movieReviews;
    private double rating;

    public Movie(Integer movieId, String movieName, Time movieScreeningTime, String movieSypnosis, List<String> movieReviews, double rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieScreeningTime = movieScreeningTime;
        this.movieSypnosis = movieSypnosis;
        this.movieReviews = movieReviews;
        this.rating = rating;
    }

    public Movie() {
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Time getMovieScreeningTime() {
        return movieScreeningTime;
    }

    public void setMovieScreeningTime(Time movieScreeningTime) {
        this.movieScreeningTime = movieScreeningTime;
    }

    public String getMovieSypnosis() {
        return movieSypnosis;
    }

    public void setMovieSypnosis(String movieSypnosis) {
        this.movieSypnosis = movieSypnosis;
    }

    public List<String> getMovieReviews() {
        return movieReviews;
    }

    public void setMovieReviews(List<String> movieReviews) {
        this.movieReviews = movieReviews;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Date getMovieScreeningDate() {
        return movieScreeningDate;
    }

    public void setMovieScreeningDate(Date movieScreeningDate) {
        this.movieScreeningDate = movieScreeningDate;
    }

    public String getMovieDetails() {
        return movieDetails;
    }

    public void setMovieDetails(String movieDetails) {
        this.movieDetails = movieDetails;
    }

    public List<String> getMovieCastAndCrews() {
        return movieCastAndCrews;
    }

    public void setMovieCastAndCrews(List<String> movieCastAndCrews) {
        this.movieCastAndCrews = movieCastAndCrews;
    }
}
