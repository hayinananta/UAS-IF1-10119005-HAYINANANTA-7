/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg10119005.hayinananta.pkg7;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * NIM      : 10119005
 * KELAS    : IF-1
 * TANGGAL  : 20-2-2021
 * NOSOAL   : 7
 */
public class JumlahBilangan extends Bilangan {
    public void jumlahBilangan() {
        int jumlah = this.getNilai1() + this.getNilai2();
        
        System.out.println("Hasil Penjumlahan = " + jumlah);
    }
    
}
