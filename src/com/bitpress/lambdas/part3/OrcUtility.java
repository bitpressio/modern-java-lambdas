package com.bitpress.lambdas.part3;


import com.bitpress.lambdas.Orc;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class OrcUtility {
    public static void sortByName(List<Orc> orcs) {
        Collections.sort(orcs, (orc1, orc2) -> orc1.getName().compareTo(orc2.getName()));
    }

    public static List<Orc> filterDeadOrcs(List<Orc> orcs) {
        return orcs;
    }

    public static List<Orc> battleOrcs(List<Orc> orcs, Function<Orc, Integer> orcHpModifier) {
        for (Orc orc : orcs) {
            orc.setHitpoints(orcHpModifier.apply(orc));
        }
        return orcs;
    }
}
