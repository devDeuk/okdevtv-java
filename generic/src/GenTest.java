
public class GenTest {
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		intBox.set(4);
		show(intBox);
		
		Box<String> strBox = new Box<>();
		strBox.set("Hello");
		show(strBox);
	}

	private static void show(Box<?> box) {
		System.out.println(box.get());
	}
}
