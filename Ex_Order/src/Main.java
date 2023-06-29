
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Enums.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product;
        OrderItem orderItem;
        Order order;


        // ENTRADAS DE DADOS
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String data = sc.nextLine();

        Client client = new Client(name, email, data);

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter #%d item data: %n", (i + 1));
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: \n");
            int quantity = sc.nextInt();

            product = new Product(productName, productPrice);
            orderItem = new OrderItem(quantity, product.getPrice(), product);

            order.addItem(orderItem);
        }

        // SAIDA DE DADOS

        System.out.println(order);

        sc.close();
    }

}
