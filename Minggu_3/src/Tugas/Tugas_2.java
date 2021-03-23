/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Tugas_2 {
        
      public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Deret : ");
        int v = s.nextInt();
        int[] jumlahderet = new int[v];
        
        //input nilai
        for (int i =0; i < v; i++){
            System.out.print("nilai ke-" + i +" :");
            jumlahderet[i] = s.nextInt();
            
        }
        // output nilai
        System.out.print("nilai array : ");
        System.out.print(" [ ");
        for (int i : jumlahderet) {
            System.out.print(i + " ");
    }
        System.out.println("]");
        
    
}
    
}
