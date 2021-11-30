package com.collections.examples;

import java.util.ArrayList;

/*Here we can see example for basic ArrayList operations like creating object for ArrayList, adding objects
into ArrayList, accessing objects based on index, searching an object in ArrayList whether it is listed 
under this instance or not, adding elements at specific index, checking whether the ArrayList is empty or 
not, getting object index, and finally size of the ArrayList.*/

//Basic ArrayList operations
public class BasicArrayListOperations {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		ArrayList<Integer> b=new ArrayList();
		//ArrayList<Object> c=new ArrayList();  //Default type Object
		a.add(10);
		a.add(20);
		a.add("chandu");
		System.out.println(a);
		System.out.println("IndexPositionValue="+a.get(2));
		System.out.println("size="+a.size());
		System.out.println(a.isEmpty());
		a.add(2, "java");
		System.out.println(a);
		System.out.println(a.contains("java"));
		System.out.println("index ="+a.indexOf("java"));
		System.out.println("is empty="+a.isEmpty());
		a.set(2, "collectons");
		System.out.println(a);		
		System.out.println(a.hashCode());
		a.remove(0);
		System.out.println(a);
		a.clear();
		System.out.println(a);
		b.add(10);
		b.add(20);
		System.out.println(b);

	}

}
