package com.fresh.countticketscostapp.tickites;

public class BusTicket {
    private String departurePoint;
    private String arrivalPoint;
    private String departureDate;
    private String travelTime;
    private float distance;
    private float price;

    public BusTicket() {
    }

    public BusTicket(String departurePoint, String arrivalPoint, String departureDate, String travelTime, float distance, float price) {
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.departureDate = departureDate;
        this.travelTime = travelTime;
        this.distance = distance;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getTicketType() {
        return "Adult";
    }
}
