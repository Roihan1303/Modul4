/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pengeluaran {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Manusia user1 = new LakiLaki(175.0, 67.5);
        System.out.println("User 1");
        System.out.println("Masukkan tinggi badan anda : " + user1.tinggiBadan() + " cm");
        System.out.print("Masukkan jenis kelamin anda (L/P) : ");
        String jawab = scan.nextLine();
        System.out.println("Berat badan ideal laki-laki ini adalah : " + user1.hitungBBI() + " kg");

        System.out.println("");
        Manusia user2 = new Perempuan(165.0, 52.0);
        System.out.println("User 2");
        System.out.println("Masukkan tinggi badan anda : " + user2.tinggiBadan() + " cm");
        System.out.print("Masukkan jenis kelamin anda (L/P) : ");
        String jawab1 = scan.nextLine();
        System.out.println("Berat badan ideal perempuan ini adalah : " + user2.hitungBBI() + " kg");
    }
}
