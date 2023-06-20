package test;

import com.example.sets.SetOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * testCalculateUnion sprawdza funkcjonalność klasę CalculateUnion
 * testCalculateDifference sprawdza funkcjonalność klasę CalculateDifference
 * testCalculateIntersection sprawdza funkcjonalność klasę CalculateIntersection
 */
public class test {
    @Test
    public void testCalculateUnion() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedUnion = new HashSet<>();
        expectedUnion.add(1);
        expectedUnion.add(2);
        expectedUnion.add(3);
        expectedUnion.add(4);
        expectedUnion.add(5);

        Set<Integer> actualUnion = SetOperations.calculateUnion(set1, set2);

        Assertions.assertEquals(expectedUnion, actualUnion);
    }

    @Test
    public void testCalculateDifference() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedDifference = new HashSet<>();
        expectedDifference.add(1);
        expectedDifference.add(2);

        Set<Integer> actualDifference = SetOperations.calculateDifference(set1, set2);

        Assertions.assertEquals(expectedDifference, actualDifference);
    }

    @Test
    public void testCalculateIntersection() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(3);

        Set<Integer> actualIntersection = SetOperations.calculateIntersection(set1, set2);

        Assertions.assertEquals(expectedIntersection, actualIntersection);
    }
}
