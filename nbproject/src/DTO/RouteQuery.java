package DTO;

import java.util.Date;

public class RouteQuery {

    private long route_id;
    private Date date;
    private int amountOfPassengers;
    private int amountOfChildren;
    private int amountOfVehicles;
    private int amountOfBigVehicles;

    public RouteQuery(long route_id, Date date, int amountOfPassengers, int amountOfChildren, int amountOfVehicles, int amountOfBigVehicles) {
        this.route_id = route_id;
        this.date = date;
        this.amountOfPassengers = amountOfPassengers;
        this.amountOfChildren = amountOfChildren;
        this.amountOfVehicles = amountOfVehicles;
        this.amountOfBigVehicles = amountOfBigVehicles;
    }

    public long getRoute_id() {
        return route_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void setAmountOfPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public int getAmountOfVehicles() {
        return amountOfVehicles;
    }

    public void setAmountOfVehicles(int amountOfVehicles) {
        this.amountOfVehicles = amountOfVehicles;
    }

    public int getAmountOfBigVehicles() {
        return amountOfBigVehicles;
    }

    public void setAmountOfBigVehicles(int amountOfBigVehicles) {
        this.amountOfBigVehicles = amountOfBigVehicles;
    }

}
