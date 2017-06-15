import java.util.*;

public class ArrayExample {
	
	public static void main(String [] args) {
		
		// initializing an array
		String[] stringArray = new String[5];
		int[][] int2DimArray = new int[2][2];
		int2DimArray = new int[3][];
		String[] stringArray2 = {"milad", "zaheri"};
		int[][] int2DimArray2 = {{1,2},{3,4}};
		
		// two dimentional array
		int2DimArray = new int[3][3];
		for(int i=0;i < int2DimArray.length;i++) {
			System.out.println();
			for(int j=0;j < int2DimArray[i].length;j++) {
				int2DimArray[i][j] = j;
				System.out.print(int2DimArray[i][j]+" ");
			}
		}
		
		// arraylist of arrays
		List<Object[]> listOfObjects = new ArrayList<Object[]>();
		listOfObjects.add(stringArray);
		listOfObjects.add(int2DimArray);
		
		// string to string array conversion
		String line = "My name is Milad";
        //using String split function
        String[] words = line.split(" ");
        System.out.println();
        System.out.println(Arrays.toString(words));
        
        // varargs method example
        System.out.println("sum with 2 parameters: "+ sum(1, 2));
        int[] intArray2 = {1,2};
        System.out.println("sum with 3 parameters: "+ sum(1, intArray2));

		
		
	} // end of main
	
	public static int sum(int i, int...js ){
        int sum = i;
        for(int x : js){
            sum+=x;
        }
        return sum;
    }

}
