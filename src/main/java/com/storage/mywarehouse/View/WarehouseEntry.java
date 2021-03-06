package com.storage.mywarehouse.View;
// Generated Aug 12, 2017 5:46:27 PM by Hibernate Tools 4.3.1

import com.storage.mywarehouse.Entity.*;
// Generated Aug 12, 2017 5:46:27 PM by Hibernate Tools 4.3.1



/**
 * Column generated by hbm2java
 */
public class WarehouseEntry  implements java.io.Serializable {


     private int id;
     private int productId;
     private String brand;
     private String type;
     private int quantity;
     private double price;
     private int warehouseId;

    public WarehouseEntry() {
    }

    public WarehouseEntry(int id, int productId, String brand, String type, int quantity, double price, int warehouseId) {
        this.id = id;
        this.productId = productId;
        this.brand = brand;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.warehouseId = warehouseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

     


}


