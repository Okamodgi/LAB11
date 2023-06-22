
public class Main {
    public static void main(String[] args) {
        Product productA = new ProductA("хлеб", 100, 5);
        Product productB = new ProductB("цветок", 200, 5);
        Product productC = new ProductC("журнал", 40, 5);

        User userA = new UserA("Алёна", "222");
        User userB = new UserB("Маша", "555");
        User userC = new UserC("Настя", "999");

        Buyer buyer = new Buyer();
        buyer.displayInfo(userA, productA);
        buyer.displayInfo(userB, productB);
        buyer.displayInfo(userC, productC);

    }
}
interface Product {
    void setName(String name);
    String getName();
    void setPrice(double price);
    double getPrice();
    void setRating(double rating);
    double getRating();
}
interface User {
    void setUsername(String username);
    String getUsername();
    void setPassword(String password);
    String getPassword();
}
