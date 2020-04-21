package kg.geektech.les8.players;

import static kg.geektech.les8.players.AbilityType.SAVE_DAMAGE_AND_REVERT;

public class Hunter extends Hero {

    public Hunter(int health, int damage) {
        super(health, damage, SAVE_DAMAGE_AND_REVERT);
    }


    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        setDamage(25);
        setDamage(getDamage() + boss.getDamage()/2);

    }
}
