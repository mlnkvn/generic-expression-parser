package expression.parser;

import expression.*;
import expression.exceptions.TripleParser;
import expression.generic.IntegerMode;
import expression.generic.NumberMode;

public class ExpressionParser implements TripleParser {
    @Override
    public All parse(String source) {
        NumberMode<Integer> thisMode = new IntegerMode();
        GenericExpressionParser<Integer> parser = new GenericExpressionParser<Integer>(thisMode);
        return (All) parser.parse(source);
    }
}



