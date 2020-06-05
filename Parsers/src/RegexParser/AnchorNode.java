package RegexParser;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class AnchorNode extends RegexNode {
	
	public AnchorNode(boolean b1, boolean b2) {
		this.start = b1;
		this.end = b2;
	}
	
	@Override
	public void unparse(PrintWriter p) {
		if(this.start){
			p.print("SOS");
		}

		if(this.end){
			p.print("EOS");
		}
	}

	@Override
	public void toString(StringBuilder s) {
		if(this.start){
			s.append("SOS");
		}

		if(this.end){
			s.append("EOS");
		}
		
	}

	@Override
	public void toRaw(StringBuilder s) {
		if (this.start) {
			s.append("^");
		}

		if (this.end) {
			s.append("$");
		}
	}

	@Override
	public RegexNode copy() {
		return new AnchorNode(start, end);
	}

	@Override
	public List<RegexNode> children() {
		return new LinkedList<>();
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
