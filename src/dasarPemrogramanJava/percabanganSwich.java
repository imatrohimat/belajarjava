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
public class percabanganSwich {
    public static void main(String[] args) {
        
        char tombol='B';
        
        switch(tombol) {
            case 'A':
                System.out.println("maju");
                break;
            case 'B':
                System.out.println("mundur");
                break;
            case 'C':
                System.out.println("naik");
                break;
                default:
                System.out.println("diam");
                
        }
    }
    
}
