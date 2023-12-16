package model;

public class Produk {
    private String productId;
    private String productName;
    private String productDesc;
    private double price;
    private int quantityAvailable;

    public Produk(String productId, String productName, String productDesc, double price, int quantityAvailable) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    // Getter methods
    public String getProdukId() {
        return productId;
    }

    public String getProdukName() {
        return productName;
    }
    
    public String getProdukDesc() {
        return productDesc;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    // Setter methods
    public void setProdukId() {
        this.productId = productId;
    }

    public void setProdukName() {
        this.productName = productName;
    }

    public void setProdukDesc() {
        this.productDesc = productDesc
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
}
