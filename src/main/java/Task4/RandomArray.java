package Task4;

public class RandomArray {
    //метод для генерации значений в массив
    public static int random(int temp) {
        return (int) (Math.random() * 20 - 10);
    }

    public static void main(String[] args) {
        int[] RandomArray = new int[20];
        for (int i = 0; i < RandomArray.length; i++) {
            RandomArray[i] = random(i);
        }
        int plus_value = 10;
        int minus_value = -10;
        //Поиск нужных значений
        for (int j : RandomArray) {
            if (j > 0) {
                if (j < plus_value) {
                    plus_value = j;
                }
            } else if (j < 0) {
                if (j > minus_value) {
                    minus_value = j;
                }
            }
        }
        System.out.println("Получился массив: ");
        for (int j : RandomArray) {
            System.out.print(j + " ");
        }
        System.out.println("\nМинимальное положительное: " + plus_value + "; Максимальное отрицательное: " + minus_value + "\n");

        //Помечаем элементы массива, которые нужно поменять
        for (int i = 0; i < RandomArray.length; i++) {
            if (RandomArray[i] == plus_value) {
                RandomArray[i] = 11;
            }
            if (RandomArray[i] == minus_value) {
                RandomArray[i] = -11;
            }
        }
        //Наконец меняем на противоположные занчения
        for (int i = 0; i < RandomArray.length; i++) {
            if (RandomArray[i] == 11) {
                RandomArray[i] = minus_value;
            }
            if (RandomArray[i] == -11) {
                RandomArray[i] = plus_value;
            }
        }
        System.out.println("Получился новый массив: ");
        for (int j : RandomArray) {
            System.out.print(j + " ");
        }
    }
}

