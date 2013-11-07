public class BinarySearchTreeDemo
{
	public static void main(String[] args)
	{
		BinarySearchTree<String> myTree = new BinarySearchTree<String>();
		myTree.insert("E");
		myTree.insert("B");
		myTree.insert("F");
		myTree.insert("A");
		myTree.insert("C");
		myTree.insert("G");
		myTree.insert("D");
		
		System.out.println("myTree:");
		BinaryTree.inorder(myTree.getTree());
		System.out.println();
		
		System.out.println("Search for 'A' returned: "+myTree.search("A").getData());
		
		//Exercise 1
		System.out.println("Max: "+myTree.findMax());
		
		//Exercise 2
		System.out.println("Min: "+myTree.findMin());
		
		//Exercise 3
		System.out.println("Recursive search for 'A' returned: "+myTree.recursiveSearch("A").getData());
		
		//Exercise 4
		System.out.println("myTree meets all requirements for binary search tree: "+myTree.isBST());
		
		BinarySearchTree<String> secondTree = new BinarySearchTree<String>();
		secondTree.insert("L");
		secondTree.insert("I");
		secondTree.insert("M");
		secondTree.insert("H");
		secondTree.insert("J");
		secondTree.insert("K");
		secondTree.insert("N");
		
		System.out.println("\nsecondTree:");
		BinaryTree.inorder(secondTree.getTree());
		System.out.println();
		
		//Exercise 5
		BinarySearchTree<String> mergedTree = myTree.mergeBST(myTree, secondTree);
		
		System.out.println("\nmergedTree:");
		BinaryTree.inorder(mergedTree.getTree());
		System.out.println("\n");
		
		//Rest of pre-made demo
		myTree.delete("C");
		BinaryTree.inorder(myTree.getTree());
		System.out.println();
		
		myTree.delete("F");
		BinaryTree.inorder(myTree.getTree());
		System.out.println();
		
		myTree.delete("A");
		BinaryTree.inorder(myTree.getTree());
		System.out.println();
		
		myTree.delete("E");
		BinaryTree.inorder(myTree.getTree());
		System.out.println();
		
		myTree.delete("B");
		myTree.delete("D");
		myTree.delete("G");
		BinaryTree.inorder(myTree.getTree());
	}
}