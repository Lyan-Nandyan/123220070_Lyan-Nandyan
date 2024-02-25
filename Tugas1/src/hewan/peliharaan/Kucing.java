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
public class Kucing extends Hewan {
    public Kucing (String nama, String jenis){
        super(nama,jenis);
    }
    
    public void perkenalan(){
        System.out.println("Hewan ini adalah Kucing bernama " + nama +", Kucing termasuk hewan peliharaan.");
        System.out.println("Berdasarkan makananya Kucing termasuk hewan " + jenis);
    }
    
    public String Bersuara(){
     return ("Meowww..");
    }
}
