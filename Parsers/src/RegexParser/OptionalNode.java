package RegexParser;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class OptionalNode extends RegexNode {

	public OptionalNode(RegexNode r1, QuantifierType quantifierType) {
		myRegex1 = r1;
		this.quantifierType = quantifierType;

	}

	public RegexNode getMyRegex1() {
		return myRegex1;
	}

	@Override
	public void unparse(PrintWriter p) {
		p.print("(");
		myRegex1.unparse(p);
		p.print(")?");
	}

	@Override
	public void toString(StringBuilder s) {
		s.append("(");
		myRegex1.toString(s);
		s.append(")?");
	}

	@Override
	public void toRaw(StringBuilder s) {
		toString(s);
	}

	@Override
	public RegexNode copy() {
		return new OptionalNode(myRegex1.copy(), quantifierType);
	}

	@Override
	public List<RegexNode> children() {
		return Arrays.asList(myRegex1);
	}

	// one kid
	protected RegexNode myRegex1;

	public QuantifierType quantifierType;

}
