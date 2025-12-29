public class OnlineOrder extends Order {
    private final String deliveryAddress;
    public OnlineOrder(int orderId, MenuItem item, int quantity, String deliveryAddress) {
        super(orderId, item, quantity);
        this.deliveryAddress = deliveryAddress;
    }
    @Override
    public void printOrder() {
        System.out.println(this + ", deliveryAddress='" + deliveryAddress + "'");
    }
}
