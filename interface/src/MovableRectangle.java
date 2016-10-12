public class MovableRectangle implements Movable, Drawable{

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
             
        @Override
	public void render(){
	    int horizontaLine = bottomRight.x - topLeft.x;
	    int verticaLine = topLeft.y - bottomRight.y - 2;
	    int ctrX = horizontaLine;
  	    int xSpacing = horizontaLine;
	    int ySpacing = verticaLine;
	    while (--ySpacing != 0) { System.out.println(""); }
	    while (ctrX-- != 1){ 
		while (--xSpacing != 0) { System.out.print(" "); }    
		System.out.print("x "); 
	    }
	    xSpacing = horizontaLine;
            System.out.println("x");
            while (verticaLine-- != 0){
		while (--xSpacing != 0) { System.out.print(" "); }    
	        System.out.print("x");
		ctrX = (2 * horizontaLine) - 3;
		while (ctrX-- != 0) { 
		    System.out.print(" "); 
		}
		System.out.println("x");
		xSpacing = horizontaLine;
	    }
	    while (--horizontaLine != 0){
		while (--xSpacing != 0) { System.out.print(" "); }    
		System.out.print("x "); 
	    }
            System.out.println("x");
	}
	
	public String toString(){
		return String.format("Movable Rectangle with p1(%d, %d), p2(%d, %d), p3(%d, %d), p4(%d, %d)"
				, topLeft.x, topLeft.y, bottomRight.x, topLeft.y, topLeft.x, bottomRight.y, bottomRight.x, bottomRight.y);
	}

}
