package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

public class Inventory {

    private String itemName;
    private int qtyAdded;
    private int qtyUsed;
    private int remaining;

    public Inventory(String itemName, int qtyAdded, int qtyUsed) {
        this.itemName = itemName;
        this.qtyAdded = qtyAdded;
        this.qtyUsed = qtyUsed;
        this.remaining = qtyAdded - qtyUsed;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQtyAdded() {
        return qtyAdded;
    }

    public void setQtyAdded(int qtyAdded) {
        this.qtyAdded = qtyAdded;
    }

    public int getQtyUsed() {
        return qtyUsed;
    }

    public void setQtyUsed(int qtyUsed) {
        this.qtyUsed = qtyUsed;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }
}
