public class GameCharacter{
    private final String name;
    private final String characterClass;
    private final int health;
    private final int mana;
    private final int strength;
    private final String weapon;

    public GameCharacter(String name, String characterClass, int health, int mana, int strength, String weapon) {
        this.name = name;
        this.characterClass = characterClass;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.weapon = weapon;
    }

    public String getName(){
        return name;
    }

    public String getCharacterClass(){
        return characterClass;
    }

    public int getHealth(){
        return health;
    }

    public int getMana(){
        return mana;
    }

    public int getStrength(){
        return strength;
    }

    public String getWeapon(){
        return weapon;
    }

    @Override
    public String toString(){
        return "Name: "+name+ "\nClass: "+characterClass+"\nHealth "+health+"\nMana: "+mana+"\nStrength: "+strength+"\nWeapon: "+ weapon;
    }

}
