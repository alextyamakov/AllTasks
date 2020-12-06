package Task2;

/**
 * @author Alexander
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ввод цифры, обозначающей операцию
        System.out.println("Выберете операцию: \n1 - сложение\n2 - умножение\n3 - вычитание\n4 - деление:\n");
        int choice = in.nextInt();
        System.out.println("Введите первый аргумент:");
        double arg1 = in.nextDouble();
        System.out.println("Введите второй аргумент:");
        double arg2 = in.nextDouble();
        double result = 0;
        //Выполнение арифметической операции, выбранной пользователем
        switch (choice) {
            case 1:
                result = arg1 + arg2;
                break;
            case 2:
                result = arg1 * arg2;
                break;
            case 3:
                result = arg1 - arg2;
                break;
            case 4:
                result = arg1 / arg2;
                break;
        }
        //Вывод результата
        System.out.printf("Результат операции: %.4f", result);
    }
}
