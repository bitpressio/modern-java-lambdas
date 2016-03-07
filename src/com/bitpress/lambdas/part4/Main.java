package com.bitpress.lambdas.part4;

import com.bitpress.lambdas.Orc;
import com.bitpress.lambdas.OrcRepository;

import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Orc> orcList = OrcRepository.getOrcs();
        printOrcs(orcList);

        OrcUtility.sortByName(orcList);
        printOrcs(orcList);

        Function<Orc, Integer> orcHpModifier = (orc) -> orc.getHitpoints() - new Random().ints(1, (150+1)).findFirst().getAsInt();
        OrcUtility.battleOrcs(orcList, orcHpModifier);
        printOrcs(orcList);

        Predicate<Orc> orcDeadTest = (orc) -> !orc.isDead();
        Predicate<Orc> orcLivingTest = Orc::isDead;
        Predicate<Orc> orcLowIqTest = (orc) -> orc.getIq() < 50;
        List<Orc> livingOrcs = OrcUtility.filterOrcs(orcList, Orc::isDead);
        printOrcs(livingOrcs);
    }

    public static void printOrcs(List<Orc> orcs) {
        System.out.println("\nOrc Roster:\n");
        for (Orc orc : orcs) {
            System.out.println(orc);
        }
    }
}
