/**
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini berisi perintah untuk menampilkan jenis-jenis tipe data ke layar
 *
 */

public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta UPPERCASE
        boolean nilaiLogika;
        char nilaiKarakter;

        // Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';

        // Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
    }
}