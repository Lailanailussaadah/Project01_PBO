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
public class Kerucut {
    
    //atribut
    public int r;
    public int s;
    public int t;
    
    //methods
    public void hitungVol(){
        int hasil = 1/3 * 22/7 * r * r * t;
        System.out.println("Hasil volume kerucut: "+ hasil);
    }
    
    public void hitungLuasSelimut(){
        int hasil = 22/7 * r * s;
        System.out.println("Hasil luas selimut kerucut: " + hasil);
    } 
}
