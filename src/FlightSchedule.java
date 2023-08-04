import java.util.Date;

public class FlightSchedule {
    private String route;
    private String airline;
    private String aircraft;
    private Date departureTime;
    private int availableSeats;

    public FlightSchedule(String route, String airline, String aircraft, Date departureTime, int availableSeats) {
        this.route = route;
        this.airline = airline;
        this.aircraft = aircraft;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
    }

    // Getter dan setter, jika diperlukan

    @Override
    public String toString() {
        return "Route: " + route +
                "\nAirline: " + airline +
                "\nAircraft: " + aircraft +
                "\nDeparture Time: " + departureTime +
                "\nAvailable Seats: " + availableSeats;
    }
}
