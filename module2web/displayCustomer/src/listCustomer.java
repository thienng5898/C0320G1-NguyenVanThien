import java.util.ArrayList;
import java.util.List;

public class listCustomer {
    public static List<Customer> customer() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Uzumaki Naruto", "12/12/1998", "Làng Lá", "images/1.png"));
        customers.add(new Customer("Uchiha Sasuke", "05/07/1998", "Làng Lá ", "images/Uchiha_Sasuke.jpg"));
        customers.add(new Customer("Gara", "25/10/1998", "Làng Cát", "images/3.jpg"));
        customers.add(new Customer("Pain", "04/03/1998", "Làng Mưa", "images/4.png"));
        customers.add(new Customer("Killer Bee", "05/04/1996", "Làng Mây", "images/5.jpg"));
        return customers;
    }
}
