/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan warna kepribadian OO
 */
package pboif2.pkg10119059.latihan40.warnakepribadian;

import java.util.Scanner;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String warna,nama;

        System.out.println(Warna.RED+"YUK"+Warna.GREEN+" CEK"+Warna.YELLOW+" KEPRIBADIANMU"+Warna.CYAN+" DARI"+Warna.PURPLE+" WARNA"+Warna.BLUE+" FAVORITMU");
        System.out.println(Warna.RED+"MERAH");
        System.out.println(Warna.GREEN+"HIJAU");
        System.out.println(Warna.YELLOW+"KUNING");
        System.out.println(Warna.BLUE+"BIRU");
        System.out.println(Warna.PURPLE+"UNGU");
        System.out.println(Warna.BLACK+"");
        System.out.println("*gunakan huruf kapital");
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = input.next();
        System.out.print("NAMA KAMU : ");
        nama = input.next();
        Warna.tesKepribadianWarna(warna, nama);
    }
    
}
