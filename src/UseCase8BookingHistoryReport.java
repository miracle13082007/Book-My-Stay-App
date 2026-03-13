public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        BookingHistory history = new BookingHistory();

        Reservation r1 = new Reservation("Alice", "Single Room");
        Reservation r2 = new Reservation("Bob", "Double Room");
        Reservation r3 = new Reservation("Charlie", "Suite Room");
        Reservation r4 = new Reservation("David", "Single Room");

        history.addReservation(r1);
        history.addReservation(r2);
        history.addReservation(r3);
        history.addReservation(r4);

        System.out.println("===== Booking History =====");
        history.displayHistory();

        BookingReportService reportService = new BookingReportService(history);

        reportService.generateReport();
    }
}