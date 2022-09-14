package ru.battle_units.base;

public class Unit {
    protected int healthScore;

    public Unit(int healthScore) {
        if (healthScore < 1) {
            throw new IllegalArgumentException("Здоровье должно быть положительным");
        }
        this.healthScore = healthScore;
    }



}
