package jobsheet5;

import java.util.Scanner;

public class sistemwifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("pengguna wifi adalah dosen (ya/tidak): ");
            String dosen = sc.nextLine().trim();

        if (dosen.equalsIgnoreCase("ya")) {
            pesan = "Akses wifi diberikan(dosen)";

        System.out.println(pesan);
        return;
        }

        System.out.print("pengguna wifi adalah mahasiswa (ya/tidak): ");
            String mahasiswa = sc.nextLine().trim();
        System.out.print("jumlah sks: ");
            int jumlah_sks = sc.nextInt();

        if (mahasiswa.equalsIgnoreCase("ya")) {
           if (jumlah_sks >= 12) {
            pesan = "Akses wifi diberikan (mahasiswa aktif)";
           } else {
            pesan = "Akses wifi ditolak (sks kurang dari 12)";
           }
        } else {
            pesan = "Akses wifi ditolak";
        }

        System.out.println(pesan);
        }

    }



    
