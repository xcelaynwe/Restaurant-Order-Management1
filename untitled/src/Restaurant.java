import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Restaurant {
    private final String name;
    private final List<Order> orders = new ArrayList<>();
    public Restaurant(String name) {
        this.name = name;
    }
    public void addOrder(Order order) {
        orders.add(order);
    }
    public Order findById(int id) {
        return orders.stream()
                .filter(o -> o.getOrderId() == id)
                .findFirst()
                .orElse(null);
    }
    public List<Order> filterByPrice(double minPrice) {
        return orders.stream()
                .filter(o -> o.getTotalPrice() > minPrice)
                .toList();
    }
    public void sortByPrice() {
        orders.sort(Comparator.comparingDouble(Order::getTotalPrice));
    }
    public void printAllOrders() {
        System.out.println("Restaurant: " + name);
        orders.forEach(Order::printOrder);
    }
}
