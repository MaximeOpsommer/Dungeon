package dungeon.objects;

public class Weapon extends Item {
	
	private int damage;
	
	public Weapon(String name, int damage) {
		super(name);
		this.damage = damage;
	}

	/**
	 * gives the number of damage of the weapon
	 * @return the number of damage
	 */
	public int getDamage() {
		return this.damage;
	}
	
	@Override
	public String getDescription() {
		return "It's a weapon with "+this.damage+" damage(s)";
	}

	@Override
	public String getType() {
		return "weapon";
	}
}
