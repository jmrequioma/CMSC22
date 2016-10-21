package le2inc;

import java.io.IOException;

import le2inc.plant.CherryBomb;
import le2inc.plant.Peashooter;
import le2inc.plant.Sunflower;
import le2inc.zombie.ConeheadZombie;
import le2inc.zombie.FlagZombie;
import le2inc.zombie.BasicZombie;

/**
 * Created by nmenego on 10/16/16.
 */
public class TestClass {
    public static void main(String[] args) {

        // test classes:
        // you may comment/uncomment which testcase# you wish to run...
        // DO NOT change the content of the test cases! you may create your own if you wish.
       test1();
       test2();
       test3();
    }

    private static void test1() {

        PvZ pvZ = new PvZ(new Character[][]{
                {new Peashooter(), null, null, null, null, null, null, null, null, new FlagZombie()},
                {new Sunflower(), null, null, null, null, null, null, null, null, new ConeheadZombie()},
                {new Sunflower(), null, null, null, null, null, null, null, null, new ConeheadZombie()},
                {new Peashooter(), new Peashooter(), null, null, null, null, null, null, new FlagZombie(), new BasicZombie()},
                {new Peashooter(), null, null, null, null, null, new BasicZombie(), new BasicZombie(), new BasicZombie(), new BasicZombie()},
        });
        try {
			pvZ.displayLawn();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        while (pvZ.isAlive() && pvZ.hasZombies()) {
            pvZ.simulateGame();
        }
    }


    private static void test2() {

        PvZ pvZ = new PvZ(new Character[][]{
                {new Peashooter(), null, null, null, null, null, new CherryBomb(), null, null, new ConeheadZombie()},
                {new Sunflower(), null, null, null, null, null, null, null, null, new FlagZombie()},
                {new Sunflower(), new Peashooter(), null, new CherryBomb(), null, null, null, null, null, new FlagZombie()},
                {new Peashooter(), new Peashooter(), null, null, null, new FlagZombie(), new ConeheadZombie(), null, null, new FlagZombie()},
                {new Peashooter(), null, null, null, null, null, new BasicZombie(), new BasicZombie(), new BasicZombie(), new BasicZombie()},
        });
        try {
			pvZ.displayLawn();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        while (pvZ.isAlive() && pvZ.hasZombies()) {
            pvZ.simulateGame();
        }
    }

    private static void test3() {

        PvZ pvZ = new PvZ(new Character[][]{
                {new Peashooter(), null, null, null, null, new BasicZombie(), new CherryBomb(), new ConeheadZombie(), new ConeheadZombie(), new ConeheadZombie()},
                {new Sunflower(), new Peashooter(), null, null, null, new ConeheadZombie(), null, new BasicZombie(), new FlagZombie(), new FlagZombie()},
                {new Sunflower(), new Peashooter(), null, null, new BasicZombie(), null, null, new ConeheadZombie(), null, new FlagZombie()},
                {new Peashooter(), new Peashooter(), new CherryBomb(), null, null, new FlagZombie(), new ConeheadZombie(), null, null, new FlagZombie()},
                {new Peashooter(), null, null, new BasicZombie(), null, null, new BasicZombie(), new BasicZombie(), new BasicZombie(), new BasicZombie()},
        });
        try {
			pvZ.displayLawn();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        while (pvZ.isAlive() && pvZ.hasZombies()) {
            pvZ.simulateGame();
        }
    }
}
