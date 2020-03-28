package common.Factory.impl;

import common.Factory.FactoryOfWarrior;
import common.entity.Captain;
import common.entity.General;
import common.entity.Soldier;
import common.entity.elf.CaptainElf;
import common.entity.elf.GeneralElf;
import common.entity.elf.SoldierElf;

public class ElfFactory implements FactoryOfWarrior {
    @Override
    public General createGeneral() {
        return new GeneralElf();
    }

    @Override
    public Soldier createSoldier() {
        return new SoldierElf();
    }

    @Override
    public Captain createCaptain() {
        return new CaptainElf();
    }
}
