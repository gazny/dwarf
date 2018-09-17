package lexer;

public class TRational extends Token {

    private final float value;

    public TRational(float value) {
        super(Tag.RATIONAL);
        this.value = value;
    }

    @Override
    public String toString() {
        return "<RATIONAL, " + this.value + ">";
    }
}
