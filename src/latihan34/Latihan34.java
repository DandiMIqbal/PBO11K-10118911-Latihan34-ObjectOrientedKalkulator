/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan34;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Latihan34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Kalkulator k = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        k.value1 = sc.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        k.value2 = sc.nextDouble();
        System.out.println("\nHasil Pertambahan : "+k.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+k.kurangBilangan());
        System.out.println("Hasil Perkalian : "+k.kaliBilangan());
        System.out.println("Hasil Pembagian : "+k.bagiBilangan());
        System.out.println("Hasil Sisa : "+k.sisaBilangan());
    }
    
}
