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
public class Hitung implements Kalkulator {

    public double bil1;
    public double bil2;

    public void bil1(double bil1) {
        this.bil1 = bil1;
    }

    public void bil2(double bil2) {
        this.bil2 = bil2;
    }

    @Override
    public double penjumlahan() {
        return bil1 + bil2;
    }

    @Override
    public double pengurangan() {
        return bil1 - bil2;
    }

    @Override
    public double perkalian() {
        return bil1 * bil2;
    }

    @Override
    public double pembagian() {
        return bil1 / bil2;
    }

}
