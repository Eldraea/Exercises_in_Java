package myjava.exercises;

import java.util.Objects;

public class StockItem implements Comparable<StockItem> {

    private final String name;
    private double price;
    private int quantityStock; // can be initialized later

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0 ; //or here
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0.0)
            this.price = price;
    }

    public void adjustStock(int quantity)
    {
        int newQuantity = this.quantityStock + quantity ;
        if(newQuantity >= 0)
            this.quantityStock = newQuantity ;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Entering StockItem.equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItem stockItem = (StockItem) o;
        return Objects.equals(name, stockItem.name);
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if(this == o) return 0;
        if(o != null) return this.name.compareTo(o.getName());
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.getName() + " : price " + this.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + 31;
    }


}
