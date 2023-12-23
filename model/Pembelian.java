package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pembelian {
    private String idPembelian;
    private String namaS;
    private Pembeli pembeli;
    private int total;
    private LocalDate tanggal;
    private ArrayList<DetailBeli> detailBelis;

    //setter
    public Pembelian setIdPembelian (String idPembelian) {
        this.idPembelian = idPembelian;
        return this;
    }
    
    public Pembelian setPembeli (Pembeli pembeli) {
        this.pembeli = pembeli;
        return this;
    }

    public Pembelian setTotal (int total) {
        this.total = total;
        return this;
    }

    public Pembelian setTanggal (LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    public Pembelian setDetailBelis (ArrayList<DetailBeli> detailBelis) {
        this.detailBelis = detailBelis;
        return this;
    }

    //getter

    public String getIdPembelian() {
        return this.idPembelian;
    }
    public Pembeli getPembeli() {
        return this.pembeli;
    }

    public int getTotal() {
        return this.total;
    }

    public LocalDate getTanggal() {
        return this.tanggal;
    }

    public ArrayList<DetailBeli> getDetailBelis() {
        return this.detailBelis;
    }

    /**
     * @return String return the namaS
     */
    public String getNamaS() {
        return namaS;
    }

    /**
     * @param namaS the namaS to set
     */
    public void setNamaS(String namaS) {
        this.namaS = namaS;
    }

}
