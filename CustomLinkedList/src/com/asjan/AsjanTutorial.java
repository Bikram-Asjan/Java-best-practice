package com.asjan;

public class AsjanTutorial {

	public static void main(String[] args) {
		LinkedList customList = new LinkedList();
		//System.out.println(customList);
		customList.insertFront(34);
		customList.insertFront(48);
		customList.insertFront(56);
		customList.insertFront(78);
		customList.insertFront(90);
		//System.out.println(customList);
		//customList.firstNode();
		customList.printNode();
		customList.deleteNode(90);
		System.out.println("\n");
		customList.printNode();
		customList.deleteNode(56);
		System.out.println("\n");
		customList.printNode();
		customList.deleteNode(34);
		System.out.println("\n");
		customList.printNode();
		
	}

}
