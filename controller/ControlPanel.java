package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Obat;
import model.DetailBeli;
import model.Kuisioner;
import model.Pembeli;
import model.Pembelian;
import model.Pembayaran;

public class ControlPanel {
    HashMap<String, Obat> obats = new HashMap<>();
    HashMap<String, Kuisioner> quiz = new HashMap<>();
    HashMap<String, String> answer = new HashMap<>();
    ArrayList<Pembelian> pembelians = new ArrayList<>();
    
    // Deklarasi list obat
    public void setItem() {
        // Deklarasi Objek Obat
        Obat obat1 = new Obat();
        Obat obat2 = new Obat();
        Obat obat3 = new Obat();
        Obat obat4 = new Obat();
        Obat obat5 = new Obat();
        Obat obat6 = new Obat();
        Obat obat7 = new Obat();
        Obat obat8 = new Obat();

        obat1.setIdObat("01")
                .setNamaObat("Parasetamol")
                .setHargaObat(6000)
                .setDescObat("meredakan demam dan nyeri tubuh")
                .setStok(100);
        obat2.setIdObat("02")
                .setNamaObat("Amoxilin")
                .setHargaObat(4000)
                .setDescObat("antibiotik")
                .setStok(100);
        obat3.setIdObat("03")
                .setNamaObat("Flutamol")
                .setHargaObat(5000)
                .setDescObat("meringankan gejala flu")
                .setStok(100);
        obat4.setIdObat("04")
                .setNamaObat("Antasid")
                .setHargaObat(6000)
                .setDescObat("meredakan gejala dari refluks asam lambung dan tukak lambung")
                .setStok(100);
        obat5.setIdObat("05")
                .setNamaObat("DexteemPlus")
                .setHargaObat(3000)
                .setDescObat("mengobati alergi dan inflamasi")
                .setStok(100);
        obat6.setIdObat("06")
                .setNamaObat("Vitamin")
                .setHargaObat(4000)
                .setDescObat("membantu tubuh bekerja secara efektif")
                .setStok(100);
        obat7.setIdObat("07")
                .setNamaObat("OBH")
                .setHargaObat(10000)
                .setDescObat("meredakan batuk berdahak")
                .setStok(100);
        obat8.setIdObat("08")
                .setNamaObat("Ranitidine")
                .setHargaObat(6000)
                .setDescObat("mengobati gejala yang berkaitan dengan produksi asam lambung berlebih")
                .setStok(100);

                // menyimpan data obat
                obats.put(obat1.getIdObat(), obat1);
                obats.put(obat2.getIdObat(), obat2);
                obats.put(obat3.getIdObat(), obat3);
                obats.put(obat4.getIdObat(), obat4);
                obats.put(obat5.getIdObat(), obat5);
                obats.put(obat6.getIdObat(), obat6);
                obats.put(obat7.getIdObat(), obat7);
                obats.put(obat8.getIdObat(), obat8);
    }

    public Obat getObat(String idObat) {
        return obats.get(idObat);
    }

    public void tampilkanDaftarObat() {
        System.out.println();
        System.out.println("======= Daftar Obat ======");
        for (Map.Entry<String, Obat> obat : obats.entrySet()) {
            String key = obat.getKey();
            Obat tObat = obat.getValue();
            if (tObat.getStok() > 0) {
                System.out.println("Kode Obat \t :" + key);
                System.out.println("Nama \t\t :" + tObat.getNamaObat());
                System.out.println("Harga \t\t :" + tObat.getHargaObat());
                System.out.println();
            } else {
                System.out.println("Obat " + tObat.getNamaObat() + "Tidak Tersedia");
            }
            System.out.println(" ");
        }
    }
    
    //login akun
    public static void setUser() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String masuk = "";
        Pembeli user = new Pembeli();
        do {
            System.out.println("===========================================");
            System.out.println("      Selamat Datang Di Klinik GenMed      ");
            System.out.println("          Generik Medical Clinic           ");
            System.out.println("===========================================");
            System.out.println("                                           ");
            System.out.println("Sebelum Masuk Silahkan Lengkapi");
            System.out.println("Data diri berikut ");
            System.out.print("Nama \t:");
            String namaUser = input.readLine();
            System.out.print("Email \t:");
            String emailUser = input.readLine();
            System.out.println("===========================================");
            System.out.print("Submit Y/N?\t:");
            masuk = input.readLine();

            if(masuk.equalsIgnoreCase("Y")){
            user.setNama(namaUser);
            user.setEmail(emailUser);
            }
        } while (!masuk.equalsIgnoreCase("Y"));
    }

    //pertanyaan
    public void setKuisioner() {
        Kuisioner test1 = new Kuisioner();
        Kuisioner test2 = new Kuisioner();
        Kuisioner test3 = new Kuisioner();
        Kuisioner test4 = new Kuisioner();
        Kuisioner test5 = new Kuisioner();
        Kuisioner test6 = new Kuisioner();
        Kuisioner test7 = new Kuisioner();
        Kuisioner test8 = new Kuisioner();

        test1.setNomorPertanyaan("01").setPertanyaan("1. Apakah Anda Merasa Mual ?");
        test2.setNomorPertanyaan("02").setPertanyaan("2. Apakah Anda Merasa Pusing ?");
        test3.setNomorPertanyaan("03").setPertanyaan("3. Apa Tenggorokan Anda  Gatal ?");
        test4.setNomorPertanyaan("04").setPertanyaan("4. Apa Hidung Anda Tersumbat ?");
        test5.setNomorPertanyaan("05").setPertanyaan("5. Anda Sedang Batuk ?");
        test6.setNomorPertanyaan("06").setPertanyaan("6. Apa Perut Anda Sakit ?");
        test7.setNomorPertanyaan("07").setPertanyaan("7. Anda Muntah-Muntah ?");
        test8.setNomorPertanyaan("08").setPertanyaan("8. Apa Anda Merasa Tubuh Anda Lemas ?");

        quiz.put(test1.getNomorPertanyaan(), test1);
        quiz.put(test2.getNomorPertanyaan(), test2);
        quiz.put(test3.getNomorPertanyaan(), test3);
        quiz.put(test4.getNomorPertanyaan(), test4);
        quiz.put(test5.getNomorPertanyaan(), test5);
        quiz.put(test6.getNomorPertanyaan(), test6);
        quiz.put(test7.getNomorPertanyaan(), test7);
        quiz.put(test8.getNomorPertanyaan(), test8);
    }
    
    public void mulaiKuisioner() throws IOException {
        System.out.println("Number of medicines: " + obats.size());
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("======== Konsultasi Kesehatan ========");
        System.out.println("Konsultasi Kesehatan bertujuan untuk \n"
        +  "mengetahui penyakit dan rekomendasi obat\n"
        +  "dari kami :)");
        System.out.println("Mari mulai... Y/N");
        String lanjut = input.readLine();
        String lanjutt = "";
        Pembeli responden = new Pembeli();
        if(lanjut.equalsIgnoreCase("Y")){
            do{           
                System.out.println("Sebelum masuk ke kuiz silahkan isi ");
                System.out.print("Nama \t \t :");
                String namaResponden = input.readLine();
                System.out.print("Usia \t \t :");
                int usiaResponden = Integer.valueOf(input.readLine());       
                System.out.print("Suhu \t \t :");
                int suhuResponden = Integer.valueOf(input.readLine());
                System.out.print("Berat Badan \t :");
                int beratResponden = Integer.valueOf(input.readLine());
                System.out.print("Submit Y/N ?");
                lanjutt = input.readLine();

                
            if(lanjutt == "Y"){
                responden.setNama(namaResponden);
                responden.setUsia(usiaResponden);
                responden.setSuhu(suhuResponden);
                responden.setBeratBadan(beratResponden);
                }    
            }while(lanjutt == "Y");

            System.out.println(" ");
            System.out.println("Jawab Pertanyaan-pertanyaan Berikut Dengan Ya/Tidak.");
           
            for (Map.Entry<String, Kuisioner> soal : quiz.entrySet()) {
                String key = soal.getKey();
                Kuisioner tSoal = soal.getValue();
                String jawab = " ";
                do{
                    System.out.println(tSoal.getPertanyaan());
                    System.out.print("Jawab : ");
                    jawab = input.readLine();

                    answer.put(key, jawab);
                }while(jawab.equalsIgnoreCase("ya")||jawab.equalsIgnoreCase("tidak"));
            }        
        }
    }

    public void checkValue(){
        for (Map.Entry<String, String> jawab : answer.entrySet()) {
        System.out.println(jawab.getKey()+" : "+ jawab.getValue());
    }
    }
    public void recommendasiObat(HashMap<String, String> jawaban){
            boolean pilek = jawaban.get("03").equalsIgnoreCase("ya"); // Contoh: Pertanyaan "Apakah Tenggorokan Anda Gatal ?"
            boolean batuk = jawaban.get("05").equalsIgnoreCase("ya"); // Contoh: Pertanyaan "Anda Sedang Batuk ?"
            boolean demam = jawaban.get("02").equalsIgnoreCase("ya");
            boolean maag = jawaban.get("06").equalsIgnoreCase("ya");
        
            if (pilek && batuk) {
                // Rekomendasi obat untuk pilek dan batuk
                System.out.println("Rekomendasi: Anda mungkin memerlukan obat untuk pilek dan batuk. Segera berkonsultasi dengan dokter.");
            } else if (pilek) {
                // Rekomendasi obat untuk pilek
                System.out.println("Rekomendasi: Anda mungkin memerlukan obat untuk pilek. Pastikan istirahat yang cukup dan minum air putih.");
            } else if (batuk) {
                // Rekomendasi obat untuk batuk
                System.out.println("Rekomendasi: Anda mungkin memerlukan obat untuk batuk. Pastikan istirahat yang cukup dan minum air hangat.");
            } else {
                // Rekomendasi jika tidak ada gejala yang cocok
                System.out.println("Tidak ada rekomendasi obat berdasarkan jawaban Anda.");
            }
        
        
    }

    public void beliObat() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DetailBeli> tDetailBelis = new ArrayList<>();
        String namaUsers = user.getNama();
        String emailUsers = user.getEmail();
        int temp = 0;
        String lanjut = "";
        try {
            do {
                temp++;
                System.out.println();
                System.out.print("Silahkan masukkan kode obat\t: ");
                String idObat = input.readLine();
                System.out.print("Jumlah yang akan dibeli\t: ");
                int jumlah = Integer.valueOf(input.readLine());
                System.out.print("Kembali berbelanja (Y/N)?\t: ");
                lanjut = input.readLine();

                DetailBeli db = new DetailBeli();
                Obat tObat = getObat(idObat);
                db.setIdDetailBeli("db" + temp);
                db.setObat(tObat);
                db.setHargaObat(tObat.getHargaObat());
                db.setJumlahObat(jumlah);
                db.setTotalHarga(tObat.getHargaObat() * jumlah);
                tDetailBelis.add(db);

            } while (lanjut.equalsIgnoreCase("Y"));

            Pembelian pembelian = new Pembelian();
            pembelian.setDetailBelis(tDetailBelis);
            pembelian.setTotal(totalPembelian(tDetailBelis)); // Perhitungan total belanja
            pembelians.add(pembelian);
            System.out.println("");
            System.out.println("===Berikut Daftar Belanjaan Anda===");
            tampilkanDaftarPembelianObat(tDetailBelis);
            System.out.println("TOTAL: " + TotalPembelian(tDetailBelis));
            System.out.println("Konfirmasi pembelian (Y/N)?");
            String konfirm = "n";
            konfirm = input.readLine();
            if (konfirm.equalsIgnoreCase("y")) {
                DetailBeli detailBeli = new DetailBeli();
                detailBeli.setDetailBelis(tDetailBelis)
                        .setIdBeliDetailBeli("P" + tDetailBelis.size() + 1)
                        .setNama(getNama(user.getNama))
                        .setTanggal(LocalDate.now())
                        .setTotal(hitungTotalBelanja(tDetailBelis));
                tDetailBelis.add(detailBeli);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tampilkanDaftarPembelianObat(ArrayList<DetailBeli> db){
        System.out.println("===================================");
        for( DetailBeli detailBeli : db){
            System.out.println("Nama Obat \t : "+detailBeli.getObat().getNamaObat());
            System.out.println("Harga \t : "+detailBeli.getHargaObat());
            System.out.println("Jumlah \t : "+detailBeli.getJumlahObat());
            System.out.println(" ");
        }
    }

    public int TotalPembelian(ArrayList<DetailBeli> db){
        int totalBeli = 0;
        for (DetailBeli detailBeli : db){
            totalBeli += detailBeli.getTotalHarga();
        }
        return totalBeli;
    }

    public void laporanPembelian(){
        for(Pembelian pembelian : pembelians){
            System.out.println(" ");
            System.out.println("=====================================");
            System.out.println("            Klinik GenMed            ");
            System.out.println("        Generic Medical Clinic       ");
            System.out.println("=====================================");
            System.out.println("           Struk Pembelian           ");
            System.out.println("Kode Transaksi :" + db.getIdDetailBeli);
            System.out.println("Tanggal Pembelian : "+ pembelian.getTanggal());
            System.out.println("                                     ");
            System.out.println(" Pembeli\t : " +user.getNama());
            System.out.println("Email \t:"+ user.getEmail());
            System.out.println("=====================================");
            ArrayList<DetailBeli> detailBelis = pembelian.getDetailBelis();
            for (DetailBeli db : detailBelis){
                System.out.println("Nama Obat \t: "+ db.getObat().getNamaObat());
                System.out.println("Quantity \t: "+ db.getJumlahObat());
                System.out.println("Total \t: "+ db.getTotalHarga());
            }
            System.out.println("=====================================");
            System.out.println("Total Harga \t \t : "+pembelian.getTotal());            
        }
    }
}
