/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penciptaan;

/**
 *
 * @author IMAT-PC
 */
public class membuatManusia {
    
    public static void main(String[] args) {
         Manusia manusia = new Manusia();
         manusia.nama= "Imat Rohimat";
         manusia.ubahNama("imat khoerudin");
         manusia.namaAlamat("Dudung", "Bandung");
        
         
         System.out.println(manusia.nama +"  "+ manusia.alamat);
         
         //dengan cara merubah visibilitas metode menjadi private kita bisa
         //memuculkannya menjadi seperti berikut ini
         
         System.out.println(manusia.ambilNama());
        
         //output setelah dipasang konstraktor
         Manusia manusia2 = new Manusia();
         
         //output stelah konstraktor menggunakan parameter
         
         Manusia manusia3 = new Manusia("Junaedi");
    }
    
    
}
