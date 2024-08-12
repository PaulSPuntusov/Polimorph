public class Text implements Main.LengthAble {
    String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public double getLength() {
        return Main.LengthAble.super.getLength(text);
    }
}
