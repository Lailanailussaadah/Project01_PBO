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
public class Lingkaran {
    
    //atribut
    public int r;
    
    //methods
    public void hitungLuas(){
        int hasil = 22/7 * r * r;
        System.out.println("Hasil luas lingkaran: " + hasil);
    }
    
    public void hitungKeliling(){
        int hasil = 2 * 22/7 * r;
        System.out.println("Hasil keliling lingkaran: " + hasil);
    }
}
