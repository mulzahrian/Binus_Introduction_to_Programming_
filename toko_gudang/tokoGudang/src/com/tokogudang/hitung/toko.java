package com.tokogudang.hitung;

import java.util.Scanner;

public class toko {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama anda :");
        String nama = input.nextLine();

        System.out.println("Stock Gudang Input Barang");
        System.out.println("##########################");

        System.out.println("Selamat Datang: " + nama);

        System.out.println("Masukkan nama barang yang mau ditambah :");
        String namaBarang = input.nextLine();

        System.out.println("Masukkan jumlah barang yang mau ditambah : Rp-");
        int jumlahBarang = input.nextInt();

        System.out.println("Masukkan harga beli untuk barang tersebut :Rp-");
        Float hargaBarang = input.nextFloat();

        System.out.println("Masukkan harga jual untuk barang tersebut :");
        Float hargaJual = input.nextFloat();

        System.out.println("Stock Gudang Rincian Barang");
        System.out.println("##########################");

        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Jumlah Barang : " + jumlahBarang);
        System.out.println("Harga Beli : " + hargaBarang);
        System.out.println("Harga Jual : " + hargaJual);

    }
}
