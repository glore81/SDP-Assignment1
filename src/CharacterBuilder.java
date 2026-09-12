public interface CharacterBuilder {
    CharacterBuilder reset();

    CharacterBuilder name(String name);
    CharacterBuilder health(int health);
    CharacterBuilder mana(int mana);
    CharacterBuilder strength(int strength);
    CharacterBuilder weapon(String weapon);

    GameCharacter build();
}