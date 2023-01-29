package com.puzzle;

import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        char ulang = 0;
        Scanner input1 = new Scanner(System.in);

        char ch;
        Scanner s = new Scanner(System.in);


        do {
            System.out.println("Coepoe Word Puzzle");
            System.out.println("===================");
            System.out.println(" ");
            System.out.println("Rules : ");
            System.out.println("1. Create a word using given characters, min 3 character & max 6 characters");
            System.out.println("2. Each Level, you Have 10 chances to answer correctly");
            System.out.println("3. To get through to next level, you have to score 70 points each level");

            System.out.println("Level 1");
            System.out.println("--------");
            System.out.println("d e t t l i");
            System.out.println(" ");
            //

            Scanner sc = new Scanner(System.in);
            int totalScore = 0;
            int count = 0;
            int correctAnswers = 0;
            ArrayList<String> inputs = new ArrayList<String>();
            ArrayList<String> correctInputs = new ArrayList<String>();
            while (count < 10) {
                int angka = count + 1;
                System.out.print(angka + " > Your Answer : ");
                String input = sc.nextLine();
                if (inputs.contains(input)) {
                    System.out.println("your input the same value");
                    continue;
                }
                if (input.length() < 3) {
                    System.out.println("min 3 word");
                    continue;
                }
                if (input.length() > 6) {
                    System.out.println("max 6 word");
                    continue;
                }
                inputs.add(input);
                count++;
                boolean containsD = input.contains("d");
                boolean containsE = input.contains("e");
                boolean containsT = input.contains("t");
                boolean containsL = input.contains("l");
                boolean containsI = input.contains("i");

                if (containsD || containsE || containsT || containsL || containsI) {
                    totalScore += 10;
                    correctAnswers++;
                    correctInputs.add(input);
                    System.out.println("#Right.Score :" + totalScore);
                } else {
                    System.out.println(input);
                }
            }
            System.out.println("Total score anda :" + totalScore);
            System.out.println("Jumlah jawaban yang benar :" + correctAnswers);
            System.out.println("Input yang benar : ");
            for (String correctInput : correctInputs) {
                System.out.println(correctInput);
            }

            int totalScore2 = 0;
            if (totalScore > 69) {
//
                System.out.println("Level 2");
                System.out.println("--------");
                System.out.println("s e c a e n");
                System.out.println(" ");
                //

                Scanner sc2 = new Scanner(System.in);
                totalScore2 = 0;
                int count2 = 0;
                int correctAnswers2 = 0;
                ArrayList<String> inputs2 = new ArrayList<String>();
                ArrayList<String> correctInputs2 = new ArrayList<String>();
                while (count2 < 10) {
                    int angka2 = count2 + 1;
                    System.out.print(angka2 + " > Your Answer : ");
                    String input2 = sc2.nextLine();
                    if (inputs.contains(input2)) {
                        System.out.println("your input the same value");
                        continue;
                    }
                    if (input2.length() < 3) {
                        System.out.println("min 3 word");
                        continue;
                    }
                    if (input2.length() > 6) {
                        System.out.println("max 6 word");
                        continue;
                    }
                    inputs2.add(input2);
                    count2++;
                    boolean containsS = input2.contains("s");
                    boolean containsE1 = input2.contains("e");
                    boolean containsC = input2.contains("c");
                    boolean containsA = input2.contains("a");
                    boolean containsN = input2.contains("n");

                    if (containsS || containsE1 || containsC || containsA || containsN) {
                        totalScore2 += 10;
                        correctAnswers2++;
                        correctInputs2.add(input2);
                        System.out.println("#Right.Score :" + totalScore2);
                    } else {
                        System.out.println(input2);
                    }
                }
                System.out.println("Total score anda :" + totalScore2);
                System.out.println("Jumlah jawaban yang benar :" + correctAnswers2);
                System.out.println("Input yang benar : ");
                for (String correctInput2 : correctInputs2) {
                    System.out.println(correctInput2);
                }
                //
            }

            //

            int totalScore3 = 0;
            if (totalScore2 > 69) {
                System.out.println("Level 3");
                System.out.println("--------");
                System.out.println("h k r n e o");
                System.out.println(" ");
                //

                Scanner sc3 = new Scanner(System.in);

                int count3 = 0;
                int correctAnswers3 = 0;
                ArrayList<String> inputs3 = new ArrayList<String>();
                ArrayList<String> correctInputs3 = new ArrayList<String>();
                while (count3 < 10) {
                    int angka3 = count3 + 1;
                    System.out.print(angka3 + " > Your Answer : ");
                    String input3 = sc3.nextLine();
                    if (inputs.contains(input3)) {
                        System.out.println("your input the same value");
                        continue;
                    }
                    if (input3.length() < 3) {
                        System.out.println("min 3 word");
                        continue;
                    }
                    if (input3.length() > 6) {
                        System.out.println("max 6 word");
                        continue;
                    }
                    inputs3.add(input3);
                    count3++;
                    boolean containsH3 = input3.contains("h");
                    boolean containsK3 = input3.contains("k");
                    boolean containsR3 = input3.contains("r");
                    boolean containsN3 = input3.contains("n");
                    boolean containsE3 = input3.contains("3");
                    boolean containsO3 = input3.contains("o");

                    if (containsH3 || containsK3 || containsR3 || containsN3 || containsE3 || containsO3) {
                        totalScore3 += 10;
                        correctAnswers3++;
                        correctInputs3.add(input3);
                        System.out.println("#Right.Score :" + totalScore3);
                    } else {
                        System.out.println(input3);
                    }
                }
                System.out.println("Total score anda :" + totalScore3);
                System.out.println("Jumlah jawaban yang benar :" + correctAnswers3);
                System.out.println("Input yang benar : ");
                for (String correctInput3 : correctInputs3) {
                    System.out.println(correctInput3);
                }
            }
            int total_keseluruhan = totalScore + totalScore2 + totalScore3;
            if(totalScore3 > 69){
                System.out.print("over all score : " + total_keseluruhan);
                System.out.print("YOU WIN !!");
                continue;
            }else {
                System.out.print("  ");
                System.out.print("YOU LOST");
                System.out.print("DO YOU WANT RETRY (y/t)? ");
                ulang = input1.next().charAt(0);

                System.out.println();
            }



        }
        while (ulang!= 't');

        System.out.println("Terimakasih...");
        //

    }

}

