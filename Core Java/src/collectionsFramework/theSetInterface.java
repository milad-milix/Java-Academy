package collectionsFramework;

import java.util.*;

public class theSetInterface {
	
	public static void main(String[] args) {
		
		// ####################  HashSet #################### //
		
		String[] arrayOfString = {"num1","num2","num3"};
	    Set<String> set = new HashSet<String>();
	    
	    // add method: Adds an object to the collection.
	    set.add(arrayOfString[0]);
	    System.out.println();
	    System.out.println("set contains:"+set);
	    
	    // clear method: Removes all objects from the collection.
	    set.clear();
	    System.out.println();
	    System.out.println("set contains:"+set);
	    
	    // contains method: Returns true if a specified object is an element within the collection.
	    set.add(arrayOfString[2]);
	    System.out.println();
	    System.out.println("set contains num3? "+set.contains("num3"));
	    
	    // isEmpty method: Returns true if the collection has no elements.
	    set.clear();
	    System.out.println();
	    System.out.println("is set empty? "+set.isEmpty());
	    
	    // iterator method: Returns an Iterator object for the collection, which may be used to retrieve an object.
	    set.add(arrayOfString[1]);
	    set.add(arrayOfString[2]);
	    Iterator<String> itr = set.iterator();
	    System.out.println();
	    System.out.println("set contains: ");
	    while(itr.hasNext()) {
	    	String element = itr.next();
	    	System.out.print(element + " ");
	    }
	    
	    // remove method: Removes a specified object from the collection.
	    set.remove("num3");
	    System.out.println();
	    System.out.println("set after removing num3: "+set);
	    
	    // size method: Returns the number of elements in the collection.
	    System.out.println();
	    System.out.println("set size: "+set.size());
	    
	    // sorting a HashSet by using TreeSet
	    set.add("num3");
	    set.add(arrayOfString[0]);
	    TreeSet<String> sortedSet = new TreeSet<String>(set);
        System.out.println("The sorted list is:");
        System.out.println(sortedSet);
        
        
        // ####################  LinkedHashSet #################### //
        
        // LinkedHashSet maintains a linked list of the entries in the set, 
        // in the order in which they were inserted. This allows insertion-order iteration over the set.
        // That is, when cycling through a LinkedHashSet using an iterator, 
        // the elements will be returned in the order in which they were inserted.
        
        
        // create a hash set
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        
        // add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        System.out.println(hs);

	}

}
