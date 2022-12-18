package com.week5;

import java.util.Scanner;

public class tokoBuku {
    public static void main(String[] args) {

        Scanner buku = new Scanner(System.in);
        Scanner pena = new Scanner(System.in);
        Scanner binder = new Scanner(System.in);

        System.out.println("Selamat Datang di Toko Buku");
        System.out.println(" 1. Buku : Rp.5000");
        System.out.println(" 2. Pena : Rp.10000");
        System.out.println(" 3. Binder : Rp.30000");

        System.out.println("      ");
        System.out.println("Masukkan Pesanan Anda");

        System.out.println("1.Berapa jumlah buku yang di pesan = ");
        int buku1 = buku.nextInt();

        System.out.println("2.Berapa jumlah pena yang di pesan = ");
        int pena1 = pena.nextInt();

        System.out.println("3.Berapa jumlah binder yang di pesan = ");
        int binder1 = binder.nextInt();

        int hasil_buku = buku1 * 5000;
        int hasil_pena = pena1 * 10000;
        int hasil_binder = binder1 * 30000;

        int hasil = hasil_buku + hasil_binder + hasil_pena;
        System.out.println("Harga dari " + buku1 + " buku adalah : " + hasil_buku);
        System.out.println("Harga dari " + pena1 + " pena adalah : " + hasil_pena);
        System.out.println("Harga dari " + binder1 + " binder adalah : " + hasil_binder);
        System.out.println("#####################################");
        System.out.println("Total Pembayaran adalah : Rp." + hasil);
        if (hasil > 100000){
            System.out.println("ANDA MENDAPATKAN HADIAH PERLENGKAPAN SEKOLAH KARNA BELANJA DI ATAS Rp.100.000");
        }
        System.out.println("Terimakasih Telah Berbelanja");






    }
}
