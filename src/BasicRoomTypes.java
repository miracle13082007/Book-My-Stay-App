// Version 2.1 - Refactored Abstract Room Class

abstract class Room {

    private String roomType;
    private int numberOfBeds;
    private int roomSize;
    private double price;

    public Room(String roomType, int numberOfBeds, int roomSize, double price) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.roomSize = roomSize;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public double getPrice() {
        return price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + roomSize + " sq ft");
        System.out.println("Price: $" + price);
    }
}
