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
public class Persegipanjang_1302194007 extends BangunDatar_1302194007{
    private int lebar, panjang;
    
    //constructor
    public Persegipanjang_1302194007 (String nama, int panjang, int lebar) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    //setter
    public void setPanjang (int panjang) {
        this.panjang = panjang;
    }
    
    public void setLebar (int lebar) {
        this.lebar = lebar;
    }
    
    //getter
    public int getLebar () {
        return lebar;
    }
    
    public int getPanjang () {
        return panjang;
    }
    
    //rumus
    public double hitungLuas() {
        return panjang * lebar ;
    }
    
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    
}
