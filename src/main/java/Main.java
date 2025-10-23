public class Main {
    public static void main(String[] args) {
        // Test Room
        Room room1 = new Room(2, 120.0, false, false);
        System.out.println("Room available? " + room1.isAvailable());
        room1.checkIn();
        room1.checkOut();
        room1.cleanRoom();

        // Test Reservation
        Reservation res1 = new Reservation("king", 3, true);
        System.out.println("Total reservation cost: $" + res1.getReservationTotal());

        // Test Employee
        Employee emp1 = new Employee(101, "Dana Wyatt", "Housekeeping", 15.50);
        emp1.punchIn(10.0);
        emp1.punchOut(14.75); // 4.75 hours
        System.out.println("Hours worked: " + emp1.getHoursWorked());

        Employee emp2 = new Employee(102, "Rick Wyatt", "Housekeeping", 15.50);
        emp2.punchIn(9.5);
        emp2.punchOut(13.0);

        System.out.println("Hours worked: " + emp2.getHoursWorked());

        // Test Hotel
        Hotel h1 = new Hotel("Sunset Inn", 5, 20);
        System.out.println("Available Suites: " + h1.getAvailableSuites());
        System.out.println("Available Rooms: " + h1.getAvailableRooms());
        System.out.println("Booking 2 suites: " + h1.bookRoom(2, true));
        System.out.println("Available Suites after booking: " + h1.getAvailableSuites());
    }
}
