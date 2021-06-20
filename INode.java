package com.bridgelabz.hashtable;

public interface INode<K> {
	//Interface is created with the template key.
	K getKey();
	void setKey(K key);
	
	INode<K> getNext();
	void setNext(INode<K> next);
}
