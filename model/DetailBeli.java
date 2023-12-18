package model;

public class DetailBeli {
    private String namaObat;
    private int totalHarga, jumlahObat;

    //setter
    public DetailBeli setNamaObat(String namaObat) {
        this.namaObat = namaObat;
        return this;
    }

    public DetailBeli setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
        return this;
    }

    public DetailBeli setJumlahObat(int jumlahObat) {
        this.jumlahObat = jumlahObat;
        return this;
    }

    //getter
    public String getNamaObat() {
        return this.namaObat;
    }

    public int getTotalHarga() {
        return this.totalHarga;
    }

    public int getJumlahObat() {
        return this.jumlahObat;
    }
}
