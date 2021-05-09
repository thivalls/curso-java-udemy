package application.program2;

import application.program2.entities.Client;
import application.program2.entities.OrderItem;
import application.program2.entities.Order;
import application.program2.entities.Product;
import application.program2.entities.enums.OrderStatus;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat clientBirthday = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        System.out.println("Seja bem vindo ao sistema de pedidos VALLS STORE: ");

        System.out.println("Digite o nome do cliente");
        String clientName = sc.nextLine();
        System.out.println("Digite o email do cliente");
        String clientEmail = sc.nextLine();
        System.out.println("Digite a data de aniversário do cliente");
        Date birthday = sdf.parse(sc.nextLine());

        Client client = new Client(clientName, clientEmail, birthday);

        Date now = new Date();
        Order order = new Order(client);


        System.out.println("Deseja adicionar produtos no pedido?");
        if(sc.nextLine().equals("s")) {
            Boolean loopSales = true;
            while(loopSales.equals(true)) {
                System.out.println("Digite o nome do produto");
                String productName = sc.nextLine();
                System.out.println("Digite o preço do produto");
                String productPrice = sc.nextLine();
                System.out.println("Digite a quantidade deste produto");
                Integer quantity = sc.nextInt();
                Product product = new Product(productName, new BigDecimal(productPrice));
                OrderItem item = new OrderItem(product, quantity);
                order.addProduct(item);
                System.out.println("Deseja adicionar mais produtos no pedido?");
                sc.nextLine();
                String response = sc.nextLine();
                if(response.equals("n")) loopSales = false;
            }
        }

        System.out.println("ORDER SUMMARY");
        System.out.println("ORDER DATE: " + sdf.format(order.getCreatedAt()));
        System.out.println("ORDER STATUS " + order.getStatus());
        System.out.println("CLIENT: " + order.getClient().getName() + "(" + clientBirthday.format(order.getClient().getBithday()) + ") - " + order.getClient().getEmail());
        System.out.println("ORDER ITEMS");
        for (OrderItem orderItem : order.getItems()) {
            System.out.println(
                orderItem.getProduct().getName() +
                " R$ " +
                orderItem.getProduct().getPrice() +
                " QUANTITY: " + orderItem.getQuantity() +
                " SUBTOTAL: " + orderItem.subTotal()
            );
        }
        System.out.println("ORDER TOTAL: " + order.getTotal());


        System.out.println("Volte sempre!!!");


        sc.close();
    }
}
