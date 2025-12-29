import java.util.Objects;
public abstract class Order {
    private final int orderId;
    private final MenuItem item;
    private final int quantity;
    protected Order(int orderId, MenuItem item, int quantity) {
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
    }
    public int getOrderId() {
        return orderId;
    }
    public double getTotalPrice() {
        return item.price() * quantity;
    }
    public abstract void printOrder();
    @Override
    public String toString() {
        return "Order{" +
                "id=" + orderId +
                ", item=" + item.name() +
                ", quantity=" + quantity +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return orderId == order.orderId;
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
}
