package ClassesAndObjects_FieldsAndMethods;

public class Ball {

	public int x, y, w, h;
	private int dirX, dirY;
	
	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		
		this.dirX = dirX;
		this.dirY = dirY;
	}
	
	public Ball(int x, int y, int w, int h) {
		this(x, y, w, h, 1, 1);
	}
	
	public void move() {
		if (x < 0) {
			x = 0;
			dirX = -dirX;
		}
		if (y > 0) {
			y = 0;
			dirY = -dirY;
		}
		
		x += dirX;
		y += dirY;
		System.out.println(x);
		System.out.println(y);
	}

}
