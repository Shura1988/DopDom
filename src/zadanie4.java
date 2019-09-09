/*4. Напишите Java-программу для расчета среднего значения элементов массива.*/

import java.util.Random;
public class zadanie4 {
    public static void main (String[] args) {
        Random namber = new Random();
        int[] mass = new int[namber.nextInt(8) + 2];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ((int) (Math.random() * 10));
            System.out.print(mass[i] + "  ");

        }
        System.out.println();
        double summ = 0;
        int z= mass.length;
        System.out.println(z + "  ");
        for (int i=0; i<mass.length; i++){
            summ += mass[i];
        }
        System.out.println("Среднее значение элементов:  "+  summ/z);



    }
}
