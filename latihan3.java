package latihan3;

import java.util.*;

public class latihan3 {
    public static void main(String[] args) {
        // membuat scanner baru untuk operasi input//
        Scanner masuk = new Scanner(System.in);
        // deklarasi variabel//
        Integer bulan;
        // cetak nama - nama bulan//
        System.out.println(
                "1. Januari\n2. Februari\n3. Maret\n4. April\n5. Mei\n6. Juni\n7. Juli\n8. Agustus\n9. September\n10. Oktober\n11. November\n12. Desember");
        System.out.printf("MASUKAN PILILHAN ANDA : ");
        bulan = masuk.nextInt();
        // metode switch case//
        switch (bulan) {
            case 1:
                System.out.print("ANDA TELAH MEMILIH BULAN JANUARI\n");
                break;
            case 2:
                System.out.print("ANDA TELAH MEMILIH BULAN FEBRUARI\n");
                break;
            case 3:
                System.out.print("ANDA TELAH MEMILIH BULAN MARET\n");
                break;
            case 4:
                System.out.print("ANDA TELAH MEMILIH BULAN APRIL\n");
                break;
            case 5:
                System.out.print("ANDA TELAH MEMILIH BULAN MEI\n");
                break;
            case 6:
                System.out.print("ANDA TELAH MEMILIH BULAN JUNI\n");
                break;
            case 7:
                System.out.print("ANDA TELAH MEMILIH BULAN JULI\n");
                break;
            case 8:
                System.out.print("ANDA TELAH MEMILIH BULAN AGUSTUS\n");
                break;
            case 9:
                System.out.print("ANDA TELAH MEMILIH BULAN SEPTEMBER\n");
                break;
            case 10:
                System.out.print("ANDA TELAH MEMILIH BULAN OKTOBER\n");
                break;
            case 11:
                System.out.print("ANDA TELAH MEMILIH BULAN NOVEMBER\n");
                break;
            case 12:
                System.out.print("ANDA TELAH MEMILIH BULAN DESEMBER\n");
                break;
            default:

        }
        System.out.println("CODEMAKER = I Putu Gede Juliana_200010113");
    }
}