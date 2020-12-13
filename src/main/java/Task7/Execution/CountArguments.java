package Task7.Execution;

import Task7.Input.InputFromConsole;

public class CountArguments implements Execute {

    public void count(InputFromConsole CurrentSign) {
        double arg1 = CurrentSign.getArg1();
        double arg2 = CurrentSign.getArg2();
        String currentSign = CurrentSign.getOperType();
        double result = 0;


        if (currentSign.equals(plus)) {
            result = arg1 + arg2;
            System.out.println(arg1 + " " + currentSign + " " + arg2 + " = " + result);
        } else if (currentSign.equals(minus)) {
            result = arg1 - arg2;
            System.out.println(arg1 + " " + currentSign + " " + arg2 + " = " + result);
        } else if (currentSign.equals(multiplicate)) {
            result = arg1 * arg2;
            System.out.println(arg1 + " " + currentSign + " " + arg2 + " = " + result);
        } else if ((arg2 == 0) && (currentSign.equals(divide))) {
            try {
                throw new Exception("На ноль делить нельзя");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (currentSign.equals(divide)) {
            result = arg1 / arg2;
            System.out.println(arg1 + " " + currentSign + " " + arg2 + " = " + result);
        } else try {
            throw new Exception("Был введен неверный знак оператора");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
