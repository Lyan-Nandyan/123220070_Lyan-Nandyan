/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan.liar;

import hewan.Hewan;
/**
 *
 * @author ASUS
 */
public class Gajah extends Hewan{

    public Gajah(String jenis) {
        super(jenis);
    }
    
    public void perkenalan(){
        System.out.println("Hewan ini adalah Gajah, Gajah termasuk hewan liar.");
        System.out.println("Berdasarkan makananya Gajah termasuk hewan " + jenis);
    }
    
    public String Bersuara(){
     return ("waaahhhh!");
    }
}
