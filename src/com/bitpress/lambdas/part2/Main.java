package com.bitpress.lambdas.part2;

import com.bitpress.lambdas.Orc;
import com.bitpress.lambdas.OrcRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Orc> orcList = OrcRepository.getOrcs();
        printOrcs(orcList);

        OrcUtility.sortByName(orcList);
        printOrcs(orcList);

    }

    public static void printOrcs(List<Orc> orcs) {
        System.out.println("\nOrc Roster:\n");
        for (Orc orc : orcs) {
            System.out.println(orc);
        }
    }
}
