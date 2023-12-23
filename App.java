import java.io.BufferedReader;
import java.io.InputStreamReader; // untuk membaca  input pada program saat di panggil 

import controller.ControlPanel;

public class App {
  
    public static void main(String[] args) throws Exception {
        ControlPanel controlKlinik = new ControlPanel();
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
                    controlKlinik.beliObat();
                    break;
                case "3": 
                    controlKlinik.tampilkanLaporan();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }

        System.out.println("Sampai Jumpa");
        System.out.println("Semoga Lekas Sembuh dan Terimakasih :)");
    }

    public static void tampilkanMenu() {
        System.out.println("+============================================+");
        System.out.println("| Pilih menu sesuai dengan kebutuhan anda!   |");
        System.out.println("+============================================+");
        System.out.println("| 1. Konsultasi                              |");
        System.out.println("|2. Beli Obat                                |");
        System.out.println("| 3. Laporan Penjualan                       |");
        System.out.println("| 4. Keluar                                  |");
        System.out.println("+============================================+");
    }
}
 
