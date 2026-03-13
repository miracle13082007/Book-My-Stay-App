// Version 4.0 - Room Search Service (Read Only)

class RoomSearchService {

    private RoomInventory inventory;

    public RoomSearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    // Method to search and display available rooms
    public void searchAvailableRooms(Room[] rooms) {

        System.out.println("===== Available Rooms =====");

        for (Room room : rooms) {

            String type = room.getRoomType();
            int availability = inventory.getAvailability(type);

            // Defensive check: only show rooms with availability > 0
            if (availability > 0) {

                room.displayRoomDetails();
                System.out.println("Available Rooms: " + availability);
                System.out.println("---------------------------");
            }
        }
    }
}