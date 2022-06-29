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
public class Driverbangundatar {
   public static void main (String[] args) {
        BangunDatar_1302194007[] mulai = new BangunDatar_1302194007[3];
        mulai[0] = new Lingkaran_1302194007 ("bulat", 21);
        mulai[1] = new Persegipanjang_1302194007 ("panjang", 15, 8);
        mulai[2] = new Segitiga_1302194007 ("tiga", 10, 12);
        
        Lingkaran_1302194007 link = (Lingkaran_1302194007) mulai[0];
        Persegipanjang_1302194007 pers = (Persegipanjang_1302194007) mulai[1];
        Segitiga_1302194007 segit = (Segitiga_1302194007) mulai[2];
        
        //output
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("Nama Bangun Datar : " + mulai[i].getNama());
                    System.out.println("Jari-jari         : " + link.getJari_jari());
                    System.out.println("Luas              : " + mulai[i].hitungLuas());
                    System.out.println("Keliling          : " + mulai[i].hitungKeliling());
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("Nama Bangun Datar : " + mulai[i].getNama());
                    System.out.println("Panjang           : " + pers.getPanjang());
                    System.out.println("Lebar             : " + pers.getLebar());
                    System.out.println("Luas              : " + mulai[i].hitungLuas());
                    System.out.println("Keliling          : " + mulai[i].hitungKeliling());
                    System.out.println("");
                    break;
                default:
                    System.out.println("Nama Bangun Datar : " + mulai[i].getNama());
                    System.out.println("Alas              : " + segit.getAlas());
                    System.out.println("Tinggi            : " + segit.getTinggi());
                    System.out.println("Luas              : " + mulai[i].hitungLuas());
                    System.out.println("Keliling          : " + mulai[i].hitungKeliling());
                    System.out.println("");
                    break;
            }
        }
    }
}
