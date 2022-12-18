package com.jumlahAngka;

import java.util.Scanner;

public class jumlah {
    public static void main(String[] args) {
        Scanner input_validasi = new Scanner(System.in);
        Scanner input_nim = new Scanner(System.in);
        Scanner input_bilangan = new Scanner(System.in);
        char ulang;
        Scanner input = new Scanner(System.in);

        //
        do {
            System.out.println("Masukkan Nama Anda [1..25] :");
            String nama = input_validasi.next();
            System.out.println("Masukkan Nim Anda [Harus 10 Karakter] :");
            String nim = input_nim.next();

            if(nama.length() > 25){
                System.out.println("Nama yang anda masukkan lebih besar dari 25 karakter");
                return;
            }

            if(nim.length() > 10){
                System.out.println("Maksimal nim adalah 10 karakter");
                return;
            }

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Registrasi Sukses.");
            System.out.println("Selamat Datang " + nama + " [NIM : " + nim + "]..");
            System.out.println("Mari Belajar Macam Macam Bilangan");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Masukkan Sembarangan Angka [5..20] :");
            int bilangan = input_bilangan.nextInt();

            if(bilangan < 5){
                System.out.println("Bilangan Terlalu Kecil minimal angka 5");
                return;
            }

            if(bilangan > 20){
                System.out.println("Bilangan Terlalu Besar maksimal 20 angka");
                return;
            }

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Deretan Bilangan");
            System.out.println("#################");
            System.out.println(bilangan +" bilangan Genap :");
            int i=1,j=1, genap=2,jumlah=0,ganjil=1,jumlah1=0,jumlah2=0;
            while(i<=bilangan){
                System.out.println(genap);
                jumlah += genap;
                genap = genap+2;
                i++;
            }
            System.out.println("Hasil Penjumlahan"+jumlah);
            System.out.println(bilangan +" bilangan Ganjil :");

            while(j<=bilangan){
                System.out.println(ganjil);
                jumlah1 += ganjil;
                ganjil = ganjil+2;
                j++;
            }
            System.out.println("Hasil Penjumlahan "+jumlah1);
            System.out.println();

            int a=0;
            int b=1;
            System.out.println(bilangan +" bilangan fibonanci :");
            for ( int k=0; k<= bilangan; k++)
            {
                System.out.println(a);
                jumlah2 += a;
                a=a+b;
                b=a-b;
            }
            System.out.println("Hasil Penjumlahan "+jumlah2);

            System.out.print("Anda Ingin Mengulang (y/t)? ");
            ulang = input.next().charAt(0);

            System.out.println();
        }
        while (ulang!= 't');

        System.out.println("Terimakasih...");
        //

    }
}
