package collectionsFramework;

import java.util.*;

public class theListInterface {
	
	public static void main(String[] args) {
		
		// ####################  ArrayList #################### //
		
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		// add method: Inserts element into the invoking list 
		list.add(0, "num1"); // Inserts the specified element at the specified position index in this list
		list.add("num2"); // Appends the specified element to the end of this list.
		System.out.println();
		System.out.println("list contains:"+list);
		
		// addAll method: Appends all of the elements in the specified collection to the end of this list,
		//in the order that they are returned by the specified collection's iterator
		list2.addAll(list);
		System.out.println();
		System.out.println("list2 contains:"+list2);
		
		// clear method: Removes all of the elements from this list.
		list2.clear();
		System.out.println();
		System.out.println("list2 contains:"+list2);
		
		// contains method: Returns true if this list contains the specified element.
		System.out.println();
		System.out.println("list1 contains num1:"+list.contains("num1"));
		
		// get method: Returns the element at the specified position in this list
		System.out.println();
		System.out.println("list1 at index 1 contains:"+list.get(1));
		
		// indexOf method: Returns the index in this list of the first occurrence of the specified element
		System.out.println();
		System.out.println("index of first occurrence of num1 in list1 is:"+list.indexOf("num1"));
		
		// lastIndexOf: Returns the index in this list of the last occurrence of the specified element
		list.add("num1");
		System.out.println();
		System.out.println("index of last occurrence of num1 in list1 is:"+list.lastIndexOf("num1"));
		
		// remove method: Removes the element at the specified position in this list.
		list.remove(2);
		System.out.println();
		System.out.println("list1 contains:"+list);
		
		// set method: Replaces the element at the specified position in this list with the specified element
		list.set(1, "num3");
		System.out.println();
		System.out.println("list1 contains:"+list);
		
		// size method: Returns the number of elements in this list.
		System.out.println();
	    System.out.println("list1 size: "+list.size());
	    
	    // toArray method: Returns an array containing all of the elements in this list in the correct order.
	    String[] arrayOfStrings = new String[list.size()];
	    arrayOfStrings = list.toArray(arrayOfStrings);
	    System.out.println();
	    System.out.print("list1 convreted to array:");
	    for(String element : arrayOfStrings)
	    	System.out.print(element + " ");
	    
	    
	    // ####################  LinkedList #################### //
	    
	    LinkedList<String> linkedList = new LinkedList<String>();
	    LinkedList<String> linkedList2 = new LinkedList<String>();
	    
	    
	    // add method: Inserts element into the invoking list 
	    linkedList.add(0, "num1"); // Inserts the specified element at the specified position index in this list
	    linkedList.add("num2"); // Appends the specified element to the end of this list.
	 	System.out.println();
	 	System.out.println("linkedList contains:"+linkedList);
	 		
	 	// addAll method: Appends all of the elements in the specified collection to the end of this list,
	 	//in the order that they are returned by the specified collection's iterator
	 	linkedList2.addAll(linkedList);
	 	System.out.println();
	 	System.out.println("linkedList2 contains:"+linkedList2);
	 	
	 	// addFirst method: Inserts the given element at the beginning of this list.
	 	linkedList2.addFirst("num3");
	 	System.out.println();
	 	System.out.println("linkedList2 contains:"+linkedList2);
	 	
	 	// addLast method: Appends the given element to the end of this list.
	 	linkedList2.addFirst("num4");
	 	System.out.println();
	 	System.out.println("linkedList2 contains:"+linkedList2);
	 	
	 	// clear method: Removes all of the elements from this list.
	 	linkedList2.clear();
	 	System.out.println();
	 	System.out.println("linkedList2 contains:"+linkedList2);
	    
	 	
	 	// contains method: Returns true if this list contains the specified element.
	 	System.out.println();
	 	System.out.println("linkedList contains num1:"+linkedList.contains("num1"));
	 	
	 	// get method: Returns the element at the specified position in this list
	 	System.out.println();
	 	System.out.println("linkedList at index 1 contains:"+list.get(1));
	 		
	 	// indexOf method: Returns the index in this list of the first occurrence of the specified element
	 	System.out.println();
	 	System.out.println("index of first occurrence of num1 in linkedList is:"+linkedList.indexOf("num1"));
	 		
	 	// lastIndexOf: Returns the index in this list of the last occurrence of the specified element
	 	list.add("num1");
	 	System.out.println();
	 	System.out.println("index of last occurrence of num1 in linkedList is:"+linkedList.lastIndexOf("num1"));
	 		
	 	// remove method: Removes the element at the specified position/element in this list.
	 	linkedList.remove(1);
	 	System.out.println();
	 	System.out.println("linkedList contains:"+linkedList);
	 	linkedList.add("num3");
	 	linkedList.remove("num3");
	 	System.out.println();
	 	System.out.println("linkedList contains:"+linkedList);
	 	
	 	// removeFirst() method: Removes and returns the first element from this list
	 	
	 	// removeLast() method: Removes and returns the last element from this list
	 	
	 	// set(int index, Object element) method: Replaces the element at the specified position in this list with the specified element.
	 	
	 	// size() method: Returns the number of elements in this list.
	 	
	 	// toArray() method: Returns an array containing all of the elements in this list in the correct order.
	 		
		
	}

}
