import java.util.*;
import java.text.*;

public class RumahSakit_V1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kode Pasien : ");
        String pasien = input.next();
        System.out.print("Kode Kamar : ");
        String kamar = input.next();
        System.out.print("Lama Menginap : ");
        int menginap = input.nextInt();
        System.out.print("Kode Dokter : ");
        String dokter = input.next();
        System.out.println();
        System.out.println("==============================================");
        ListMethod(pasien, kamar, menginap, dokter);
        System.out.println("==============================================");

        input.close();
    }

    static void ListMethod(String pasien, String kamar, int menginap, String dokter) {
        String[] KodePasien = {"PS0001", "PS0002", "PS0003", "PS0004",};
        String[] StatusPasien = {"Pasien Baru", "Pasien Lama", "Pasien BPJS", "Pasien Akses",};
        int[] BiayaPasien = {500000, 400000, 300000, 200000};

        String[] KodeKamar = {"1111", "2222", "3333", "4444", "5555"};
        String[] NamaKamar = {"Kamar Melati", "Kamar Mawar", "Kamar Dahlia", "Kamar Anggrek", "Kamar Tulip"};
        int[] BiayaKamar = {1000000, 2000000, 3000000, 4000000, 5000000};

        String[] KodeDokter = {"DK001", "DK002", "DK003", "DK004", "DK005"};
        String[] NamaDokter = {"DR. Andi", "DR. Joko", "DR. Karni", "DR. Amin", "DR. Udin"};
        int[] BiayaPemeriksaan = {500000, 400000, 300000, 200000, 100000};

        String status = "";
        String namaK = "";
        String namaD = "";
        String KetDiskon = "";
        int biaya = 0;
        int biayaK = 0;
        int biayaP = 0;
        int diskon = 0;

        //Code Pasien
        if (pasien.equalsIgnoreCase(KodePasien[0])) {
            status = StatusPasien[0];
            biaya = BiayaPasien[0];
        } else if (pasien.equalsIgnoreCase(KodePasien[1])) {
            status = StatusPasien[1];
            biaya = BiayaPasien[1];
        } else if (pasien.equalsIgnoreCase(KodePasien[2])) {
            status = StatusPasien[2];
            biaya = BiayaPasien[2];
        } else if (pasien.equalsIgnoreCase(KodePasien[3])) {
            status = StatusPasien[3];
            biaya = BiayaPasien[3];
        } else {
            System.out.println("Pasien Tidak Terdaftar");
        }

        //Code Kamar
        if (kamar.equalsIgnoreCase(KodeKamar[0])) {
            namaK = NamaKamar[0];
            biayaK = BiayaKamar[0];
        } else if (kamar.equalsIgnoreCase(KodeKamar[1])) {
            namaK = NamaKamar[1];
            biayaK = BiayaKamar[1];
        } else if (kamar.equalsIgnoreCase(KodeKamar[2])) {
            namaK = NamaKamar[2];
            biayaK = BiayaKamar[2];
        } else if (kamar.equalsIgnoreCase(KodeKamar[3])) {
            namaK = NamaKamar[3];
            biayaK = BiayaKamar[3];
        } else if (kamar.equalsIgnoreCase(KodeKamar[4])) {
            namaK = NamaKamar[4];
            biayaK = BiayaKamar[4];
        } else {
            System.out.println("Kamar Tidak Ditemukan");
        }

        //Code Diskon
        if ((menginap > 1) && (menginap < 5)) {
            diskon = (biayaK * 10) / 100;
            KetDiskon = "10% (Dari Biaya Kamar)";
        } else if ((menginap > 4) && (menginap < 7)) {
            diskon = (biayaK * 20) / 100;
            KetDiskon = "20% (Dari Biaya Kamar)";
        } else if ((menginap > 6) && (menginap < 9)) {
            diskon = (biayaK * 30) / 100;
            KetDiskon = "30% (Dari Biaya Kamar)";
        } else if ((menginap > 8) && (menginap < 11)) {
            diskon = (biayaK * 40) / 100;
            KetDiskon = "40% (Dari Biaya Kamar)";
        } else if (menginap > 10) {
            diskon = (biayaK * 50) / 100;
            KetDiskon = "50% (Dari Biaya Kamar)";
        } else {
            System.out.println("Anda Tidak Mendapatkan Diskon");
        }

        //Code Dokter
        if (dokter.equalsIgnoreCase(KodeDokter[0])) {
            namaD = NamaDokter[0];
            biayaP = BiayaPemeriksaan[0];
        } else if (dokter.equalsIgnoreCase(KodeDokter[1])) {
            namaD = NamaDokter[1];
            biayaP = BiayaPemeriksaan[1];
        } else if (dokter.equalsIgnoreCase(KodeDokter[2])) {
            namaD = NamaDokter[2];
            biayaP = BiayaPemeriksaan[2];
        } else if (dokter.equalsIgnoreCase(KodeDokter[3])) {
            namaD = NamaDokter[3];
            biayaP = BiayaPemeriksaan[3];
        } else if (dokter.equalsIgnoreCase(KodeDokter[4])) {
            namaD = NamaDokter[4];
            biayaP = BiayaPemeriksaan[4];
        } else {
            System.out.println("Dokter Tidak Terdaftar");
        }

        //Code Declaration to Execute
        int results = biaya + biayaK + biayaP - diskon;
        DecimalFormat koma = new DecimalFormat("#,###,###");

        String pasienKoma = koma.format(biaya);
        String kamarKoma = koma.format(biayaK);
        String PemeriksaanKoma = koma.format(biayaP);
        String hasilKoma = koma.format(results);

        //Code Is Executed
        System.out.println("==============================================");
        System.out.println("Status Pasien : " + status);
        System.out.println("Biaya Daftar Pasien : Rp." + pasienKoma);
        System.out.println("Nama Kamar : " + namaK);
        System.out.println("Biaya Kamar : Rp." + kamarKoma);
        System.out.println("Nama Dokter : " + namaD);
        System.out.println("Biaya Pemeriksaan : Rp." + PemeriksaanKoma);
        System.out.println("Diskon : " + KetDiskon);
        System.out.println("Total Bayar : Rp." + hasilKoma);
    }
}
