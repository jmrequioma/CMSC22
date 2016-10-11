public class TestResizableCircle {
	public static void main(String[] args) {
		ResizableCircle r = new ResizableCircle(2);
		System.out.println(r);
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		r.resize(50);
		System.out.println(r);
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
	}
}
