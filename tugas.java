
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);

        float strukturData, pbo, basisData, algoritma, rpl, rataRata;
        String predikat;

        System.out.println("=== SISTEM SELEKSI ASISTEN DOSEN ===");
        System.out.println("Masukkan nilai Struktur Data: ");
        strukturData = can.nextFloat();

        System.out.println("Masukkan nilai Pemrograman Berorientasi Objek: ");
        pbo = can.nextFloat();

        System.out.println("Masukkan nilai Basis Data: ");
        basisData = can.nextFloat();

        System.out.println("Masukkan nilai Algoritma dan Pemrograman: ");
        algoritma = can.nextFloat();

        System.out.println("Masukkan nilai Rekayasa Perangkat Lunak: ");
        rpl = can.nextFloat();

        rataRata = (strukturData + pbo + basisData + algoritma + rpl) / 5;

        System.out.print("1. Nilai Struktur Data ="+ strukturData); 
        can.nextDouble(); 

        System.out.print("2. Nilai Pemograman Berorientasi Objek ="+ pbo); 
        can.nextDouble(); 

        System.out.print("3. Nilai Basis Data = "+ basisData); 
        can.nextDouble(); 
        
        System.out.print("4. Nilai Algoritma dan Pemrograman = "+ algoritma); 
        can.nextDouble(); 
        
        System.out.print("5. Nilai RPL = "+ rpl); 
        can.nextDouble();
    }
}