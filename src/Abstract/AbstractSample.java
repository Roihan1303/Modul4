/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author ASUS
 */
public class AbstractSample {

    public static void main(String[] args) {
        bangunDatar obj1 = new bujurSangkar(10);
        System.out.println("Luas bujur sankgar dengan sisi 10 = " + obj1.hitungLuas());
        System.out.println("Kelilingnya = " + obj1.hitungKeliling());
        System.out.println("\n");

        bangunDatar obj2 = new Lingkaran(7);
        System.out.println("Luas lingkaran dengan jari-jari 7 = " + obj2.hitungLuas());
        System.out.println("Kelilingnya = " + obj2.hitungKeliling());
        System.out.println("\n");
    }
}
