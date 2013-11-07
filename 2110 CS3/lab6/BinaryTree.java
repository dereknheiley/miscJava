/**
 * @author Derek Neil B00163969
 * BinaryTree class with recursive methods for traversing
 * the BinaryTree & null checks to prevent run time errors.
 */
public class BinaryTree<T> {
	
	//instance variables
	private T data;
	private BinaryTree<T> parent;
	private BinaryTree<T> left;
	private BinaryTree<T> right;
	
	//constructors
	public BinaryTree(){
		parent = left = right = null;
		data = null;
	}
	//overloaded to accept data at time of creation!
	public BinaryTree(T newdata){
		parent = left = right = null;
		data = newdata;
	}
	
	public void makeRoot(T data){
		if (this.data != null)
			System.out.println("Can't make root. Already exists");
		else
			this.data = data;
	}
	
	//set & get methods
	public void setData(T data){
		this.data = data;
	}
	public void setLeft(BinaryTree<T> tree){
		left = tree;
	}
	public void setRight(BinaryTree<T> tree){
		right = tree;
	}
	public void setParent(BinaryTree<T> tree){
		parent = tree;
	}
	public T getData(){
		return data;
	}
	public BinaryTree<T> getParent(){
		return parent;
	}
	public BinaryTree<T> getLeft(){
		return left;
	}
	public BinaryTree<T> getRight(){
		return right;
	}
	
	//attach & detach methods
	public void attachLeft(BinaryTree<T> tree){
		if (tree==null) 
			return;
		else if (left!=null || tree.getParent()!=null){
			System.out.println("Can't attach");
			return;
		}
		else{
			tree.setParent(this);
			left = tree;
		}
	}
	public void attachRight(BinaryTree<T> tree){
		if (tree==null)
			return;
		else if (right!=null || tree.getParent()!=null){
			System.out.println("Can't attach");
			return;
		}
		else{
			tree.setParent(this);
			right = tree;
		}
	}
	public BinaryTree<T> detachLeft(){
		BinaryTree<T> retLeft = left;
		left = null;
		retLeft.setParent(null);
		return retLeft;
	}
	public BinaryTree<T> detachRight(){
		BinaryTree<T> retRight = right;
		right =null;
		retRight.setParent(null);
		return retRight;
	}
	
	//contents
	public boolean isEmpty(){
		if (data == null)
			return true;
		else
			return false;
	}
	public void clear(){
		left = right = parent =null;
		data = null;
	}
	
	
	public BinaryTree<T> root(){
		if (parent == null)
			return this;
		else{
			BinaryTree<T> root = parent;
			while (root.getParent()!=null)
				root = root.getParent();
			return root;
		}
	}
	
	public static <T> void preorder(BinaryTree<T> t){
		if (t!=null){
			System.out.print(t.getData()+" ");
			preorder(t.getLeft());	
			preorder(t.getRight());
		}
	}
	
	public static <T> void inorder(BinaryTree<T> t){
		if (t!=null){
			inorder(t.getLeft());
			System.out.print(t.getData() + " ");
			inorder(t.getRight());
		}
	}
	
	public static <T> void postorder(BinaryTree<T> t){
		if (t!=null){
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() + " ");
		}
	}
	
	//Step 1 recursive method that finds number of nodes
	public static <T> int numNodes(BinaryTree<T> t){
		int count = 0;
		if(t!= null){
			count++;
			count = count + numNodes(t.getLeft());
			count = count + numNodes(t.getRight());
		}
		return count;
	}
	
	/*Step 2 recursive method to find height of tree
	 *assuming this means the height from this node 
	 *back to up to it's root most parent, i guess this 
	 *is better called DEPTH */
	public static <T> int height(BinaryTree<T> t){
		if(t!=null){
			int height = 0;
			if(t.getParent()!=null)
				height = 1 + height(t.getParent());
			return height;
		}
		return -1;
	}
	//method from class finds height of the whole tree given the root
	public static <T> int findHeight(BinaryTree<T> t){
		if(t!=null){
			return 1 + Math.max(findHeight(t.getLeft()), findHeight(t.getLeft()));
		}
		return -1;
	}
	
	//Step 3 subtree lengths differ by 1 at most
	public static <T> boolean heightBalanced(BinaryTree<T> t){
		if(t!=null){
			int l = BinaryTree.numNodes(t.getLeft());
			int r = BinaryTree.numNodes(t.getRight());
			if( l == r || l == r+1 || l == r-1 )
				return true;
		}
		return false;
	}
	
	//Step 4 level order traversal iteratively
	//used custom Queue implementation for O(1) and better efficiency for add/remove
	public static<T> void levelOrder(BinaryTree<T> t){
		if(t!=null){
			Q<BinaryTree<T>> q = new Q<BinaryTree<T>>();
			BinaryTree<T> curr = t;
			while(curr!=null){
				System.out.print(curr.getData() + " ");
				q.enqueue(curr.getLeft());
				q.enqueue(curr.getRight());
				curr = q.dequeue();
			}
		}	
	}

}