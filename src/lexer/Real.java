package lexer;

public class Real extends Token {
    
    private final float value;

    public Real(float value) {
        super(Tag.REAL);
        this.value = value;
    }
}
