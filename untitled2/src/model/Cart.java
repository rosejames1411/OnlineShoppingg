package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products;
    private float totalValue;

    public Cart() {
        products = new ArrayList<>();
        totalValue = 0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalValue += product.getPrice();
    }

    public List<Product> getProducts() {
        return products;
    }

    public float getTotalValue() {
        return totalValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cart Details:\n");
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        sb.append("Total Value: $").append(totalValue);
        return sb.toString();
    }
}

