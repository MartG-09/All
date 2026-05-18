import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOddTest {

    @Test
      public void TestThatArrayOddExists(){
            int[] array = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
            ArrayOdd.arrayOdd(array);
     }

    @Test
     public void TestThatNewArrayReturnsOddNumber(){
            int[] array = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
            int[] expected = {1 , 3 , 5 , 7 , 9 };
            int[] actual = (ArrayOdd.arrayOdd(array));
            assertArrayEquals(actual , expected);
    }

}
