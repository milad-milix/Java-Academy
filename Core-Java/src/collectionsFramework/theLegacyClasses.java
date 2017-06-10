package collectionsFramework;

import java.util.*;

public class theLegacyClasses {
	
	public static void main(String[] args) {
		
		// ####################  Vector #################### //
		
		// initialize size is 4, increment is 3
		Vector vector = new Vector(4, 3);
		
		System.out.println("Initial size: " + vector.size());
	    System.out.println("Initial capacity: " + vector.capacity());
	    vector.addElement(new String("name1"));
	    vector.addElement(new String("name2"));
	    vector.addElement(new String("name3"));
	    System.out.println("First element: " + vector.firstElement());
	    System.out.println("Last element: " + vector.lastElement());
	    if(vector.contains(new String("name2")))
	         System.out.println("Vector contains name2.");
	    
	    
	    // ####################  Stack #################### //
	    
	    Stack stack = new Stack();
	    
	    // push method: Pushes the element onto the stack. Element is also returned.
	    stack.push(new String("name1"));
	    System.out.println("push(name1)");
	    System.out.println("stack: " + stack);
	    stack.push(new String("name2"));
	    System.out.println("push(name2)");
	    System.out.println("stack: " + stack);
	    
	    // empty() method: Tests if this stack is empty. Returns true if the stack is empty
	    
	    // peek method: Returns the element on the top of the stack, but does not remove it.
	    System.out.println("on top of stack is: "+stack.peek());
	    
	    // pop method: Returns the element on the top of the stack, removing it in the process
	    
	    // search method: Searches for element in the stack.
	    // If found, its offset from the top of the stack is returned.
	    System.out.println("offset of name2 in stack is: "+stack.search("name2"));
	    
	    // ####################  HashTable #################### //
	    
	    // has the same methods as HashMap
	    Hashtable<String, Integer> hashTable = new Hashtable<String, Integer>();
	    
	    hashTable.put("name1", 12);
	    hashTable.put("name2", 14);
	    
	    // Show all balances in hash table.
	    Enumeration<String> names = hashTable.keys();
	    while(names.hasMoreElements()) {
	    	String str = (String) names.nextElement();
	    	System.out.println(str + ": " + hashTable.get(str));
	    	} 
	}

}
