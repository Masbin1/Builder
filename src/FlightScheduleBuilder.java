import java.util.Date;

public class FlightScheduleBuilder {
    private String route;
    private String airline;
    private String aircraft;
    private Date departureTime;
    private int availableSeats;

    public FlightScheduleBuilder setRoute(String route) {
        this.route = route;
        return this;
    }

    public FlightScheduleBuilder setAirline(String airline) {
        this.airline = airline;
        return this;
    }

    public FlightScheduleBuilder setAircraft(String aircraft) {
        this.aircraft = aircraft;
        return this;
    }

    public FlightScheduleBuilder setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
        return this;
    }

    public FlightScheduleBuilder setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
        return this;
    }

    public FlightSchedule build() {
        return new FlightSchedule(route, airline, aircraft, departureTime, availableSeats);
    }
}
