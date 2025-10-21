package lab5_travel_itinerary_manager;

public class Main {
    public static void main(String[] args) {
        LinkedPositionalList<String> itinerary = new LinkedPositionalList<>();

        Position<String> paris = itinerary.addLast("Paris");
        Position<String> rome = itinerary.addLast("Rome");
        // Position<String> london = itinerary.addLast("London");

        itinerary.addAfter(paris, "Louvre Museum");
        itinerary.addBefore(rome, "Colosseum");

        System.out.println("Final Itinerary:");
        for (String stop : itinerary) {
            System.out.println(" - " + stop);
        }
    }
}
