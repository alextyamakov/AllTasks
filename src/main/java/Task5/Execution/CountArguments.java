package Task5.Execution;

import Task5.Input.InputFromConsole;

public class CountArguments implements Execute {

    public void count(InputFromConsole CurrentSign) {
        double arg1 = CurrentSign.getArg1();
        double arg2 = CurrentSign.getArg2();
        String currentSign = CurrentSign.getOperType();
        double result;


        if (currentSign.equals(plus)) {
            result = arg1 + arg2;
        } else if (currentSign.equals(minus)) {
            result = arg1 - arg2;
        } else if (currentSign.equals(multiplicate)) {
            result = arg1 * arg2;
        } else if (currentSign.equals(divide)) {
            result = arg1 / arg2;
        } else return;
        System.out.println(arg1 + " " + currentSign + " " + arg2 + " = " + result);

    }
}
