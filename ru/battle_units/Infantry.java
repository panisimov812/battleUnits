package ru.battle_units;

import ru.battle_units.base.BattleUnit;

public class Infantry extends BattleUnit {
    private int additionalAttack = 5;

    public Infantry(int healthScore, int attackScore){
        super(healthScore, attackScore);
    }

    public void infantryVoid() {
        System.out.println("Метод infantryVoid");
    }
}
