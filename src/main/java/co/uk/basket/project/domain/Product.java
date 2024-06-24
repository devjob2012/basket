package co.uk.basket.project.domain;

import static co.uk.basket.project.domain.Offer.*;

public enum Product {
    BANANA(20, NONE),
    APPLE(35, NONE),
    LIMES(15, THREE_FOR_TWO),
    MELONS(20, BOGOF);

    private double price;
    private Offer offer;

    Product(double price, Offer offer) {
        this.price = price;
        this.offer = offer;
    }

    public static Product getEnum(String value) {
        for (Product v : values()) {
            if (value.equalsIgnoreCase(v.name()))
                return v;
        }
        return null;
    }

    public double getPrice() {
        return this.price;
    }

    public Offer getOffer() {
        return this.offer;
    }
}
