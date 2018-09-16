import lexer.Tag;
import lexer.Token;
import lexer.Word;

public class Main {
    public static void main(String[] args) {
        Token token = new Token(Tag.IF);
        Token token2 = Word.and;
        System.out.println(token + " " + token2);
    }
}
