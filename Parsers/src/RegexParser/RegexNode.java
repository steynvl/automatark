package RegexParser;

import java.io.Serializable;
import java.util.List;

public abstract class RegexNode extends FormulaNode implements Serializable {

    public RegexNode parent;

    abstract public RegexNode copy();

    abstract public List<RegexNode> children();

}
