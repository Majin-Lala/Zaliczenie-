package com.example.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * calculateUnion oblicza sumę zbiorów
 * calculateDifference oblicza różnicę zbiorów
 * calculateIntersection oblicza przekrój zbiorów
 *
 */
public class SetOperations {
    public static Set<Integer> calculateUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static Set<Integer> calculateDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }

    public static Set<Integer> calculateIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}