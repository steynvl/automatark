package RegexParser;

import java.io.PrintWriter;

public class AnchorNode extends RegexNode {
	
	public AnchorNode(boolean b1, boolean b2) {
		this.start = b1;
		this.end = b2;
	}
	
	@Override
	public void unparse(PrintWriter p) {
		//both start of String and end of String
		
		if(this.start){
			p.print("SOS");
		}
//		p.print("(");
//		myRegex1.unparse(p);
//		p.print(")");
		if(this.end){
			p.print("EOS");
		}
	}

	@Override
	public void toString(StringBuilder s) {
		//both start of String and end of String
		if(this.start){
			s.append("SOS");
		}
//		s.append("(");
//		myRegex1.toString(s);
//		s.append(")");
		if(this.end){
			s.append("EOS");
		}
		
	}

	@Override
	public void toRaw(StringBuilder s) {
		if (this.start) {
			s.append("^");
		}

//		s.append("(");
//		s.append(myRegex1.toString());
//		s.append(")");

		if (this.end) {
			s.append("$");
		}
	}
	
	public void setStartAnchor(boolean b){
		this.start = b;
	}
	public void setEndAnchor(boolean b){
		this.end = b;
	}
	
	public boolean hasStartAnchor(){
		return start;
	}
	
	public boolean hasEndAnchor(){
		return end;
	}
	
	
	protected boolean start;
	protected boolean end;
}
