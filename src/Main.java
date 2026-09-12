public class Main {
    public static void main(String[] args){
        GameCharacter warrior = new WarriorBuilder()
                .name("Charlz")
                        .build();

        GameCharacter mage = new MageBuilder()
                .name("Gendalf")
                        .build();
        System.out.println(warrior);
        System.out.println();
        System.out.println(mage);
    }
}
