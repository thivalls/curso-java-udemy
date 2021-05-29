package application.function;

import application.comparator.Product;

import java.util.function.Function;

public class ProductFunction implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
