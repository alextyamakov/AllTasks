package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите операцию (1 - калькулятор; 2 - поиск длинного слова): ");
        int MainChoice = sc.nextInt();
        //Калькулятор
        if (MainChoice == 1) {
            System.out.println("Выберете операцию: \n1 - сложение\n2 - умножение\n3 - вычитание\n4 - деление:\n");
            int choice = sc.nextInt();
            System.out.println("Введите первый аргумент:");
            double arg1 = sc.nextDouble();
            System.out.println("Введите второй аргумент:");
            double arg2 = sc.nextDouble();
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
            //Поиск в массиве
        } else if (MainChoice == 2) {
            System.out.println("Введите размер массива: ");
            int size = sc.nextInt();
            String[] sample = new String[size];
            //Вводим элементы массива
            for (int i = 0; i < size; i++) {
                System.out.println("Введите " + i + "-й элемент массива (слово):");
                String temp1 = sc.next();
                sample[i] = temp1;
            }
            System.out.println(sample[0]);
            int[] arrlength = new int[size];
            //Получаем массив из длины элементов первого массива
            for (int i = 0; i < size; i++) {
                int temp2 = sample[i].length();
                arrlength[i] = temp2;
            }
            //Находим максимальное значение
            int max = 0;
            int imax = 0;
            for (int i = 0; i < size; i++) {
                if (arrlength[i] > max) {
                    max = arrlength[i];
                    imax = i;
                }
            }
            //Выводим самое длинное слово
            System.out.println("Самое длинное слово - " + sample[imax]);
        }
    }
}

