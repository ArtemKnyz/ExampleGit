package jun1;

import java.util.Scanner;
import static jun1.Jun1.*;

public class ShortLong {

   static Jun1 ju = new Jun1();
    static int[] count;
    
           
    static void Array() {                            //заполняем массив числами
        count = new int[ju.number];
        for (int i = 0; i < number; i++) {
            System.out.println("input count " + i + ":");
            count[i] = new Scanner(System.in).nextInt();
        }
    }

    static Integer str(int i) {                             //определяем разрядность числа
        return String.valueOf(Math.abs(i)).length();
    }

    static int shortNumber = Integer.MAX_VALUE; //самая коротая разрядность числа
    static int longNumber = 0; // самая длинная разрядность числа
    static int m = 0, n = 0;    // соответсвенно короткое и длинное число

    static void number() {
       // Jun1.t = 10;
        for (int i = 0; i <= count.length - 1; i++) {
            if (shortNumber > str(count[i])) {
                shortNumber = str(count[i]);
                m = count[i];
            } 
            if (longNumber < str(count[i])) {
                longNumber = str(count[i]);
                n = count[i];
            }
        }
        System.out.println("самое короткое число и его разрядность = " + m + " " + shortNumber);
        System.out.println("самое длинное число и его разрядность  = " + n + " " + longNumber);
    }
}
