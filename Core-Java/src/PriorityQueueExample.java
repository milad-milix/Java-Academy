import java.util.*;

public class PriorityQueueExample {
	
	public static void main(String [] args) {
		
		//natural ordering example of priority queue
		Queue<Integer> integerPriorityQueue = new PriorityQueue<>(5);
		Random rand = new Random();
		for(int i=0;i<5;i++){
			integerPriorityQueue.add(new Integer(rand.nextInt(50)));
		}
		for(int i=0;i<5;i++){
			Integer in = integerPriorityQueue.poll();
			System.out.println("Processing Integer:"+in);
		}
		
		//PriorityQueue example with Comparator
		Queue<SampleClass> comparatorPriorityQueue = new PriorityQueue<>(5, idComparator);
		addDataToQueue(comparatorPriorityQueue);
		pollDataFromQueue(comparatorPriorityQueue);
	}
	
	//Comparator anonymous class implementation
	public static Comparator<SampleClass> idComparator =  new Comparator<SampleClass>(){
		@Override
		public int compare(SampleClass c1, SampleClass c2){
			return (int) (c1.getId() - c2.getId());
		}
	};
	
	//utility method to add random data to Queue
	private static void addDataToQueue(Queue<SampleClass> sampleClassPriorityQueue) {
		Random rand = new Random();
		for(int i=0;i<5;i++) {
			int id = rand.nextInt(30);
			sampleClassPriorityQueue.add(new SampleClass(id, "Employee "+id));
		}
	}
	
	//utility method to pull data from Queue
	private static void pollDataFromQueue(Queue<SampleClass> sampleClassPriorityQueue) {
		while(true) {
			SampleClass employee = sampleClassPriorityQueue.poll();
			if(employee == null) break;
			System.out.println("Processing employee with ID="+employee.getId());
		}
	}
		

}
