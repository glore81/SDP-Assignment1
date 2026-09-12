public class Main {
    public static void main(String[] args){
        Enemy enemy = Enemy.builder()
                .name("Warrior")
                .health(80)
                .strength(20)
                .build();

        System.out.println(enemy);
    }
}
