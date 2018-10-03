/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class InterfaceSample {
    
    public static void main(String[] args) {
        InterfaceBujurSangkar obj1 = new InterfaceBujurSangkar(10){};
        System.out.println("Luas bujur sangkar dengan sisi 10 = " + obj1.hitungLuas());
        System.out.println("Kelilingnya = " + obj1.hitungKeliling());
        System.out.println("\n");
        
        InterfaceBangunDatar obj2 = new InterfaceSegitiga(6, 8){};
        System.out.println("Luas segitiga dengan sisi 6, dan tinggi 8 = " + obj2.hitungLuas());
        System.out.println("Kelilingnya = " + obj2.hitungKeliling());
    }
}
