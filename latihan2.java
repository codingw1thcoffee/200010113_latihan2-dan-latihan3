package latihan2;
//fungsi untuk mengambil input user//
import java.util.Scanner;
public class latihan2{
    public static void main(String[] args) {
        //membuat scanner baru//
        Scanner masuk = new Scanner(System.in);
        //membuat variabel baru//
        Float TB, BB, BMI, meter;
        String kat_bb;
        //konversi cm ke m//
        //menerima input user//
        System.out.println("MASUKAN SYARAT CETAK BMI");
        System.out.println("-----------------------------");
        System.out.print("Masukan Berat Badan Anda (Kg) = ");
        BB = masuk.nextFloat();
        System.out.print("Masukan Tinggi Badan Anda (Cm) = ");
        TB = masuk.nextFloat();
        meter = TB/100;
        //menghitung BMI//
        BMI = BB/(meter*meter);
        System.out.printf("Body Mass Index Anda = %.1f %n",BMI);
        System.out.println("---------------------------------------");

        //cek kategori berat badan//
        if(BMI < 18.5){
            kat_bb = "Katergori = Berat Badan Kurang";
            System.out.println(kat_bb);
        }else if (BMI >= 18.5 && BMI <= 25) {
            kat_bb = "Kategori = Normal";
            System.out.println(kat_bb);
        }else if (BMI >= 25 && BMI < 30){
            kat_bb = "Kategori = Kelebihan Berat Badan";
            System.out.println(kat_bb);
        }else if (BMI >= 30){
            kat_bb = "Kategori = Obesitas";
            System.out.println(kat_bb);
        }
        System.out.println("Codemaker = I Putu Gede Juliana_200010113");
    }
}
