package lexer;

import java.util.Hashtable;

public class Word extends Token {

    public static final Word
        and = new Word("and", Tag.AND),
        or = new Word("or", Tag.OR),
        eq = new Word("==", Tag.EQ), ne = new Word("!=", Tag.NE),
        le = new Word("<=", Tag.LE), ge = new Word(">=", Tag.GE),
        True = new Word("true", Tag.TRUE), False = new Word("false", Tag.FALSE),
        minus = new Word("minus", Tag.MINUS),
        temp = new Word("t", Tag.TEMP);

    private final String lexeme;

    public Word(String lexeme, Tag tag) {
        super(tag);
        this.lexeme = lexeme;
    }

    public String toString() {
        return "<" + this.tag.name() + ", " + this.lexeme + ">";
    }
}