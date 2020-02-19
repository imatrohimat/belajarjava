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
public class percabangan {
 
    public static void main(String[] args) {
            int a =90;
            int b = 100;
            
    
    if (a == 90) {
            System.out.println("sembilan puluh");
    }
    
    if (a==90 && b==100) {
        System.out.println("perhitungan sesuai");
    } else {
        System.out.println("coba periksa lagi");
    }
    
    if ( a==90) {
        System.out.println("sembilan puluh");
    } else if (a==100) {
        System.out.println("seratus");
    }
    
    
    
    //contoh dalam pemberian index nilai 
    
    int nilai= 90;
    char index;
    
    if (nilai== 90) {
        index ='A';
    } else if (nilai >=80) {
        index ='B';
    } else {
        index ='C';
    }
        System.out.println(index);
}
    
}
