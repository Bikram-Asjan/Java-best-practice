package com.asjan;

public class LinkedList {
 private Node top;
 
 public LinkedList(){
	 top = null;
 }
 public void insertFront(int data){
	 System.out.println("before inserting :"+top);
	 top = new Node(data, top);
	 System.out.println("After inserting into list");
	 System.out.println(" data : "+top.getData());
	 System.out.println(" next : "+top.getNext());
	 System.out.println("Node address : "+top);
	 System.out.println("\n");
 } 
  
 public void deleteNode(int data){
	 Node prev = null;
	 Node curr = top;
	 // (curr != null) checks if list is empty or not
	 while(curr != null && curr.getData() != data){
		 prev = curr;
		 curr = curr.getNext();
	 }
	if(curr != null){
		if(prev != null){
			// delete middle node
			prev.setNext(curr.getNext());
		} else {
			top = curr.getNext();
		}
	}
 }
 
 public void printNode(){
	 Node curr = top;
	 while(curr != null){
		 // print int data
		 System.out.println(curr.getData());
		 curr = curr.getNext();
	 }
 }
 
 public void firstNode(){
	 System.out.println(top.getData());
 }
}
