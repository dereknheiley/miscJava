public class NullNode implements NodeInterface {
	
	//allows NullNode to point to a real node
	private NodeInterface prev = this;
	private NodeInterface next = this;
	
	public void set(int val){
	}
	public NodeInterface self(){
		return null;
	}
	public NodeInterface pred() {
		return prev;
	}
	public NodeInterface succ() {
		return next;
	}
	
	//NullNode can only be set at beginning or end, not an intermediate node
	public void setPred(NodeInterface n) {
		prev = n;
		next = this;
	}
	public void setSucc(NodeInterface n) {
		next = n;
		prev = this;
	}

	public Integer element() {
		return null;
	}
	public String toString(){
		return "";
	}
	public boolean accept(NodeVisitorInterface visitor){
		return false;
	}

}