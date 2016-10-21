package le2inc.plant;

import le2inc.Character;

/**
 * Class to generalize all types of plants.
 */
public abstract class Plant extends Character {
	
	private int sunlightCost;
	
	public Plant(int hp, int damage) {
		super(hp, damage);
		// TODO Auto-generated constructor stub
	}
	
	public int getSunlightCost() {
		return sunlightCost;
	}

}
