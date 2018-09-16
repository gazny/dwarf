package lexer;

public class Number extends Token {

    private final int value ;

    public Number(int value) {
        super(Tag.NUMBER);
        this.value = value;
    }
}
