import java.util.*;

public class SearchItem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean value = true;
        String[] jumlah = new String[0];
        int i = 0;

        while (value) {
            System.out.println("1.Masukan Item");
            System.out.println("2.List Item");
            System.out.println("3.Search Item");
            System.out.println("0.EXIT");

            if (input.hasNextInt()) {
                int masukan = input.nextInt();
                System.out.println();

                switch (masukan) {
                    case 1:
                        System.out.println("Data Hanya Bisa Di Masukan Sekali : (Lanjut/Tidak)");

                        if (input.hasNextLine()) {
                            String pilihan = input.next();

                            if (pilihan.equalsIgnoreCase("Lanjut")) {
                                System.out.print("\nMasukan Jumlah Item Anda : \n");

                                if (input.hasNextInt()) {
                                    int item = input.nextInt();
                                    jumlah = new String[item];
                                    System.out.println();

                                    for (i = 0; i < jumlah.length; i++) {
                                        System.out.print((i + 1) + ".");
                                        jumlah[i] = input.next();
                                    }
                                    System.out.println("\nItem Telah Di Tambahkan\n");
                                } else {
                                    operator();
                                }
                                break;

                            } else if (pilihan.equalsIgnoreCase("Tidak")) {
                                System.out.println();
                            } else {
                                operator();
                                ;
                            }
                        }
                        break;

                    case 2:
                        int number = 1;
                        System.out.println("===========================================");
                        System.out.println("LIST ITEM : ");
                        for (String values : jumlah) {
                            System.out.println(number + "." + values);
                            number++;
                        }

                        System.out.println("===========================================");
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Pilih Item Yang Ingin Anda Cari :");
                        String[] jumlahTotal = jumlah;
                        String search = input.next();
                        int counter = -1;

                        for (int cari = 0; cari < jumlahTotal.length; cari++) {
                            if (jumlahTotal[cari].equals(search)) {
                                counter = cari;
                            }
                        }

                        if (counter >= 0) {
                            System.out.println("===========================================");
                            System.out.println("Data Anda Berada Di Posisi : " + (counter + 1));
                            System.out.println("===========================================");
                        } else {
                            System.out.println("===========================================");
                            System.out.println("Data Anda Tidak Terdaftar");
                            System.out.println("===========================================");
                        }
                        break;

                    case 0:
                        value = false;
                        input.close();
                        break;
                    default:
                        operator();
                }
            } else {
                operator();
                input.next();
            }
        }
    }

    static void operator() {
        System.out.println();
        System.out.println("===========================================");
        System.out.println("Masukan Sesuai Opsi !!!");
        System.out.println("===========================================");
    }

}