public class Triangle extends Shape2 {
	
	protected double side1, side2, side3;

	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}

	public Triangle(double side1, double side2, double side3) {
		if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		} else {
			throw new IllegalArgumentException("Sides are not valid!!!");
		}
	}

	@Override
	public double getArea() {
		double p = (getPerimeter() / 2.0);
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)); 
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		return "A Triangle with sides=" + side1 + ", " + side2 + ", " + side3 + ", which is a subclass of " + super.toString();
	}
}
