/*5. Напишите программу на Java, чтобы проверить, содержит ли массив определенное значение.*/

import java.util.Random;
public class zadanie5 {
    public static void main(String[] args) {
        Random namber = new Random();
        int[] mass = new int[namber.nextInt(8) + 2];
        int i;
        int x = 7;
        for (i = 0; i < mass.length; i++) {
            mass[i] = ((int) (Math.random() * 10));
            System.out.print(mass[i] + "  ");

        }
        System.out.println();
        for (i = 0; i < mass.length; i++) {
            if (mass[i] == x) {
                System.out.print(" в массиве еcть искомое значение");
                break;

            }
        }

    }
}






