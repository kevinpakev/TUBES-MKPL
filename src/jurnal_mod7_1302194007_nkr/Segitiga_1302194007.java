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
public class Segitiga_1302194007 extends BangunDatar_1302194007{
    private int alas, tinggi;
    
    //constructor
    public Segitiga_1302194007 (String nama, int alas, int tinggi) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    //setter
    public void setAlas (int alas) {
        this.alas = alas;
    }
    
    public void setTingg (int tinggi) {
        this.tinggi = tinggi;
    }
    
    //getter
    public int getAlas () {
        return alas;
    }
    
    public int getTinggi () {
        return tinggi;
    }
    
    //rumus
    public double hitungLuas () {
        return 0.5 * alas * tinggi;
    }
    
    public double hitungKeliling () {
       double sisi;
       sisi = Math.sqrt(Math.pow(tinggi,2) + Math.pow((0.5 * alas),2));
       return sisi + sisi + alas;
    }
 
}
