/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan38.objectorientedperhitunganlingkaran;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * lingkaran.
 */
public class PBO210117064Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
 * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lkr = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        lkr.validasiInput();
        lkr.hasilPerhitungan(lkr.diameter);
    }
}