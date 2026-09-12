public class WarriorBuilder implements CharacterBuilder {
    private static final int MIN_STRENGTH = 15;
    private static final int DEFAULT_HEALTH = 150;
    private static final int DEFAULT_MANA = 10;

    private String name;
    private int health;
    private int mana;
    private int strength;
    private String weapon;

    public WarriorBuilder() {
        this.reset();
    }

    @Override
    public CharacterBuilder reset() {
        this.name = null;
        this.health = DEFAULT_HEALTH;
        this.mana = DEFAULT_MANA;
        this.strength = MIN_STRENGTH;
        this.weapon = "Greatsword";
        return this;
    }

    @Override
    public CharacterBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CharacterBuilder health(int health) {
        this.health = health;
        return this;
    }

    @Override
    public CharacterBuilder mana(int mana) {
        this.mana = mana;
        return this;
    }

    @Override
    public CharacterBuilder strength(int strength) {
        this.strength = strength;
        return this;
    }

    @Override
    public CharacterBuilder weapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public GameCharacter build() {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Warrior name is required!");
        }
        if (strength < MIN_STRENGTH) {
            throw new IllegalStateException("Warrior requires at least " + MIN_STRENGTH + " strength!");
        }

        return new GameCharacter(name, "Warrior", health, mana, strength, weapon);
    }
}