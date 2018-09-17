package lexer;

public class Token {

    protected final Tag tag;

    public Token(Tag tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "<" + tag.name() + ">";
    }
}
