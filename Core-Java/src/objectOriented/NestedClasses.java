package objectOriented;

public class NestedClasses {
	
	// outer class
	public class OuterClass {
		
		private static final String staticVariable = "OuterClassStatic";
	    private String privateClass = "OuterClassPrivate";
	    protected String protectedClass = "OuterClassProtected";
	    
	    // inner class
	    private class InnerClass {
	    	
	    	public void print() {
	    		System.out.println("This is an inner class");
	    		}
	    	
	        //inner class, non static can access all the variables/methods of outer class
	    	public void getOutervariables() {
	    		System.out.println("outer class staticVariable in inner class = " + staticVariable);
	    		System.out.println("outer class privateClass in inner class = " + privateClass);
	    		System.out.println("outer class protectedClass in inner class = " + protectedClass);
	    		}
	    	}
	    
	    // create instance of inner class in a method of outer class
	    void showInnerClass() {
	    	InnerClass innerClass = new InnerClass();
	    	innerClass.print();
	    	innerClass.getOutervariables();
	    	}
	    
	    // method to create method-local Inner class
	    void methodLocal() {
	    	// method-local inner class
	    	class MethodInnerClass {
	    		public void print() {
	    			System.out.println("This is method inner class ");
	    			}   
	    		} // end of inner class
	    	// Accessing the inner class
	    	MethodInnerClass inner = new MethodInnerClass();
	        inner.print();
	    	}
	    
	    abstract class AnonymousInner {
	    	   public abstract void mymethod();
	    	}
	    
	    void showAnonymousInner(){
	    	AnonymousInner inner = new AnonymousInner() {
	    		public void mymethod() {
	    			System.out.println("This is an example of anonymous inner class");
	    			}
	    		};
	    		inner.mymethod();
	    		}
	    
	    }
	// static nested class, can access OuterClass static variables/methods
	static class staticInnerClass {
        public void print() {
           System.out.println("This is a nested static class");
        }
     }
	
	public static void main(String[] args) {
		 
		//for this tutorial usage
		NestedClasses nesstedClasses = new NestedClasses();
		
		// create and instance of outer class and call it's methods
		OuterClass outerClass = nesstedClasses.new OuterClass();
		outerClass.showInnerClass();
		outerClass.methodLocal();
		outerClass.showAnonymousInner();
		
		// create and instance of the staticInnerClass
		NestedClasses.staticInnerClass staticInner = new staticInnerClass();
		staticInner.print();

	}

}
