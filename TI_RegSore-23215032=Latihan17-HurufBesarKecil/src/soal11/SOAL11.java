/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal11;

/**
 *
 * @author
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : HURUF BESAR DAN KECIL
 */
import java.util.Scanner;

public class SOAL11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan kalimat
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        System.out.println("=== Hasil Formatting ===");

        // Menampilkan kalimat dalam format huruf besar
        System.out.println("Kalimat dalam huruf besar: " + kalimat.toUpperCase());

        // Menampilkan kalimat dalam format huruf kecil
        System.out.println("Kalimat dalam huruf kecil: " + kalimat.toLowerCase());

        // Menutup scanner
        scanner.close();
    }
}
