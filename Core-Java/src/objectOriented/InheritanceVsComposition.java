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
	///// Interface /////
	
	class InheritanceTesterClass {
		public void main(String[] args) {
			Child3 child3 = new Child3();
			child3.child3Method();
			}
		}
	
	public interface Interface1 {

		public void method();
		}
	
	public interface Interface2 {

		public void method();
		}
	
	public interface Interface3 extends Interface1, Interface2 {

		//same method is declared in Interface1 and Interface2 both
		public void method();
		}
	
	public class InterfacesImpl implements Interface1, Interface2, Interface3 {

		@Override
		public void method() {
			System.out.println("method implementation of concrete class");
			}
		}
	
	//// Composition ////
	public class CompositionExample {
		
		Child1 child1Object = new Child1();
		Child2 Child2Object = new Child2();
		
		public void test() {
			child1Object.print();
			}
		
		public void method1() {
			child1Object.child1Method();
			}
		
		public void method2() {
			Child2Object.child2Method();
			}
		}
	
	// composition with inheritance
	public class CompositionAndInheritance {

		SuperClass obj = null;

		public CompositionAndInheritance(SuperClass o) {
			this.obj = o;
		}
		public void test(){
			obj.print();
		}
		
		public void main(String args[]){
			CompositionAndInheritance obj1 = new CompositionAndInheritance(new Child1());
			CompositionAndInheritance obj2 = new CompositionAndInheritance(new Child2());
			
			obj1.test();
			obj2.test();
		}
	}
	
}
