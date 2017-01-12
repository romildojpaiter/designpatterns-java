package lambda;

public class RunnableLambda {
	
	public static void main(String[] args) {
		
		System.out.println("=== RunnableTest ===");
		
		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world one");
			}
		};
		
		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Hello World dois");
		
		// runs
		r1.run();
		r2.run();
		
	}

}
