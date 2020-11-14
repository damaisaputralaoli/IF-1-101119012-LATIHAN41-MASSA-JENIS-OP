
package pbo10119012latihan41;

import java.util.Scanner;

/**
 * NAMA  : DAMAI SAPUTRA LAOLI
 * KELAS : IF-1
 * NIM   : 10119012
 */
public class PBO10119012Latihan41 {

    
    public static void main(String[] args) {
        int sisi, massa, volume;
        Scanner scanner = new Scanner(System.in);
        Kubus kb1 = new Kubus();
        kb1.setSisi(5);
        kb1.setMassa(250);
        sisi = kb1.getSisi();
        massa = kb1.getMassa();
        volume = kb1.hitungVolume(sisi);

        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("Sisi : "+ sisi);
        System.out.println("Massa : "+ massa);
        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : "+volume);
        System.out.println("Massa Jenis : "+kb1.hitungMassaJenis(massa,volume));
    }
}