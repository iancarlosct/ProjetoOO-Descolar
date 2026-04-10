package com.decolar.sistema_voos.entity;

import com.decolar.sistema_voos.entity.Flight;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int cartId;
    private List<Flight> flights = new ArrayList<>();
    private double totalValue;

    public Cart(int cartId, List<Flight> flights, double totalValue) {
        this.cartId = cartId;
        this.flights = flights;
        this.totalValue = totalValue;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}