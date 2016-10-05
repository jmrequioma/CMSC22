public class ShapeTest3 {
	public static void main(String[] args) {
		Shape2 s1 = new Circle2(5.5, "RED", false); // Upcast Circle to Shape
		System.out.println(s1); // which version?
		System.out.println(s1.getArea()); // which version?
		System.out.println(s1.getPerimeter()); // which version?
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		System.out.println(s1.getRadius());
		Circle2 c1 = (Circle2)s1; // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		Shape2 s2 = new Shape2();
		Shape2 s3 = new Rectangle2(1.0, 2.0, "RED", false); // Upcast

		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		System.out.println(s3.getLength());
		Rectangle2 r1 = (Rectangle2)s3; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		Shape2 s4 = new Square2(6.6); // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		System.out.println(s4.getSide());
		// Take note that we downcast Shape s4 to Rectangle ,
		// which is a superclass of Square, instead of Squar e
		Rectangle2 r2 = (Rectangle2)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getSide());
		System.out.println(r2.getLength());
		// Downcast Rectangle r2 to Square
		Square2 sq1 = (Square2)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
	}
}
