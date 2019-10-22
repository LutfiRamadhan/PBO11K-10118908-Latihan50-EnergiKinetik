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
class Hitung {
    private double massa, kecepatan, gaya;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double EnergiKinetik(){
        return 0.5*this.massa*Math.pow(this.kecepatan, 2);
    }
    
    public double hitungGaya(){
        this.gaya = this.massa*this.kecepatan;
        return this.gaya;
    }
    
    public double Usaha(){
        return this.gaya*this.kecepatan;
    }
}
