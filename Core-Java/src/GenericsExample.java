
public class GenericsExample {
	
	private class GenericsBasicExample<T> {
		
		private T t;

		public T getT() {
			return this.t;
		}

		public void setT(T t) {
			this.t = t;
		}
		
		public <T> boolean isEqual(GenericsBasicExample<T> g1, GenericsBasicExample<T> g2){
			return g1.getT().equals(g2.getT());
		}
	}

	public static void main(String[] args) {
		GenericsExample genericsExample = new GenericsExample(); //main class instance
		
		GenericsExample.GenericsBasicExample<String> genericsBasicExample = genericsExample.new GenericsBasicExample<>();
		genericsBasicExample.setT("Milad");
		
		// raw type
		GenericsExample.GenericsBasicExample genericsBasicExampleRawType = genericsExample.new GenericsBasicExample<>();
		genericsBasicExampleRawType.setT("Milad2");
		genericsBasicExampleRawType.setT(12);
		genericsBasicExampleRawType.setT("Milad");
		
		//test generic method
		System.out.println(genericsBasicExample.isEqual(genericsBasicExample, genericsBasicExampleRawType));
		
	}

}
