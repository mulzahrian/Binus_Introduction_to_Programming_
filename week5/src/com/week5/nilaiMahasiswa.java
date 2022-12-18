package com.week5;

import java.util.Scanner;

public class nilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Siswa ");
        String nama = input.next();

        System.out.println("Nilai Siswa ");
        int nilai = input.nextInt();

        if (nilai > 70){
            System.out.println("Selamat Siswa atas nama " + nama + " di nyatakan lulus dengan score " + nilai);
        }

        if (nilai < 70){
            System.out.println(" Siswa atas nama " + nama + "di nyatakan tidak lulus dengan score " + nilai);
        }

    }
}
