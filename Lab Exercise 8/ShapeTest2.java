public class ShapeTest2 {
	public static void main(String[] args) {
		// shape
		//Shape2 s = new Shape2();
		//System.out.println(s);
		//System.out.println(s.getColor());

		//s.setColor("yellow");

		//System.out.println(s.isFilled());

		//s.setFilled(false);

		//System.out.println(s);
		//Shape2 s2 = new Shape2("black", false);
		//System.out.println(s2);

		// circle
		Circle2 c = new Circle2(2.0, "purple", true);
		System.out.println(c);
		c.setColor("green");
		c.setFilled(false);
		c.setRadius(6.7);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(c);

		// rectangle
		Rectangle2 r = new Rectangle2(6.5, 7.6, "indigo", false);
		System.out.println(r);
		r.setColor("pink");
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		System.out.println(r);

		// square
		Square2 sq = new Square2(7, "red", true);
		System.out.println(sq);
		sq.setColor("blue");
		System.out.println(sq.getArea());
		System.out.println(sq.getPerimeter());
		sq.setFilled(false);
		System.out.println(sq);

		// triangle
		Triangle t = new Triangle(3, 4, 5);
		System.out.println(t);
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
	}
}
