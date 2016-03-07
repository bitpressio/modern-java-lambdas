package com.bitpress.lambdas.part2;

import com.bitpress.lambdas.Orc;

import java.util.Collections;
import java.util.List;

public class OrcUtility {
    public static void sortByName(List<Orc> orcs) {
        Collections.sort(orcs, (orc1, orc2) -> orc1.getName().compareTo(orc2.getName()));
    }

    public static List<Orc> filterOrcs(List<Orc> orcs) {
        return orcs;
    }

    public static List<Orc> battleOrcs(List<Orc> orcs) {
        return orcs;
    }
}
