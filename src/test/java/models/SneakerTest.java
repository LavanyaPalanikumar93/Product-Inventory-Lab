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


    }

