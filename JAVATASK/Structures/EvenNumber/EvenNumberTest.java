import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenNumberTest {
        @Test
         public void testThatEvenNumberIstrue(){
//          int number = 4;
          boolean expected = true;
          assertTrue(EvenNumber.isEven(4));
        }
    
}
