import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ResourceBundle.Control;

import controller.ControlPanel;
import model.Obat;
import model.Pembeli;

public class App {
   
    public static void main(String[] args) throws Exception {
        ControlPanel controlKlinik = new ControlPanel();
        controlKlinik.checkValue();
        controlKlinik.setItem(); // Panggil setItem dari objek controlKlinik
        controlKlinik.setKuisioner(); //      
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        controlKlinik.setUser(); // Panggil setUser dari objek controlKlinik
        while (lanjut) {
            tampilkanMenu();
            System.out.print("Pilih menu:");
            String pilihan = reader.readLine();
            switch (pilihan) {
                case "1":
                    controlKlinik.mulaiKuisioner();
                    break;
                case "2": 
                    controlKlinik.tampilkanDaftarObat();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }

        System.out.println("Sampai Jumpa");
    }

    public static void tampilkanMenu() {
        System.out.println("1. Konsultasi");
        System.out.println("2. Daftar obat");
        System.out.println("3. Laporan Penjualan");
        System.out.println("4. Keluar");
    }
}
