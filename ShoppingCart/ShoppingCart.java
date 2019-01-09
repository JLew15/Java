public class ShoppingCart {
  public static double purchase(String product, int quantity, double price)
  {
    double total = quantity * price;
    System.out.println("You have purchased " + quantity + " " + product + " for $" + price);

    return total;
  }
  public static void main(String[] args) {
    purchase("soda", 1, 1.00);
    purchase("candies", 3, 0.50);
    purchase("chocolates", 10, 1.00);

    double result = purchase("Windex", 20, 13.99);

    System.out.println("I spent " + result);

    System.out.println("I also spent " + purchase("soda", 1, 1.00));
  }

}
