public class MovableRectangle implements Movable{

	MovablePoint topLeft;
	MovablePoint bottomRight;
	
	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
	    topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
	    bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);	    
	}
	
	@Override
	public void moveDown() {
		topLeft.moveDown();
		bottomRight.moveDown();
		
	}

	@Override
	public void moveLeft() {
		topLeft.moveLeft();
		bottomRight.moveLeft();
		
	}

	@Override
	public void moveRight() {
		topLeft.moveRight();
		bottomRight.moveRight();
		
	}

	@Override
	public void moveUp() {
		topLeft.moveUp();
		bottomRight.moveUp();
		
	}
	
	public String toString(){
		return String.format("Movable Rectangle with p1(%d, %d), p2(%d, %d), p3(%d, %d), p4(%d, %d)"
				, topLeft.x, topLeft.y, bottomRight.x, topLeft.y, topLeft.x, bottomRight.y, bottomRight.x, bottomRight.y);
	}

}
