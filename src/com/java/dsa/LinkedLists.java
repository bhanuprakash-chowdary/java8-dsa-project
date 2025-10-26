package com.java.dsa;

class Node1{
	int data;
	Node1 next;
	Node1(int data){
		this.data=data;
	}
	public Node1(int data, Node1 next) {
		super();
		this.data = data;
		this.next = next;
	}
	
}

class LinkedList{
	
	private Node1 head;
	private Node1 tail;
	private int size=0;
	void insert(int data) {
		//creating new node
		Node1 newNode=new Node1(data);
		//Assigning head node to new node but we have to mark new node to be head
		newNode.next=head;
		//Pointing newNode to head
		head=newNode;
		if(tail==null) {
			tail=head;
		}
		size+=1;
	}
	
	void insert(int data,int index) {
		if(index==0) {
			insert(data);
			return;
		}
		
		if(index==size) {
			insertAtEnd(data);
			return;
		}
		
		Node1 temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		
//		Node1 newNode=new Node1(data, temp.next);
//		temp.next=newNode;
		Node1 newNode=new Node1(data);
		newNode.next=temp.next;
		temp.next=newNode;
		size++;
	}
	
	
	void insertAtEnd(int data) {
		
		if(tail==null) {
			insert(data);
			return;
		}
		//creating new node
		Node1 newNode=new Node1(data);
		//Assigning tail node to new node but we have to mark new node to be tail
		tail.next=newNode;
		//Pointing newNode to tail
		tail=newNode;
		size+=1;
		
	}
	
	void printList() {
		Node1 copyNodes=head;
		while(copyNodes!=null) {
			System.out.print(copyNodes.data +" -> ");
			copyNodes=copyNodes.next;
		}
		System.out.print("END");
		System.out.println(" Head "+head.data +" Tail "+ tail.data);
	}
	
	int deleteFirst() {
		int value=head.data;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return value;
	}
	
	int deleteLast() {
		if(size<=1) {
			deleteFirst();
		}
		int value=tail.data;
		Node1 secondLast=get(size-2);//Index starts with 0
		tail=secondLast;
		tail.next=null;
		size--;
		return value;
	}
	Node1 get(int index) {
		Node1 node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
		
	}
	
	int deleteBasedOnIndex(int index) {

		if(index==0) {
			return deleteFirst();
		}
		if(index==size-1) {
			return deleteLast();
		}
		
		Node1 prev=get(index-1);
		int value=prev.next.data;
		prev.next=prev.next.next;
		return value;

	}
	
	int search(int value) {
		Node1 node=head;
		int index=0;
		while(node!=null) {
			if(node.data==value) {
				return index;
			}else {
				index+=1;
				node=node.next;
			}
			
		}
		return index;
	}
	
	public static LinkedList merge(LinkedList node1,LinkedList node2) {
		
		Node1 first=node1.head;
		Node1 second=node2.head;
		
		LinkedList newList=new LinkedList();
		
		while(first!=null && second!=null) {
			if(first.data<second.data) {
				
				newList.insertAtEnd(first.data);
				first=first.next;
			}else {
				newList.insertAtEnd(second.data);
				second=second.next;
			}
		}
		
		while(first!=null ) {
			newList.insertAtEnd(first.data);
			first=first.next;
		}
		while(second!=null) {
			newList.insertAtEnd(second.data);
			second=second.next;
		}
		
		return newList;
	}
	
	public static Node1 addTwoNumbers(LinkedList node1, LinkedList node2) {

		Node1 l1 = node1.head;
		Node1 l2 = node2.head;

		Node1 dummyHead = new Node1(0);
		Node1 current = dummyHead;

		int carry = 0;
		while (l1 != null || l2 != null || carry != 0) {

			int sum = carry;

			if (l1 != null) {
				sum += l1.data;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.data;
				l2 = l2.next;
			}

			carry = sum / 10;
			current.next = new Node1(sum % 10);
			current = current.next;
		}
		return dummyHead.next;
	}

	public Node1 reverse() {

		Node1 prev=null;
		while(head!=null) {
			
			Node1 next=head.next;
			head.next=prev;
			prev=head;
			head=next;
			
		}
		
		return prev;
	}
	
}


public class LinkedLists {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtEnd(5);
        list.insertAtEnd(2);
        list.insert(15, 2);
        list.printList();
        System.out.println("Value found at index : "+list.search(10));
        
        System.out.println(list.deleteFirst());
        list.printList();
        System.out.println(list.deleteLast());
        list.printList();
        System.out.println(list.deleteBasedOnIndex(2));
        list.printList();
        
        
        LinkedList first = new LinkedList();
        LinkedList second = new LinkedList();
        
        first.insertAtEnd(1);
        first.insertAtEnd(2);
        first.insertAtEnd(4);
        
        second.insertAtEnd(1);
        second.insertAtEnd(3);
        second.insertAtEnd(4);
        
        LinkedList mergedSort =LinkedList.merge(first, second);
        
        mergedSort.printList();
        
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        
        l1.insert(3);
        l1.insert(4);
        l1.insert(2);
        
        l2.insert(4);
        l2.insert(6);
        l2.insert(5);
        
        Node1 sum =LinkedList.addTwoNumbers(l1, l2);
        while(sum!=null) {
        	 System.out.print(sum.data+" -> ");
        	sum=sum.next;
        }
       
        
        
       Node1 reversed=list.reverse();
       while(reversed!=null) {
      	 System.out.print(reversed.data+" -> ");
      	reversed=reversed.next;
      }
        
        
        
        
    }
}
