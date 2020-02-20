/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenanganError;

/**
 *
 * @author IMAT-PC
 */
public class Mahasiswa {
    private String nim;
    
    public String getNim(){
        return nim;
    }
    
    void setNim(String nim) throws Throwable {
        if(nim==null){
            throw  new Throwable("Nimnya diisi dong");
        }
        
        this.nim=nim;
    }
    
}
