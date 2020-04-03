package jun1;

import java.util.Scanner;

class Jun1 {

    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("сколько чисел вы хотите ввести?");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
//заполняем массив числами
        int[] count = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("input count " + i + ":");
            count[i] = new Scanner(System.in).nextInt();
        }
        //находим самое короткое и самое длинное число и его разрядность
        int shortNumber = Integer.MAX_VALUE;  //самая коротая разрядность числа
        int longNumber = 0; // самая длинная разрядность числа
        int[] m = {0, 0, 0, 0};
        for (int i = 0; i < count.length - 1; i++) {
            shortNumber = (shortNumber > str(count[i])) ? str(count[i]) : shortNumber;
            if (shortNumber > str(count[i])) {
                m[0] = count[i - 1];
            }

            longNumber = (longNumber < str(count[i])) ? str(count[i]) : longNumber;
            if (longNumber >= str(count[i])) {
                m[1] = count[i];
                System.out.println("m[1]=" + m[1] + " " + longNumber);
            }
        }

        System.out.println("самое короткое число и его разрядность = " + m[0] + " " + shortNumber);
        System.out.println("самое длинное число и его разрядность  = " + m[1] + " " + longNumber);

    }

    //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    static Integer str(int i) {
        return String.valueOf(Math.abs(i)).length();
    }

}
