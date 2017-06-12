package objectOriented;

public class InheritanceVsComposition {
	
	public abstract class SuperClass {

		public abstract void print();
	}
	
	public class Child1 extends SuperClass {

		@Override
		public void print() {
			System.out.println("print implementation of Child1 class");
		}
		
		// Child1 own method
		public void child1Method(){
			// implementation
			
		}
		
	}
	
	public class Child2 extends SuperClass {

		@Override
		public void print() {
			System.out.println("print implementation of Child2 class");
		}
		
		// Child2 own method
		public void child2Method(){
			// implementation
			
		}
		
	}
	
	public class Child3 extends Child1{

		@Override
		public void print() {
			System.out.println("print implementation of Child3 class");
		}
		
		// Child3 own method
		public void child3Method(){
			super.print();
			
		}
		
	}
	
	class testerClass {
		public void main(String[] args) {
			Child3 child3 = new Child3();
			child3.child3Method();
		}
	}
	

}
