package exampl;

import org.springframework.stereotype.Component;

@Component("square")
public class Square implements Shape {
	int side ;
	public Square () {
		side = 6;
	}
	public Square(int side) {
		super();
		this.side = side;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getarea() {
		return side*side;
	}

}
