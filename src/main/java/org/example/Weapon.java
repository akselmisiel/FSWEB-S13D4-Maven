package org.example;

public enum Weapon {
    SWORD(20, 2),
    STAFF(15, 1.5),
    GUN(15, 0.5);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

}
