import Task7.Execution.CountArguments;
import Task7.Input.InputFromConsole;
import org.junit.Assert;
import org.junit.Test;

public class Task8 {

    @Test
    public void testAddition() {
        InputFromConsole testInput1 = new InputFromConsole();
        testInput1.setArg1(2);
        testInput1.setArg2(2.3);
        testInput1.setOperType("+");
        Assert.assertEquals("Не работает сложение!",4.3, CountArguments.count(testInput1),0);
    }
    @Test
    public void testSubtraction() {
        InputFromConsole testInput2 = new InputFromConsole();
        testInput2.setArg1(15.455);
        testInput2.setArg2(9);
        testInput2.setOperType("-");
        Assert.assertEquals("Не работает вычитание!",6.455, CountArguments.count(testInput2),0);
    }
    @Test
    public void testMultiplication() {
        InputFromConsole testInput3 = new InputFromConsole();
        testInput3.setArg1(22);
        testInput3.setArg2(0.4);
        testInput3.setOperType("*");
        Assert.assertEquals("Не работает умножение!",8.8, CountArguments.count(testInput3),0);
    }
    @Test
    public void testDivision() {
        InputFromConsole testInput4 = new InputFromConsole();
        testInput4.setArg1(256);
        testInput4.setArg2(64);
        testInput4.setOperType("/");
        Assert.assertEquals("Не работает деление!",4, CountArguments.count(testInput4),0);
    }
}
