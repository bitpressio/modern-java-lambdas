package com.bitpress.lambdas;

import java.util.Arrays;
import java.util.List;

public class OrcRepository {
    private static List<Orc> ORCS = Arrays.asList(
            new Orc("Uglok", "Blackfist", 90, 100),
            new Orc("Sarfu", "Wolfeater", 14, 100),
            new Orc("Yambagorn", "Bloodfang", 25, 100),
            new Orc("Krognak", "Blackfist", 36, 100),
            new Orc("Graklak", "Wolfeater", 3, 100),
            new Orc("Trilug", "Blackfist", 56, 100),
            new Orc("Vruhag", "Bloodfang", 33, 100),
            new Orc("Zeakgu", "Wolfeater", 78, 100),
            new Orc("Slughig", "Blackfist", 19, 100),
            new Orc("Wurgoth", "Wolfeater", 83, 100)
    );

    public static List<Orc> getOrcs() {
        return ORCS;
    }
}
