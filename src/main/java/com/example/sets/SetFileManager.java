package com.example.sets;

import java.io.*;
import java.util.Scanner;
import java.util.Set;

/**
 * saveSetToFile zapisuje wprowadzone dane i obliczenia do pliku txt
 * readSetsFromFile odczytuje nasz plik txt, który poprzednio sie utworzył oraz wyświetla komunikat jeżeli wystąpił błąd w odczycie pliku
 */
public class SetFileManager {
    public static void saveSetsToFile(Set<Integer> set1, Set<Integer> set2, Set<Integer> sum, Set<Integer> difference, Set<Integer> intersection, String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println("Zbiór 1: " + set1);
            writer.println("Zbiór 2: " + set2);
            writer.println("Suma: " + sum);
            writer.println("Różnica: " + difference);
            writer.println("Przekrój: " + intersection);
            System.out.println("Dane zostały zapisane do pliku.");
        } catch (FileNotFoundException e) {
            System.out.println("Błąd zapisu do pliku.");
        }
    }

    public static void readSetsFromFile(String filename) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Błąd odczytu pliku.");
        }
    }
}