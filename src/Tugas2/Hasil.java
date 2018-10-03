/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ASUS
 */
public class Hasil {

    public static void main(String[] args) {
        System.out.println("=== Selamat Datang Di Kalkulator ===");

        Hitung r = new Hitung();
        r.bil1(10);
        r.bil2(5);
        System.out.println("");
        System.out.println("Masukkan Bilangan Pertama : " + r.bil1);
        System.out.println("Masukkan Bilangan Kedua : " + r.bil2);

        System.out.println("");
        System.out.println("Hasil Penjumlahan : " + r.penjumlahan());
        System.out.println("Hasil Pengurangan : " + r.pengurangan());
        System.out.println("Hasil Perkalian   : " + r.perkalian());
        System.out.println("Hasil Pembagian   : " + r.pembagian());

        System.out.println("");
        System.out.println("=== Perhitungan Selesai ===");

    }
}
