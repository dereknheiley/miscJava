public class BinarySearchTree<T extends Comparable<T>> {
	private BinaryTree<T> tree;
	int size;
	
	public BinarySearchTree(){
		tree = new BinaryTree<T>();
		size = 0;
	}
	public BinaryTree<T> getTree(){
		return tree;
	}
	public boolean isEmpty(){
		return tree.isEmpty();
	}
	public int size(){
		return size;
	}
	
	public BinaryTree<T> search(T key){
		BinaryTree<T> t = tree;
		boolean found = false;
		while(!found&&t!=null){
			if (key.compareTo(t.getData())<0)
				t = t.getLeft();
			else if (key.compareTo(t.getData())>0)
				t = t.getRight();
			else
				found = true;
		}
		if (found)
			return t;
		else
			return null;
	}
	
	public void insert(T item){
		if(item==null) //added to handle corner case
			return;
		if (tree.isEmpty()){
			tree.makeRoot(item);
			size++;
			return;
		}
		BinaryTree<T> t = tree;
		boolean done = false;
		while (!done){
			int c = item.compareTo(t.getData());
			if (c==0){
				System.out.println("Duplicate item. Can't insert");
				done=true;
			}
			else if (c<0){
				if (t.getLeft()==null){
					BinaryTree<T> newNode = new BinaryTree<T>();
					t.setLeft(newNode);
					newNode.setParent(t);
					newNode.setData(item);
					done = true;
					size++;
				}
				else
					t = t.getLeft();
			}
			else if (c>0){
				if (t.getRight()==null){
					BinaryTree<T> newNode = new BinaryTree<T>();
					t.setRight(newNode);
					newNode.setParent(t);
					newNode.setData(item);
					done = true;
					size++;
				}
				else
					t = t.getRight();
			}
		}
	}
	
	public BinaryTree<T> findPredecessor(BinaryTree<T> node){
		if (node.getLeft()==null)
			return null;
		BinaryTree<T> pred = node.getLeft();
		while (pred.getRight()!=null)
			pred = pred.getRight();
		return pred;
	}
	
	public void deleteHere(BinaryTree<T> deleteNode, BinaryTree<T> attach){
		BinaryTree<T> parent = deleteNode.getParent();
		deleteNode.clear();
		if (parent == null)
			return;
		if (attach == null){ 
				if (parent.getLeft()==deleteNode)
					parent.setLeft(null);
				else
					parent.setRight(null);
				
				deleteNode.setParent(null);
				return;
		}
		if (deleteNode==parent.getLeft()){
			parent.detachLeft();
			attach.setParent(null);
			parent.attachLeft(attach);
		}
		else{
			parent.detachRight();
			attach.setParent(null);
			parent.attachRight(attach);
		}
	}
	
	public void delete(T key){
		if (tree.isEmpty()){
			System.out.println("Can't delete. Empty tree");
			return;
		}
		BinaryTree<T> deleteNode = search(key);
		if (deleteNode == null){
			System.out.println("Can't delete. Key not found"); 
			return;
		}
		BinaryTree<T> hold = null;
		if (deleteNode.getLeft()==null && deleteNode.getRight()==null){
			deleteHere(deleteNode, null);
		}
		else if (deleteNode.getLeft()==null){
			hold = deleteNode.getRight();
			deleteHere(deleteNode, hold);
		}
		else if (deleteNode.getRight()==null){
			hold = deleteNode.getLeft();
			deleteHere(deleteNode, hold);
		}
		else{
			hold = findPredecessor(deleteNode);
			deleteNode.setData(hold.getData());
			deleteNode = hold;
			deleteHere(deleteNode, deleteNode.getLeft());
		}
		size--;
	}
	
	//Exercise 1: findMax
	public T findMax(){
		BinaryTree<T> curr = tree;
		while(curr.getRight()!=null)
			curr = curr.getRight();
		return curr.getData();
	}
	
	//Exercise 2: findMin
	public T findMin(){
		BinaryTree<T> curr = tree;
		while(curr.getLeft()!=null)
			curr = curr.getLeft();
		return curr.getData();
	}
	
	//Exercise 3: recursive search
	//driver method
	public BinaryTree<T> recursiveSearch(T key){
		if (tree.isEmpty()) 
			return null;
		return recursiveSearch(tree, key);
	}
	//recursive worker method
	public BinaryTree<T> recursiveSearch(BinaryTree<T> t, T key) {
		if(t==null)
			return null;
		int c = key.compareTo(t.getData());
		if(c<0)
			return recursiveSearch(t.getLeft(), key);
		if(c>0)
			return recursiveSearch(t.getRight(), key);
		return t; //c==0 case
	}
	
	//Exercise 4: is binary search tree
	public boolean isBST(){
		BinaryTree<T> t = tree;
		if (t==null)
			return true;
		//make sure we have root of BST to start with
		while(t.getParent()!=null)
			t = t.getParent();
		//get tree values in order
		Q<T> q = new Q<T>();
		isBST(q, t.getLeft());
		q.enqueue(t.getData());
		isBST(q, t.getRight());
		//loop through q checking ascending order w/o duplicates
		T curr = q.dequeue();
		while(curr!=null && q.peek()!=null){
			if(curr.compareTo(q.peek()) < 0 )
				curr=q.dequeue();
			else
				return false;
		}
		return true;
	}
	//worker method
	private void isBST(Q<T> q, BinaryTree<T> t){
		if (t!=null){
			isBST(q, t.getLeft());
			q.enqueue(t.getData());
			isBST(q, t.getRight());
		}
	}
	
	//Exercise 5: 
	//merge two BinarySearchTree's into a new third one with O(n) complexity
	public BinarySearchTree<T> mergeBST(BinarySearchTree<T> t1, BinarySearchTree<T> t2){
		BinarySearchTree<T> out = new BinarySearchTree<T>();
		//insert method with drop duplicates
		if (t1!=null){ //get items in first
			if(t1.getTree()!=null){
				out.insert(t1.getTree().getData());
				mergeBST(out, t1.getTree().getLeft());	
				mergeBST(out, t1.getTree().getRight());
			}
		}
		if(t2!=null){ //get items in second
			if(t2.getTree()!=null){
				out.insert(t2.getTree().getData());
				mergeBST(out, t2.getTree().getLeft());	
				mergeBST(out, t2.getTree().getRight());
			}
		}
		return out;
	}
	//worker method doing preorder merging of binary search trees
	private void mergeBST(BinarySearchTree<T> out, BinaryTree<T> t){
		if (t!=null){
			out.insert(t.getData());
			mergeBST(out, t.getLeft());	
			mergeBST(out, t.getRight());
		}
	}
	
}