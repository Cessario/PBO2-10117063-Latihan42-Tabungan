/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan42.tabungan;

import java.util.Scanner;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : program menarik tabungan
 */
public class PBO210117063Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah;
        Scanner sc = new Scanner (System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tb = new Tabungan(sc.nextInt());
        System.out.print("Jumlah uang yang akan diambil :");
        jumlah = sc.nextInt();
        System.out.print("Saldo Anda Sekarang : " +tb.ambilUang(jumlah));
        
      
    }
    
}
