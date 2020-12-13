package Task7;

import Task7.Execution.CountArguments;
import Task7.Execution.Execute;
import Task7.Input.InputFromConsole;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Execute countArguments = new CountArguments();
        InputFromConsole inputSet = new InputFromConsole();

        System.out.println("Введите первый аргумент: ");
        try {
            inputSet.setArg1(sc.nextDouble());
        }
        catch (InputMismatchException f) {
            System.out.println("Вы ввели не число:" + f);
        }
        sc.nextLine();
        System.out.println("Введите оператор: ");
            inputSet.setOperType(sc.nextLine());
        System.out.println("Введите второй аргумент: ");
        try {
            inputSet.setArg2(sc.nextDouble());
        }
        catch (InputMismatchException f) {
            System.out.println("Вы ввели не число:" + f);
        }
        countArguments.count(inputSet);
    }
}
