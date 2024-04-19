package services;
import models.Sneaker;
import models.Whiskey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class WhiskeyServiceTest {

    @Test
        public void createTest(){

            // (1)

            String expectedBrand = "Adidas";
            float expectedPrice = 80.00f;

            // (2)
            WhiskeyService whiskeyService = new WhiskeyService();
            Whiskey testWhiskey = whiskeyService.create( expectedBrand,expectedPrice);

            // (3)
            int actualId = testWhiskey.getId();
            String actualBrand = testWhiskey.getBrand();
            float actualPrice = testWhiskey.getPrice();

            // (4)
            Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
            Assertions.assertEquals(expectedBrand, actualBrand);
            Assertions.assertEquals(expectedPrice, actualPrice);

        }
    }



