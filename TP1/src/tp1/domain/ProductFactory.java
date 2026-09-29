package tp1.domain;
import java.util.*;
import java.util.function.BiFunction;
public final class ProductFactory {
    private static final Map<String, BiFunction<String, Double, Product>> REG = new HashMap<>();
    static {
        register("BOOK", Book::new);
        register("ELECTRONIC", Electronic::new);
        register("CLOTHING", Clothing::new);
        register("FOOD", Food::new);
    }
    private ProductFactory() {}
    public static void register(String type, BiFunction<String, Double, Product> f) { REG.put(type, f); }
    public static Product createProduct(String type, String name, double price) {
        BiFunction<String, Double, Product> f = REG.get(type);
        if (f == null) throw new IllegalArgumentException("Unknown product");
        return f.apply(name, price);
    }
}
