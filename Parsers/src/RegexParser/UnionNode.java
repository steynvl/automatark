package RegexParser;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class UnionNode extends RegexNode {
	public UnionNode(RegexNode r1, RegexNode r2) {
		myRegex1 = r1;
		myRegex2 = r2;
	}

	public RegexNode getMyRegex1() {
		return myRegex1;
	}

	public RegexNode getMyRegex2() {
		return myRegex2;
	}

	@Override
	public void unparse(PrintWriter p) {
		p.print("(");
		myRegex1.unparse(p);
		p.print(" | ");
		myRegex2.unparse(p);
		p.print(")");
	}

	@Override
	public void toString(StringBuilder s) {
		s.append("(");
		myRegex1.toString(s);
		s.append(" | ");
		myRegex2.toString(s);
		s.append(")");
	}

	@Override
	public void toRaw(StringBuilder s) {
		s.append("(");
		myRegex1.toRaw(s);
		s.append("|");
		myRegex2.toRaw(s);
		s.append(")");
	}

	@Override
	public RegexNode copy() {
		return new UnionNode(myRegex1.copy(), myRegex2.copy());
	}

	@Override
	public List<RegexNode> children() {
		return Arrays.asList(myRegex1, myRegex2);
	}

	// two kids
	protected RegexNode myRegex1;
	protected RegexNode myRegex2;
}
