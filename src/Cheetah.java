public class Cheetah extends Animal implements   Printable {
    private int speed;

    @Override
    public void print() {
        System.out.println("гепарда зовут " + getName() + " его скорость " + getSpeed());
    }

    public int getSpeed() {
        return speed;
    }

    public Cheetah(int speed) {
        this.speed = speed;
        setName("cheetah1");
    }
}
