package entity;

public class Discount extends BaseEntity {
    private int id;
    private String name;
    private String details;
    private double discountAmount;

    public Discount() {
    }

    public Discount(int id, String name,String details, double discountAmount) {
        this.id = id;
        this.name = name;
        this.details = details;
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

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
}
