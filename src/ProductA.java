public class ProductA implements Product {
    private String name;
    private double price;
    private double rating;
    ProductA(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }
}
