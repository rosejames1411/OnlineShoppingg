package service;

import model.Cart;
import model.Product;

public class CartServiceImpl implements CartService {
    private Cart cart;

    public CartServiceImpl() {
        cart = new Cart();
    }

    @Override
    public void addToCart(Product product) {
        cart.addProduct(product);
        System.out.println("Added to cart: " + product.getProductName());
    }

    @Override
    public void displayCartDetails() {
        System.out.println(cart);
    }
}

