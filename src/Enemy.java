public class Enemy {
    private final String name;
    private final int health;
    private final int strength;

    private Enemy(Builder builder){
        this.name = builder.name;
        this.health = builder.health;
        this.strength = builder.strength;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString(){
        return "Name: "+name +"\nHealth: "+ health+"\nStrength: "+strength;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int health = 100;
        private int strength = 20;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder health(int health) {
            this.health = health;
            return this;
        }

        public Builder strength(int strength) {
            this.strength = strength;
            return this;
        }

        public Enemy build() {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Enemy name is required");
            }
            return new Enemy(this);
        }
    }
}
