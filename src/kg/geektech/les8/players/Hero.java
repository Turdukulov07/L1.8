package kg.geektech.les8.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {

    private AbilityType abilityType;


    protected Hero(int health, int damage, AbilityType abilityType) {
        super(health, damage);
        this.abilityType = abilityType;
    }
}
