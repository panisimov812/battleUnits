package ru.battle_units;

import ru.battle_units.base.BattleUnit;
import ru.battle_units.base.Unit;

public class King extends Unit {
    private int gold = 500;
    private BattleUnit[] army;

    public King(int healthScore) {
        super(healthScore);
    }
}
