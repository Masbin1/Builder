import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FlightSchedule schedule1 = new FlightScheduleBuilder()
                .setRoute("Jakarta - Singapore")
                .setAirline("Garuda Indonesia")
                .setAircraft("Boeing 777")
                .setDepartureTime(new Date())
                .setAvailableSeats(150)
                .build();

        FlightSchedule schedule2 = new FlightScheduleBuilder()
                .setRoute("Jakarta - Tokyo")
                .setAirline("Japan Airlines")
                .setAircraft("Airbus A350")
                .setDepartureTime(new Date())
                .setAvailableSeats(200)
                .build();

        System.out.println("Flight Schedule 1:");
        System.out.println(schedule1);

        System.out.println("\nFlight Schedule 2:");
        System.out.println(schedule2);
    }
}
