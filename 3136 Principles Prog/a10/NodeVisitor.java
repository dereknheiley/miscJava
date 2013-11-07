public class NodeVisitor implements NodeVisitorInterface{
	
	public ListState state = new ListState();
	private int mult=1;
	private int sum=0;

	public NodeVisitor() {
	}
	public NodeVisitor(int m){
		mult=m;
	}

	public boolean visit(NodeInterface n) {
		state.setState(n);
		n.set(n.element()*mult);
		sum+=n.element();
		return n.succ() instanceof Node;
	}
	public Integer getSum(){
		return sum;
	}
	
	//could have also implemented second NodeVisitor that implemented NodeVisitorInterface
	public Integer getState(){
		return state.getState();
	}

}