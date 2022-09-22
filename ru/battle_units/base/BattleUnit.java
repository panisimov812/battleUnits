package ru.battle_units.base;

public class BattleUnit extends Unit {
    protected int attackScore;

    public BattleUnit(int healthScore, int attackScore) {
        super(healthScore);
        if (attackScore < 1) {
            throw new IllegalArgumentException("Аттака должна быть положительной");
        }
        this.attackScore = attackScore;
    }

    public int getAttackScore() {
        return attackScore;
    }

    //тестовый методы
    public void battleUnitVoid() {
        System.out.println("Метод BattleUnit");
    }

    public boolean runFromField() {
        if (!isAlive()) {
            System.out.println("Юнит не может сбежать");
            return false;
        }
        healthScore -= 1;
        if (!isAlive()) {
            System.out.println("Юнит не смог сбежать");
            return false;
        }
        return true;
    }

}
