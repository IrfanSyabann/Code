import java.util.*;
import java.text.*;

public class RumahSakit {
    public static void main(String[] args) {

        String[] StatusPasien = {"Pasien Baru", "Pasien Lama", "Pasien BPJS", "Pasien Akses",};
        int[] BiayaPasien = {500000, 400000, 300000, 200000};

        String[] NamaKamar = {"Kamar Melati", "Kamar Mawar", "Kamar Dahlia", "Kamar Anggrek", "Kamar Tulip"};
        int[] BiayaKamar = {1000000, 2000000, 3000000, 4000000, 5000000};

        String[] NamaDokter = {"DR. Andi", "DR. Joko", "DR. Karni", "DR. Amin", "DR. Udin"};
        int[] BiayaPemeriksaan = {500000, 400000, 300000, 200000, 100000};

        Scanner input = new Scanner(System.in);

        int bayarPa = 0;
        int bayarK = 0;
        int bayarP = 0;
        double diskon = 0;
        String status = "";
        String NamaKa = "";
        String NamaDok = "";
        String KetDiskon = "";

        System.out.print("Kode Pasien = ");
        String pasien = input.next();
        if (pasien.equalsIgnoreCase("ps0001")) {
            status = StatusPasien[0];
            bayarPa = BiayaPasien[0];

            System.out.print("Kode Kamar : ");
            String kamar = input.next();
            if (kamar.equalsIgnoreCase("1111")) {
                NamaKa = NamaKamar[0];
                bayarK = BiayaKamar[0];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];

                }

            } else if (kamar.equalsIgnoreCase("2222")) {
                NamaKa = NamaKamar[1];
                bayarK = BiayaKamar[1];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];
                    
                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                     bayarP = BiayaPemeriksaan[2];
                    
                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                     bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                     bayarP = BiayaPemeriksaan[4];

                }
            } else if (kamar.equalsIgnoreCase("3333")) {
                NamaKa = NamaKamar[2];
                bayarK = BiayaKamar[2];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                     bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];

                }
            } else if (kamar.equalsIgnoreCase("4444")) {
                NamaKa = NamaKamar[3];
                bayarK = BiayaKamar[3];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];
                    
                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];

                }
            } else if (kamar.equalsIgnoreCase("5555")) {
                NamaKa = NamaKamar[4];
                bayarK = BiayaKamar[4];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];

                }
            }
        } else if (pasien.equalsIgnoreCase("ps0002")) {
            status = StatusPasien[1];
            bayarPa = BiayaPasien[1];

            System.out.print("Kode Kamar : ");
            String kamar = input.next();
            if (kamar.equalsIgnoreCase("1111")) {
                NamaKa = NamaKamar[0];
                bayarK = BiayaKamar[0];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                     bayarP = BiayaPemeriksaan[2];
                    
                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];
                    
                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];
                    
                }

            } else if (kamar.equalsIgnoreCase("2222")) {
                NamaKa = NamaKamar[1];
                bayarK = BiayaKamar[1];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                     bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];

                }
            } else if (kamar.equalsIgnoreCase("3333")) {
                NamaKa = NamaKamar[2];
                bayarK = BiayaKamar[2];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];

                }
            } else if (kamar.equalsIgnoreCase("4444")) {
                NamaKa = NamaKamar[3];
                bayarK = BiayaKamar[3];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                     bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                     bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                     bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                     bayarP = BiayaPemeriksaan[4];

                }
            } else if (kamar.equalsIgnoreCase("5555")) {
                NamaKa = NamaKamar[4];
                bayarK = BiayaKamar[4];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                     bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                     bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                     bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                     bayarP = BiayaPemeriksaan[4];

                }
            }

        } else if (pasien.equalsIgnoreCase("ps0003")) {
            status = StatusPasien[2];
            bayarPa = BiayaPasien[2];

            System.out.print("Kode Kamar : ");
            String kamar = input.next();
            if (kamar.equalsIgnoreCase("1111")) {
                NamaKa = NamaKamar[0];
                 bayarK = BiayaKamar[0];
                
                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP  = BiayaPemeriksaan[0];
                    
                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];
                    
                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];
                    
                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];
                    
                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];
                    
                }

            } else if (kamar.equalsIgnoreCase("2222")) {
                NamaKa = NamaKamar[1];
                bayarK = BiayaKamar[1];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];
                    
                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];
                    
                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                     bayarP = BiayaPemeriksaan[2];
                    
                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                     bayarP = BiayaPemeriksaan[3];
                    
                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                     bayarP = BiayaPemeriksaan[4];
                    
                }
            } else if (kamar.equalsIgnoreCase("3333")) {
                NamaKa = NamaKamar[2];
                bayarK = BiayaKamar[2];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                     bayarP = BiayaPemeriksaan[0];
                    
                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                     bayarP = BiayaPemeriksaan[1];
                    
                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                     bayarP = BiayaPemeriksaan[2];
                    
                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                     bayarP = BiayaPemeriksaan[3];
                    
                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                     bayarP = BiayaPemeriksaan[4];
                    
                }
            } else if (kamar.equalsIgnoreCase("4444")) {
                NamaKa = NamaKamar[3];
                bayarK = BiayaKamar[3];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                     bayarP = BiayaPemeriksaan[0];
                    
                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                     bayarP = BiayaPemeriksaan[1];
                    
                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                     bayarP = BiayaPemeriksaan[2];
                    
                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                     bayarP = BiayaPemeriksaan[3];
                    
                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                     bayarP = BiayaPemeriksaan[4];
                    
                }
            } else if (kamar.equalsIgnoreCase("5555")) {
                NamaKa = NamaKamar[4];
                bayarK = BiayaKamar[4];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];
                    
                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];
                    
                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];
                    
                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];
                    
                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];
                    
                }
            }

        } else if (pasien.equalsIgnoreCase("ps0004")) {
            status = StatusPasien[3];
            bayarPa = BiayaPasien[3];

            System.out.print("Kode Kamar : ");
            String kamar = input.next();
            if (kamar.equalsIgnoreCase("1111")) {
                NamaKa = NamaKamar[0];
                bayarK = BiayaKamar[0];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];

                }

            } else if (kamar.equalsIgnoreCase("2222")) {
                NamaKa = NamaKamar[1];
                bayarK = BiayaKamar[1];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];
                }
            } else if (kamar.equalsIgnoreCase("3333")) {
                NamaKa = NamaKamar[2];
                bayarK = BiayaKamar[2];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];

                }
            } else if (kamar.equalsIgnoreCase("4444")) {
                NamaKa = NamaKamar[3];
                bayarK = BiayaKamar[3];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];

                }
            } else if (kamar.equalsIgnoreCase("5555")) {
                NamaKa = NamaKamar[4];
                bayarK = BiayaKamar[4];

                System.out.print("Lama Menginap : ");
                int menginap = input.nextInt();
                if ((menginap > 0) && (menginap < 5)) {
                    diskon = bayarK / 10;
                    KetDiskon = "10%";
                } else if ((menginap > 4) && (menginap < 7)) {
                    diskon = bayarK / 5;
                    KetDiskon = "20%";
                } else if ((menginap > 6) && (menginap < 9)) {
                    diskon = bayarK / 3.33;
                    KetDiskon = "30%";
                } else if ((menginap > 8) && (menginap < 10)) {
                    diskon = bayarK / 2.5;
                    KetDiskon = "40%";
                } else if (menginap > 10) {
                    diskon = bayarK / 2;
                    KetDiskon = "50%";
                } else {
                    diskon = bayarK;
                    KetDiskon = "Tidak Ada Diskon";
                }

                System.out.print("Kode Dokter : ");
                String dokter = input.next();
                if (dokter.equalsIgnoreCase("dk001")) {
                    NamaDok = NamaDokter[0];
                    bayarP = BiayaPemeriksaan[0];

                } else if (dokter.equalsIgnoreCase("dk002")) {
                    NamaDok = NamaDokter[1];
                    bayarP = BiayaPemeriksaan[1];

                } else if (dokter.equalsIgnoreCase("dk003")) {
                    NamaDok = NamaDokter[2];
                    bayarP = BiayaPemeriksaan[2];

                } else if (dokter.equalsIgnoreCase("dk004")) {
                    NamaDok = NamaDokter[3];
                    bayarP = BiayaPemeriksaan[3];

                } else if (dokter.equalsIgnoreCase("dk005")) {
                    NamaDok = NamaDokter[4];
                    bayarP = BiayaPemeriksaan[4];

                }
            }

        } else {
            System.out.println("Data Tidak Valid!!!");
        }

        int Total = bayarPa + bayarK + bayarP - (int) diskon;
        DecimalFormat koma = new DecimalFormat("#,###,###");

        String Hasil = koma.format(Total);
        String HasilPa = koma.format(bayarPa);
        String HasilK = koma.format(bayarK);
        String HasilP = koma.format(bayarP);

        System.out.println();
        System.out.println("Status Pasien : " + status);
        System.out.println("Biaya daftar Pasien : Rp." + HasilPa);
        System.out.println("Nama Kamar : " + NamaKa);
        System.out.println("Biaya Kamar : Rp." + HasilK);
        System.out.println("Nama Dokter : " + NamaDok);
        System.out.println("Biaya Pemeriksaan: Rp." + HasilP);
        System.out.println("Diskon : " + KetDiskon + " (Dari Biaya Kamar)");
        System.out.println();
        System.out.println("Total Bayar : Rp." + Hasil);

        input.close();

    }
}
