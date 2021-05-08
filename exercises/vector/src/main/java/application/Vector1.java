package application;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class Product {
    int id;
    String name;
    BigDecimal price;

    Product(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public BigDecimal getPrice() {
        return price;
    }

//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Vector1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Product product1 = new Product(1, "TV", new BigDecimal(500));
        Product product2 = new Product(2, "Stove", new BigDecimal(500));
        Product product3 = new Product(3, "Fryer", new BigDecimal(500));
        Product product4 = new Product(4, "Fryer", new BigDecimal(400));
        Product product5 = new Product(5, "Fryer", new BigDecimal(400));

        Product[] dataProducts = new Product[5];
        dataProducts[0] = product1;
        dataProducts[1] = product2;
        dataProducts[2] = product3;
        dataProducts[3] = product4;
        dataProducts[4] = product5;

//        for(Product product : dataProducts) {
//            System.out.println(product.name);
//        }


        System.out.println("Digite o número de produtos a serem informados");
        int n = sc.nextInt();

        int[] ids = new int[n];
        for(int i = 0; i < ids.length; i++) {
            System.out.println("Digite o id do produto");
            ids[i] = sc.nextInt();
        }

        // System.out.println(Arrays.toString(ids));

        Double average = 0.0;
        for (int id : ids) {
            for (Product product : dataProducts) {
                if(product.getId() == id) {
                    average += product.getPrice().doubleValue();
                }
            }
        }

        System.out.println("A média dos preços dos produtos é: " + average/n);

        sc.close();
    }
}
