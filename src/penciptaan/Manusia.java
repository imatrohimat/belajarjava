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
class Manusia {
    
    //entity
    public String nama;
    public String alamat;
    
    //fungsi
   public String ambilNama(){
        return nama;
    }
   public String ambilAlamat() {
       return alamat;
   }
   
   public void ambilNama(String nama){
       this.nama=nama;
   }
   
   public void ambilAlamat(String alamat){
       this.alamat=alamat;
   }
   //prosedur
    void hapusNama(){
        nama="";
    }
    
     void ubahNama(String namaBaru){
        nama= namaBaru;
    }
     
     public void ubah(String nama){
         nama=this.nama;
     }
     
     public void ubah(String nama, String alamat) {
         nama = this.nama;
         alamat= this.alamat;
     }
    
    void namaAlamat (String namaBaru, String alamatBaru) {
        nama = namaBaru;
        alamat = alamatBaru;
    }
    
    void jikaValueSamaDgnAtribut (String nama, String alamat) {
        this.nama=nama;
        this.alamat=alamat;
    }
    
    //konstraktor untuk memanggil otomatis saat penciptaan manusia
    public Manusia(){
        System.out.println("objek manusia dibuat");
    }
    
    //konstraktor menggunakan parameter nama
    public Manusia(String nama) {
        this.nama=nama;
    }
}
