package tp1.application;
import tp1.domain.*;
public class OrderService {
    public Product createOrder(String type, String name, double price) {
        Product product = ProductFactory.createProduct(type, name, price);
        System.out.println("Order created for " + product.getName());
        return product;
    }
}
