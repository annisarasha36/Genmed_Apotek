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

public class ControlPanel {
    // Inisialisasi class HashMap dan Arraylist
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

        // Input Object value
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

        // menyimpan Object obat
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

    // Menampilkan Daftar Object Obat
    public void tampilkanDaftarObat() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("+=================================================================+");
        System.out.println("|                           Daftar Obat                           |");
        System.out.println("+=================================================================+");
        for (Map.Entry<String, Obat> obat : obats.entrySet()) {
            String key = obat.getKey();
            Obat tObat = obat.getValue();
            if (tObat.getStok() > 0) {
                System.out.println("| Kode Obat \t : " + key + "\t \t \t \t \t \t |");
                System.out.println("| Nama \t\t : " + tObat.getNamaObat() + "\t\t \t\t\t|");
                System.out.println("| Harga \t : " + tObat.getHargaObat() + "\t\t \t\t\t \t|");
            } else {
                System.out.println("| Obat " + tObat.getNamaObat() + " Tidak Tersedia.\t\t\t\t |");
            }
            System.out.println("+=================================================================+");
        }
        System.out.print("Beli Obat ? Y/N \t : ");
        String masuk = input.readLine();

        if (masuk.equalsIgnoreCase("Y")) {
            beliObat();
        }
    }

    // login akun
    public void setUser() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String masuk = "";
        Pembeli user = new Pembeli();
        do {
            System.out.println("+=================================================================+");
            System.out.println("|                 Selamat Datang Di Klinik GenMed                 |");
            System.out.println("|                     Generik Medical Clinic                      |");
            System.out.println("+=================================================================+");
            System.out.println("|                                                                 |");
            System.out.println("| Sebelum Masuk Silahkan Lengkapi                                 |");
            System.out.println("| Data diri berikut                                               |");
            System.out.print("| Nama \t \t:");
            String namaUser = input.readLine();
            System.out.print("| Email \t:");
            String emailUser = input.readLine();
            System.out.println("+=================================================================+");
            System.out.print("Submit Y/N?\t: ");
            masuk = input.readLine();

            if (masuk.equalsIgnoreCase("Y")) {
                user.setNama(namaUser);
                user.setEmail(emailUser);
            }
        } while (!masuk.equalsIgnoreCase("Y"));
    }

    // pertanyaan
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
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ");
        System.out.println("+=================================================================+");
        System.out.println("|                       Konsultasi Kesehatan                      |");
        System.out.println("+=================================================================+");
        System.out.println("| Konsultasi Kesehatan bertujuan untuk mendiagnosis penyakit \n     |"
                         + "| memberikan rekomendasi obat dari kami :)                          |");
        System.out.println("Mari mulai... Y/N : ");
        String lanjut = input.readLine();
        System.out.println("");
        String lanjutt = "";
        Pembeli responden = new Pembeli();
        if (lanjut.equalsIgnoreCase("Y")) {
            do {
                System.out.println("+=================================================================+");
                System.out.println("| Sebelum masuk ke kuiz silahkan isi                              |");
                System.out.print("| Nama \t \t : ");
                String namaResponden = input.readLine();
                System.out.print("| Usia \t \t : ");
                int usiaResponden = Integer.valueOf(input.readLine());
                System.out.print("| Suhu Tubuh \t : ");
                int suhuResponden = Integer.valueOf(input.readLine());
                System.out.println("+=================================================================+");
                System.out.print("| Submit Y/N ? ");
                lanjutt = input.readLine();

                if (lanjutt.equalsIgnoreCase("Y")) {
                    responden.setNama(namaResponden);
                    responden.setUsia(usiaResponden);
                    responden.setSuhu(suhuResponden);
                }
            } while (!lanjutt.equalsIgnoreCase("Y"));

            System.out.println(" ");
            System.out.println("Jawab Pertanyaan-pertanyaan Berikut Dengan Ya/Tidak.");
            System.out.println(" ");
            for (Map.Entry<String, Kuisioner> soal : quiz.entrySet()) {
                String key = soal.getKey();
                Kuisioner tSoal = soal.getValue();
                String jawab = " ";
                do {
                    System.out.println(tSoal.getPertanyaan());
                    System.out.print("Jawab : ");
                    jawab = input.readLine();
                    System.out.println(" ");
                    if (jawab.equalsIgnoreCase("ya") || jawab.equalsIgnoreCase("tidak")) {
                        answer.put(key, jawab);
                    }
                } while (!jawab.equalsIgnoreCase("ya") && !jawab.equalsIgnoreCase("tidak"));

            }
            recommendasiObat(responden);
        }
    }

    public void recommendasiObat(Pembeli responden) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String lanjut;
        // Get data dari var responden
        String namaRes = responden.getNama();
        int suhu = responden.getSuhu();
        int usiaRes = responden.getUsia();

        // inisialisasi kondisi
        String status = "";
        String panasTubuh;
        // Spesifikasi Suhu Tubuh
        if (suhu >= 37) {
            panasTubuh = "Panas";
        } else {
            panasTubuh = "Normal";
        }
        // Spesifikasi Usia
        if (usiaRes < 11) {
            status = "Anak-Anak";
        } else if (usiaRes >= 11 && usiaRes <= 18) {
            status = "Remaja";
        } else if (usiaRes > 18) {
            status = "Dewasa";
        } else {
            System.out.println("Makhluk tidak tedifinisi");
        }

        try {
            System.out.println("+=================================================================+");
            System.out.println("| Memproses Hasil...                                              |");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("+=================================================================+");
        System.out.println("|                                                                 |");
        System.out.println("| Terimakasih Karna Sudah Mengisi Kuisioner                       |");
        System.out.println("| Berdasarkan jawaban yang kami terima dari " + namaRes+ "          |");
        System.out.print("| Bahwa ");

        for (Map.Entry<String, String> entry : answer.entrySet()) {
            String nomerSoal = entry.getKey();
            String jawabanRes = entry.getValue();
            if ((nomerSoal.equals("01") || nomerSoal.equals("02") || nomerSoal.equals("03") || nomerSoal.equals("04")
                    || nomerSoal.equals("05") || nomerSoal.equals("06") || nomerSoal.equals("07")
                    || nomerSoal.equals("08")) == jawabanRes.equalsIgnoreCase("ya")) {

                boolean diagnosisDitemukan = true;

                // Diagnosis Demam
                if ((nomerSoal.equals("02") || nomerSoal.equals("07") || nomerSoal.equals("08"))
                        && jawabanRes.equalsIgnoreCase("ya")) {
                    if (panasTubuh.equals("Panas")) {
                        // Tampilkan diagnosis dan rekomendasi obat untuk Demam
                        System.out.println(" Anda Terkena Demam");
                        System.out.println("| Tips Meredakan Demam\n"
                                + "| 1. Perbanyak Minum\n"
                                + "| 2. Istirahat Yang Cukup\n"
                                + "| 3. Kompres Air Dingin\n"
                                + "| 4. Mandi Dengan Air Hangat\n"
                                + "| 5. Meminum Obat Penurun Panas");
                        System.out.println(" ");
                        System.out.println("Berikut Merupakan Rekomendasi Obat Dari Kami : ");
                        if (status.equals("Dewasa") || status.equals("Remaja")) {
                            System.out.println("| 1. Paracetamol 500mg 3x/hari\n"
                                    + "| 2. amoxilin 500mg 3x/hari\n"
                                    + "| 3. vitamin C \n");
                        } else if (status.equals("Anak-Anak")) {
                            System.out.println("| 1. Paracetamol  250mg 3x/hari\n"
                                    + "| 2.  Amoxilin 3x/hari\n"
                                    + "| 3.  Vitamin C\n");
                        }
                    }
                }

                // Diagnosis Flu Batuk
                if ((nomerSoal.equals("02") || nomerSoal.equals("03") || nomerSoal.equals("04")
                        || nomerSoal.equals("05")) && jawabanRes.equalsIgnoreCase("ya")) {
                    System.out.println("Anda Terkena Flu Batuk");
                    System.out.println("Tips Meredakan Flu Batuk\n"
                            + "1. Istirahat yang cukup\n"
                            + "2. Minum obat teratur\n"
                            + "3. jangan minum es\n"
                            + "4. selalu menggunakan pakaian hangat\n");
                    System.out.println(" ");
                    System.out.println("Berikut Merupakan Rekomendasi Obat Dari Kami : ");
                    if (status.equals("Dewasa") || status.equals("Remaja")) {
                        System.out.println("1. Paracetamol 500mg 3x/hari\n"
                                + "2. Flutamol 3x/hari \n"
                                + "3. Vitamin C \n");
                    } else if (status.equals("Anak-Anak")) {
                        System.out.println("1. Paracetamol 250mg 3x/hari\n"
                                + "2. Flutamol 3x/hari  \n"
                                + "3. Vitamin C\n");
                    }
                }

                // Diagnosis Maag
                if ((nomerSoal.equals("06") || nomerSoal.equals("01") || nomerSoal.equals("08"))
                        && jawabanRes.equalsIgnoreCase("ya") && !panasTubuh.equals("Panas")) {
                    System.out.println("Anda terkena penyakit Maag");
                    System.out.println("Tips Meredakan Gejala Maag\n"
                            + "1. makan  tepat waktu minimal sehari 3 kali\n"
                            + "2. Jangan makan-makanan yang pedas\n"
                            + "3. jangan makan-makanan berlemak\n"
                            + "4. jangan makan-makanan asam\n");
                    System.out.println(" ");
                    System.out.println("Berikut Merupakan Rekomendasi Obat Dari Kami : ");
                    if (status.equals("Dewasa") || status.equals("Remaja")) {
                        System.out.println("1. Antasid 200mg 3x/hari\n"
                                + "2. Ranitidine 150mg  2x/hari\n"
                                + "3. Dexteempluss 100mg 2x/hari\n"
                                + "4. Amoxilin  500mg 3x/hari\n");
                    } else if (status.equals("Anak-Anak")) {
                        System.out.println("1. Paracetamol 500mg 3x/hari\n"
                                + "2. Antasid  70mg 2x/hari \n"
                                + "3. Ranitidine  50mg 2x/hari\n"
                                + "4. Paracetamol 250mg 3x/hari\n");
                    }
                }

                // Jika tidak ada kondisi yang terpenuhi
                if (!diagnosisDitemukan) {
                    System.out.println("Anda tidak memilih gejala apapun atau belum teridentifikasi");
                    System.out.println("Terimakasih telah menggunakan layanan kami.");
                }

                // Melanjutkan Ke Opersi pembelian
                System.out.println(" ");
                System.out.println("Lanjut Membeli Obat ? Y/N ");
                lanjut = input.readLine();

                if (lanjut.equalsIgnoreCase("Y")) {
                    try {
                        System.out.println("Memuju Beli Obat...");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    beliObat();
                } else {
                    try {
                        System.out.println("Menuju Menu Utama...");
                        Thread.sleep(3000);
                        
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                }

            } else if ((nomerSoal.equals("01") && nomerSoal.equals("02") && nomerSoal.equals("03")
                    && nomerSoal.equals("04")
                    && nomerSoal.equals("05") && nomerSoal.equals("06") && nomerSoal.equals("07")
                    && nomerSoal.equals("08")) == jawabanRes.equalsIgnoreCase("tidak")) {
                // Jika user memilih tidak ada gejala yang dialami
                System.out.println("Anda Tidak Memilih Gejala Apapun"); // atau belum terdifinisikan
                System.out.println("Terimakasih Telah Menggunakan Layanan Kami");

            }
            
        }

    }

    public void beliObat() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DetailBeli> tDetailBelis = new ArrayList<>();
        Pembeli user = new Pembeli();
        int temp = 0;
        String lanjut = "";

        // Opsi lihatlist obat terlebih dahulu
        System.out.println("======================================");
        System.out.println("\tSelamat Datang \t \n"
                + "\tApotek Klinik Genmed\t");
        System.out.println("=====================================");
        System.out.print("Lihat list Obat ? Y/N\t : ");
        String lihat = input.readLine();
        // Menampilkan daftar obat jika user input Y dan melanjutkan jika N
        if (lihat.equalsIgnoreCase("Y")) {
            tampilkanDaftarObat();
        }

        System.out.println("=====================================");

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
            System.out.println("TOTAL: " + totalPembelian(tDetailBelis));
            System.out.println("Konfirmasi pembelian (Y/N)?");
            String konfirm = input.readLine();
            if (konfirm.equalsIgnoreCase("y")) {
                pembelian.setIdPembelian("P" + (pembelians.size() + 1));
                pembelian.setNamaS(user.getNama());
                pembelian.setTanggal(LocalDate.now());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        laporanPembelian(user);
       
    }
    
    public void tampilkanDaftarPembelianObat(ArrayList<DetailBeli> db) {
        System.out.println("===================================");
        for (DetailBeli detailBeli : db) {
            System.out.println("Nama Obat \t : " + detailBeli.getObat().getNamaObat());
            System.out.println("Harga \t : " + detailBeli.getHargaObat());
            System.out.println("Jumlah \t : " + detailBeli.getJumlahObat());
            System.out.println(" ");
        }
    }

    public int totalPembelian(ArrayList<DetailBeli> db) {
        int totalBeli = 0;
        for (DetailBeli detailBeli : db) {
            totalBeli += detailBeli.getTotalHarga();
        }
        return totalBeli;
    }

    public void laporanPembelian(Pembeli user) {
        for (Pembelian pembelian : pembelians) {
            System.out.println(" ");
            System.out.println("=====================================");
            System.out.println("            Klinik GenMed            ");
            System.out.println("        Generic Medical Clinic       ");
            System.out.println("=====================================");
            System.out.println("           Struk Pembelian           ");
            System.out.println("Kode Transaksi :" + pembelian.getIdPembelian());
            System.out.println("Tanggal Pembelian : " + pembelian.getTanggal());
            System.out.println("                                     ");
            System.out.println(" Pembeli\t : " + user.getNama());
            System.out.println("Email \t\t:" + user.getEmail());
            System.out.println("=====================================");
            ArrayList<DetailBeli> detailBelis = pembelian.getDetailBelis();
            for (DetailBeli db : detailBelis) {
                System.out.println("Nama Obat \t: " + db.getObat().getNamaObat());
                System.out.println("Quantity \t: " + db.getJumlahObat());
                System.out.println("Total \t\t: " + db.getTotalHarga());
            }
            System.out.println("=====================================");
            System.out.println("Total Harga \t \t : " + pembelian.getTotal());
            System.out.println("");

             break;
        }
        System.out.println("Silahkan Lakukan Pembayaran di Cabang Klinik Genmed Terdekat.");
         
    }

    public void tampilkanLaporan(){
        Pembeli user = new Pembeli();
        laporanPembelian(user);
    }
}
