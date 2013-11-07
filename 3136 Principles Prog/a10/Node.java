public class Node implements NodeInterface {
	
	private int data;
	private NodeInterface next = new NullNode();
	private NodeInterface prev = new NullNode();

	//constructors
	public Node(int data) {
		this.data = data;
		next.setPred(this);
		prev.setSucc(this);
	}
	public Node(int data, NodeInterface prev, NodeInterface next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	
	public void set(int val){
		data = val;
	}
	public NodeInterface self(){
		return this;
	}
	
	public NodeInterface pred() {
		return prev;
	}
	public void setPred(NodeInterface n) {
		prev=n;
	}

	public NodeInterface succ() {
		return next;
	}
	public void setSucc(NodeInterface n) {
		next=n;
	}
	public Integer element() {
		return data;
	}
	public String toString(){
		return ""+data;
	}
	
	public boolean accept(NodeVisitorInterface visitor){
		return visitor.visit(this);
	}

}