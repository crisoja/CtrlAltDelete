package Entities;

import java.util.List;

public class Customer {
    private Integer customerId;
    private String customerName;
    private List<MovieOrder> movieOrders;

    public Customer(Integer customerId, String customerName, List<MovieOrder> movieOrders) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.movieOrders = movieOrders;
    }

    public Customer() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<MovieOrder> getOrders() {
        return movieOrders;
    }

    public void setOrders(List<MovieOrder> movieOrders) {
        this.movieOrders = movieOrders;
    }
}
