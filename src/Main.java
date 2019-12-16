public class Main {

    public static void main(String[] args) {
        createObject ("Sharik").print();
        createObject ("Murka").print();
        createObject ("cheetah1").print();
    }
    public static Printable createObject (String className) {// метод, для того чтобы вызывать объекты классов  через уникальный пульт
        Printable printable = null;
        switch (className){
            case "Sharik":
                printable = new Dog(8);
                break;
            case "Murka":
                printable = new Cat ("Myau");
                break;
            case "cheetah1":
                printable=new Cheetah(90);
                break;

        }
        return printable;
    }

}

