import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionPrimeNumberTest {

    @Test
     public void testThatANumberIsPrime(){
            int number = 2;
            assertTrue(FunctionPrimeNumber.isPrime(number));
     }

}
