package model;

public class Pembeli{
    private String nama;
    private int suhu,  usia, beratBadan;
    private boolean gejala;

    //setter
    public Pembeli setNama(String nama) {
        this.nama = nama;
        return this;
    }

    public Pembeli setUsia(int usia) {
        this.usia = usia;
        return this;
    }

    public Pembeli setSuhu(int suhu) {
        this.suhu = suhu;
        return this;
    }

    public Pembeli setBeratBadan(int beratBadan) {
        this.beratBadan = beratBadan;
        return this;
    }

    public Pembeli setGejala(boolean gejala) {
        this.gejala = gejala;
        return this;
    }

    //getter
    public String getNama() {
        return this.nama;
    }

    public int getUsia() {
        return this.usia;
    }

    public int getSuhu() {
        return this.suhu;
    }

    public int getBeratBadan() {
        return this.beratBadan;
    }

    public boolean getGejala() {
        return this.gejala;
    }
}