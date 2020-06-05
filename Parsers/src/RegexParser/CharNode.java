package RegexParser;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;


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
		s.append(myChar);
	}

	@Override
	public RegexNode copy() {
		return new CharNode(myChar);
	}

	@Override
	public List<RegexNode> children() {
		return new LinkedList<>();
	}

	public char getChar(){
		return myChar;
	}
	
	protected char myChar;
}
