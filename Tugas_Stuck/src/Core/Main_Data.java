//DATABASE

package Core;

import java.io.*;
import java.util.*;

public class Main_Data {
    Properties data = new Properties();

    void saveData(Main_App data) {
        try {
            this.data.put("Data", data.buildSave.toString());

            this.data.store(new FileOutputStream("src/Core/Data/Main_Data.properties"), "DATA");
        } catch (FileNotFoundException e) {
            System.out.println("FILE TIDAK DITEMUKAN!!!");
        } catch (IOException e) {
            System.out.println("FILE GAGAL DIBUAT!!!");
        }
    }

    void loadData(Main_App data) {
        try {
            this.data.load(new FileInputStream("src/Core/Data/Main_Data.properties"));

            String[] load = this.data.getProperty("Data").split(". ");
            if (this.data.getProperty("Data").isEmpty()) {
                //DATA KOSONG UNTUK MENGATATASI BUG NOMOR
            } else {
                for (String addLoad : load) {
                    data.buildItem.add(addLoad);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE TIDAK DITEMUKAN!!!");
        } catch (IOException e) {
            System.out.println("FILE GAGAL MEMUAT!!!");
        }
    }
}
