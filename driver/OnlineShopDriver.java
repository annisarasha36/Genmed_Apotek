package driver;

import model.Produk;
import controller.ShoppingCart;

public class OnlineShopDriver {
    public static void main(String[] args) {
        // Inisialisasi beberapa produk
        Produk product1 = new Produk("P001", "Product 1", 10.0, 5);
        Produk product2 = new Produk("P002", "Product 2", 15.0, 7);
        Produk product3 = new Produk("P003", "Product 3", 20.0, 3);

        // Membuat objek ShoppingCart
        ShoppingCart cart = new ShoppingCart();

        // Menambahkan produk ke keranjang belanja
        cart.addProdukToCart(product1);
        cart.addProdukToCart(product2);
        cart.addProdukToCart(product3);

        // Menghapus produk dari keranjang belanja
        cart.removeProdukFromCart(product2);

        // Menampilkan daftar produk di keranjang belanja
        System.out.println("Products in Cart:");
        for (Produk product : cart.getCartItems()) {
            System.out.println(product.getProdukName() + " - $" + product.getPrice());
        }

        // Melakukan checkout
        cart.checkout();
    }
}
