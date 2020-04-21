package kg.geektech.les8.players;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage) {

        super(health, damage, AbilityType.BOOST);
    }


    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int Number = random.nextInt( 30) + 3;
        for (int i = 0; i < heroes.length - 1; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + Number);
            }

        }
    }
}
