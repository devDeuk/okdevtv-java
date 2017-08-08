
public class LambdaTest {

	public static void main(String[] args) {
		int result = add(3, 6);
		System.out.println(result);

		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world one!");
			}
		};

		// Lambda Runnable
		Runnable r2 = () -> {
			System.out.println("Hello world two!");
			System.out.println("Hello world two two!");
		};

		r1.run();
		r2.run();

	}

	private static int add(int i, int j) {
		return i + j;
	}

}
