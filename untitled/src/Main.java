public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Delicious Place");
        MenuItem pasta = new MenuItem("Pasta", 2200);
        MenuItem steak = new MenuItem("Steak", 4500);
        Order order1 = new InHouseOrder(1, pasta, 2);
        Order order2 = new OnlineOrder(2, steak, 1, "Astana, Abay street 10");
        restaurant.addOrder(order1);
        restaurant.addOrder(order2);
        restaurant.printAllOrders();
        System.out.println("\nFiltered orders (price > 3000):");
        restaurant.filterByPrice(3000).forEach(System.out::println);
        System.out.println("\nSorted by price:");
        restaurant.sortByPrice();
        restaurant.printAllOrders();
    }
}

