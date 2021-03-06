package jun1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javafx.animation.KeyValue;
import static jun1.Jun1.*;

public class ShortLong {

    static Jun1 ju = new Jun1();
    static int[] count;
    static int[]ss;

    static void Array() {                            //заполняем массив числами
        count = new int[number];
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

    static int[] greater = new int[ju.number];

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

    void gag() {
        shortNumber = Integer.MAX_VALUE;
        ss = new int[number];
        for (int j = 0; j < count.length; j++) {
            ss[j] = count[j];
            M:
            for (int i = j+1; i <= count.length-1 ; i++) {
                if ((str(count[i]) < str(ss[j]))) {
                    if ((count[i]) == ss[j]) continue;
                    shortNumber = str(count[i]);
                    m = ss[j];
                    ss[j] = count[i];
                    count[i] = m;
                }
            }
        }
        System.out.println("числа по возрастанию: " + Arrays.toString(ss));
    }


public  void sort(int[]array) {                       //сортируем в обратном порядке
        for (int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        
         System.out.println("числа по убыванию: "+Arrays.toString(array));
    }
}