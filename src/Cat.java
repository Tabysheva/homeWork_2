public class Cat extends Animal implements Printable{
    private  String makeVoice;

    public Cat(String makeVoice) {
        this.makeVoice = makeVoice;
        setName("Murka");
    }



    public String getMakeVoice() {
        return makeVoice;
    }

    @Override
    public void print() {
        System.out.println("Кошку зовут " + getName()  + " она говорит " + getMakeVoice());

    }
}
