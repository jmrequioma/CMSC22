
public class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {
		double newRadius = super.radius * percent / 100.0;
		super.radius += newRadius;
	}
	
	public String toString() {
		return String.format("ResizableCircle with radius = %.2f", super.radius);
	}
}
