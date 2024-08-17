public class Cuckoo extends Birds{
    String name;

    public Cuckoo(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
    double n = Math.random();
        System.out.println("Куку!");
    for( int i = 1; i<n*10;i++){
        System.out.println("Куку!");
    }

    }
}
