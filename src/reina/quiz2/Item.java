/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reina.quiz2;

/**
 *
 * @author WINDOWS 10
 */
public class Item {
    private String nama; //variabel nama untuk nama item
    private float harga; //variabel harga untuk harga item
    private int jumlah; //variabel jumlah untuk jumlah item

    //membuat konstruktor default
    public Item() {
    }
    //membuat konstruktor berparameter
    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    
}
