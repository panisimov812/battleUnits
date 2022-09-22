package ru.battle_units;

import ru.battle_units.base.BattleUnit;

//рыцарь
//здоровье
//очкиАтаки ++
//дополнительноеЗдоровье

public class Knight extends BattleUnit {
    private int additionalHealth = 10; // дополнительное здоровье

    public Knight(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    public void knightVoid() {
        System.out.println("Метод knightVoid");
    }
}
