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
public class Pegawai extends Manusia{
    private String nip;
    
    public String ambilNip(){
        return nip;
    }
    
    public void ubahNip (String nip){
        this.nip=nip;
    }
    
   
   
}
