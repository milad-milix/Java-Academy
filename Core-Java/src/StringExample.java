import java.util.Arrays;

public class StringExample {
	
	public static void main(String [] args) {
		
		String string = "Milad Zaheri";
		
		// string pooling
		String s1 = "Cat"; // if there is the same value "Cat" in pool, it will reference to it
        String s2 = "Cat"; // if there is not a same value in pool, it will create a new one
        String s3 = new String("Cat"); // if exist in pool, creates only 1 object in Java heap, if not, creates also in pool
		
        // substring method
		System.out.println("First 5 char String: " + string.substring(0, 5)); // from zero to 5 character next
		System.out.println("First 5 char String: " + string.substring(6)); // from 6 to the end
		
		
		// compareTo and compareToIgnoreCase method
		String ss1 = "Dog";
		String ss2 = "dog";
		System.out.println("compareTo returns: " + ss1.compareTo(ss2)); // returns positive if equal(case sensitive)
		System.out.println("compareToIgnoreCase returns: " + ss1.compareToIgnoreCase(ss2)); // returns zero if equal(non case sensitive)
		
		// convert to character array
		char[] chars = string.toCharArray();
		System.out.println("lenght of character array is: " +chars.length);
		System.out.println("character at index 3" +string.charAt(3));
		//let's convert char[] to String now
        String charToStr = new String(chars);
		
		// split method
		String string2 = "Milad is a software engineer";
		String[] words = string2.split(" "); // splits with delimiter
        String[] twoWords = string2.split(" ", 2); // splits with delimiter in two parts, first part is before first occurrence of delimiter
        System.out.println("String split with delimiter: "+Arrays.toString(words));
        System.out.println("String split into two: "+Arrays.toString(twoWords));
        
        //convert String to byte array
        byte[] byteArray = string.getBytes();

		


	}

}
