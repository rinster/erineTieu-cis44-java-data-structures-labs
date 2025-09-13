package lab2_ecosystem_simulation;

import java.util.Random;

public class Ecosystem {
    private Animal[] river;
    private Random random;

    public Ecosystem(int riverSize) {
        this.river = new Animal[riverSize];
        this.random = new Random();

        // Add logic to populate river
    }

    public void runStep() {
        // Core Logic for single step goes here
        // 1. Create a new array for the next state.
        // 2. Iterate through the current river array.
        // 3. For each animal, decide its next move.
        // 4. Handle collisions and place animals in the new array.
        // 5. Replace the old river with the new one
    }

    public void visualize() {
        for (Animal animal : river) {
            System.out.print(" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ecosystem eco = new Ecosystem(20); // Create a river
        eco.visualize();
        // Loop to run multiple steps...
    }
}
