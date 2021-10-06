package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemInfo
{
    @Id
    private int itemID;
    private String itemName;
    private String description;
    private double expectedPrice;

    public double getExpectedPrice() {return expectedPrice;}

    public void setExpectedPrice(double expectedPrice) {this.expectedPrice = expectedPrice;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public String getItemName() {return itemName;}

    public void setItemName(String itemName) {this.itemName = itemName;}
}
