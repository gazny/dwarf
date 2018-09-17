package lexer;

public class TWord extends Token {

    public static final TWord
        and = new TWord("and", Tag.AND),
        or = new TWord("or", Tag.OR),
        eq = new TWord("==", Tag.EQ),
        ne = new TWord("!=", Tag.NE),
        le = new TWord("<=", Tag.LE),
        ge = new TWord(">=", Tag.GE),
        True = new TWord("true", Tag.TRUE),
        False = new TWord("false", Tag.FALSE),
        minus = new TWord("minus", Tag.MINUS),
        temp = new TWord("t", Tag.TEMP);

    private final String lexeme;

    public TWord(String lexeme, Tag tag) {
        super(tag);
        this.lexeme = lexeme;
    }

    @Override
    public String toString() {
        return "<WORD, " + this.lexeme + ">";
    }
}