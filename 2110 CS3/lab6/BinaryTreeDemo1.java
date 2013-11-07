/**
 * @author Derek Neil B00163969
 * Demo of binary tree method calls with proper names list
 */
import java.util.Scanner;
public class BinaryTreeDemo1{
	public static void main(String[] args){
		
		//instance variables
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter name or done: ");
		String temp = keyboard.next();
		if( !temp.equalsIgnoreCase("done") ){
			//just keep one reference to main root
			BinaryTree<String> treeRoot = new BinaryTree<String>(temp);
			BinaryTree<String> curr = treeRoot;
			System.out.print("Enter name or done: ");
			temp = keyboard.next();
			
			//get names in loop
			while( !temp.equalsIgnoreCase("done") ){
				if(curr.getLeft()==null)
					curr.attachLeft(new BinaryTree<String>(temp));
				else if(curr.getRight()==null){
					curr.attachRight(new BinaryTree<String>(temp));
					curr = curr.getLeft();
				}
				
				System.out.print("Enter name or done: ");
				temp = keyboard.next();
			}
			//move pointer to furthest leaf down on left
			if(curr.getLeft()!=null)
				curr = curr.getLeft();
			
			System.out.print("Height of Tree is: ");
			System.out.println(BinaryTree.height(curr));
			
			System.out.print("Number of nodes in the Tree is: ");
			System.out.println(BinaryTree.numNodes(treeRoot));
			
			System.out.print("Inorder:  ");
			BinaryTree.inorder(treeRoot);
			System.out.println();
			
			System.out.print("Preorder:  ");
			BinaryTree.preorder(treeRoot);
			System.out.println();
			
			System.out.print("Postorder:  ");
			BinaryTree.postorder(treeRoot);
			System.out.println();
			
			System.out.print("Levelorder:  ");
			BinaryTree.levelOrder(treeRoot);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Done.");
	}
	
}