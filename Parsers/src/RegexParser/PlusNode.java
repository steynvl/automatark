package RegexParser;

import java.io.PrintWriter;

public class PlusNode extends RegexNode {

	public PlusNode(RegexNode r1, QuantifierType quantifierType) {
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
		p.print(")+");
	}

	@Override
	public void toString(StringBuilder s) {
		s.append("(");
		myRegex1.toString(s);
		s.append(")+");
	}

	@Override
	public void toRaw(StringBuilder s) {
		s.append("(");
		myRegex1.toRaw(s);
		s.append(")+");
	}

	@Override
	public RegexNode copy() {
		return new PlusNode(myRegex1.copy(), quantifierType);
	}

	// one kid
	protected RegexNode myRegex1;

	public QuantifierType quantifierType;

}
