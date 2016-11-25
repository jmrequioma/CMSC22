package main;

import character.*;
import character.Character;
import weapon.*;

public class CharacterTest {
	 public static void main(String[] args) {
		 WeaponBehavior a = new AxeBehavior();
		 WeaponBehavior s = new SwordBehavior();
		 WeaponBehavior b = new BowAndArrowBehavior();
		 WeaponBehavior knife = new KnifeBehavior();
		 Character q = new Queen(a);
		 Character q2 = new Queen(s);
		 Character q3 = new Queen(b);
		 Character q4 = new Queen(knife);
		 System.out.println("Queen wielding different weapons.");
		 q.fight();
		 q2.fight();
		 q3.fight();
		 q4.fight();
		 System.out.println("------------------");
		 System.out.println("King wielding different weapons.");
		 Character k = new King(a);
		 Character k2 = new King(s);
		 Character k3 = new King(b);
		 Character k4 = new King(knife);
		 k.fight();
		 k2.fight();
		 k3.fight();
		 k4.fight();
		 System.out.println("------------------");
		 System.out.println("Knight wielding different weapons.");
		 Character kn = new Knight(a);
		 Character kn2 = new Knight(s);
		 Character kn3 = new Knight(b);
		 Character kn4 = new Knight(knife);
		 kn.fight();
		 kn2.fight();
		 kn3.fight();
		 kn4.fight();
		 System.out.println("------------------");
		 System.out.println("Troll wielding different weapons.");
		 Character t = new Troll(a);
		 Character t2 = new Troll(s);
		 Character t3 = new Troll(b);
		 Character t4 = new Troll(knife);
		 t.fight();
		 t2.fight();
		 t3.fight();
		 t4.fight();
	 }
	        
}
