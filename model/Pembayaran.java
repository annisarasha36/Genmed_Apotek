package model;

public class Pembayaran {
    private int uangMasuk, uangKeluar;

    //setter
    public Pembayaran setUangMasuk(int uangMasuk) {
        this.uangMasuk = uangMasuk;
        return this;
    }

    public Pembayaran setUangKeluar(int uangKeluar) {
        this.uangKeluar = uangKeluar;
        return this;
    }

    //getter
    public int getUangMasuk() {
        return this.uangMasuk;
    }

    public int getUangKeluar() {
        return this.uangKeluar;
    }
}
