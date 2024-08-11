public class Sparrow extends Birds{
String name;

    public Sparrow(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println("Чирик!");
    }
}
