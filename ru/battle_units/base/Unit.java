package ru.battle_units.base;

public class Unit {
    protected int healthScore;
    private int maxHealthScore;

    //конструктор
    public Unit(int healthScore) {
        if (healthScore < 1) {
            throw new IllegalArgumentException("Здоровье должно быть положительным");
        }
        this.healthScore = healthScore; //для текущего объекта значение должно быть равно healthScore переданное в конструктор
        maxHealthScore = healthScore;
    }

    public int getHealthScore() {
        return healthScore;
    }

    public void plusHealth(int healthScore) {
        if (!isAlive()) return;
        this.healthScore = Math.min(this.healthScore + healthScore, maxHealthScore);
    }

    //ни чего не возвращает поэтому void
    public void minusHealth(int healthScore) {
        if (!isAlive()) return;
        this.healthScore -= healthScore;
    }

    public boolean isAlive() {
        return healthScore > 0;
    }


}
