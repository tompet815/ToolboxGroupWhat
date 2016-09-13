package DTO;

import java.sql.Time;
import java.util.Date;

public class FerryRouteReservationDetail extends FerryRouteIdentifer {

    private Date date;
    private Time time;
    private String ferryName;
    private Reservation reservation;

    public FerryRouteReservationDetail(Date date, Time time, String ferryName, Reservation reservation, long id) {
        super(id);
        this.date = date;
        this.time = time;
        this.ferryName = ferryName;
        this.reservation = reservation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

}
