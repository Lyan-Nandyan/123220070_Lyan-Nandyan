/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hewan;

/**
 *
 * @author ASUS
 */
public abstract class Hewan {
    protected String nama, jenis;
    
    public Hewan(String nama, String jenis){
    this.nama = nama;
    this.jenis =jenis;
    }
    
    public Hewan(String jenis){
    this.jenis = jenis;
    }
    
    public abstract void perkenalan();
}
