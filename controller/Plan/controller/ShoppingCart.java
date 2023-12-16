package controller;

import java.util.ArrayList;
import java.util.List;

import model.Produk;

public class ShoppingCart {
    private List<Produk> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProdukToCart(Produk Produk) {
        cartItems.add(Produk);
        System.out.println(Produk.getProdukName() + " added to cart.");
    }

    public void removeProdukFromCart(Produk Produk) {
        if (cartItems.remove(Produk)) {
            System.out.println(Produk.getProdukName() + " removed from cart.");
        } else {
            System.out.println("Produk not found in cart.");
        }
    }

    public List<Produk> getCartItems() {
        return cartItems;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Produk Produk : cartItems) {
            total += Produk.getPrice();
        }
        return total;
    }

    public void generateReceipt() {
        System.out.println("===== Shopping Receipt =====");
        for (Produk Produk : cartItems) {
            System.out.println(Produk.getProdukName() + " - $" + Produk.getPrice());
        }
        System.out.println("Total: $" + calculateTotal());
        System.out.println("============================");
    }

    public void checkout() {
        generateReceipt();
        cartItems.clear();
        System.out.println("Thank you for shopping with us!");
    }
}

