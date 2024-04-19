package models;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class WhiskeyTest {


    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getBrand());
    }


@Test
    public void setIdTest() {
        // given (1)
       int expected = 9;

        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setId(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getId());
    }

    @Test
    public void setPriceTest() {
        // given (1)
       float expected = 9.0F;

        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getPrice());
    }


    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedBrand = "xyz";
        float expectedPrice = 80.00f;

        // (3)
        Whiskey testWhiskey = new Whiskey(expectedBrand, expectedId,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testWhiskey.getId());

        Assertions.assertEquals(expectedBrand, testWhiskey.getBrand());

        Assertions.assertEquals(expectedPrice, testWhiskey.getPrice());
    }






}
