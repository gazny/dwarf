package lexer;

import java.util.Hashtable;

public class Word {

    public static final Word
        and = new Word("and", Tag.AND),
        or = new Word("or", Tag.OR),
        eq = new Word("==", Tag.EQ), ne = new Word("!=", Tag.NE),
        le = new Word("<=", Tag.LE), ge = new Word(">=", Tag.GE),
        True = new Word("true", Tag.TRUE), False = new Word("false", Tag.FALSE),
        minus = new Word("minus", Tag.MINUS),
        temp = new Word("t", Tag.TEMP);

    private final String lexeme;
    private final Tag tag;

    public Word(String lexeme, Tag tag) {
        this.lexeme = lexeme;
        this.tag = tag;
    }

    public String toString() {
        return "<" + tag.name() + ", " + this.lexeme + ">";
    }
}