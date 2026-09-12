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

        Enemy enemy = Enemy.builder()
                .name("goblin")
                .health(120)
                .strength(20)
                .build();

        try {
            new WarriorBuilder().name("Joseph").strength(5).build();
        } catch (IllegalStateException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(customWarrior);
        System.out.println();
        System.out.println(archmage);
        System.out.println();
        System.out.println(bossWarrior);
        System.out.println();
        System.out.println(enemy);
    }
}
