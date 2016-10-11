
public class MovableTester {
	public static void main(String[] args) {
		// point
		Movable m1 = new MovablePoint(5, 6, 10, 0);     // upcast
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		
		// circle
		Movable m2 = new MovableCircle(2, 1, 2, 20, 2); // upcast
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		// rectangle
		Movable m3 = new MovableRectangle(0, 2, 2, 0, 2, 8); // upcast
		System.out.println(m3);
		m3.moveRight();
		System.out.println(m3);
	}
}
