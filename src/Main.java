public class Main {
    public static void main(String[] args){
        CharacterBuilder warriorBuilder = new WarriorBuilder();
        CharacterBuilder mageBuilder = new MageBuilder();
        GameCharacter customWarrior = warriorBuilder
                .name("Conan")
                .health(200)
                .strength(25)
                .weapon("Double-Axe")
                .build();

        CharacterDirector director = new CharacterDirector();
        GameCharacter bossWarrior = director.makeBossWarrior(warriorBuilder);
        GameCharacter archmage = director.makeArchmage(mageBuilder);

        System.out.println(customWarrior);
        System.out.println();
        System.out.println(archmage);
        System.out.println();
        System.out.println(bossWarrior);
    }
}
