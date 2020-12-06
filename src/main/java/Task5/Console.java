package Task5;

import Task5.Execution.CountArguments;
import Task5.Execution.Execute;
import Task5.Input.InputFromConsole;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Execute countArguments = new CountArguments();
        InputFromConsole inputSet = new InputFromConsole();

        System.out.println("Введите первый аргумент: ");
        inputSet.setArg1(sc.nextDouble());
        sc.nextLine();
        System.out.println("Введите оператор: ");
        inputSet.setOperType(sc.nextLine());
        System.out.println("Введите второй аргумент: ");
        inputSet.setArg2(sc.nextDouble());
        countArguments.count(inputSet);
    }
}
