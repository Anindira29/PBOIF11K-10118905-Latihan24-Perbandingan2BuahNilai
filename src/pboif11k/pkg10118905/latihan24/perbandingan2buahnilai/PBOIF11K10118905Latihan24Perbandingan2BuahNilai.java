/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan24.perbandingan2buahnilai;

import java.util.Scanner;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Perbandingan dua buah nilai
 */
public class PBOIF11K10118905Latihan24Perbandingan2BuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void bandingkan(int a, int b) {
        if (a < b){
            System.out.println(a+"Lebihkecil dari"+b);
        }else if (a > b){
            System.out.println(a+"lebih besar dari"+b);
        }else {
            System.out.println(a+"sama dengan"+b);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ulangi;
        do {
            System.out.println("====== Program Perbandingan Nilai=====");
            System.out.println("Masukkan nilai pertama: ");
            int nilai1 = sc.nextInt();
            System.out.println("Masukkan nilai kedua: ");
            int nilai2 = sc.nextInt();
            bandingkan (nilai1,nilai2);
            System.out.println("\nUlangi aktifitas? (ya/tidak):");
            ulangi = sc.next();
            ulangi = ulangi.toLowerCase();
            System.out.println();
        } while (ulangi.equals("ya"));
            
    }
    
}
