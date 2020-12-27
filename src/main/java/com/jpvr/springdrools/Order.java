package com.jpvr.springdrools;

public class Order {

    private String name;
    private String cardType;
    private int discount;
    private int price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Order name(String name) {
        this.name = name;
        return this;
    }

    public Order cardType(String cardType) {
        this.cardType = cardType;
        return this;
    }

    public Order discount(int discount) {
        this.discount = discount;
        return this;
    }

    public Order price(int price) {
        this.price = price;
        return this;
    }


}