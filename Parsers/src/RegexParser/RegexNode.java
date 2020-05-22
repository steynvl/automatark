package RegexParser;

import java.io.Serializable;

public abstract class RegexNode extends FormulaNode implements Serializable {

    public RegexNode parent;

    abstract public RegexNode copy();

}
