/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.belajar;

/**
 *
 * @author IMAT-PC
 * inner class
 */
public class kelasLuar {
    private String data;
    
    public void ubahData(String data){
        this.data=data;
    }
    
    public String ambilData(){
        return data;
    }
    
    public class kelasDalam{
        private String contoh;
        
        public void ubahContoh(String contoh){
            this.contoh=contoh;
        }
        
        public String ambilContoh (){
            return contoh;
        }
    }
}
