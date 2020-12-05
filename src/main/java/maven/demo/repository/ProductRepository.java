package maven.demo.repository;

import java.util.List;

import maven.demo.model.Product;

public class ProductRepository {
    private static List<Product> products = List.of(
        Product.of(1L, "Lenovo Legion",     60000.90),
        Product.of(1L, "Raspberry Pi 4",    3950.00),
        Product.of(1L, "USB Splitter",      599.00),
        Product.of(1L, "Philips Toaster",   1800.50)
    );

    public static List<Product> getProducts() {
        return List.copyOf(products);
    }
}
