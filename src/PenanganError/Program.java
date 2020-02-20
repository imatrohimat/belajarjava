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
public class Program {
    public static void main(String[] args) {
        try{
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNim(null);
        } catch (Throwable e) {
            System.out.println("ups, error pak lee");
            System.out.println(e.getMessage());
        }
    }
    
}
