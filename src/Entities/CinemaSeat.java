package Entities;

import java.util.List;

public class CinemaSeat {
    private Integer cinemaSeatId;
    private int cinemaSeatCapacity;
    private boolean isSeatAvailable;
    private List<MovieOrder> movieOrders;
    private Integer movieOrderId;

    public CinemaSeat(Integer cinemaSeatId, int cinemaSeatCapacity, boolean isSeatAvailable, List<MovieOrder> movieOrders) {
        this.cinemaSeatId = cinemaSeatId;
        this.cinemaSeatCapacity = cinemaSeatCapacity;
        this.isSeatAvailable = isSeatAvailable;
    }

    public CinemaSeat() {
    }

    public Integer getCinemaSeatId() {
        return cinemaSeatId;
    }

    public void setCinemaSeatId(Integer cinemaSeatId) {
        this.cinemaSeatId = cinemaSeatId;
    }

    public int getCinemaSeatCapacity() {
        return cinemaSeatCapacity;
    }

    public void setCinemaSeatCapacity(int cinemaSeatCapacity) {
        this.cinemaSeatCapacity = cinemaSeatCapacity;
    }

    public boolean isSeatAvailable() {
        return isSeatAvailable;
    }

    public void setSeatAvailable(boolean seatAvailable) {
        isSeatAvailable = seatAvailable;
    }

    public List<MovieOrder> getMovieOrders() {
        return movieOrders;
    }

    public void setMovieOrders(List<MovieOrder> movieOrders) {
        this.movieOrders = movieOrders;
    }

    public Integer getMovieOrderId() {
        return movieOrderId;
    }

    public void setMovieOrderId(Integer movieOrderId) {
        this.movieOrderId = movieOrderId;
    }
}
