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
public class Bola {
    //atribut
    public int r;
    
    //methods
    public void hitungVol(){
        int hasil =4/3 * 22/7 * r*r*r;
        System.out.println("Hasil volume bola: "+ hasil);
    }
}
