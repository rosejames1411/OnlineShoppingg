package service;

import model.Product;

public interface CartService {

    void addToCart(Product product);

    void displayCartDetails();
}

