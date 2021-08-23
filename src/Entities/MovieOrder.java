package Entities;

import java.util.List;

public class MovieOrder {
    private Integer movieOrderId;
    private List<MovieTicket> movieTickets;

    public MovieOrder(Integer movieOrderId, List<MovieTicket> movieTickets) {
        this.movieOrderId = movieOrderId;
        this.movieTickets = movieTickets;
    }

    public Integer getMovieOrderId() {
        return movieOrderId;
    }

    public void setMovieOrderId(Integer movieOrderId) {
        this.movieOrderId = movieOrderId;
    }

    public List<MovieTicket> getMovieTickets() {
        return movieTickets;
    }

    public void setMovieTickets(List<MovieTicket> movieTickets) {
        this.movieTickets = movieTickets;
    }
}
