package com.bitpress.lambdas.part1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        sortIntegers();
    }

    public static void sortIntegers() {
        Integer[] numbers = new Integer[] { 22, 5342, 1, 0};

        System.out.println("Sorted by separate class:");
        System.out.println(Arrays.toString(sortNumbersSeparateClass(numbers)));

        System.out.println("Sorted by anonymous inner class:");
        System.out.println(Arrays.toString(sortNumbersAnonymousClass(numbers)));

        System.out.println("Sorted by lambda:");
        System.out.println(Arrays.toString(sortNumbersByLambda(numbers)));
    }

    public static Integer[] sortNumbersSeparateClass(Integer[] numbers) {
        Arrays.sort(numbers, new IntegerSorter());

        return numbers;
    }

    public static Integer[] sortNumbersAnonymousClass(Integer[] numbers) {
       Arrays.sort(numbers, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        return numbers;
    }

    public static Integer[] sortNumbersByLambda(Integer[] numbers) {
        Arrays.sort(numbers, (o1, o2) -> o1 - o2);

        return numbers;
    }

}
