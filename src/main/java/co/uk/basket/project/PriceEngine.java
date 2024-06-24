package co.uk.basket.project;


import co.uk.basket.project.domain.Product;

public class PriceEngine {
    public static double getPrice(Product product, long quantities) {
        double finalPrice = 0;
        switch (product.getOffer()) {
            case NONE -> {
                finalPrice = product.getPrice() * quantities;
            }
            case THREE_FOR_TWO -> {
                finalPrice = (quantities % 3 + quantities / 3 * 2) * product.getPrice();
            }
            case BOGOF -> {
                finalPrice = (quantities % 2 + quantities / 2) * product.getPrice();
            }
        }
        return finalPrice;
    }
}
