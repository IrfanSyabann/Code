import java.util.*;

public class SearchItem_V1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> List = new ArrayList<>();

        boolean value = true;

        while (value) {

            try {
                //Shelter
                int length = List.size();
                int[] number = new int[0];

                for (int a = 1; a <= length; a++) {
                    number = new int[a];
                }

                //Start Program
                System.out.println("1.Add Item");
                System.out.println("2.Remove Item");
                System.out.println("3.List Item");
                System.out.println("0.EXIT");

                int choice = input.nextInt();

                //Decision Maker
                switch (choice) {
                    case 1 -> {
                        System.out.print("Input Your Item : ");
                        String add = input.next();
                        List.add(add);
                        System.out.println();
                        System.out.println("=============================================");
                        System.out.println("You Item Has Been Successfully Added");
                        System.out.println("=============================================");
                        System.out.println();
                    }

                    case 2 -> {
                        System.out.println();
                        System.out.println("=============================================");
                        System.out.print("Select The Items You Want To Delete \n");
                        System.out.println("=============================================");
                        System.out.println("LIST : ");

                        for (int b = 0; b < number.length; b++) {
                            number[b] = (b) + 1;
                        }

                        for (int c : number) {
                            System.out.println(c + "." + List.get(c - 1));
                        }
                        System.out.println("=============================================");
                        System.out.print("Delete : ");
                        boolean consideration = false;
                        do {
                            try {

                                int remove = input.nextInt();
                                remove = remove - 1;
                                List.remove(remove);
                                consideration = true;

                                System.out.println("=============================================");
                                System.out.println("Your Item Already Delete");
                                System.out.println("=============================================");
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("=============================================");
                                System.out.println("Add Item First!!!");
                                System.out.println("=============================================");
                                consideration = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Input Only Number!!!");
                                input.next();
                            }
                        } while (!consideration);
                    }

                    case 3 -> {

                        for (int b = 0; b < number.length; b++) {
                            number[b] = (b) + 1;
                        }

                        System.out.println("=============================================");
                        System.out.println("LIST : ");
                        for (int c : number) {
                            System.out.println(c + "." + List.get(c - 1));
                        }
                        System.out.println("=============================================");

                    }

                    case 0 -> value = false;

                    default -> {
                        System.out.println();
                        System.out.println("=============================================");
                        System.out.println("Masukan Sesuai Format!!!");
                        System.out.println("=============================================");
                        System.out.println();
                    }
                }

            }catch (InputMismatchException e){
                System.out.println();
                System.out.println("=============================================");
                System.out.println("Input Only Number!!!");
                System.out.println("=============================================");
                System.out.println();
                input.next();
            }

        }
        input.close();
    }
}
