package model;


public class Obat{
    private String idObat, namaObat, jenisObat, satuan;
    private int hargaObat;
    private String descObat;
    private int stok;
    private Boolean tersedia;

    //Setter
    public Obat setIdObat(String idObat){
        this.idObat = idObat;
        return this;
    }
    public Obat setNamaObat(String namaObat){
        this.namaObat = namaObat;
        return this;
    }
    public Obat setJenisObat(String jenisObat){
        this.jenisObat = jenisObat;
        return this;
    }
    public Obat setSatuan(String satuan){
        this.satuan = satuan;
        return this;
    }
    public Obat setHargaObat(int hargaObat){
        this.hargaObat = hargaObat;
        return this;
    }
    public Obat setStok(int stok){
        this.stok = stok;
        return this;
    }
    public Obat tersedia(Boolean tersedia){
        this.tersedia = tersedia;
        return this;
    }
    public Obat setDescObat(String descObat){
        this.descObat = descObat;
        return this;
    }

    //getter
    public String getIdObat() {
        return this.idObat;
    }
    public String getNamaObat() {
        return this.namaObat;
    }
    public String getJenisObat() {
        return this.jenisObat;
    }
    public String getSatuan() {
        return this.satuan;
    }
    public int getHargaObat() {
        return this.hargaObat;
    }
    public int getStok() {
        return this.stok;
    }
    public Boolean getTersedia() {
        return this.tersedia;
    }
    public String setDescObat() {
        return this.descObat;
    }
}
