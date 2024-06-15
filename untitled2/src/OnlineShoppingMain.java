
import model.Product;
import service.CartService;
import service.CartServiceImpl;

public class OnlineShoppingMain {

    public static void main(String[] args) {

        // Create some products
        Product product1 = new Product(1, "Laptop", "A high performance laptop", 999.99f);
        Product product2 = new Product(2, "Smartphone", "A latest model smartphone", 499.99f);
        Product product3 = new Product(3, "Headphones", "Noise-cancelling headphones", 79.99f);

        // Create a cart service
        CartService cartService = new CartServiceImpl();

        // Add products to cart
        cartService.addToCart(product1);
        cartService.addToCart(product2);
        cartService.addToCart(product3);

        // Display the cart details
        cartService.displayCartDetails();
    }
}

