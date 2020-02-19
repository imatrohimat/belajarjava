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
    String nama;
    String alamat;
    
    //fungsi
   public String ambilNama(){
        return nama;
    }
   //prosedur
    void hapusNama(){
        nama="";
    }
    
     void ubahNama(String namaBaru){
        nama= namaBaru;
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
