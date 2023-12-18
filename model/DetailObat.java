package model;

public class DetailObat extends Obat{
    private String descObat, dosis ;
    private int aturanMinum;

    //setter
    public DetailObat setDescObat(String descObat) {
        this.descObat = descObat;
        return this;
    }

    public DetailObat setDosis(String dosis) {
        this.dosis = dosis;
        return this;
    }

    public DetailObat setAturanMinum(int aturanMinum) {
        this.aturanMinum = aturanMinum;
        return this;
    }

    //getter
    public String getDescObat() {
        return this.descObat;
    }

    public String getDosis() {
        return this.dosis;
    }

    public int getAturanMinum() {
        return this.aturanMinum;
    }
}