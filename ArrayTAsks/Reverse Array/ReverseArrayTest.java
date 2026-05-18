import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseArrayTest {

    @Test
     public void TestThatReverseArrayExists(){
            int[] array = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
            ReverseArray.reverse(array);
     }

    @Test
     public void TestThatOriginalArrayIsReversed(){
            int[] array = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
            int[] expected ={ 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1} ;
            int[] actual = ReverseArray.reverse(array);
            assertArrayEquals(expected , actual);
     }

}
