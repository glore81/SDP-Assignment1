public class MageBuilder implements CharacterBuilder {
    private static final int MIN_MANA = 100;
    private static final int DEFAULT_HEALTH = 70;

    private String name;
    private int health;
    private int mana;
    private int strength;
    private String weapon;

    public MageBuilder() {
        this.reset();
    }

    @Override
    public CharacterBuilder reset() {
        this.name = null;
        this.health = DEFAULT_HEALTH;
        this.mana = MIN_MANA;
        this.strength = 5;
        this.weapon = "Staff";
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
            throw new IllegalStateException("Mage name is required!");
        }
        if (mana < MIN_MANA) {
            throw new IllegalStateException("Mage requires at least " + MIN_MANA + " mana!");
        }

        return new GameCharacter(name, "Mage", health, mana, strength, weapon);
    }
}