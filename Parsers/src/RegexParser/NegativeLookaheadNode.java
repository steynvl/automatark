package RegexParser;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class NegativeLookaheadNode extends RegexNode {

    public NegativeLookaheadNode(RegexNode r1) {
        myRegex1 = r1;
    }

    public RegexNode getMyRegex1() {
        return myRegex1;
    }

    @Override
    public void unparse(PrintWriter p) {
        p.print("(?!");
        myRegex1.unparse(p);
        p.print(")");

    }

    @Override
    public void toString(StringBuilder s) {
        s.append("(?!");
        myRegex1.toString(s);
        s.append(")");
    }

    @Override
    public void toRaw(StringBuilder s) {
        s.append("(?!");
        myRegex1.toRaw(s);
        s.append(")");
    }

    @Override
    public RegexNode copy() {
        return new NegativeLookaheadNode(myRegex1.copy());
    }

    @Override
    public List<RegexNode> children() {
        return Arrays.asList(myRegex1);
    }

    // one child
    protected RegexNode myRegex1;
}
