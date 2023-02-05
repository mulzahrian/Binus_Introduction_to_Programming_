package com.jenisUrutan;
import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PROGRAM SIMULASI");
        System.out.println("MENU");
        System.out.println("1.RANDOM DATA");
        System.out.println("2.SIMULASI BUBLE SORT - ASCENDING");
        System.out.println("3.SIMULASI BUBLE SORT - DESCENDING");
        System.out.println("4.SIMULASI SELECTION SORT - ASCENDING");
        System.out.println("5.SIMULASI SELECTION SORT - DESCENDING");
        System.out.println("6.EXIT");
        System.out.println("MASUKKAN PILIHAN ANDA");
        int pilihan = scanner.nextInt();
        if (pilihan == 1){
            System.out.print("Masukkan rentang bawah: ");
            int lowerBound = scanner.nextInt();
            System.out.print("Masukkan rentang atas: ");
            int upperBound = scanner.nextInt();

            int[] numbers = new int[5];
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                numbers[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            }

            System.out.println("Bilangan acak sebelum diurutkan: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        if (pilihan == 2){
            System.out.print("Masukkan rentang bawah: ");
            int lowerBound = scanner.nextInt();
            System.out.print("Masukkan rentang atas: ");
            int upperBound = scanner.nextInt();

            int[] numbers = new int[5];
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                numbers[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            }

            System.out.println("Bilangan acak sebelum diurutkan: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();

            // Bubble Sort
            System.out.println("Bubble Sort - Ascending: ");
            int[] bubbleSorted = numbers.clone();
            for (int i = 0; i < bubbleSorted.length - 1; i++) {
                for (int j = 0; j < bubbleSorted.length - i - 1; j++) {
                    if (bubbleSorted[j] > bubbleSorted[j + 1]) {
                        int temp = bubbleSorted[j];
                        bubbleSorted[j] = bubbleSorted[j + 1];
                        bubbleSorted[j + 1] = temp;
                    }
                }
            }
            for (int number : bubbleSorted) {
                System.out.print(number + " ");
            }
            System.out.println();


        }

        if (pilihan == 3){
            System.out.print("Masukkan rentang bawah: ");
            int lowerBound = scanner.nextInt();
            System.out.print("Masukkan rentang atas: ");
            int upperBound = scanner.nextInt();

            int[] numbers = new int[5];
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                numbers[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            }

            System.out.println("Bilangan acak sebelum diurutkan: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();

            // Bubble Sort - Descending
            System.out.println("Bubble Sort - Descending: ");
            int[] bubbleSortedDescending = numbers.clone();
            for (int i = 0; i < bubbleSortedDescending.length - 1; i++) {
                for (int j = 0; j < bubbleSortedDescending.length - i - 1; j++) {
                    if (bubbleSortedDescending[j] < bubbleSortedDescending[j + 1]) {
                        int temp = bubbleSortedDescending[j];
                        bubbleSortedDescending[j] = bubbleSortedDescending[j + 1];
                        bubbleSortedDescending[j + 1] = temp;
                    }
                }
            }
            for (int number : bubbleSortedDescending) {
                System.out.print(number + " ");
            }
            System.out.println();

        }

        if (pilihan == 4){
            System.out.print("Masukkan rentang bawah: ");
            int lowerBound = scanner.nextInt();
            System.out.print("Masukkan rentang atas: ");
            int upperBound = scanner.nextInt();

            int[] numbers = new int[5];
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                numbers[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            }

            System.out.println("Bilangan acak sebelum diurutkan: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();

            // Selection Sort
            System.out.println("Selection Sort - Ascending: ");
            int[] selectionSorted = numbers.clone();
            for (int i = 0; i < selectionSorted.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < selectionSorted.length; j++) {
                    if (selectionSorted[j] < selectionSorted[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = selectionSorted[minIndex];
                selectionSorted[minIndex] = selectionSorted[i];
                selectionSorted[i] = temp;
            }
            for (int number : selectionSorted) {
                System.out.print(number + " ");
            }
            System.out.println();

        }

        if (pilihan == 5){
            System.out.print("Masukkan rentang bawah: ");
            int lowerBound = scanner.nextInt();
            System.out.print("Masukkan rentang atas: ");
            int upperBound = scanner.nextInt();

            int[] numbers = new int[5];
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                numbers[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            }

            System.out.println("Bilangan acak sebelum diurutkan: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();

            // Selection Sort - Descending
            System.out.println("Selection Sort - Descending: ");
            int[] selectionSortedDescending = numbers.clone();
            for (int i = 0; i < selectionSortedDescending.length - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < selectionSortedDescending.length; j++) {
                    if (selectionSortedDescending[j] > selectionSortedDescending[maxIndex]) {
                        maxIndex = j;
                    }
                }
                int temp = selectionSortedDescending[i];
                selectionSortedDescending[i] = selectionSortedDescending[maxIndex];
                selectionSortedDescending[maxIndex] = temp;
            }
            for (int number : selectionSortedDescending) {
                System.out.print(number + " ");
            }
            System.out.println();

        }

        if (pilihan == 6){
            System.out.println("terimakasih anda telah keluar");
        }

        if (pilihan > 6){
            System.out.println("tidak ada dalam pilihan anda di keluarkan otomatis");
        }

        if (pilihan < 1){
            System.out.println("tidak ada dalam pilihan anda di keluarkan otomatis");
        }












    }
}
