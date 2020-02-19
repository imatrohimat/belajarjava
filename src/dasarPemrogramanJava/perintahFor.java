/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasarPemrogramanJava;

import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author IMAT-PC
 */
public class perintahFor {
    public static void main(String[] args) {
        for (int i= 1; i<=100; i++)
        {
            System.out.println(i);
        if (i==40) {
            break;
        }
       }
    }
}
