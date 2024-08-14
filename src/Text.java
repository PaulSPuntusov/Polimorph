public class Text implements LengthAble {
    String text;

    public Text(String text) {
        this.text = text;
    }
    public double getLength(){
        return text.length();
    }
}
