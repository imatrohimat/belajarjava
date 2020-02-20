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
public class Berumur extends Bernama{
   private int umur;
    
   public Berumur(){
      
   }
   
   public Berumur(String nama, int umur){
       this.nama=nama;
       this.umur=umur;
   }
   
   public int ambilUmur(){
       return umur;
   }
}
