
/*2. Напишите Java-программу для суммирования значений массива. */

public class zadanie2 {
    public static void main(String[] args) {
        int mass[] = {23, 45, 2, 7, 123, 19};
        int summ = 0;

        for (int i = 0; i < mass.length; i++) {
            summ += mass[i];

        }
        System.out.print(" Сумма =  " + summ);
    }
}

