public class ShapeTest {
	public static void main(String[] args) {
		// shape
		Shape s = new Shape();
		System.out.println(s);
		System.out.println(s.getColor());

		s.setColor("yellow");

		System.out.println(s.isFilled());

		s.setFilled(false);

		System.out.println(s);
		Shape s2 = new Shape("black", false);
		System.out.println(s2);

		// circle
		Circle c = new Circle(2.0, "purple", true);
		System.out.println(c);
		c.setColor("green");
		c.setFilled(false);
		c.setRadius(6.7);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(c);

		// rectangle
		Rectangle r = new Rectangle(6.5, 7.6, "indigo", false);
		System.out.println(r);
		r.setColor("pink");
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		System.out.println(r);

		// square
		Square sq = new Square(7, "red", true);
		System.out.println(sq);
		sq.setColor("blue");
		System.out.println(sq.getArea());
		System.out.println(sq.getPerimeter());
		sq.setFilled(false);
		System.out.println(sq);
	}
}