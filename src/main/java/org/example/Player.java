package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage < 0 ? 0: healthPercentage > 100 ? 100 : healthPercentage;
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int healthPotion) {
        int sum = healthPotion + healthPercentage;
        this.healthPercentage = sum > 100 ? 100 : sum;
    }

    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (healthPercentage < 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }


}
