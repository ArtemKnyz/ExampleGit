package jun1;

import java.util.Arrays;
import java.util.Scanner;

class Jun1 {

    static int number = 0;
    static ShortLong sh = new ShortLong();

    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("сколько чисел вы хотите ввести?");
        Scanner num = new Scanner(System.in);
        number = num.nextInt();

        sh.Array();  //наполняем массив вводимыми числами
        sh.number(); //ищем короткое и длинное число и их разрядность
        sh.gag();
        sh.sort(new ShortLong().ss);
        // Arrays.sort(sh.ss);
        
    }
}
