/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan42.tabungan;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : program menarik tabungan
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan (int saldo ){
     this.saldo = saldo;
        
    }

    public int getSaldo() {
        return saldo;
    }

      
    public int ambilUang(int jumlah){
      return saldo - jumlah;
    }
    
}
