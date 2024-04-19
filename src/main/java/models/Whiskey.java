package models;
public class Whiskey {
    String brand;
    int id;
    float price;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Whiskey(String brand, int id, float price) {
        this.brand = brand;
        this.id = id;
        this.price = price;
    }
    public Whiskey() {
    }
    public String getBrand() {
        return brand;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }


}
