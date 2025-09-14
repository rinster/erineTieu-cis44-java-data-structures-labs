package lab2_ecosystem_simulation;

public abstract class Animal {
    protected int position;

    public Animal(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int pos) {
        this.position = pos;
    }

    // Each animal decides its next position
    public abstract int decideMove(int riverSize);

    @Override
    public abstract String toString();
}
