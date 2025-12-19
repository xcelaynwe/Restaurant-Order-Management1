import java.util.ArrayList;
record MenuItem(String name, double price) {}
class Order {
    private final int orderId;
    private final MenuItem item;
    private final int quantity;
    private final double totalPrice;
    public Order(int orderId, MenuItem item, int quantity) {
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
        this.totalPrice = item.price() * quantity;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void printOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item.name());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: " + totalPrice);
        System.out.println("----------------------");
    }
}
class Restaurant {
    private final String name;
    private final ArrayList<Order> orders;

    public Restaurant(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }
    public void addOrder(Order order) {
        orders.add(order);
    }
    public void printAllOrders() {
        System.out.println("Restaurant: " + name);
        for (Order order : orders) {
            order.printOrder();
        }
    }
    public void compareOrders(Order o1, Order o2) {
        if (o1.getTotalPrice() > o2.getTotalPrice()) {
            System.out.println("Order 1 is more expensive");
        } else if (o1.getTotalPrice() < o2.getTotalPrice()) {
            System.out.println("Order 2 is more expensive");
        } else {
            System.out.println("Both orders have the same price");
        }
    }
}
class Main {
    static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Delicious Place");
        MenuItem pasta = new MenuItem("Pasta", 2200);
        MenuItem steak = new MenuItem("Steak", 4500);
        Order order1 = new Order(1, pasta, 2);
        Order order2 = new Order(2, steak, 1);
        restaurant.addOrder(order1);
        restaurant.addOrder(order2);
        restaurant.printAllOrders();
        restaurant.compareOrders(order1, order2);
    }
}
