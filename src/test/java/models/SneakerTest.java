package models;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SneakerTest {
    @Test public void setNameTest() {
            // given (1)
            String expected = "OZWEEGO";

            // when (2)
        Sneaker testSneaker = new Sneaker();
            testSneaker.setName(expected);

            // then (3)
            Assertions.assertEquals(expected, testSneaker.getName());
        }
        @Test
    public void setBrandTest(){
        String expected="xyz";
        Sneaker testSneaker=new Sneaker();
        testSneaker.setBrand(expected);
        Assertions.assertEquals(expected,testSneaker.getBrand());
        }
    @Test void setSportTest(){
        String expected="xyz";
        Sneaker testSneaker=new Sneaker();
        testSneaker.setSport(expected);
        Assertions.assertEquals(expected,testSneaker.getSport());
    }
    @Test void setIdTest(){
        int expected=Integer.MAX_VALUE;
        Sneaker testSneaker=new Sneaker();
        testSneaker.setId(expected);
        Assertions.assertEquals(expected,testSneaker.getId());
    }
    @Test void setSizeTest(){
        int expected=Integer.MAX_VALUE;
        Sneaker testSneaker=new Sneaker();
        testSneaker.setSize(expected);
        Assertions.assertEquals(expected,testSneaker.getSize());
    }
    @Test void setQtyTest(){
        int expected=Integer.MAX_VALUE;
        Sneaker testSneaker=new Sneaker();
        testSneaker.setQty(expected);
        Assertions.assertEquals(expected,testSneaker.getQty());
    }
    @Test void setPriceTest(){
        float expected=Float.MAX_VALUE;
        Sneaker testSneaker=new Sneaker();
        testSneaker.setPrice(expected);
        Assertions.assertEquals(expected,testSneaker.getPrice());
    }

        @Test // (1)
        public void constructorTest(){

            // (2)
            int expectedId = 6;
            String expectedName = "Stan Smith";
            String expectedBrand = "Adidas";
            String expectedSport = "Tennnis";
            int expectedQty = 10;
            float expectedPrice = 80.00f;

            // (3)
            Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                    expectedSport, expectedQty,expectedPrice);

            // (4)
            Assertions.assertEquals(expectedId, testSneaker.getId());
            Assertions.assertEquals(expectedName, testSneaker.getName());
            Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
            Assertions.assertEquals(expectedSport, testSneaker.getSport());
            Assertions.assertEquals(expectedQty, testSneaker.getQty());
            Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
        }
    @Test // (1)
    public void constructorIdTest() {
        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;
        // (3)
        Sneaker testSneaker = new Sneaker(expectedId);
        Assertions.assertEquals(expectedId, testSneaker.getId());
    }
    @Test // (1)
    public void constructorPriceTest() {
        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;
        // (3)
        Sneaker testSneaker = new Sneaker(expectedPrice);
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }

    @Test // (1)
    public void constructorQtyTest() {
        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;
        // (3)
        Sneaker testSneaker = new Sneaker(expectedBrand);
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
    }



    }




