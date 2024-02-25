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
public class Harimau extends Hewan{

    public Harimau(String jenis) {
        super(jenis);
    }
    
    public void perkenalan(){
        System.out.println("Hewan ini adalah Harimau, Harimau termasuk hewan liar.");
        System.out.println("Berdasarkan makananya Harimau termasuk hewan " + jenis);
    }
    
}
