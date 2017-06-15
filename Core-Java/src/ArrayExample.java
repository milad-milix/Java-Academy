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
        
        //adding two arrays to another array
        Object[] objArr1 = {"1","2","3"};
        Object[] objArr2 = {"4","5","6"};
        Object[] objArr = new Object[objArr1.length+objArr2.length];
        System.arraycopy(objArr1, 0, objArr, 0, objArr1.length);
        System.arraycopy(objArr2, 0, objArr, objArr1.length, objArr2.length);
        System.out.println("meged arrays: "+Arrays.toString(objArr));
        
        // sorting array
        String[] objArr3 = {"5", "3", "7"};
        Arrays.sort(objArr3);
        System.out.println("sorted array: "+Arrays.toString(objArr3));
        
        // ArrayList to array conversion
        List<String> strList = new ArrayList<String>();
        strList.add("1");
        strList.add("2");
        strList.add("3");
        String[] strArr = null;
        strArr = strList.toArray(new String[strList.size()]);
        System.out.println("arraylist to array" + Arrays.toString(strArr));
        
        
	
	} // end of main
	
	public static int sum(int i, int...js ){
        int sum = i;
        for(int x : js){
            sum+=x;
        }
        return sum;
    }

}
