package com.example.main;

import com.example.sets.SetFileManager;
import com.example.sets.SetOperations;

import java.util.*;

/**
 * main wyświetla polecenia do użytkownika i pobiera od niego dane
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie pierwszego zbioru
        System.out.print("Podaj elementy pierwszego zbioru (oddzielone przecinkami): ");
        String set1Input = scanner.nextLine();
        Set<Integer> set1 = parseSet(set1Input);

        // Pobranie drugiego zbioru
        System.out.print("Podaj elementy drugiego zbioru (oddzielone przecinkami): ");
        String set2Input = scanner.nextLine();
        Set<Integer> set2 = parseSet(set2Input);

        // Obliczenie sumy, różnicy i przekroju zbiorów
        Set<Integer> sum = SetOperations.calculateUnion(set1, set2);
        Set<Integer> difference = SetOperations.calculateDifference(set1, set2);
        Set<Integer> intersection = SetOperations.calculateIntersection(set1, set2);

        // Zapisanie danych do pliku
        SetFileManager.saveSetsToFile(set1, set2, sum, difference, intersection, "wyniki.txt");

        // Odczyt danych z pliku na żądanie użytkownika
        System.out.print("Czy chcesz odczytać dane z pliku? (T/N): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("T")) {
            SetFileManager.readSetsFromFile("wyniki.txt");
        }

        scanner.close();
    }

    private static Set<Integer> parseSet(String input) {
        Set<Integer> set = new HashSet<>();
        String[] elements = input.split(",");
        for (String element : elements) {
            try {
                int value = Integer.parseInt(element.trim());
                set.add(value);
            } catch (NumberFormatException e) {
            }
        }
        return set;
    }
}
