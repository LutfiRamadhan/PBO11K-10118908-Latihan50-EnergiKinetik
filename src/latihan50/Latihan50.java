/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan50;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hitung h = new Hitung();
        h.setKecepatan(25);
        h.setMassa(145);
        h.hitungGaya();
        System.out.println("Massa : "+h.getMassa());
        System.out.println("Kecepatan : "+h.getKecepatan());
        System.out.println("Energi Kinetik : "+h.EnergiKinetik());
        System.out.println("Usaha : "+h.Usaha());
    }

}
