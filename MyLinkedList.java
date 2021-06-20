package com.bridgelabz.hashtable;

public class MyLinkedList<K, V> {
		/*
		 * Linked List consist of a head and a tail. Create a linked list of INode.
		 */
		public INode<K> head;
		public INode<K> tail;

		public MyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		// Add a node at the front
		public void add(INode<K> newNode) {
			if (this.head == null) {
				this.head = newNode;
			}
			if (this.tail == null) {
				this.tail = newNode;
			} else {
				INode<K> tempNode = this.head; 
				this.head = newNode; 
				this.head.setNext(tempNode); 
			}
		}

		// Add a node at the end
		public void append(INode<K> newNode) {
			if (this.head == null) {
				this.head = newNode;
			}
			if (this.tail == null) {
				this.tail = newNode;
			} else {
				this.tail.setNext(newNode);
				this.tail = newNode;
			}
		}

		// Pop-out the 1st node(56)
		public INode<K> pop() {
			INode<K> tempNode = this.head;
			this.head = head.getNext();
			return tempNode;
		}

		// Pop-out the last node(70)
		public void popLast() {
			INode<K> tempNode = head;
			while (tempNode.getNext().equals(tail)) {
				tempNode = tempNode.getNext();
			}
			this.tail = tempNode;
			tempNode.setNext(null);
		}
		
		public INode<K> search(K key){
			INode<K> tempNode = head;
			while(tempNode != null && tempNode.getNext() != null) {
				if(tempNode.getKey().equals(key)) {
					return tempNode;
				}
				tempNode = tempNode.getNext();
			}
			return null;
		}
		
		public void printMyNodes() {
			System.out.println("My Nodes : " + head);
		}
		
		public String toString() {
			return "MyLinkedListNodes{" + head + '}';
		}

	}
