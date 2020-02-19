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
public class operatorLogika {
    public static void main(String[] args) {
        boolean pernyataan1 = 100 > 5 || 100 < 4; //kondisi atau
        boolean pernyataan2 = 100 > 7 && 100 < 8; // kondisi dan
        
        System.out.println(pernyataan1);
        System.out.println(pernyataan2);
    }
    
}
