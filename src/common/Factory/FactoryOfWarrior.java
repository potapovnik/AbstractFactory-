package common.Factory;

import common.entity.Captain;
import common.entity.General;
import common.entity.Soldier;

public interface FactoryOfWarrior {
    General createGeneral();
    Soldier createSoldier();
    Captain createCaptain();
}
