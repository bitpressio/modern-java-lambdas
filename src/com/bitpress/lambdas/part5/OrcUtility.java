package com.bitpress.lambdas.part5;


import com.bitpress.lambdas.Orc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class OrcUtility {
    public static void sortByName(List<Orc> orcs) {
        Collections.sort(orcs, (orc1, orc2) -> orc1.getName().compareTo(orc2.getName()));
    }

    public static List<Orc> filterOrcs(List<Orc> orcs, Predicate<Orc> orcTest) {
        List<Orc> passingOrcs = new ArrayList<>();

        for (Orc orc : orcs) {
            if(orcTest.test(orc)) {
                passingOrcs.add(orc);
            }
        }
        return passingOrcs;
    }

    public static List<Orc> battleOrcs(List<Orc> orcs, Function<Orc, Integer> orcHpModifier) {
        for (Orc orc : orcs) {
            orc.setHitpoints(orcHpModifier.apply(orc));
        }
        return orcs;
    }

    public static void insultOrcs(List<Orc> orcs, Consumer<Orc> orcConsumer) {
        for (Orc orc : orcs) {
            orcConsumer.accept(orc);
        }
    }
}
