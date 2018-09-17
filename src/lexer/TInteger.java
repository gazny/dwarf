package lexer;

public class TInteger extends Token {

    private final int value;

    public TInteger(int value) {
        super(Tag.INTEGER);
        this.value = value;
    }

    @Override
    public String toString() {
        return "<INTEGER, " + this.value + ">";
    }
}
