package lexer;

public class Token {

    protected final Tag tag;

    public Token(Tag tag) {
        this.tag = tag;
    }

    public String toString() {
        return "<" + tag.name() + ">";
    }
}
