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

    //getter nama
    public String getNama() {
        return nama;
    }

    //setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //getter harga
    public float getHarga() {
        return harga;
    }

    //setter harga
    public void setHarga(float harga) {
        this.harga = harga;
    }

    //getter jumlah
    public int getJumlah() {
        return jumlah;
    }

    //setter jumlah
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    //menghitung total dari item * jumlah
    public float getTotal(){
        return this.harga * this.jumlah;
    }

    @Override
    public String toString() {
        return this.nama;
    }
    
    
}
