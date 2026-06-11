package com.dayFive;

public class TreeDemo {
	
	// Creating Tree Nodes =========//
	class Node{
		int data;
		Node leftNode;
		Node rightNode;
		
		public Node(int data) {
			this.data = data;
		}
	}
	//==============================//
	// Root Node
	private Node rootNode;
	
	// Inserting Nodes of Tree =======//
	void insert(int data) {
		rootNode = insertRec(rootNode, data);		
	}
	
	 public Node insertRec(Node rootNode, int data) {
		Node newNode = new Node(data);
		 if(rootNode == null) {
				rootNode = newNode;
			} else if(data < rootNode.data) {
			rootNode.leftNode = insertRec(rootNode.leftNode, data);
			}else if(data > rootNode.data){
			rootNode.rightNode= insertRec(rootNode.rightNode, data);
		}
		 return rootNode;
		
	}
	 //===================================//
	 //========Traversal of Tree=========//
	 //==================================//
	 
	 // [1] In-Order []
	 public void Inorder() {
		 InorderRec(rootNode);
		
	}
	 public void InorderRec(Node root) {
		if(root != null) {
			InorderRec(root.leftNode);
			System.out.print(root.data+" ");
			InorderRec(root.rightNode);
			
		}
	}
	 // [2] Pre-Order []
	 public void preorder() {
		 PreorderRec(rootNode);
		
	}
	 public void PreorderRec(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
			PreorderRec(root.leftNode);
			PreorderRec(root.rightNode);
			
		}
	}
	 
	 // [3] Post-Order []
	 public void postorder() {
		 PostorderRec(rootNode);
		
	}
	 public void PostorderRec(Node root) {
		if(root != null) {
			PostorderRec(root.leftNode);
			PostorderRec(root.rightNode);
			System.out.print(root.data+" ");
			
		}
	}


	public static void main(String[] args) {

		TreeDemo tree = new TreeDemo();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		System.out.println("Inorder Traversal :: ");
		tree.Inorder();
		System.out.println("\nPreorder Traversal :: ");
		tree.preorder();
		System.out.println("\nPostorder Traversal :: ");
		tree.postorder();

	}

}
