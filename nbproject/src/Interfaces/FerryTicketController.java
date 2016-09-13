package Interfaces;

import DTO.FerryRouteReservationDetail;
import DTO.RoutePriceSummary;
import DTO.RouteQuery;
import java.util.List;

public interface FerryTicketController {

    /**
     * get departure times available which match the criteria specified by RouteQuery.
     * @pre ferries and route should exist.
     * @throw NoSuchFerryExeption, and NoSuchRouteExeption if they are not found.
     * @return a collection of RoutePriceSummary. 
     */
    List<RoutePriceSummary> getAvailableTimes(RouteQuery query);
    /**
     * get the reservation detail after submitting reservation.
     * @pre the session is not timeout
     * @throw TimeExpiredExeption if the customer don't submit for a long time after query 
     * @return FerryRouteReservationDetail with a reservation id 
     */
    FerryRouteReservationDetail submitReservation(FerryRouteReservationDetail route);

}
