package Entities;

import java.util.List;

public class MovieTicket {
    private Integer ticketId;
    private List<Movie> movies;
    private List<Cinema> cinemas;
    private Customer customer;
    private Integer customerId;

    public MovieTicket(Integer ticketId, List<Movie> movies, List<Cinema> cinemas, Customer customer, Integer customerId) {
        this.ticketId = ticketId;
        this.movies = movies;
        this.cinemas = cinemas;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
