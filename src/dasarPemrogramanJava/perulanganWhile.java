/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasarPemrogramanJava;

/**
 *
 * @author IMAT-PC
 */
public class perulanganWhile {
    public static void main(String[] args) {
        int jumlah= 6;
        
        while( jumlah > 5) {
            System.out.println(jumlah);
            jumlah++;
            if (jumlah ==100){
                break;
            }
        }
    }
    
    
    
}
