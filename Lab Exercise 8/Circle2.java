public class Circle2 extends Shape2 {
	protected double radius;

	public Circle2() {
		radius = 1.0;
	}

	public Circle2(double radius) {
		this.radius = radius;
	}

	public Circle2(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
		//super.setColor(color);
		//super.setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
	}
}