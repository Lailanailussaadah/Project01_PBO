/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class Tabung {
    //atribut
    public int r;
    public int t;
    
    //methods
    public void hitungVol(){
        int hasil = 22/7 * r*r*t;
        System.out.println("Hasil volume tabung: "+ hasil);
    }
    
    public void hitungLuasSelimut(){
        int hasil = 2 * 22/7 *r*t;
        System.out.println("Hasil luas selimut tabung: "+ hasil);
    }
}
