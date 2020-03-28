package common;

import common.Factory.FactoryOfWarrior;
import common.Factory.impl.ElfFactory;
import common.Factory.impl.OrcFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        List<Object> fieldOfBattle = new ArrayList<>();

        FactoryOfWarrior factory = new ElfFactory();
        fieldOfBattle.add(factory.createGeneral());
        fieldOfBattle.add(factory.createCaptain());
        fieldOfBattle.add(factory.createSoldier());

        factory = new OrcFactory();
        fieldOfBattle.add(factory.createGeneral());
        fieldOfBattle.add(factory.createCaptain());
        fieldOfBattle.add(factory.createSoldier());

        for (Object object : fieldOfBattle) {
            System.out.println(object.getClass());
        }
    }
}
