package models;
public class Sneaker {
    private  int id;
    private String name;
    private String brand;
    private  String sport;
    private  int qty;
    private  float price;
    private int size;
    public Sneaker(int id, String name, String brand, String sport, int qty, float price) {
        this.id=id;
        this.name=name;
        this.brand=brand;
        this.sport=sport;
        this.qty=qty;
        this.price=price;
    }
    public Sneaker() {

    }
    public Sneaker(int id, String name, String brand, String sport, float size, int qty, float price) {
        this.id=id;
        this.name=name;
        this.brand=brand;
        this.sport=sport;
        this.qty=qty;
        this.price=price;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setBrand(String brand) {
        this.brand=brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setSport(String sport) {
        this.sport=sport;
    }
    public String getSport() {
        return sport;
    }
    public void setId(int id) {
this.id=id;
    }
    public int getId() {
        return id;
    }
    public void setSize(int size) {
        this.size=size;
    }
    public int getSize() {
        return size;
    }
    public void setQty(int qty) {
        this.qty=qty;
    }
    public Sneaker(int id) {
        this.id = id;
    }
    public int getQty() {
        return qty;
    }
    public Sneaker(float price) {
        this.price = price;
    }
    public void setPrice(float price) {
        this.price=price;
    }
    public float getPrice() {
        return price;
    }
    public Sneaker(String brand) {
        this.brand = brand;
    }
}
