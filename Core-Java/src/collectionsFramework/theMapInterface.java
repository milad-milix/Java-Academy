package collectionsFramework;

import java.util.*;

public class theMapInterface {
	
	public static void main(String[] args) {
		
		// ####################  HashMap #################### //
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		// put method: Puts an entry in the invoking map, overwriting any previous value associated with the key
		hm.put("name1", 10);
		hm.put("name2", 20);
		System.out.println();
		System.out.println("hashmap contains: "+hm);
		
		// clear method: Removes all key/value pairs from the invoking map.
		hm.clear();
		System.out.println();
		System.out.println("hashmap contains: "+hm);
		
		// containsKey method: Returns true if the invoking map contains the given key.
		System.out.println();
		System.out.println("hashmap contains name1?  "+hm.containsKey("name1"));
		
		// containsValue method: Returns true if the map contains the given value.
		hm.put("name1", 10);
		System.out.println();
		System.out.println("hashmap contains 10?  "+hm.containsValue(10));
		
		// entrySet method: Returns a Set that contains the entries in the map.
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		// Display elements 
	    while(i.hasNext()) {
	    	Map.Entry me = (Map.Entry)i.next();
	    	System.out.print(me.getKey() + ": ");
	    	System.out.println(me.getValue());
	    	}
		
	    // equals(HashMap map) method: Returns true if map is a Map and contains the same entries.
	    
	    // get method: Returns the value associated with the key.
	    System.out.println();
		System.out.println("the value associated with name is:  "+hm.get("name1"));
		
		// hashCode() method: Returns the hash code for the invoking map.
		
		// isEmpty() method: Returns true if the invoking map is empty.
		
		// keySet method: Returns a Set that contains the keys in the invoking map.
		hm.put("name2", 20);
		Set keyset=hm.keySet();
		System.out.println();
		System.out.println("Key set values are: " + keyset);
		
		// values() method: Returns a collection containing the values in the map.
		
		// putAll(Map m): Puts all the entries from m into this map.
		
		// remove method: Removes the entry whose key equals to the given key
		hm.remove("name1");
		System.out.println();
		System.out.println("hashmap contains: "+hm);
		
		// size() method: Returns the number of key/value pairs in the map.
		
		// ####################  TreeMap #################### //
		
		// TreeMap has the same methods as HashMap
		TreeMap treeMap = new TreeMap();
		
		treeMap.put("name1", 10);
		treeMap.put("name2", 20);
		
		set = treeMap.entrySet();
		i = set.iterator();
		
		while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
		
		
	}
}
