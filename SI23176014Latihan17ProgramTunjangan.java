/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.pkg23176014.latihan17.programtunjangan;

/**
 *
 * @author User
 * NAMA     : Muhammad Nur Khikam
 * KELAS    : Sistem Informasi
 * NIM      : 23176014
 * Deskripsi Program : Program ini berfungsi untuk menghitung total gaji bulanan berdasarkan gaji pokok 
 * dan status menikah. Jika pengguna menikah, akan dihitung tunjangan sebesar 35% dari gaji pokok
 */
import java.util.Scanner;

public class SI23176014Latihan17ProgramTunjangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========Program Tunjangan========");
        
        // Input gaji pokok
        System.out.print("Berapa gaji pokok anda per bulan? Rp. ");
        double gajiPokok = input.nextDouble();
        
        // Input status menikah atau belum
        System.out.print("Status Anda? (Menikah/Belum) : ");
        String status = input.next();
        
        // Tunjangan jika sudah menikah
        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }
        
        // Total gaji
        double totalGaji = gajiPokok + tunjangan;
        
        // Output hasil
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.printf("Gaji Pokok   : Rp %.1f%n", gajiPokok);
        System.out.printf("Tunjangan    : Rp %.1f%n", tunjangan);
        System.out.printf("Total Gaji   : Rp %.1f%n", totalGaji);
        
        input.close();
    }
}

