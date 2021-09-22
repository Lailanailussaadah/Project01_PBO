/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ASUS
 */
public class BangunDatarMain {
    public static void main(String[] args){
        PersegiPanjang pp = new PersegiPanjang ();
        pp.panjang = 25;
        pp.lebar = 38;
        pp.hitungLuas();
        pp.hitungKeliling();
        
        Persegi pA = new Persegi();
        pA.sisi = 10;
        pA.hitungLuas();
        pA.hitungKeliling();
        
        Persegi pB = new Persegi();
        pB.sisi = 15;
        pB.hitungLuas();
        pB.hitungKeliling();
        
        Lingkaran lX = new Lingkaran();
        lX.r = 25;
        lX.hitungLuas();
        lX.hitungKeliling();
        
        Lingkaran lZ = new Lingkaran();
        lZ.r = 37;
        lZ.hitungLuas();
        lZ.hitungKeliling();
    }
}
        

        
