public class Square2 extends Rectangle2 {

	public Square2() {
		super();
	}

	public Square2(double side) {
		super(side, side);
	}

	public Square2(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return super.getLength();
	}

	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}

	@Override
	public void setWidth(double side) {
		super.setWidth(side);
	}

	@Override
	public void setLength(double side) {
		super.setLength(side);
	}

	@Override
	public String toString() {
		return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
	}

}
