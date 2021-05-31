package application.functionAsParameter;

import application.comparator.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public Double filteredSum(List<Product> products, Predicate<Product> criteria) {
        Double sum = 0.0;
        for (Product product : products) {
            if (criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
