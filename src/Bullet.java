import java.awt.Color;
import java.awt.Graphics;

public class Bullet {

	private double x, y, vx, vy;
	private Color myColor;

	public Bullet(double direction) {
		myColor = Color.orange;
		x = MainClass.WIDTH / 2;
		y = MainClass.HEIGHT / 2;
		this.vx = Math.sin(direction) * 20;
		this.vy = -Math.cos(direction) * 20;
		update(0, 0);
		update(0, 0);
	}

	public void setColor(Color newColor) {
		myColor = newColor;
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval((int) x - 5, (int) y - 5, 10, 10);
	}

	public void update(double dx, double dy) {
		x += vx + dx * 2;
		y += vy + dy * 2;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}
