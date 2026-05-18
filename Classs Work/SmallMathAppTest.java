import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class SmallMathAppTest {

    SmallMathApp miniApp;

    @BeforeEach
        void setUp(){
            miniApp = new SmallMathApp();
    }

    @Test
        public void testThatSmallMathAppExists() {
                miniApp.operators("+");
        }

    @Test
        public void testThatSmallMathAppMultiplyNumbers() {
                double expected = 20;
                double actual = miniApp.operators("*");
                assertEquals(actual , expected);
        }

    @Test
        public void testThatSmallMathAppAddNumbers() {
                double expected = 12;
                double actual = miniApp.operators(" + ");
                assertEquals(actual , expected);
        }

    @Test
        public void testThatSmallMathAppDivideNumbers() {
                double expected = 5;
                double actual = miniApp.operators(" / ");
                assertEquals(actual , expected);
        }

    @Test
        public void testThatSmallMathAppSubtratNumbers() {
                double expected = 8;
                double actual = miniApp.operators("-");
                assertEquals(actual , expected);
        }

    @Test
        public void testThatInSmallMathAppInvalidOperatorIsEnteredExceptionIsThrown() {
                assertThrows(IllegalArgumentException.class, ()-> miniApp.operators("%"));
                assertEquals(miniApp.operators("%"));
        }

}







