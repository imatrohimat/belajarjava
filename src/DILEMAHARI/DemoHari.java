/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DILEMAHARI;

import static DILEMAHARI.Hari.KAMIS;
import static DILEMAHARI.Hari.MINGGU;
import static DILEMAHARI.Hari.RABU;
import static DILEMAHARI.Hari.SABTU;
import static DILEMAHARI.Hari.SELASA;
import static DILEMAHARI.Hari.SENIN;

/**
 *
 * @author IMAT-PC
 */
public class DemoHari {
    Hari hari;

    public  DemoHari(Hari hari){
        this.hari=hari;
       
    }
    
    public void evaluasiHari(){
        switch(hari){
            case SABTU: 
            case MINGGU:
                System.out.println("asyiikk");
            break;
            case SENIN: 
            case SELASA:
                System.out.println("berat");
                break;
            case RABU: 
            case KAMIS:
                System.out.println("capek");
                break;
                default:
                    System.out.println("berkah");
        } 
    }
    
     public static void main(String[] args){
 
    DemoHari hariPertama = new DemoHari(Hari.MINGGU);
    hariPertama.evaluasiHari();
 
    DemoHari hariKedua = new DemoHari(Hari.SENIN);
    hariKedua.evaluasiHari();
 
    DemoHari hariKetiga = new DemoHari(Hari.SELASA);
    hariKetiga.evaluasiHari();
 
    DemoHari hariKeempat = new DemoHari(Hari.RABU);
    hariKeempat.evaluasiHari();
 
    DemoHari hariKelima = new DemoHari(Hari.KAMIS);
    hariKelima.evaluasiHari();
 
    DemoHari hariKeenam = new DemoHari(Hari.JUMAT);
    hariKeenam.evaluasiHari();
 
    DemoHari hariKetujuh = new DemoHari(Hari.SABTU);
    hariKetujuh.evaluasiHari();
  }
}
