/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Perempuan extends Manusia {

    private double TB;
    private double BBI;

    public Perempuan(double TB, double BBI) {
        this.TB = TB;
        this.BBI = BBI;
    }

    @Override
    public double tinggiBadan() {
        return TB;
    }

    @Override
    public double hitungBBI() {
        return BBI;
    }
}
