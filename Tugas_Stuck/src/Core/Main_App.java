//TEMPAT MAIN CODE

package Core;

import java.util.*;

public class Main_App {
    //VARIABLE-VARIABLE CODE
    Scanner input = new Scanner(System.in);
    Main_Data data = new Main_Data();
    Stack<String> buildItem = new Stack();
    Stack<String> indexDelete = new Stack();
    Stack<String> dataDelete = new Stack();
    Stack<String> redoIndex = new Stack();
    Stack<String> redoData = new Stack();

    StringBuilder buildSave = new StringBuilder();


    String validationSpace;
    int numberDelete, numberEdit;

    //CONSTRUCTOR
    public Main_App() {
        boolean loopMain = true;

        System.out.println("==================================================================");
        while (loopMain) {
            try {
                screen();
                System.out.println("==================================================================");
                System.out.println("PILIH : ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1 -> add();
                    case 2 -> delete();
                    case 3 -> edit();
                    case 4 -> undo();
                    case 5 -> redo();
                    case 6 -> showData();
                    case 0 -> {
                        input.close();
                        loopMain = false;
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("EXIT!!!");
                        System.out.println("----------------------------------------------------------------");
                    }
                    default -> {
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("PILIHAN TIDAK TERDAFTAR!!!");
                        System.out.println("----------------------------------------------------------------");
                    }
                }
                System.out.println("==================================================================");
            } catch (InputMismatchException e) {
                numberEdit = 0;
                buildItem.removeAll(buildItem);

                System.out.println("----------------------------------------------------------------");
                System.out.println("MASUKAN ANGKA SAJA!!!");
                System.out.println("----------------------------------------------------------------");
                System.out.println("==================================================================");

                input.next();
            }
        }
    }

    //MENU DATA
    void screen() {
        System.out.println("1.Tambahkan Data");
        System.out.println("2.Hapus Data");
        System.out.println("3.Edit Data");
        System.out.println("4.Undo");
        System.out.println("5.Redo");
        System.out.println("6.Tampilkan Data");
        System.out.println("0.Keluar");
    }

    //MENAMBAHKAN DATA
    void add() {
        data.loadData(this);

        System.out.println("==================================================================");
        System.out.println("TAMBAHKAN DATA");
        System.out.println("==================================================================");
        System.out.println("1.ACCEPT");
        System.out.println("0.BACK");
        System.out.println("==================================================================");

        while (true) {
            System.out.print("TAMBAHKAN : ");
            String item = input.next();
            buildItem.add(item);

            System.out.println("----------------------------------------------------------------");
            System.out.println("Success Input Data!!!");
            System.out.println("----------------------------------------------------------------");

            if (item.equals("1")) {
                try {
                    buildItem.remove(buildItem.size() - 1);
                    for (String save : buildItem) {
                        buildSave.append(save + ". ");
                    }
                    buildItem.removeAll(buildItem);
                    data.saveData(this);
                    buildSave.delete(0, buildSave.length());
                    screen();

                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Data Save!!!");
                    System.out.println("----------------------------------------------------------------");

                    break;
                } catch (StringIndexOutOfBoundsException e) {
                    screen();

                    System.out.println("----------------------------------------------------------------");
                    System.out.println("DATA YANG DIMASUKAN KOSONG!!!");
                    System.out.println("----------------------------------------------------------------");

                    break;
                }

            } else if (item.equals("0")) {
                buildItem.removeAll(buildItem);
                screen();

                System.out.println("----------------------------------------------------------------");
                System.out.println("Data Not Save!!!");
                System.out.println("----------------------------------------------------------------");

                break;
            }
        }
    }

    //MENGHAPUS DATA
    void delete() {
        numberDelete = 0;
        buildItem.removeAll(buildItem);
        data.loadData(this);

        System.out.println("==================================================================");
        System.out.println("HAPUS DATA");
        while (true) {
            System.out.println("==================================================================");
            System.out.println("LIST ITEM YANG INGIN DI HAPUS : ");

            for (String showDelete : buildItem) {
                numberDelete += 1;
                System.out.println(numberDelete + "." + showDelete);
            }

            System.out.println("==================================================================");
            System.out.println("Y = YES");
            System.out.println("N = NO");
            System.out.println("==================================================================");


            System.out.print("DELETE (MASUKAN NOMOR DATA) : ");
            String delete = input.next();

            if (delete.equals("Y")) {
                for (String save : buildItem) {
                    buildSave.append(save + ". ");
                }
                buildItem.removeAll(buildItem);
                numberDelete = 0;
                data.saveData(this);
                buildSave.delete(0, buildSave.length());
                screen();

                System.out.println("----------------------------------------------------------------");
                System.out.println("Data Save!!!");
                System.out.println("----------------------------------------------------------------");

                break;
            } else if (delete.equals("N")) {
                indexDelete.removeAll(indexDelete);
                dataDelete.removeAll(dataDelete);
                buildItem.removeAll(buildItem);

                numberDelete = 0;
                screen();

                System.out.println("----------------------------------------------------------------");
                System.out.println("Data Not Save!!!");
                System.out.println("----------------------------------------------------------------");

                break;
            } else {
                try {
                    Integer remove = Integer.parseInt(delete);
                    indexDelete.add(remove.toString());
                    dataDelete.add(buildItem.remove(remove - 1));

                    numberDelete = 0;

                    System.out.println("----------------------------------------------------------------");
                    System.out.println("BERHASIL MENGHAPUS DATA!!!");
                    System.out.println("----------------------------------------------------------------");
                } catch (NumberFormatException e) {
                    numberDelete = 0;

                    System.out.println("----------------------------------------------------------------");
                    System.out.println("PILIHAN TIDAK TERDAFTAR!!!");
                    System.out.println("----------------------------------------------------------------");
                } catch (ArrayIndexOutOfBoundsException e) {
                    numberDelete = 0;

                    System.out.println("----------------------------------------------------------------");
                    System.out.println("DATA TIDAK DITEMUKAN!!!");
                    System.out.println("----------------------------------------------------------------");
                }
            }
        }
    }

    //MENGEDIT DATA
    void edit() {
        data.loadData(this);

        System.out.println("==================================================================");
        System.out.println("EDIT DATA");
        System.out.println("==================================================================");
        System.out.println("Y = YES");
        System.out.println("N = NO");

        while (true) {
            System.out.println("==================================================================");
            System.out.println("LIST DATA : ");

            for (String showEdit : buildItem) {
                numberEdit += 1;
                System.out.println(numberEdit + "." + showEdit);
            }
            System.out.println("==================================================================");


            System.out.print("EDIT (MASUKAN NOMOR YANG INGIN DI EDIT) : ");
            String indexEdit = input.next();
            validationSpace = indexEdit;
            validationSpace = input.nextLine();

            if (indexEdit.equals("Y")) {

                for (String edit : buildItem) {

                    numberEdit += 1;
                    buildSave.append(edit + ". ");
                }
                data.saveData(this);
                numberEdit = 0;
                buildItem.removeAll(buildItem);

                System.out.println("----------------------------------------------------------------");
                System.out.println("Data Save!!!");
                System.out.println("----------------------------------------------------------------");

                break;
            } else if (indexEdit.equals("N")) {
                buildItem.removeAll(buildItem);
                numberEdit = 0;
                screen();

                System.out.println("----------------------------------------------------------------");
                System.out.println("Data Not Save!!!");
                System.out.println("----------------------------------------------------------------");

                break;
            } else {
                if (validationSpace.contains(" ")) {
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("JANGAN MASUKAN SPASI KEDALAM DATA!!!");
                    System.out.println("----------------------------------------------------------------");
                    numberEdit = 0;
                } else {
                    try {
                        Integer editIndex = Integer.parseInt(indexEdit);

                        if (editIndex > buildItem.size()) {
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("DATA TIDAK DITEMUKAN!!!");
                            System.out.println("----------------------------------------------------------------");
                        } else {
                            System.out.print("EDIT (MASUKAN DATA YANG ANDA INGINKAN) : ");

                            String dataEdit = input.next();
                            validationSpace = dataEdit;
                            validationSpace = input.nextLine();
                            if (validationSpace.contains(" ")) {
                                System.out.println("----------------------------------------------------------------");
                                System.out.println("JANGAN MASUKAN SPASI KEDALAM DATA!!!");
                                System.out.println("----------------------------------------------------------------");
                                numberEdit = 0;
                            } else {
                                buildItem.set(editIndex - 1, dataEdit);
                                buildSave.delete(0, buildSave.length());
                                numberEdit = 0;

                                System.out.println("----------------------------------------------------------------");
                                System.out.println("DATA BERHASIL DIEDIT!!!");
                                System.out.println("----------------------------------------------------------------");
                            }
                        }
                    } catch (NumberFormatException e) {
                        numberEdit = 0;

                        System.out.println("----------------------------------------------------------------");
                        System.out.println("MASUKAN ANGKA SAJA!!!");
                        System.out.println("----------------------------------------------------------------");
                    }

                }
            }
        }
    }

    //UNDO DATA
    void undo() {
        data.loadData(this);
        int prep = 0;
        int finalValue = 0;
        Collections.reverse(dataDelete);
        Collections.reverse(indexDelete);

        if (!indexDelete.isEmpty() && !dataDelete.isEmpty()) {

            for (String indexValue : indexDelete) {
                Integer initialIndex = Integer.parseInt(indexValue);
                finalValue += 1;

                try {
                    String undoValue = dataDelete.get(prep);
                    prep += 1;

                    Integer finalIndex = Integer.parseInt(indexDelete.get(finalValue));

                    if (initialIndex == finalIndex) {
                        initialIndex -= 1;

                        for (int j = finalValue; j < buildItem.size(); j++) {
                            indexDelete.set(j, finalIndex.toString());
                        }
                        System.out.println("BERHASIL MENGUNDO DATA!!!");

                        buildItem.add(initialIndex, undoValue);
                    } else {
                        initialIndex -= 1;
                        System.out.println(initialIndex);

                        buildItem.add(initialIndex, undoValue);

                        System.out.println("BERHASIL MENGUNDO DATA!!!");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    int removeUndo = (buildItem.size() - (buildItem.size() - 1));
                    buildItem.add(initialIndex, dataDelete.get(dataDelete.size() - 1));
                }
            }

            for (String undo : buildItem) {
                buildSave.append(undo + ". ");
            }
            data.saveData(this);
            buildSave.delete(0, buildSave.length());
            buildItem.removeAll(buildItem);
            redoIndex.addAll(indexDelete);
            redoData.addAll(dataDelete);
            indexDelete.removeAll(indexDelete);
            dataDelete.removeAll(dataDelete);
        } else {
            System.out.println("----------------------------------------------------------------");
            System.out.println("TIDAK ADA DATA YANG BISA DIUNDO!!!");
            System.out.println("----------------------------------------------------------------");
        }
    }

    //REDO DATA
    void redo() {
        if (!redoIndex.isEmpty() && !redoData.isEmpty()) {
            for (int k = 0; k < redoIndex.size(); k++) {
                buildItem.pop();
            }
            indexDelete.addAll(redoIndex);
            dataDelete.addAll(redoData);
            redoIndex.removeAll(redoIndex);
            redoData.removeAll(redoData);

            for (String redo : buildItem) {
                buildSave.append(redo + ". ");
            }
            data.saveData(this);
            buildSave.delete(0, buildSave.length());

            System.out.println("----------------------------------------------------------------");
            System.out.println("DATA BERHASIL DIUNDO!!!");
            System.out.println("----------------------------------------------------------------");
        } else {
            System.out.println("----------------------------------------------------------------");
            System.out.println("TIDAK ADA DATA YANG BISA DIREDO!!!");
            System.out.println("----------------------------------------------------------------");
        }
    }

    //SHOW DATA
    void showData() {
        buildItem.removeAll(buildItem);
        data.loadData(this);
        int numberShow = 0;

        System.out.println("==================================================================");
        System.out.println("SHOW DATA : ");
        for (String show : buildItem) {
            numberShow += 1;
            System.out.println(numberShow + "." + show);
        }
    }
}
