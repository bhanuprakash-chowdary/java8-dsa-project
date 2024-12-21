package com.java.dsa;

public class CircularLinkedList {
	public static void main(String[] args) {
		CircularLinkedListImpl list = new CircularLinkedListImpl();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(5);
        list.insert(2);
        list.insert(15);
        list.display();
        list.delete(10); 
        list.display();
	}
}

class CircularLinkedListImpl{
	private class Node3{
		int data;
		Node3 next;
		public Node3(int data) {
			this.data=data;
		}
	}
	
	
	Node3 head;
	Node3 tail;
	
	void insert(int data) {
		Node3 node=new Node3(data);
		if(head==null) {
			head=node;
			tail=head;
			return;
		}
		
		tail.next =node;
		node.next=head;
		tail=node;
	}
	
	void display() {
		Node3 temp = head;
		if (head != null) {
			do {
				System.out.print(temp.data+ " - > ");
				temp = temp.next;
			} while (temp != head);
			System.out.println("END");
		}
	}
	
	void delete(int data) {

		Node3 temp = head;

		if (temp == null) {
			return;
		}

		if (temp.data == data) {
			head = head.next;
			tail.next = head;
			return;
		}
		do {
			Node3 n=temp.next;
			if (n.data==data) {
				temp.next=temp.next.next;
				return;
			} 
			temp = temp.next;
		} while (temp != head);
	}
}