import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char DIVISION = '/';
    public static final char EQUALS = '=';
@Test
@DisplayName("Testing addition")
void testCalculatorAdd() throws RuntimeException {
    int firstOperand = 1;
    int secondOperand = 1;
    char operator = ADDITION;
    int expected = 2;

    int result= Calculator.calculate(firstOperand, secondOperand, operator);
    assertEquals(expected, result);
}
    @Test
    @DisplayName("Testing subtraction")
    void testCalculationSub() throws RuntimeException {
    int a=2;
    int b=1;
    char o= '-';
    int expected=1;

    int result = Calculator.calculate(a, b, o);
    assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing multiplication ")
    void testCalculateMul() throws RuntimeException {
    int a=2;
    int b=2;
    char o= '*';
    int expected= 4;

    int result = Calculator.calculate(a,b,o);
    assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() throws RuntimeException {
    int a=6;
    int b=3;
    char o= '/';
    int expected = 2;

    int result = Calculator.calculate(a,b,o);
    assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero(){
    int a =2;
    int b= 0;
    char o= '/';
    assertThrows(RuntimeException.class,()->{Calculator.calculate(a,b,o);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator(){
    int a=2;
    int b=1;
    char o= '=';
    assertThrows(RuntimeException.class,()->{Calculator.calculate(a,b,o);});
    }
}