package lab2_ecosystem_simulation;

import java.util.Random;

public class Ecosystem {
    private Animal[] river;
    private Random random;

    public Ecosystem(int riverSize) {
        this.river = new Animal[riverSize];
        this.random = new Random();

        // Populate river randomly
        for (int i = 0; i < riverSize; i++) {
            int roll = random.nextInt(3); // 0 = empty, 1 = Bear, 2 = Fish
            if (roll == 1) {
                river[i] = new Bear(i);
            } else if (roll == 2) {
                river[i] = new Fish(i);
            }
        }
    }

    public void runStep() {
        Animal[] newRiver = new Animal[river.length];

        for (int i = 0; i < river.length; i++) {
            Animal animal = river[i];
            if (animal == null)
                continue;

            int newPos = animal.decideMove(river.length);

            if (newRiver[newPos] == null) { // Handle empty space
                animal.setPosition(newPos);
                newRiver[newPos] = animal;
            } else {
                // Handle collisions

                // Get other animal
                Animal other = newRiver[newPos];

                if (animal instanceof Bear && other instanceof Fish) {
                    animal.setPosition(newPos);
                    newRiver[newPos] = animal;
                } else if (animal instanceof Fish && other instanceof Bear) {
                    // Fish dies, Bear stays, Do nothing
                } else if (animal.getClass() == other.getClass()) {
                    // Reproduce, populate a random part of the array
                    int[] emptyIndices = new int[river.length];
                    int count = 0;

                    // Collect empty spots in *newRiver* (not old river)
                    for (int j = 0; j < river.length; j++) {
                        if (newRiver[j] == null) {
                            emptyIndices[count++] = j;
                        }
                    }

                    if (count > 0) {
                        int spawnIndex = emptyIndices[random.nextInt(count)];

                        // Spawn a new animal
                        Animal baby;
                        if (animal instanceof Fish) {
                            baby = new Fish(spawnIndex);
                        } else {
                            baby = new Bear(spawnIndex);
                        }

                        newRiver[spawnIndex] = baby;

                        // Testing
                        // System.out.println("*******" + baby.getClass().getSimpleName() +
                        // " spawned at " + spawnIndex + "*******");
                    }

                    // No existing null spaces, keep the existing one in place
                    newRiver[newPos] = other;
                }
            }
        }
        river = newRiver;
    }

    public void visualize() {
        for (Animal animal : river) {
            if (animal == null)
                System.out.print("-");
            else
                System.out.print(animal);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ecosystem eco = new Ecosystem(20);

        for (int step = 0; step < 10; step++) {
            eco.visualize();
            eco.runStep();
        }
    }
}
