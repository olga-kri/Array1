import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Объявить три массива: целочисленный, дробный, произвольный
        int[] oneTwoThree = new int[3];
        oneTwoThree[0] = 1;
        oneTwoThree[1] = 2;
        oneTwoThree[2] = 3;
        float[] fractions = {1.57f, 7.654f, 9.986f};
        boolean[] trueOrFalse = new boolean[5];

        // Задача 2: Распечатайте на отдельной строчке элементы каждого массива через запятую
        for (int index = 0; index < oneTwoThree.length; index++) {
            if (index == oneTwoThree.length - 1) {
                System.out.print(oneTwoThree[index]);
                break;
            }
            System.out.print(oneTwoThree[index] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(fractions));
        System.out.println(Arrays.toString(trueOrFalse));
        // Задача 3: Выведите на отдельной строке элементы массиво в обратном порядке
        for (int index = oneTwoThree.length-1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(oneTwoThree[index]);
                break;
            }
            System.out.print(oneTwoThree[index] + ", ");
        }
        System.out.println();
        for (int index = fractions.length-1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(fractions[index]);
                break;
            }
            System.out.print(fractions[index] + ", ");
        }
        System.out.println();
        for (int index = trueOrFalse.length-1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(trueOrFalse[index]);
                break;
            }
            System.out.print(trueOrFalse[index] + ", ");
        }
        //Задача 4: в целочисленном массиве все нечетные числа сделать четными
        System.out.println();
        for (int index = 0; index < oneTwoThree.length; index++) {
            if (oneTwoThree[index] % 2 != 0) {
                oneTwoThree[index] = oneTwoThree[index] + 1;
            }
        }
            System.out.println(Arrays.toString(oneTwoThree));

    }
}