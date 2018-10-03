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
public class Kucing extends Hewan{
    
    @Override
    void setBerat() {
        String kucing = "Carberus";
        System.out.println("Nama Kucing : " + kucing);
    }

    @Override
    void setSuara() {
        String suara = "Miaw Meow Meong";
        System.out.println("Suara Kucing : " + suara);
    }

    @Override
    void setNama() {
        double berat = 2.0;
        System.out.println("Berat Kucing : " + berat);
    }
    
}
