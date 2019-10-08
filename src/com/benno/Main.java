package com.benno;
import java.text.DecimalFormat;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung target saldo tabungan
     */

public class Main {

    public static void main(String[] args) {
        DecimalFormat satuan = new DecimalFormat();

        int Saldo = 3500000;
        double Bunga = 0.08;
        int Target = 6000000;
        int i = 0;
        while (i < 10){
            Saldo += (Saldo * Bunga);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + satuan.format(Saldo));
            i++;

            if (Saldo >= Target){
                break;
            }
        }
    }
}
