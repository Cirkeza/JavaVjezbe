package game;

public class CircleCollider {
private int cx;
private int cy;
private int poluprecnik;
public CircleCollider(int cx, int cy, int poluprecnik) {
	if (poluprecnik <= 0) {
		throw new
IllegalArgumentException("Poluprecnik mora biti veci od nule");
	}
	this.cx = cx;
	this.cy = cy;
	this.poluprecnik = poluprecnik;
}
public int getCx() {
	return cx;
}
public void setCx(int cx) {
	this.cx = cx;
}
public int getCy() {
	return cy;
}
public void setCy(int cy) {
	this.cy = cy;
}
public int getPoluprecnik() {
	return poluprecnik;
}
public void setPoluprecnik(int poluprecnik) {
	this.poluprecnik = poluprecnik;
}
@Override
public String toString() {
	return "CircleCollider [cx=" + cx + ", cy=" + cy + ", poluprecnik=" + poluprecnik + "]";
}
}
