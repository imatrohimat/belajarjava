/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keunikanString;

/**
 *
 * @author IMAT-PC
 * 
 * string sebagai kelas bukan sebagai tipe data sehingga 
 * string pun memiliki banyak metode yang dapat kita gunakan untuk melakukan proses manipulasi string
 * seperti menjadikannya huruf besar atau huruf kecil. 
 */
public class stringAsClass {
    
    public static void main(String[] args) {
        String data = "buku";
        String data2= "buku"+"milik";
        data2=data2+"Andy";
    
        
        String data3="bukumilikAndy";
    String hasil= data.toUpperCase();
      
    System.out.println(hasil);
    
if (data2==data3) {
    System.out.println(data2+" sama dengan "+data3);
} else {
    System.out.println(data2+" tidak sama "+data3);
}

    
if (data2.equals(data3)){
    System.out.println(data2+" sama dengan "+data3);
} else {
    System.out.println(data2+" tidak sama "+data3);
}
       
    }
    
    
    
}
