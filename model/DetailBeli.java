package model;

public class DetailBeli { 
    private String idDetailBeli;
    private int totalHarga, jumlahObat,  hargaObat;
    private Pembelian pembelian;
    private Obat obat;
    
    //setter
    public DetailBeli setIdDetailBeli(String idDetailBeli) {
        this.idDetailBeli = idDetailBeli;
        return this;
    }
    
    public DetailBeli setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
        return this;
    }
    public DetailBeli setHargaObat(int hargaObat) {
        this.hargaObat = hargaObat;
        return this;
    }
    
    public DetailBeli setJumlahObat(int jumlahObat) {
        this.jumlahObat = jumlahObat;
        return this;
    }
    
    public DetailBeli setPembelian(Pembelian pembelian) {
        this.pembelian = pembelian;
        return this;
    }
    public DetailBeli setObat(Obat obat) {
        this.obat = obat;
        return this;
    }
    //getter
    public String getIdDetailBeli() {
        return this.idDetailBeli;
    }

    public int getTotalHarga() {
        return this.totalHarga;
    }
    public int getHargaObat() {
        return this.hargaObat;
    }

    public int getJumlahObat() {
        return this.jumlahObat;
    }

    public Pembelian getPembelian() {
        return pembelian;
    }
   
    public Obat getObat() {
        return this.obat;
    }

}
