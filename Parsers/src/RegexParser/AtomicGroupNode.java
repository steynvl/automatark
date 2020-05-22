package RegexParser;

import java.io.PrintWriter;

public class AtomicGroupNode extends RegexNode {

    public AtomicGroupNode(RegexNode r1) {
        myRegex1 = r1;
    }

    public RegexNode getMyRegex1() {
        return myRegex1;
    }

    @Override
    public void unparse(PrintWriter p) {
        p.print("(?>");
        myRegex1.unparse(p);
        p.print(")");

    }

    @Override
    public void toString(StringBuilder s) {
        s.append("(?>");
        myRegex1.toString(s);
        s.append(")");
    }

    @Override
    public void toRaw(StringBuilder s) {
        s.append("(?>");
        myRegex1.toRaw(s);
        s.append(")");
    }

    @Override
    public RegexNode copy() {
        return new AtomicGroupNode(myRegex1.copy());
    }

    // one child
    public RegexNode myRegex1;
}
