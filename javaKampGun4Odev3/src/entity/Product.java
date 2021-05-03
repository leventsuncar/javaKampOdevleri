package entity;

public class Product extends BaseEntity {
    private int id;
    private String name;
    private String details;
    private double price;
    private double lastPrice;
    private Discount discountAmount;

    public Product() {
    }

    public Product(int id, String name, String details, double price, Discount discountAmount) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.price = price;

        this.discountAmount = discountAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(double lastPrice) {
        this.lastPrice=lastPrice;
    }

    public Discount getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Discount discountAmount) {
        this.discountAmount = discountAmount;
    }
}
