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
public class Lingkaran_1302194007 extends BangunDatar_1302194007{
    private int jari_jari;    
    //constructor
    public Lingkaran_1302194007 (String nama, int jari_jari) {
        super(nama);
        this.jari_jari = jari_jari;
    }
    
    //setter
    public void setJari_jari (int jari_jari) {
        this.jari_jari = jari_jari;
    }
    
    //getter
    public int getJari_jari () {
        return jari_jari;
    }
    
    //rumus
    public double hitungLuas () {
        return 3.14 * (jari_jari * jari_jari);
    }
    
    public double hitungKeliling () {
        return (22 * 2 * jari_jari) / 7;
    }
    
}
