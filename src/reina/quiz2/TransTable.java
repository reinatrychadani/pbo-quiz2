/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reina.quiz2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WINDOWS 10
 */
public class TransTable extends DefaultTableModel{
    private String[] kolom; //variabel array bertipe String untuk menyimpan kolom nama
    
    //konstruktor
    public TransTable(){
        this.kolom = new String[]{
            "Nama", "Harga", "Jumlah"
        };
    }
    
    //getter kolom
    public String[] getKolomNama(){
        return this.kolom;
    }
}
