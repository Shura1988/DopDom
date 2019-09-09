/*3. Напишите программу на Java для печати следующей сетки.*/

public class zadanie3 {
    public  static void main (String[] args) {


       String[][] mass = new String[10][10];
        String k = "*";
        int i, j;
        for (i = 0; i < mass.length; i++) {
            for (j = 0; j < mass.length; j++) {
                mass[i][j] = k;
                System.out.print(mass[i][j] + "  ");
            }

            System.out.println();
        }

    }}





