package ru.battle_units;

import ru.battle_units.base.BattleUnit;

public class Infantry extends BattleUnit {
    private int additionalAttack = 5;

    public Infantry(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    public void infantryVoid() {
        System.out.println("Метод infantryVoid");
    }

    //переопределение метода
    public boolean runFromField() {
        if (super.runFromField()) {
            attackScore -= 3;
            System.out.println("После бегства атака уменьена на 3");
            return true;
        }
        return false;
    }
}
