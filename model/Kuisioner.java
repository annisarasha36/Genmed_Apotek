package model;

public class Kuisioner {
    private String nomorPertanyaan, pertanyaan, jawaban;

    //setter
    public Kuisioner setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
        return this;
    }
    
    public Kuisioner setNomorPertanyaan(String nomorPertanyaan) {
        this.nomorPertanyaan = nomorPertanyaan;
        return this;
    }
    
    public Kuisioner setJawaban(String jawaban) {
        this.jawaban = jawaban;
        return this;
    }

    //getter
    public String getPertanyaan() {
        return this.pertanyaan;
    }

    public String getNomorPertanyaan() {
        return this.nomorPertanyaan;
    }

    public String getJawaban() {
        return this.jawaban;
    }


}
