public class Main {
    public static void main(String[] args) {
        Sparrow jack = new Sparrow("Jack");
        jack.sing();
        Cuckoo ququ = new Cuckoo("Кукуша");
        ququ.sing();
        Parrot gosha = new Parrot("Гоша", "abbracadabbra!");
        gosha.sing();
        letsSing(jack);
    }

    public static double sum(Number... nums) {
        double res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i].doubleValue();
        }
        return res;
    }

    public static double mainGetLength(LengthAble object) {
        double res = 0;
        res = object.getLength();
        return res;
    }
    public static void letsSing(SingAble object){
        object.sing();
    }

    interface LengthAble {
        double getLength();
    }
    interface SingAble{
        void sing();
    }
}