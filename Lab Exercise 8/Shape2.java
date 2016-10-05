abstract public class Shape2 {
	protected String color;
	protected boolean filled;

	public Shape2() {
		color = "green";
		filled = true;
	}

	public Shape2(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {
		String answer;	
		if (filled) {
			answer = "filled.";
		} else {
			answer = "Not filled.";
		}
		return String.format("A Shape with color of %s and %s", color, answer); 
	}

	abstract public double getArea();

	abstract public double getPerimeter();
}