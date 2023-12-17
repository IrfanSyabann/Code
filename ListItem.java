import java.util.*;
import java.text.*;
import java.time.*;

class ListItem {
    public static void main(String[] args) {

        String[] Menu = {"Minuman", "Makanan"};

        String[] List = {"Aqua", "Teh Poci", "Teh Tawar", "Teh Botol", "Teh Ngeteh",};
        int[] price = {5000, 4000, 3000, 6000, 20000};

        String[] List1 = {"Ayam Geprek", "Ayam Geprek + Nasi Goreng", "Ayam Geprek Engga Di Geprek", "Nasi Doang", "Nasi Kuning",};
        int[] price1 = {10000, 11000, 9000, 0, 5000};


        System.out.println("Selamat Datang Di IpanMart");
        System.out.println();

        System.out.println("Pilih Menu Anda : ");
        System.out.println("1." + Menu[0]);
        System.out.println("2." + Menu[1]);
        System.out.println();
        System.out.println("------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Pesanan Anda : ");
        int choice = 0;
        if (!input.hasNextInt()) {
            while (!input.hasNextInt()) {
                System.out.println("Harap Masukan Angka Saja");
                input.next();
            }
            choice = input.nextInt();
        } else if (input.hasNextInt()) {
            choice = input.nextInt();
        }
        System.out.println("------------------");
        System.out.println();

        if (choice == 1) {
            System.out.println("Daftar Minuman : ");
            System.out.println("1." + List[0] + " : 5.000");
            System.out.println("2." + List[1] + " : 4.000");
            System.out.println("3." + List[2] + " : 3.000");
            System.out.println("4." + List[3] + " : 6.000");
            System.out.println("5." + List[4] + " : 20.000");
            System.out.println();
            System.out.println("------------------");
            System.out.println("Pilih Minuman : ");
            int choice1 = 0;
            System.out.println();
            while (!input.hasNextInt()) {
                System.out.println("Harap Masukan Angka Saja...");
                input.next();
            }
            choice1 = input.nextInt();
            System.out.println("Jumlah Pesanan : ");
            int amount = 0;
            System.out.println("------------------");
            System.out.println();
            while (!input.hasNextInt()) {
                System.out.println("Harap Masukan Angka Saja...");
                input.next();
            }
            amount = input.nextInt();

            int[] results = {
                    price[0] * amount,
                    price[1] * amount,
                    price[2] * amount,
                    price[3] * amount,
                    price[4] * amount};
            DecimalFormat df = new DecimalFormat("#,###");
            String resultsAmount[] = {
                    df.format(results[0]),
                    df.format(results[1]),
                    df.format(results[2]),
                    df.format(results[3]),
                    df.format(results[4]),};

            LocalDate Tanggal = LocalDate.now();
            Date Time = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("H:m:ss");
            String Jam = sdf.format(Time);

            switch (choice1) {
                case 1:
                    System.out.println("-----------------------");
                    System.out.println("Tanggal : " + Tanggal);
                    System.out.println("Jam : " + Jam);
                    System.out.println();
                    System.out.println("Total Belanja Anda : ");
                    System.out.println(amount + " " + List[0] + " = " + "Rp " + resultsAmount[0]);
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("TerimaKasih Datang Kembali");
                    break;
                case 2:
                    System.out.println("-----------------------");
                    System.out.println("Tanggal : " + Tanggal);
                    System.out.println("Jam : " + Jam);
                    System.out.println();
                    System.out.println("Total Belanja Anda : ");
                    System.out.println(amount + " " + List[1] + " = " + "Rp " + resultsAmount[1]);
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("TerimaKasih Datang Kembali");
                    break;
                case 3:
                    System.out.println("-----------------------");
                    System.out.println("Tanggal : " + Tanggal);
                    System.out.println("Jam : " + Jam);
                    System.out.println();
                    System.out.println("Total Belanja Anda : ");
                    System.out.println(amount + " " + List[2] + " = " + "Rp " + resultsAmount[2]);
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("TerimaKasih Datang Kembali");
                    break;
                case 4:
                    System.out.println("-----------------------");
                    System.out.println("Tanggal : " + Tanggal);
                    System.out.println("Jam : " + Jam);
                    System.out.println();
                    System.out.println("Total Belanja Anda : ");
                    System.out.println(amount + " " + List[3] + " = " + "Rp " + resultsAmount[3]);
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("TerimaKasih Datang Kembali");
                    break;
                case 5:
                    System.out.println("-----------------------");
                    System.out.println("Tanggal : " + Tanggal);
                    System.out.println("Jam : " + Jam);
                    System.out.println();
                    System.out.println("Total Belanja Anda : ");
                    System.out.println(amount + " " + List[4] + " = " + "Rp " + resultsAmount[4]);
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("TerimaKasih Datang Kembali");
                    break;
                default:
                    System.out.println("Maaf Menu Belum Tersedia");
            }
        } else if (choice == 2) {
            System.out.println("Daftar Makanan : ");
            System.out.println("1." + List1[0] + " : 10.000");
            System.out.println("2." + List1[1] + " : 11.000");
            System.out.println("3." + List1[2] + " : 9.000");
            System.out.println("4." + List1[3] + " : Gratis");
            System.out.println("5." + List1[4] + " : 5.000");
            System.out.println();

            System.out.println("------------------");
            System.out.println("Pilih Makanan : ");
            int choice1 = 0;
            System.out.println();
            while (!input.hasNextInt()) {
                System.out.println("Harap Masukan Angka Saja...");
                input.next();
            }
            choice1 = input.nextInt();
            System.out.println("Jumlah Pesanan : ");
            int amount = 0;
            while (!input.hasNextInt()) {
                System.out.println("Harap Masukan Angka Saja...");
                input.next();
            }
            amount = input.nextInt();
            System.out.println("------------------");
            System.out.println();

            int[] results = {
                    price1[0] * amount,
                    price1[1] * amount,
                    price1[2] * amount,
                    price1[3] * amount,
                    price1[4] * amount};
            DecimalFormat df = new DecimalFormat("#,###");
            String resultsAmount[] = {
                    df.format(results[0]),
                    df.format(results[1]),
                    df.format(results[2]),
                    df.format(results[3]),
                    df.format(results[4]),};

            LocalDate Tanggal = LocalDate.now();
            Date Time = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("H:m:ss");
            String Jam = sdf.format(Time);

            switch (choice1) {
                case 1:
                    System.out.println("-----------------------");
                    System.out.println("Tanggal : " + Tanggal);
                    System.out.println("Jam : " + Jam);
                    System.out.println();
                    System.out.println("Total Belanja Anda : ");
                    System.out.println(amount + " " + List1[0] + " = " + "Rp " + resultsAmount[0]);
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("TerimaKasih Datang Kembali");
                    break;
                case 2:
                    System.out.println("-----------------------");
                    System.out.println("Tanggal : " + Tanggal);
                    System.out.println("Jam : " + Jam);
                    System.out.println();
                    System.out.println("Total Belanja Anda : ");
                    System.out.println(amount + " " + List1[1] + " = " + "Rp " + resultsAmount[1]);
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("TerimaKasih Datang Kembali");
                    break;
                case 3:
                    System.out.println("-----------------------");
                    System.out.println("Tanggal : " + Tanggal);
                    System.out.println("Jam : " + Jam);
                    System.out.println();
                    System.out.println("Total Belanja Anda : ");
                    System.out.println(amount + " " + List1[2] + " = " + "Rp " + resultsAmount[2]);
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("TerimaKasih Datang Kembali");
                    break;
                case 4:
                    System.out.println("-----------------------");
                    System.out.println("Tanggal : " + Tanggal);
                    System.out.println("Jam : " + Jam);
                    System.out.println();
                    System.out.println("Total Belanja Anda : ");
                    System.out.println(amount + " " + List1[3] + " = " + "Rp " + resultsAmount[3]);
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("TerimaKasih Datang Kembali");
                    break;
                case 5:
                    System.out.println("-----------------------");
                    System.out.println("Tanggal : " + Tanggal);
                    System.out.println("Jam : " + Jam);
                    System.out.println();
                    System.out.println("Total Belanja Anda : ");
                    System.out.println(amount + " " + List1[4] + " = " + "Rp " + resultsAmount[4]);
                    System.out.println("-----------------------");
                    System.out.println();
                    System.out.println("TerimaKasih Datang Kembali");
                    break;
                default:
                    System.out.println("Maaf Menu Belum Tersedia");
            }
        } else {
            System.out.print("Maaf Menu Belum Tersedia");
            System.out.println();
        }
        input.close();
    }
}