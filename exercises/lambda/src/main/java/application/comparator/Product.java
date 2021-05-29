package application.comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Product {
    private String name;
    private Double price;

    public static Boolean filtraMenor100Estatico(Product product) {
        return product.getPrice() <= 100;
    }

    public boolean filtraMenor100NaoEstatico() {
        return price <= 100.00;
    }

    public static void multiplicaPor3Estatico(Product product) {
        product.setPrice(product.getPrice() * 3);
    }

    public void multiplicaPor3NaoEstatico() {
        this.setPrice(getPrice() * 3);
    }
}
