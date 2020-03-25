package mypackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculationTest {

    public CalculationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getSum method, of class Calculation.
     */
    @Test//test case
    public void testGetSumValid() {
        Calculation calc = new Calculation();
        int result = calc.getSum(2, 2);
        assertEquals(4, result);
    }

    @Test//test case
    public void testGetSumNotValid() {
        Calculation calc = new Calculation();
        int result = calc.getSum(2, 2);
        assertNotEquals(5, result);

    }

    
    @Test//test case
    public void testDivision(){
        Calculation calc = new Calculation();
        double result = calc.division(4, 2);
        assertEquals(2, result, 0.1);

    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroNumber(){
        Calculation calc = new Calculation();
        double result = calc.division(4, 0);
        //assertEquals(2, result, 0.1);
    }
    @Test
    public void testDivisionNegativeNumber(){
        Calculation calc = new Calculation();
        double result = calc.division(-4, -2);
        assertFalse(result < 0);
    }
    
    @Test
    public void testSumOfArrayValid(){
        Calculation calc = new Calculation();
        int [] array = {2, 4, 8};
        int sum = calc.sumOfArray(array);
        assertNotEquals(14, sum);
    }
    
    @Test
    public void testMultiplyArrayByNumberValid(){
        Calculation calc = new Calculation();
        int [] array = {2, 5, 10, 3};
        int num = 10;
        calc.multiplyArrayByNumber(array, num);
        int [] expected = {20, 50, 100, 30};
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        assertArrayEquals(expected, array);
    }

}
