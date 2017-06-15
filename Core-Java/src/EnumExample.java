import java.io.Closeable;
import java.io.IOException;

public class EnumExample{
	
	enum enumThread {
		
		START(1){
			
			@Override
			public String toString(){
				return "START implementation. Priority="+getPriority();
			}
			@Override
			public String getDetail() {
				return "START";
			}
		},
		RUNNING(2){
			@Override
			public String getDetail() {
				return "RUNNING";
			}
			
		},
		WAITING(3){
			@Override
			public String getDetail() {
				return "WAITING";
			}
		},
		DEAD(4){
			@Override
			public String getDetail() {
				return "DEAD";
			}
		};
		private int priority;
		
		public abstract String getDetail();
		
		//Enum constructors should always be private.
		private enumThread(int i){
			priority = i;
			}
		
		//Enum can have methods
		public int getPriority(){
			return this.priority;
			}
		
		public void setPriority(int p){
			this.priority = p;
		}
		
		//Enum can override functions
		@Override
		public String toString(){
			return "Default EnumExample implementation. Priority="+getPriority();
			}
		
	} // end of Enum
	
	public static void main(String[] args) throws IOException {
		
		// using Enum values
		enumThread[] thArray = enumThread.values();
		for(enumThread th : thArray){
			System.out.println(th.toString() + "::priority="+th.getPriority());
		}
		
		// using Enum value of
		enumThread th = Enum.valueOf(enumThread.class, "START");
		System.out.println("th priority="+th.getPriority());
		System.out.println("th priority="+enumThread.RUNNING.getPriority());
		
		// using Enum methods
		enumThread thc = enumThread.DEAD;
		System.out.println(thc.getPriority());
		thc = enumThread.START;
		System.out.println(thc.toString());
	} //end of main

}
