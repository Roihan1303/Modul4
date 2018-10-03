/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author ASUS
 */
public class Karnivora {
    public static void main(String[] args) {
        
        //Cara Penulisan Objek : (superclass) variable = new (subclass)
        System.out.println("===== HEWAN DEFAULT =====");
        Hewan h = new Hewan();
        h.setNama();
        h.setSuara();
        h.setBerat();
        
        System.out.println("");
        System.out.println("===== HEWAN KUCING =====");
        Hewan k = new Kucing();
        k.setNama();
        k.setSuara();
        k.setBerat();
        
        System.out.println("");
        System.out.println("===== HEWAN SINGA =====");
        Hewan s = new Singa();
        s.setNama();
        s.setSuara();
        s.setBerat();
    }
}
