package lab2_ecosystem_simulation;

import java.util.Random;

public class Fish extends Animal {
    private static Random rand = new Random();

    public Fish(int position) {
        super(position);
    }

    @Override
    public int decideMove(int riverSize) {
        int direction = rand.nextInt(3) - 1; // -1 left, 0 stay, +1 right
        int newPos = position + direction;
        if (newPos < 0 || newPos >= riverSize) {
            return position; // Stay if out of bounds
        }
        return newPos;
    }

    @Override
    public String toString() {
        return "F";
    }
}
