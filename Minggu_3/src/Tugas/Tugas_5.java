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
public class Tugas_5 {
    
        public static void main(String[] args) {
        Scanner beliminum = new Scanner(System.in);

        System.out.println("       KOP SURAT            ");
        System.out.println("       COFFE SHOP           ");
        System.out.println("----------------------------");
        
        //data minuman
        System.out.println("     SPECIAL MENU           ");
        System.out.println("    1.ES KOPI PRANGKO       ");
        System.out.println("    2.CAFFE LATTE           ");
        System.out.println("    3.CARAMEL MACHIATO      ");
        System.out.println("    4.EXPRESSO              ");
        System.out.println("    5.V60                   ");
        System.out.println("----------------------------");

        //nama pembeli
        System.out.print("Masukkan nama pembeli : ");
        String nama = beliminum.nextLine();
        System.out.println("");

        //pilih minuman
        System.out.print("Silahkan masukkan pilihan anda : ");
        int minuman = beliminum.nextInt();

        //switch case minuman
        switch (minuman) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah ES KOPI PRANGKO  ");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah CAFFE LATTE ");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah CARAMEL MACHIATO");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah EXPRESSO");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah V60");
                break;
            default:
                System.out.println("Tidak ada data minuman");
        }
        System.out.println("Pesanan anda akan segera kami antar");
        System.out.println("Terima kasih " + nama + " telah berkunjung ke KOP SURAT");
    }
}
