package ru.battle_units;

import ru.battle_units.base.BattleUnit;
import ru.battle_units.base.Unit;

public class Application {

    public static void main(String[] args) {
        Knight knight1 = new Knight(20, 17);
        knight1.knightVoid();

        BattleUnit knight2 = new Knight(20, 17);
        knight2.battleUnitVoid();

        Unit knight3 = new Knight(20,17);
        knight3.plusHealth(4);


    }
}
