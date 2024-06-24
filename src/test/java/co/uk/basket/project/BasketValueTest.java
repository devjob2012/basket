package co.uk.basket.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class BasketValueTest {
    @Test
    public void shouldReturnCorrectBasketValueFor2AppleAnd3Limes() {
        List<String> basketList = List.of("Apple", "Limes", "Limes", "Limes");
        BasketValue basketValue = new BasketValue();
        basketValue.calculatePrice(basketList);
        Assertions.assertEquals(65, basketValue.calculatePrice(basketList));
    }

    @Test
    public void shouldReturnCorrectBasketValueFor2AppleAnd3LimesAnd2Melons() {
        List<String> basketList = List.of("Apple", "Limes", "Limes", "Limes", "Melons", "Melons");
        BasketValue basketValue = new BasketValue();
        basketValue.calculatePrice(basketList);
        Assertions.assertEquals(85, basketValue.calculatePrice(basketList));
    }

    @Test
    public void shouldReturnCorrectBasketValueFor2AppleAnd3LimesAnd3Melons() {
        List<String> basketList = List.of("Apple", "Limes", "Limes", "Limes", "Melons", "Melons", "Melons");
        BasketValue basketValue = new BasketValue();
        basketValue.calculatePrice(basketList);
        Assertions.assertEquals(105, basketValue.calculatePrice(basketList));
    }

    @Test
    public void shouldReturnCorrectBasketValueFor2AppleAnd4LimesAnd3Melons() {
        List<String> basketList = List.of("Apple", "Limes", "Limes", "Limes", "Limes", "Melons", "Melons", "Melons");
        BasketValue basketValue = new BasketValue();
        basketValue.calculatePrice(basketList);
        Assertions.assertEquals(120, basketValue.calculatePrice(basketList));
    }
    @Test
    public void shouldReturnCorrectBasketValueFor2AppleAnd4LimesAnd3MelonsAnd2Banana() {
        List<String> basketList = List.of("Apple", "Limes", "Limes", "Limes", "Limes", "Melons", "Melons", "Melons","Banana","Banana");
        BasketValue basketValue = new BasketValue();
        basketValue.calculatePrice(basketList);
        Assertions.assertEquals(160, basketValue.calculatePrice(basketList));
    }
}
