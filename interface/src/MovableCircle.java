
public class MovableCircle implements Movable {
	
	private int radius;
	private MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	
	public String toString() {
		return "Movable Circle with center at x = " + center.x + ", and y = " + center.y + ", and with radius = " + radius;
	}
	
	@Override
	public void moveDown() {
		center.moveDown();
		
	}

	@Override
	public void moveLeft() {
		center.moveLeft();
		
	}

	@Override
	public void moveRight() {
		center.moveRight();
		
	}

	@Override
	public void moveUp() {
		center.moveUp();
		
	}

}
