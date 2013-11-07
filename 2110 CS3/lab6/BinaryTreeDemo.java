/**
 * @author Derek Neil B00163969
 * Demo of binary tree method calls with null arguments
 * to test robustness of BinaryTree class.
 */
public class BinaryTreeDemo{
	public static void main(String[] args){
		
		//make root is built into overloaded constructor
		BinaryTree<String> A = new BinaryTree<String>("A");
		BinaryTree<String> B = new BinaryTree<String>("B");
		BinaryTree<String> C = new BinaryTree<String>("C");
		BinaryTree<String> D = new BinaryTree<String>("D");
		BinaryTree<String> E = new BinaryTree<String>("E");
		BinaryTree<String> F = new BinaryTree<String>("F");
		
		A.attachLeft(B);
		A.attachRight(C);
		B.attachLeft(D);
		B.attachRight(E);
		D.attachLeft(F);
		
		System.out.print("Preorder:  ");
		BinaryTree.preorder(A);
		System.out.println();
		
		System.out.print("Inorder:  ");
		BinaryTree.inorder(A);
		System.out.println();
		
		System.out.print("Postorder:  ");
		BinaryTree.postorder(A);
		System.out.println();
		
		//Step 1 test
		System.out.println();
		System.out.println("Number of Nodes in Binary Tree:");
		System.out.println("A is: "+BinaryTree.numNodes(A));
		System.out.println("B is: "+BinaryTree.numNodes(B));
		System.out.println("C is: "+BinaryTree.numNodes(C));
		System.out.println("D is: "+BinaryTree.numNodes(D));
		System.out.println("E is: "+BinaryTree.numNodes(E));
		System.out.println("F is: "+BinaryTree.numNodes(F));
		System.out.println("null is: "+BinaryTree.numNodes(null));
		
		//Step 2 test
		System.out.println();
		System.out.println("Height of Node: ");
		System.out.println("A is: "+BinaryTree.height(A));
		System.out.println("B is: "+BinaryTree.height(B));
		System.out.println("C is: "+BinaryTree.height(C));
		System.out.println("D is: "+BinaryTree.height(D));
		System.out.println("E is: "+BinaryTree.height(E));
		System.out.println("F is: "+BinaryTree.height(F));
		System.out.println("null is: "+BinaryTree.height(null));
		
		//Step 3 test
		System.out.println();
		System.out.println("Height Balanced Nodes (True/False): ");
		System.out.println("A "+BinaryTree.heightBalanced(A));
		System.out.println("B "+BinaryTree.heightBalanced(B));
		System.out.println("C "+BinaryTree.heightBalanced(C));
		System.out.println("D "+BinaryTree.heightBalanced(D));
		System.out.println("E "+BinaryTree.heightBalanced(E));
		System.out.println("F "+BinaryTree.heightBalanced(F));
		System.out.println("null "+BinaryTree.heightBalanced(null));
		
		//Step 4 test
		System.out.println();
		System.out.print("Levelorder:  ");
		BinaryTree.levelOrder(A);
		BinaryTree.levelOrder(null); 
		System.out.println();
		
		System.out.println();
		System.out.println("Done.");
	}
	
}