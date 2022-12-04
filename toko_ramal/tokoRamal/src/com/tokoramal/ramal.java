package com.tokoramal;




import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class ramal {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.println("Selamat Datang di program Ramalam Cupu :");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Data Anda");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("Masukkan Nama Anda :");
        String nama = input.nextLine();
        System.out.println("Masukkan Umur Anda : ");
        int umur = input.nextInt();

        System.out.println("Data Pasangan Anda");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("Masukkan Nama Pasangan :");
        String namaPasangan = input2.nextLine();
        System.out.println("Masukkan Umur Pasangan : ");
        int umurPasangan = input2.nextInt();



        System.out.println(nama + " ["+umur+"] " + "Tahun");
        int n = 6;
        for (int y = -n; y <= 2 * n; y++) {
            for (int x = -2 * n; x <= 2 * n; x++)
                if ((y <= 0 &&
                        ((int) Math.sqrt((x+n)*(x+n) + y*y) <= n
                                || (int) Math.sqrt((x-n)*(x-n) + y*y) <= n))
                        || (y > 0 && Math.abs(x) <= 2 * n - y))
                    System.out.print("♥ ");
                else
                    System.out.print("♡ ");
            System.out.println();
        }
        System.out.println(namaPasangan + " ["+umurPasangan+"] " + "Tahun");
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;

        System.out.println("Tekan ENTER Untuk Melihat Hasil Ramalam...");
        String enter = input3.nextLine();

        System.out.println("Kecocokan Anda Dengan Pasangan Anda Adalah : " + result + " %");
        System.out.println("Terimakasih karna anda telah menggunakan jasa ramalan kami.. ^_^");
    }
}
