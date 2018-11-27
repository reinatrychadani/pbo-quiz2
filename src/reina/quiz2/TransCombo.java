/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reina.quiz2;

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
    
    
}
