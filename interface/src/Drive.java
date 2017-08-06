
public class Drive {
	public static void main(String[] args) {
		Car avante = new Avante();
		Car matiz = new Matiz();

		drive(avante, "Avante");
		drive(matiz, "Matiz");
	}

	private static void drive(Car car, String model) {
		System.out.println(model);
		for (int i = 0; i < 10; i++) {
			car.accelerate();
			System.out.println(i + ":" + car.getSpeed());
		}
	}
}
