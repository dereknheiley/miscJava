public class LinkedList {

	private NodeInterface head = new NullNode();
	private NodeInterface tail = head;
	private NodeInterface nullStart = head;
	private NodeInterface nullEnd = head;
	private int size=0;

	/*it's best to create the list with data or a node, i got a headache trying to figure out
	 * what would happen if you created an empty list then tried to insert the first real element*/
	public LinkedList(int data){
		head = tail = new Node(data);
		nullStart = head.pred();
		nullStart.setSucc(head);
		nullEnd = head.succ();
		nullEnd.setPred(head);
		size++;
	}
	public LinkedList(NodeInterface n) {
		head = tail = n;
		nullStart = head.pred();
		nullStart.setSucc(head);
		nullEnd = head.succ();
		nullEnd.setPred(head);
		size++;
	}

	public void destroy() {
		nullStart = nullEnd = head = tail = new NullNode();
		size=0;
		//this should trigger garbage collection on the orphaned nodes in java
	}

	public NodeInterface head() {
		return head.self();
	}

	public NodeInterface tail() {
		return tail.self();
	}
	
	public int size(){
		return size;
	}
	//generic insert at front of list
	public NodeInterface insertFront(int x) {
		Node newNode = new Node(x, new NullNode(), head);
		newNode.pred().setSucc(newNode);
		head.setPred(newNode); 	//since i know i'm inserting before head
		head=newNode; 			//i can change head pointer
		size++;
		return newNode;
	}
	//generic insert at end of list
	public NodeInterface insertEnd(int x) {
		Node newNode = new Node(x, tail, new NullNode());
		newNode.succ().setPred(newNode);
		tail.setSucc(newNode); 	//since i know i'm inserting at end
		tail=newNode; 			//i can change the tail pointer
		size++;
		return newNode;
	}
	
	public NodeInterface insertBefore(NodeInterface n, int x) {
		Node newNode = new Node(x, n.pred(), n);
		n.pred().setSucc(newNode);
		n.setPred(newNode);
		size++;
		setHeadTails();
		return newNode;
	}
	public NodeInterface insertAfter(NodeInterface n, int x){
		Node newNode = new Node(x, n, n.succ());
		n.setSucc(newNode);
		newNode.succ().setPred(newNode);
		size++;
		setHeadTails();
		return newNode;
	}

	//assumes n is in the list, again, not sure how to change head & tail pointers without an IF
	public void delete(NodeInterface n) {
		NodeInterface change = n.pred();
		change.setSucc(n.succ());
		change = n.succ();
		change.setPred(n.pred());
		n.setSucc(null); //help java garbage collection
		n.setPred(null);
		n = new NullNode(); //just for kicks
		size--;
		setHeadTails();
	}
	private void setHeadTails(){
		head = nullStart.succ();
		tail = nullEnd.pred();
	}
	//note this forEach can accept any NodeVisitor that implements the NodeVisitorInterface
	public void forEach(NodeVisitorInterface visitor){
		NodeInterface n=head;
		while( n.accept(visitor) )
			n=n.succ();
	}
}