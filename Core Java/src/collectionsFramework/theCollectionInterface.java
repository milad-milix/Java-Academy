package collectionsFramework;

import java.util.*;


public class theCollectionInterface {
	
	public static void main(String[] args) {
		
		// add method: Adds element to the invoking collection. 
		List<String> list = new ArrayList<String>();
		list.add("name1");
		list.add("name2");
		System.out.println("ArrayList 1 Elements after add method");
	    System.out.print("\t" + list);
	    
	    // addAll method: Adds all the elements of list to the invoking collection.
	    List<String> list2 = new ArrayList<String>();
	    list2.addAll(list);
	    System.out.println();
	    System.out.println("ArrayList 2 Elements after addAll method");
	    System.out.print("\t" + list2);
	    
	    // clear method: Removes all elements from the invoking collection.
	    list.clear();
	    System.out.println();
	    System.out.println("ArrayList 1 Elements after clear method");
	    System.out.print("\t" + list);
	    
	    // contains mehod: Returns true if element is an element of the invoking collection.
	    System.out.println();
	    System.out.println("ArrayList 2 contains name1? " + list2.contains("name1"));
	    
	    // containsAll method: Returns true if the invoking collection contains all elements of list2.
	    list.addAll(list2);
	    System.out.println();
	    System.out.println("ArrayList 1 contains all the elements of list2? " + list.containsAll(list2));
	    
	    // equals method: Returns true if the invoking collection and element are equal.
	    System.out.println();
	    System.out.println("ArrayList 1 is equal to list2? " + list.equals(list2));
	    
	    // hashCode method: Returns the hash code for the invoking collection.
	    System.out.println();
	    System.out.println("ArrayList 1 hash code: " + list.hashCode());
	    
	    // isEmpty method: Returns true if the invoking collection is empty.
	    list.clear();
	    System.out.println();
	    System.out.println("is ArrayList 1 empty: " + list.isEmpty());
	    
	    // iterator method: Returns an iterator for the invoking collection.
	    Iterator<String> itr = list2.iterator();
	    System.out.println();
	    System.out.println("ArrayList 2 contains: ");
	    while(itr.hasNext()) {
	    	String element = itr.next();
	    	System.out.print(element + " ");
	    	}
	    
	    // remove method: Removes one instance of element from the invoking collection.
	    list2.remove("name2");
	    System.out.println();
	    System.out.println("ArrayList 2 after removing name2: "+list2);
	    
	    // removeAll method: Removes all elements of list from the invoking collection.
	    list2.add("name2");
	    list.add("name2");
	    list2.removeAll(list);
	    System.out.println();
	    System.out.println("ArrayList 2 after removeAll: "+list2);
	    
	    // retainAll: Removes all elements from the invoking collection except those in list.
	    list2.add("name2");
	    list2.retainAll(list);
	    System.out.println();
	    System.out.println("ArrayList 2 after retainAll: "+list2);
	    
	    // size method: Returns the number of elements held in the invoking collection.
	    list2.add("name1");
	    System.out.println();
	    System.out.println("ArrayList 2 size: "+list2);
	    
	    // toArray method: Returns an array that contains all the elements stored in the invoking collection.
	    String[] arrayOfStrings = new String[list2.size()];
	    arrayOfStrings = list2.toArray(arrayOfStrings);
	    System.out.println();
	    System.out.println("ArrayList 2 converted to array of string: ");
	    for(String element : arrayOfStrings) {
	    	System.out.print(element + " ");
	    }
	}

}
