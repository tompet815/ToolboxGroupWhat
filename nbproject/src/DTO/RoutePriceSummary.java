package DTO;

import java.sql.Time;

public class RoutePriceSummary extends FerryRouteIdentifer{
    private double totalPrice;
    private Time time;
    private String ferryName;

    public RoutePriceSummary(double totalPrice, Time time, String ferryName, long id) {
        super(id);
        this.totalPrice = totalPrice;
        this.time = time;
        this.ferryName = ferryName;
    }   

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getFerryName() {
        return ferryName;
    }

    public void setFerryName(String ferryName) {
        this.ferryName = ferryName;
    }
    
}
