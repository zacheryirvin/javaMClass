package com.zacheryirvin;

public class StockItem implements Comparable<StockItem> {
  private final String name;
  private double price;
  private int quantity;

  public StockItem(String name, double price) {
    this.name = name;
    this.price = price;
    this.quantity = 0;
  }

  public StockItem(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setPrice(double price) {
    if(price > 0.0) {
      this.price = price;
    }
  }

  public void adjustStock(int quantity) {
    int newQuantity = this.quantity + quantity;
    if(newQuantity > 0) {
      this.quantity = newQuantity;
    }
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == this) {
      return true;
    }

    if((obj == null) || (obj.getClass() != this.getClass())) {
      return false;
    }

    String objName = ((StockItem) obj).getName();
    return this.name.equals(objName);
  }

  @Override
  public int hashCode() {
    return this.name.hashCode() + 57;
  }

  @Override
  public int compareTo(StockItem i) {
    if(this == i) {
      return 0;
    }

    if(i != null) {
      return this.name.compareTo(i.getName());
    }
    
    throw new NullPointerException();
  }

  @Override
  public String toString() {
    return this.name + " price: " + this.price; 
  }
}
