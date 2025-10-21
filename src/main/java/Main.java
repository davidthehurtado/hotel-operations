public class Main {
    public static void main(String[] args) {
        // Test Room
        Room room1 = new Room(2, 120.0, false, false);
        System.out.println("Room available? " + room1.isAvailable());

        // Test Reservation
        Reservation res1 = new Reservation("king", 3, true);
        System.out.println("Total reservation cost: $" + res1.getReservationTotal());

        // Test Employee
        Employee emp1 = new Employee(101, "Dana Wyatt", "Housekeeping", 15.50, 45);
        System.out.println("Employee total pay: $" + emp1.getTotalPay());
    }
}
