package jobsheet5;

import java.util.Scanner;

public class sistemPerpus {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String pesan;

    System.out.print("input kartuTandaMahasiswa (ya/tidak): ");
        String kartuTandaMahasiswa = sc.nextLine().trim();
    System.out.print("input registrasi online (ya/tidak): ");
        String registrasi_online = sc.nextLine().trim();

    if (kartuTandaMahasiswa.equalsIgnoreCase("ya") || registrasi_online.equalsIgnoreCase("ya")) {
        pesan = "Silahkan masuk";
    } else {
        pesan = "Ditolak masuk";
    }
    System.out.println(pesan);

     
    }
    
}
