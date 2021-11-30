package com.collections.examples;

import java.util.ArrayList;
import java.util.List;

public class AddListElementsToArrayList {

	public static void main(String[] args) {
		 ArrayList<String> arrl = new ArrayList<String>();
	        //adding elements to the end
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        System.out.println("Actual ArrayList:"+arrl);
	        List<String> list = new ArrayList<String>();
	        list.add("one");
	        list.add("two");
	        System.out.println("list elements: "+list);
	        arrl.addAll(list);
	        System.out.println("After Copy: "+arrl);
	}

}
