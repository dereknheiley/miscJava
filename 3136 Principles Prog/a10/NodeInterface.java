public interface NodeInterface{
	public abstract void set(int val);
	public abstract NodeInterface self();
	public abstract NodeInterface pred();
	public abstract NodeInterface succ();
	public abstract void setPred(NodeInterface n);
	public abstract void setSucc(NodeInterface n);
	public abstract Integer element();
	public abstract String toString();
	
	//Visitable implementation
	public abstract boolean accept(NodeVisitorInterface visitor);
}