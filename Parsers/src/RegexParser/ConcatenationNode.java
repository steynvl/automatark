package RegexParser;

import java.io.PrintWriter;
import java.util.*;

public class ConcatenationNode extends RegexNode {
	public ConcatenationNode(List<RegexNode> S) {
		myConcateList = S;
	}

	public List<RegexNode> getList() {
		return myConcateList;
	}


	public void toString(StringBuilder s) {
		Iterator<RegexNode> it = myConcateList.iterator();
		try {
			
			while (it.hasNext()) {
				s.append("(");
				((RegexNode) it.next()).toString(s);
				s.append(")");
			}
			
		} catch (NoSuchElementException ex) {
			System.err.println("unexpected NoSuchElementException in RegexListNode.toString");
			System.exit(-1);
		}
	}

	@Override
	public void toRaw(StringBuilder s) {
		Iterator<RegexNode> it = myConcateList.iterator();
		try {

			while (it.hasNext()) {
				s.append("(");
				((RegexNode) it.next()).toRaw(s);
				s.append(")");
			}

		} catch (NoSuchElementException ex) {
			System.err.println("unexpected NoSuchElementException in RegexListNode.toString");
			System.exit(-1);
		}
	}

	public void unparse(PrintWriter p) {
		Iterator<RegexNode> it = myConcateList.iterator();
		try {
			
			while (it.hasNext()) {
				p.print("(");
				((RegexNode) it.next()).unparse(p);
				p.print(")");
			}
			
		} catch (NoSuchElementException ex) {
			System.err.println("unexpected NoSuchElementException in RegexListNode.unparse");
			System.exit(-1);
		}

	}

	@Override
	public RegexNode copy() {
		List<RegexNode> copy = new LinkedList<>();
		myConcateList.forEach(n -> copy.add(n.copy()));
		return new ConcatenationNode(copy);
	}

	@Override
	public List<RegexNode> children() {
		return new LinkedList<>(myConcateList);
	}

	// two kids
	private List<RegexNode> myConcateList;
}
