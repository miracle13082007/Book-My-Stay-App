// Version 6.0 - Reservation Confirmation & Room Allocation

public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App =====");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Initialize booking queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Create booking requests
        bookingQueue.addRequest(new Reservation("Alice", "Single Room"));
        bookingQueue.addRequest(new Reservation("Bob", "Double Room"));
        bookingQueue.addRequest(new Reservation("Charlie", "Single Room"));
        bookingQueue.addRequest(new Reservation("David", "Suite Room"));

        // Allocation service
        RoomAllocationService allocationService =
                new RoomAllocationService(inventory, bookingQueue);

        // Process queue
        allocationService.processBookings();

        // Show final allocations
        allocationService.displayAllocations();

        System.out.println("\n===== Booking Process Completed =====");
    }
}

