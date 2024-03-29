package com.bridgelabz.hashtable;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {

	@Test
	public void givenASentence_WhenWordsAreAddedToListShould_ReturnWordFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myHashMap.get(word);
			if(value == null) value = 1;
			else value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("to");
		System.out.println(myHashMap);
		Assert.assertEquals(2, frequency);
	}

}
