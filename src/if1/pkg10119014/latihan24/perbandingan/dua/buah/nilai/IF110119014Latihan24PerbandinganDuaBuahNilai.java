/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan24.perbandingan.dua.buah.nilai;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IF110119014Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int nilai1, nilai2, nilai3;
String pilihan;
Scanner scanner = new Scanner(System.in);
System.out.println("====Program Perbandingan====");
do{
    System.out.print("Masukan nilai pertama :");
    nilai1 = scanner.nextInt();
    System.out.print("Masukan nilai kedua : ");
    nilai2 = scanner.nextInt();
    if(nilai1 < nilai2) {
        System.out.printf("Hasil : %1$d Lebih Kecil dari %2$d%n", nilai1, nilai2);
    }
    if (nilai1>nilai2){
        System.out.printf("Hasil : %1$d Lebih Besar dari %2$d%n",nilai1, nilai2);
    }
    if (nilai1==nilai2){
        System.out.printf("Hasil : %1$d Sama Dengan %2$d%n", nilai1 , nilai2);
    }
    System.out.print("Ulangi Ktifitas? Ya/Tidak : ");
    pilihan = scanner.next();
    System.out.println();
}while(pilihan.equals("ya")|| pilihan.equals("Ya"));
    }
}
    
    

