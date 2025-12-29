public class InHouseOrder extends Order {
    public InHouseOrder(int orderId, MenuItem item, int quantity) {
        super(orderId, item, quantity);
    }
    @Override
    public void printOrder() {
        System.out.println(this);
    }
}
