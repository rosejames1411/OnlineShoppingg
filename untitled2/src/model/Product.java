package model;

public class Product {

    private int productId;
    private String productName;
    private String description;
    private float price;

    public Product(int productId, String productName, String description, float price) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Description: " + description + ", Price: $" + price;
    }
}

