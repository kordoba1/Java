package game.model;


public abstract class Droid {
    protected String name;
    protected int health;
    protected int damage;

    public Droid() { }

    public Droid(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void getHit(int damage) {
        this.health -= damage;
    }

    @Override
    public String toString() {
        return String.format("name =%10s, damage =%5d, health =%5d", name, damage, health);
    }
}
