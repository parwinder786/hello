package challengesChapter6;

public class Wall {

	private double width;
	private double height;

	public Wall() {
		this(0.0, 0.0);  //set the initial values into 2nd constructor 
	}

	public Wall(double width, double height) {

		this.width = width;
		this.height = height;
		if (width < 0) {
			this.width = 0;
		}
		if (height < 0) {
			this.height = 0;
		}

	}

	public void setWidth(double width) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public void setHight(double height) {
		if (height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return height * width;
	}
}
