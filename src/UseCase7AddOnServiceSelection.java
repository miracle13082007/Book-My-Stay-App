// Version 7.0 - Add-On Service Selection Demonstration

public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App =====");

        // Example reservation ID (from previous allocation step)
        String reservationId = "SINGLEROOM-1";

        // Create services
        AddOnService breakfast = new AddOnService("Breakfast", 20);
        AddOnService airportPickup = new AddOnService("Airport Pickup", 40);
        AddOnService spaAccess = new AddOnService("Spa Access", 50);

        // Service manager
        AddOnServiceManager manager = new AddOnServiceManager();

        // Guest selects services
        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, airportPickup);
        manager.addService(reservationId, spaAccess);

        // Display selected services
        manager.displayServices(reservationId);

        // Calculate total add-on cost
        double totalCost = manager.calculateTotalCost(reservationId);

        System.out.println("\nTotal Add-On Cost: $" + totalCost);

        System.out.println("\n===== Add-On Service Selection Completed =====");
    }
}