package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import src.FizzyPrinter;


public class FizzyPrinterTest {
    private FizzyPrinter printer;
    String result;

    @Before
    public void setUp() {
        printer = new FizzyPrinter();
    }

    @Test
    public void testFizz() {
        result = printer.printFizzy(9, false);
        assertEquals("Fizz",result);
    }

    @Test
    public void testFizzBuzzBang() {
        result = printer.printFizzy(105, false);
        assertEquals("Fizzbuzzbang", result);
    }

    @Test
    public void testBoomUppercase() {
        result = printer.printFizzy(13,true);
        assertEquals("BOOM", result);
    }
}