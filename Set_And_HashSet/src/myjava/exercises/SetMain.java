package myjava.exercises;

import java.util.*;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++)
        {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are " + squares.size() + " squares and there are " + cubes.size() + " cubes") ;

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements");

        for(int i: intersection)
        {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));

        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words)
        {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] arrayNatureWords= {"all", "nature", "is","but","art","unknown","to", "thee" };
        String[] arrayDivineWords = {"to", "err", "is", "human","to", "forgive", "divine"};

        nature.addAll(Arrays.asList(arrayNatureWords));
        divine.addAll(Arrays.asList(arrayDivineWords));


        Set<String> diff = new HashSet<>(nature);
        diff.removeAll(divine);

        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);

        System.out.println("nature - divine:");
        printSet(diff);
        System.out.println("divine - nature:");
        printSet(diff2);

        Set<String> union2 = new HashSet<>(nature);
        union2.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);
        System.out.println("union - intersection:");
        union2.removeAll(intersectionTest);
        printSet(union2);

        if(nature.containsAll(divine))
        {
            System.out.println("Divine is a subset of Nature");
        }
        if(nature.containsAll(intersectionTest)){
            System.out.println("IntersectionTest is a subset of Nature");
        }

        if(divine.containsAll(nature))
        {
            System.out.println("Nature is a subset of Divine");
        }

        if(divine.containsAll(intersectionTest))
        {
            System.out.println("IntersectionTest is a subset of Divine");
        }


    }

    private static void printSet(Set<String> mySet)
    {
        for(String s: mySet)
        {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
