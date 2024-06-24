package co.uk.basket.project;

import co.uk.basket.project.domain.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceEngineTests {
    @Test
    public void shouldReturnCorrectPriceForDifferentProductsAndQuantities() {
        Assertions.assertEquals(70.0, PriceEngine.getPrice(Product.APPLE, 2));
        Assertions.assertEquals(30.0, PriceEngine.getPrice(Product.LIMES, 3));
        Assertions.assertEquals(30.0, PriceEngine.getPrice(Product.LIMES, 2));
        Assertions.assertEquals(45.0, PriceEngine.getPrice(Product.LIMES, 4));
    }
}
