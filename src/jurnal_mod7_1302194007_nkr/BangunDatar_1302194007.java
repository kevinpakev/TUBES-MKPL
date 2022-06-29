/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal_mod7_1302194007_nkr;

/**
 *
 * @author AMS
 */
public abstract class BangunDatar_1302194007 {
     private String nama;
    
    //constructor
    public BangunDatar_1302194007 (String nama) {
        this.nama = nama;
    }
    
    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //getter
    public String getNama () {
        return nama;
    }
    
    //abstract rumus
    public abstract double hitungKeliling();
    
    public abstract double hitungLuas();
}
