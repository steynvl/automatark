package RegexParser;

import java.io.PrintWriter;


public class CharNode extends RegexNode{
	public CharNode(char val) {
		this.myChar = val;
	}
	
	@Override
	public void unparse(PrintWriter p) {
		p.print(myChar);
	}

	@Override
	public void toString(StringBuilder s) {
		s.append(myChar);
	}

	@Override
	public void toRaw(StringBuilder s) {
		toString(s);
	}

	@Override
	public RegexNode copy() {
		return new CharNode(myChar);
	}

	public char getChar(){
		return myChar;
	}
	
	protected char myChar;
}
