
public class MovablePoint implements Movable, Drawable {
	
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public String toString() {
		return "Movable Point with x = " + x + ", and y = " + y;
	}
	
	@Override
	public void moveDown() {
		y += ySpeed;
		
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;
		
	}

	@Override
	public void moveRight() {
		x += xSpeed;
		
	}

	@Override
	public void moveUp() {
		y -= ySpeed;
		
	}
	
	@Override
	public void render(){
		while(y-- != 0){ System.out.println(""); }
		while(x-- != 1){ System.out.print(""); } 
		System.out.println(".");
	}
		
}
