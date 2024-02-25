/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan.peliharaan;

import hewan.Hewan;

/**
 *
 * @author ASUS
 */
public class Anjing extends Hewan {
    
    public Anjing (String nama, String jenis){
        super(nama,jenis);
    }
    
    public void perkenalan(){
        System.out.println("Hewan ini adalah Anjing bernama " + nama +", Anjing termasuk hewan peliharaan.");
        System.out.println("Berdasarkan makananya Anjing termasuk hewan " + jenis);
    }

}
