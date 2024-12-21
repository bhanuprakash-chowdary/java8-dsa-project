package com.java.dsa;

public class DoubleLinkedList {
	public static void main(String[] args) {
		DoubleLinkedImpl list = new DoubleLinkedImpl();
        list.insert(10);
        list.insert(20);
        list.insert(30);
//        list.insertAtEnd(5);
//        list.insertAtEnd(2);
//        list.insert(15, 2);
        list.printList();
//        System.out.println("Value found at index : "+list.search(10));
//        
//        System.out.println(list.deleteFirst());
//        list.printList();
//        System.out.println(list.deleteLast());
//        list.printList();
//        System.out.println(list.deleteBasedOnIndex(2));
//        list.printList();
        
        
        
    }
}

class DoubleLinkedImpl {

	Node2 head;

	public void insert(int data) {

		Node2 node = new Node2(data);
		node.next = head;
		node.prev=null;
		if(head!=null) {
			head.prev = node;
		}
		head = node;
	}
	
//	public void printList(){
//		
//		Node2 temp=head;
//		while(temp!=null) {
//			System.out.print(temp.data+ " -> ");
//			temp=temp.next;
//		}
//	}
	
	public void printList() {
		
		Node2 node=head;
		Node2 last=null;
		while(node!=null) {
			last=node;
			System.out.print(node.data+ " -> ");
			node=node.next;
		}
		System.out.println("END");
		System.out.println("Print in reverse");
		while(last!=null) {
			System.out.print(last.data+ " -> ");
			last=last.prev;
		}
		System.out.println("START");
	}

	private class Node2 {

		private int data;
		private Node2 next;
		private Node2 prev;
		private int size;

		public Node2(int data) {
			this.data = data;
		}
	}
}
