/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reina.quiz2;

import java.util.*;

/**
 *
 * @author WINDOWS 10
 */
public class Transaksi {
    private final String code; //variabel kode untuk kode transaksi
    private ArrayList<Item> items = new ArrayList<>(); //variabel item untuk menyimpan list item
    private float total; //variabel total untuk menyimpan total

    //membuat konstruktor berparameter
    public Transaksi(String code, ArrayList<Item> items) {
        this.code = code;
        this.items = items;
    }
    
    //setter total
    public void setTotal(){
        float total = 0;
        for(Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    
    //output transaksi
    public String printDetail(){
        setTotal();
        String string = "";
        string += "Kode\t\t: "+ this.code +"\n";
        string += "Daftar Belanja : \n";
        for(Item item : this.items){
            string += "\t" + item.getNama() + "(x" + item.getJumlah() + ") : " + item.getTotal() + "\n";
        }
        string += "Total\t\t: "+ this.total;
        return null;
    }
}
