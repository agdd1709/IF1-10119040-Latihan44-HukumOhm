/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan44.hukumohm;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  :10119040
 * Kelas: IF1
 * Program menghitung kuat arus listrik menggunakan hukum ohm dengan metode
 * pendekatan berbasis objek
 */
public class Baterai {
    private float kuatArus,hambatan;

    public float getKuatArus() {
        kuatArus = 3;
        return kuatArus;
    }

    public float getHambatan() {
        hambatan =12 ;
        return hambatan;
    }
    
  
    public float hitungtegang(){
        return kuatArus*hambatan;
        
    }
    
   public void baterai(){
       System.out.println("=====Hukum Ohm=====");
       System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar akan berbanding lurus dengan potensial"
               +"pada ujung-ujung kawat pengantar tersebut asalkan suhu kawat di jaga konstan");
       System.out.println("Kuat arus : "+getKuatArus()+" ampere");
       System.out.println("Hambatan : "+getHambatan()+" ohm");
       System.out.println("Hasil Tegangan : "+hitungtegang()+" volt");
   }
}
