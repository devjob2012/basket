package co.uk.basket.project;


import co.uk.basket.project.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BasketValue {
    public static void main(String[] args) {
        List<String> basketList = List.of("Apple", "Apple", "Banana", "Limes", "Melons", "Melons", "Melons", "Limes", "Limes");
        BasketValue basketValue = new BasketValue();
        double totalPrice = basketValue.calculatePrice(basketList);
        System.out.println(" Total price is " + totalPrice);
    }

    public double calculatePrice(List<String> basketList) {
        double totalPrice = 0;
        Map<Product, Long> productList = basketList.stream()
                .collect(Collectors.groupingBy(t -> Product.getEnum(t.toUpperCase()), Collectors.counting()));
        for (var entry : productList.entrySet()) {
            double price = PriceEngine.getPrice(entry.getKey(), entry.getValue());
            totalPrice += price;
        }
        return totalPrice;
    }
}
