package com.java.dsa;


class Node{
	
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data=data;
	}
	
	@Override
	public int hashCode() {
		return data*31+1;
	}
	
}

/*				8 	
 * 
 * 			7		12
 * 		
 * 		2				15
 * 		
 * 			5
 */


class BinaryTree {

	Node root;

	public void insert(int data) {

		root = insertRec(root, data);
	}

	public Node insertRec(Node node, int data) {

		if (root == null) {
			return root = new Node(data);
		} else if (data <= root.data) {

			return root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			return root.right = insertRec(root.right, data);
		}

		return root;
	}

	public void inorder(Node right) {
		inorderRec(right);
	}

	public void inorderRec(Node root) {
		if(root!=null) {
		
			inorderRec(root.left);
			
			System.out.println(root.data+ " ");
			
			inorder(root.right);
			
		}
	}
}
public class TreeDsa {

	public static void main(String[] args) {
		
		BinaryTree tree=new BinaryTree();
		tree.insert(8);
		tree.insert(7);
		tree.insert(15);
		tree.insert(5);
		tree.insert(2);
		tree.insert(12);
		tree.insert(0);
	}
}
