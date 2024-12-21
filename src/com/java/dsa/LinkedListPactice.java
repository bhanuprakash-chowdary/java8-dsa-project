package com.java.dsa;

public class LinkedListPactice {
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	
	public void insert(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void insertAtPosition(int data,int pos) {
		
		Node newNode=new Node(data);
		Node temp=head;
		int index=pos-2;
		while(index>0) {
			temp=temp.next;
			index-=1;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	public void insertAtEnd(int data) {
		if(head==null) {
			insert(data);
			return;
		}
		
		Node temp=head;
		do {
			temp=temp.next;
		}while(temp.next!=null);
		
		if(temp.next==null) {
			Node newNode=new Node(data);
			temp.next=newNode;
		}
		
	}
	
	public void deleteAtBeginning() {
		head=head.next;
	}
	
	public void deleteAtMiddle(int data) {

		if (head.data == data) {
			head = head.next;
		}

		Node temp = head;

		while (temp!=null && temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}

	}
	
	public void deleteAtEnd() {
		Node temp=head;
		
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("END");
	}
	
	
	
	
	
	

	public static void main(String args[]) {
		LinkedListPactice listedList=new LinkedListPactice();
		listedList.insert(1);
		listedList.insert(3);
		listedList.insert(5);
		listedList.insert(7);
		listedList.insert(9);
		listedList.insert(11);
		listedList.insertAtPosition(6,4);
		listedList.insertAtEnd(0);
		
		listedList.display();
		
		listedList.deleteAtEnd();
		
		listedList.display();
	}
}


