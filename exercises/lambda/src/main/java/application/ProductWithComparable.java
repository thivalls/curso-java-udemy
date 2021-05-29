package application;

import lombok.Data;

@Data
public class ProductWithComparable implements Comparable<ProductWithComparable> {
    private final String name;
    private final Double price;

    @Override
    public int compareTo(ProductWithComparable other) {
        return this.getName().toUpperCase().compareTo(other.getName().toUpperCase());
    }
}
