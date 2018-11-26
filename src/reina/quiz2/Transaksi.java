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
    public Transaksi(String code, float total) {
        this.code = code;
        this.total = total;
    }
    
    
}
