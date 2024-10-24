import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int jamLembur;
        double honorLembur;
        int batasJamlembur = 16;
        double tarifNormal = 10000;
        double tarifLebih = 15000;

        // Input dari user
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total jam lembur: ");
        jamLembur = input.nextInt();

        // Proses perhitungan honor lembur
        if (jamLembur <= batasJamlembur) {
            honorLembur = jamLembur * tarifNormal;
        } else {
            int lemburLebih = jamLembur - batasJamlembur;
            honorLembur = (batasJamlembur * tarifNormal) + (lemburLebih * tarifLebih);
        }

        // Output hasil
        System.out.println("Total jam lembur: " + jamLembur);
        System.out.println("Honor lembur: " + honorLembur);
    }
}

