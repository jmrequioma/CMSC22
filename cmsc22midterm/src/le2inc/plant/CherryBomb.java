package le2inc.plant;

import java.util.List;

import le2inc.zombie.Zombie;

public class CherryBomb extends Plant implements SplashAttacker {
	
	private int turnCount = 2;
	
	public CherryBomb() {
		super(10, 150);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void splashAttack(List<Zombie> defenders) {
		// TODO Auto-generated method stub
		if (turnCount != 0) {
			turnCount--;
		} else {
			for (Zombie z : defenders) {
				super.takeDamage(getDamage());
				z.takeDamage(getDamage());
			}
		}
	}
}
