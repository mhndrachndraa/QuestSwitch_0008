
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        float strukturData, pbo, basisData, algoritma, rpl, rataRata, matakuliah;
        String predikat;
        int jumlahMataKuliah = 5;

        System.out.println("=== SISTEM SELEKSI ASISTEN DOSEN ===");
        System.out.println("Masukkan nilai Struktur Data: ");
        strukturData = ns.nextFloat();

        System.out.println("Masukkan nilai Pemrograman Berorientasi Objek: ");
        pbo = ns.nextFloat();

        System.out.println("Masukkan nilai Basis Data: ");
        basisData = ns.nextFloat();

        System.out.println("Masukkan nilai Algoritma dan Pemrograman: ");
        algoritma = ns.nextFloat();

        System.out.println("Masukkan nilai Rekayasa Perangkat Lunak: ");
        rpl = ns.nextFloat();

        System.out.print("1. Nilai Struktur Data =" + strukturData);
        System.out.print("2. Nilai Pemograman Berorientasi Objek =" + pbo);
        System.out.print("3. Nilai Basis Data = " + basisData);
        System.out.print("4. Nilai Algoritma dan Pemrograman = " + algoritma);
        System.out.print("5. Nilai RPL = " + rpl);
        System.out.println("Total Matkul = ");

        float totalNilai = strukturData + pbo + basisData + basisData + algoritma;
        rataRata = totalNilai / jumlahMataKuliah;

        System.out.println("Total Nilai: " + totalNilai);
        System.out.println("Rata-rata Nilai: " + rataRata);

        if (rataRata >= 93.75) {
            predikat = "A (Sangat Baik)";
        } else if (rataRata >= 87.5) {
            predikat = "AB (Baik Sekali)";
        } else if (rataRata >= 75) {
            predikat = "B (Baik)";
        } else if (rataRata >= 62.5) {
            predikat = "BC (Cukup)";
        } else {
            predikat = "C (Kurang)";

            System.out.println("Predikat Anda: " + predikat);

            ns.close();

        }
    }
}