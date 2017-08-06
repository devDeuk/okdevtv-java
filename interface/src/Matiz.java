
public class Matiz implements Car {
	int speed;
	
	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public boolean accelerate() {
		speed += 20;
		return false;
	}

}
