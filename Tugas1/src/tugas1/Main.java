/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;


import hewan.peliharaan.*;
import hewan.liar.*;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anjing a = new Anjing ("Rusty","Karnivora");
        Kucing k = new Kucing ("Kitty","Karnivora");
        Gajah g = new Gajah ("Herbivora");
        Harimau h = new Harimau ("Karnivora");
        
        a.perkenalan();
        System.out.println("--------------------------\n");

        k.perkenalan();
        System.out.println("Kucing biasanya berbuyi " + k.Bersuara());
        System.out.println("--------------------------\n");
        
        g.perkenalan();
        System.out.println("Gajah memiliki suara seperti terompet berbunyi " + g.Bersuara());
        System.out.println("--------------------------\n");
        
        h.perkenalan();
        System.out.println("--------------------------\n");
    }
    
}
