import java.util.Arrays;

public class SuperDot {
    Property[] prop;

    public SuperDot(Property... prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "SuperDot{" +
                "prop=" + Arrays.toString(prop) +
                '}';
    }
}
