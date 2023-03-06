package tugas1PraktikumPBO;

import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan nama hewan : ");
        String nama = scn.nextLine();
        System.out.print("Masukkan umur hewan : ");
        int umur = scn.nextInt();

        try {
            Hewan kucing = new Kucing(nama, umur);
            Hewan anjing = new Anjing(nama, umur);
            Peliharaan peliharaan = new Kucing(nama, umur);
            System.out.println(kucing);
            System.out.println(anjing);
            System.out.println(peliharaan);
        } catch (UmurError e) {
            System.out.println(e.getMessage());
        }
    }
}

class UmurError extends Exception {
    public UmurError() {
        super("Invalid umur. umur seharusnya diantara 0 sampai 20 tahun.");
    }
}