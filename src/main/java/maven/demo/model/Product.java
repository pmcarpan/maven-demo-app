package maven.demo.model;

public class Product {
    public final Long id;
    public final String name;
    public final Double price;

    private Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static Product of(Long id, String name, Double price) {
        return new Product(id, name, price);
    }
}
