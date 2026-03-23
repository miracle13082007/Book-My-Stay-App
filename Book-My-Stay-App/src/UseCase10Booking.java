import java.util.*;

public class UseCase10Booking {

    static class Booking {
        String id, type, room;
        boolean cancelled;

        Booking(String id, String type, String room) {
            this.id = id;
            this.type = type;
            this.room = room;
        }
    }

    static Map<String, Integer> inventory = new HashMap<>();
    static Map<String, Booking> bookings = new HashMap<>();
    static Stack<String> stack = new Stack<>();

    public static void main(String[] args) {
        inventory.put("Single", 2);

        create("B1", "Single");
        show();

        cancel("B1");
        show();
    }

    static void create(String id, String type) {
        if (inventory.getOrDefault(type, 0) == 0) return;
        String room = type + inventory.get(type);
        inventory.put(type, inventory.get(type) - 1);
        bookings.put(id, new Booking(id, type, room));
    }

    static void cancel(String id) {
        if (!bookings.containsKey(id)) return;
        Booking b = bookings.get(id);
        if (b.cancelled) return;
        stack.push(b.room);
        inventory.put(b.type, inventory.get(b.type) + 1);
        b.cancelled = true;
    }

    static void show() {
        System.out.println(inventory);
    }
}