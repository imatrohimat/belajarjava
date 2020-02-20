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
public class membuatPegawai extends Manusia {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        pegawai.nama="sule";
        pegawai.alamat="jl. prikitiew";
        pegawai.ubahNip("1234589");
        
        System.out.println(pegawai.ambilNama()+" "+pegawai.ambilAlamat()+" "+ pegawai.ambilNip());
    }
}
