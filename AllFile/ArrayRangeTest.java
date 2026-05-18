import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayRangeTest{
    
    @Test
     public void testThatCalculatingRangeReturnsCorrectValue(){
        int[] array = {2 , 5 , 7 , 9 , 20}
        int expectedValue = 18;
        int actualValue = ArrayRange.isRange(array);
        AssertEquals(actualValue, expectedValue);
    }
}
