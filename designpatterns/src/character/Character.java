package character;
import weapon.WeaponBehavior;
public class Character {
	WeaponBehavior weapon;
	
	public Character(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	public void fight() {
		weapon.useWeapon();
	}
		
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}
