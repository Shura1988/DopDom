/*Напишите программу на Java для сортировки числового массива и массива строк.*/

public class zadanie1 {
    public static void main(String[] args) {
        String [] arr = {"D", "E", "Q", "N", "A", "F", "K", "L" };
        int mass [] = {23, 45, 2, 7, 123, 19};
        System.out.println("Иcxoдный массив: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.print(arr[j]+ "  ");
        }
        System.out.println();
        System.out.println("Иcxoдный массив: ");
        for(int i=0; i<mass.length; i++)
        {
            System.out.print(mass[i] + "  ");
        }
        System.out.println();
        int t=0;
        for (int i=0 ; i<mass.length; i++){
            for (int j=mass.length-1; j>0; j--) {
                if (mass[j - 1] > mass[j]) {
                    t = mass[j - 1];
                    mass[j - 1] = mass[j];
                    mass[j] = t;
                }
            }
        }

        for(int i=0; i < mass.length; i++)
            System.out.print(mass[i] +"  ");
        System.out.println();
    }
}


