package game;

public class Player extends GameObject {
	private String name;
	private int health;
	public Player(int x, int y, Collidable colider, String name, int health) {
		super(x, y, colider);
		this.name = name;
		this.health = health;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name==null) {
			throw new
	IllegalArgumentException("Ime ne smije biti prazno");
		}
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if (health < 0 || health >100) {
			throw new
	IllegalArgumentException("Health mora biti izmedju 0 i 100");
		}
		this.health = health;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + "]";
	}

}
