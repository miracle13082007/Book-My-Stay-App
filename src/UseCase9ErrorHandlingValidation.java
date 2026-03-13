public class UseCase9ErrorHandlingValidation {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Reservation r1 = new Reservation("Alice", "Single Room");
        Reservation r2 = new Reservation("Bob", "Luxury Room");

        processBooking(r1, inventory);
        processBooking(r2, inventory);
    }

    public static void processBooking(Reservation reservation, RoomInventory inventory) {

        try {

            String roomType = reservation.getRoomType();

            InvalidBookingValidator.validateRoomType(roomType, inventory);
            InvalidBookingValidator.validateAvailability(roomType, inventory);

            int available = inventory.getAvailability(roomType);

            inventory.updateAvailability(roomType, available - 1);

            System.out.println("Booking successful for " + reservation.getGuestName() + " - " + roomType);

        } catch (InvalidBookingException e) {

            System.out.println("Booking failed for " + reservation.getGuestName() + ": " + e.getMessage());
        }
    }
}