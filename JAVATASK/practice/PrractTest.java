import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrractTest {

        @Test
         public void testThatEvenIndexIsPrinted(){
           int[] array = {12, 2, 46, 48, 3};
           int[] expected ={12 , 46 , 3};
           int[] actual = Prract.evenIndexArray(array);
           assertArrayEquals(actual , expected);
        }

}
