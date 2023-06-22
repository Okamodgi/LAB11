
public class Buyer implements Product, User {
    public void displayInfo(User user, Product product){
        System.out.println("Покупатель " + user.getUsername() + " купила " + product.getName());
    }

    public void setName(String name) {
    }
    public String getName() {
        return null;
    }
    public void setPrice(double price) {
    }
    public double getPrice() {
        return 0;
    }
    public void setRating(double rating) {
    }
    public double getRating() {
        return 0;
    }
    public void setUsername(String username) {
    }
    public String getUsername() {
        return null;
    }
    public void setPassword(String password) {
    }
    public String getPassword() {
        return null;
    }
}
