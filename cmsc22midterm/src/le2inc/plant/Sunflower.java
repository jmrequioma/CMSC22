package le2inc.plant;

public class Sunflower extends Plant implements Producer{
	public Sunflower() {
		super(30, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int produce() {
		// TODO Auto-generated method stub
		return 100;   // gives 100 sunlight every turn
	}
}
