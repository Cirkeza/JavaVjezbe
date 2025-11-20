package game;

public abstract class GameObject {
private int x;
private int y;
private Collidable colider;
public GameObject(int x, int y, Collidable colider) {

	this.x = x;
	this.y = y;
	this.colider = colider;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public Collidable getColider() {
	return colider;
}
public void setColider(Collidable colider) {
	this.colider = colider;
}
@Override
public String toString() {
	return "GameObject [x=" + x + ", y=" + y + ", colider=" + colider + "]";
}
}
