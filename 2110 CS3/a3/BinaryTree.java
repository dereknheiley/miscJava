/**
 * @author Derek Neil B00163969
 * BinaryTree class with recursive methods for traversing
 * the BinaryTree & null checks to prevent run time errors
 */
public class BinaryTree<T extends Comparable<T>> implements Comparable<BinaryTree<T>> {
	
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
	
	//compare something to something else!
	public int compareTo(BinaryTree<T> t){
		return data.compareTo(t.getData());
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
			BinaryTree<T> next = parent;
			while (next.getParent()!=null)
				next = next.getParent();
			return next;
		}
	}
	
	public void preorder(BinaryTree<T> t){
		if (t!=null){
			System.out.print(t.getData()+" ");
			preorder(t.getLeft());	
			preorder(t.getRight());
		}
	}
	
	public void inorder(BinaryTree<T> t){
		if (t!=null){
			inorder(t.getLeft());
			System.out.print(t.getData() + " ");
			inorder(t.getRight());
		}
	}
	
	public void postorder(BinaryTree<T> t){
		if (t!=null){
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() + " ");
		}
	}

	public int numNodes(BinaryTree<T> t){
		int count = 0;
		if(t!= null){
			count++;
			count = count + numNodes(t.getLeft());
			count = count + numNodes(t.getRight());
		}
		return count;
	}
	
	public int height(BinaryTree<T> t){
		if(t!=null){
			int height = 0;
			if(t.getParent()!=null)
				height = 1 + height(t.getParent());
			return height;
		}
		return -1;
	}

	public boolean heightBalanced(BinaryTree<T> t){
		if(t!=null){
			int l = this.numNodes(t.getLeft());
			int r = this.numNodes(t.getRight());
			if( l == r || l == r+1 || l == r-1 )
				return true;
		}
		return false;
	}
	
	public void levelOrder(BinaryTree<T> t){
		if(t!=null){
			Q<BinaryTree<T>> q = new Q<BinaryTree<T>>();
			BinaryTree<T> curr = t;
			while(curr!=null){
				System.out.println(curr.getData() + " ");
				q.enqueue(curr.getLeft());
				q.enqueue(curr.getRight());
				curr = q.dequeue();
			}
		}	
	}
}