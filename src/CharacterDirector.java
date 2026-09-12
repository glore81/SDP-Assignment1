public class CharacterDirector {

    public GameCharacter makeBossWarrior(CharacterBuilder builder){
        return builder.reset()
                .name("Demon Lord Warrior")
                .health(500)
                .strength(25)
                .weapon("Demonic Axe")
                .build();
    }

    public GameCharacter makeArchmage(CharacterBuilder builder){
        return builder.reset()
                .name("Archmage")
                .mana(250)
                .weapon("Staff of Power")
                .build();
    }
}
