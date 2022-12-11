package com.restoBungkar;

import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        Scanner input_pesanan = new Scanner(System.in);
        Scanner enter = new Scanner(System.in);
        Scanner nasi_goreng = new Scanner(System.in);
        Scanner ayam_bakar = new Scanner(System.in);
        Scanner steak = new Scanner(System.in);
        Scanner kwetiaw = new Scanner(System.in);
        Scanner kambing_guling = new Scanner(System.in);
        System.out.println("Selamat Siang...");

        System.out.println("Pesan untuk berapa Orang : ");
        double berapaOrang = input_pesanan.nextDouble();
        System.out.println("Pesanan Atas nama :");
        String nama = input_pesanan.next();
        System.out.println("      ");
        System.out.println("Menu Spesial Hari ini");
        System.out.println("======================");
        System.out.println(" 1.Nasi Goreng Spesial dengan harga Rp. 9999,99");
        System.out.println(" 2.Ayam Bakar Spesial dengan harga Rp. 12345,67");
        System.out.println(" 3.Steak Sirloin Spesial dengan harga Rp. 21108,40");
        System.out.println(" 4.Kwetiaw Siram Spesial dengan harga Rp. 13579,13");
        System.out.println(" 5.Kambing Guling Spesial dengan harga Rp. 98765,43");
        System.out.println("      ");
        System.out.println("Pesanana Anda [ Batas Pesanan 0-1 ]");

        System.out.println("1.Nasi Goreng Spesial = ");
        double nasiGoreng = nasi_goreng.nextDouble();

        System.out.println("2.Ayam Bakar Spesial = ");
        double ayamBakar = ayam_bakar.nextDouble();

        System.out.println("3.Steak sirloin Spesial = ");
        double steak1 = steak.nextDouble();

        System.out.println("4.Kwetiaw Siram Spesial = ");
        double kwetiaw1 = kwetiaw.nextDouble();

        System.out.println("5.Kambing Guling Spesial = ");
        double kambingGuling = kambing_guling.nextDouble();

        System.out.println("Selamat Menikmati Makanan Anda");
        System.out.println(" ");
        System.out.println("Pembelian :");

        Double nasiGorengHasil = nasiGoreng * 9999.99;
        Double ayamBakarHasil = ayamBakar * 12345.67;
        Double steak1Hasil = steak1 * 21108.40;
        Double kwetiaw1Hasil = kwetiaw1 * 13579.13;
        Double kambingGulingHasil = kambingGuling * 98765.43;

        System.out.println(" 1.Nasi Goreng Spesial " + (int)nasiGoreng + " Porsi" + " * Rp. 9999,99 = Rp." + nasiGorengHasil);
        System.out.println(" 2.Ayam Bakar Spesial " + (int)ayamBakar + " Porsi" + " * Rp. 12345,67 = Rp." + ayamBakarHasil);
        System.out.println(" 3.Steak sirloin Spesial " + (int)steak1 + " Porsi" + " * Rp. 21108,40 = Rp." + steak1Hasil);
        System.out.println(" 4.Kwetiaw Siram Spesial " + (int)kwetiaw1 + " Porsi" + " * Rp. 13579,13 = Rp." + kwetiaw1Hasil);
        System.out.println(" 5.Kambing Guling Spesial " + (int)kambingGuling + " Porsi" + " * Rp.98765,43 = Rp." + kambingGulingHasil);
        System.out.println("========================================================================================");
        double total_pembelian = nasiGorengHasil + ayamBakarHasil + steak1Hasil + kwetiaw1Hasil + kambingGulingHasil;
        System.out.println(" Total Pembelian                                Rp." + total_pembelian);
        double total_discount = total_pembelian * 0.10;
        System.out.println(" Disc 10% (Masa Promosi)                        Rp." + total_discount + " - ");
        System.out.println("========================================================================================");

        //double total_orang = nasiGoreng + ayamBakar + steak1 + kwetiaw1 + kambingGuling;
        double total_keselurahan = total_pembelian - total_discount;
        double total_all = total_keselurahan / berapaOrang;
        System.out.println(" Total Pembelian Setelah disc 10%               Rp." + total_keselurahan + "");
        System.out.println(" Pembelian perorang ( untuk " + (int)berapaOrang + " orang)            Rp." + total_all);
        System.out.println("                                    Terimakasih telah berkunjung                      ");
        System.out.println("                                    Tekan ENTER lalu keluar                            ");
        String enter1 = enter.nextLine();


    }
}
