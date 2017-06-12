package objectOriented;

public class InheritanceVsComposition {
	
	///////// Inheritance /////////
	
	public abstract class SuperClass {

		public abstract void print();
	}
	
	// child1 class is an extension of superclass
	public class Child1 extends SuperClass {

		// child1 must override the abstract method of it's super class
		@Override
		public void print() {
			System.out.println("print implementation of Child1 class");
		}
		
		// Child1 own method
		public void child1Method(){
			// implementation
			
		}
		
	}
	// child2 has same situation as child1
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
	
	// child3 extends child1 so child3 will become a part of hierarchy SuperClass->Child1->Child3
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
	
	///////// Interface /////////
	
	public interface Interface1 {
		public void method1();
		}
	
	public interface Interface2 {
		public void method2();
		}
	
	// interface does not need to extend it's parent(s) methods
	public interface Interface3 extends Interface1, Interface2 {
		public void method3();
		}
	
	// interface implementation has to implement all methods of the corresponding interfaces
	public class InterfacesImpl implements Interface1, Interface2, Interface3 {

		@Override
		public void method1() {
			System.out.println("Interface1 method implementation of concrete class");
			}
		
		@Override
		public void method2() {
			System.out.println("Interface1 method implementation of concrete class");
			}
		
		@Override
		public void method3() {
			System.out.println("Interface1 method implementation of concrete class");
			}
		}
	
	///////// Composition /////////
	
	public class CompositionExample {
		// use instance of other classes in this class
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
	// this provides a flexibility to have different child classes of super class in our class
	public class CompositionAndInheritance {

		SuperClass obj = null;

		public CompositionAndInheritance(SuperClass o) {
			this.obj = o;
		}
		public void test(){
			obj.print();
		}
	}
	
	// testing part
	public static void main(String[] args) {
		
		InheritanceVsComposition mainClassObject  = new InheritanceVsComposition();
		Child3 child3 = mainClassObject.new Child3();
		child3.child3Method();
		
		InterfacesImpl interfaceImpl = mainClassObject.new InterfacesImpl();
		interfaceImpl.method1();
		
		CompositionAndInheritance obj1 = mainClassObject.new CompositionAndInheritance(mainClassObject.new Child1());
		CompositionAndInheritance obj2 = mainClassObject.new CompositionAndInheritance(mainClassObject.new Child2());
		
		obj1.test();
		obj2.test();
		}
	}
