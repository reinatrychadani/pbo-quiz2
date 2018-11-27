/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reina.quiz2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author WINDOWS 10
 */
public class TransCombo {
    private HashMap<String,Float> items = new HashMap<>();
    
    public TransCombo(){
        this.items.put("Kopi", new Float(10000));
        this.items.put("Gula", new Float(30000));
        this.items.put("Susu", new Float(20000));
    }
    
    public ArrayList<String> getNama(){
        ArrayList<String> string = new ArrayList<>();
        for(String item : this.items.keySet()){
            string.add(item);
        }
        return string;
    }
    
    public ArrayList<Float> getHarga(){
        ArrayList<Float> flt = new ArrayList<>();
        for(float item : this.items.values()){
            flt.add(item);
        }
        return flt;
    }
    
    public void addItem(String nama, float harga){
        this.items.put(nama, harga);
    }
}
