/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Waktu;

import java.util.Calendar;

/**
 *
 * @author IMAT-PC
 */
public class Calender {
    
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
       
        calendar.set(Calendar.YEAR,1995);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 17);
    }
    
}
