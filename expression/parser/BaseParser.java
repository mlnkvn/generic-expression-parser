package expression.parser;

public class BaseParser {
    private static final char END = '\0';
    private final CharSource source;
    private char ch = 0xffff;

    protected BaseParser(final CharSource source) {
        this.source = source;
        take();
    }

    protected char take() {
        final char result = ch;
        ch = source.hasNext() ? source.next() : END;
        return result;
    }

    protected boolean test(final char expected) {
        return ch == expected;
    }

    protected boolean take(final char expected) {
        if (test(expected)) {
            take();
            return true;
        }
        return false;
    }

    protected boolean isWhitespace() {
        return Character.isWhitespace(ch);
    }

    protected boolean isDigit() {
        return Character.isDigit(ch);
    }

    protected boolean isVariable() {
        return ch >= 'x' && ch <= 'z';
    }

    protected boolean isAlphabetic() {
        return ch >= 'a' && ch <= 'w';
    }


//    protected boolean isNeg() {
//        skipAllWhitespace();
//        boolean res = false;
//        while (ch == '-') {
//            res = !res;
//            take();
//            skipAllWhitespace();
//        }
//        return res;
//    }

    protected void skipAllWhitespace() {
        while (Character.isWhitespace(ch)) {
            take();
        }
    }

    protected boolean eof() {
        return take(END);
    }

    protected IllegalArgumentException error(final String message) {
        return source.error(message);
    }
}
