/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.belajar;

/**
 *
 * @author IMAT-PC
 */
public class mainKalkulator {
    public static void main(String[] args) {
        try {
        int a = 90;
        int b= 0;
        
        int c= Kalkulator.pengurangan(a, b);
        int d= Kalkulator.penjumlahan(a, b);
        int e= Kalkulator.perkalian(a, b);
        int f= Kalkulator.pembagian(a, b);
        
        System.out.println("Pengurangan= "+c);
        System.out.println("Penjumlahan= "+d);
        System.out.println("perkalian= "+e);
        System.out.println("pembagian= "+f);
        } catch (Throwable e){
            System.out.println("ops.. terjadi error: ");
            System.out.println(e.getMessage());
        }
        
    }
    
}
