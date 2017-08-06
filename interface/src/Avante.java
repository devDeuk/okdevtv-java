
public class Avante implements Car {
	int speed;

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public boolean accelerate() {
		speed += 10;
		return false;
	}

}
