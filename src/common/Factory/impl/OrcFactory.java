package common.Factory.impl;

import common.Factory.FactoryOfWarrior;
import common.entity.Captain;
import common.entity.General;
import common.entity.Soldier;
import common.entity.orc.CaptainOrc;
import common.entity.orc.GeneralOrc;
import common.entity.orc.SoldierOrc;

public class OrcFactory implements FactoryOfWarrior {
    @Override
    public General createGeneral() {
        return new GeneralOrc();
    }

    @Override
    public Soldier createSoldier() {
        return new SoldierOrc();
    }

    @Override
    public Captain createCaptain() {
        return new CaptainOrc();
    }
}
