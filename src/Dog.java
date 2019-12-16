public class Dog extends  Animal implements Printable{
    private int age;

    public Dog(int age) {
        this.age = age;
        setName("Sharik");
    }

    public int getAge() {
        return age;
    }


    @Override
    public void print() {
        System.out.println("Собаку зовут " + getName()
        + ", ей " + getAge());

    }
}
