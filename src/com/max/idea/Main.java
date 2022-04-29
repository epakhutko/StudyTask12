package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(in).useLocale(Locale.ENGLISH);
        System.out.println("Input two numbers");
        String a = inp.nextLine();
        int b = inp.nextInt();
        int c = Integer.parseInt(a);
        if (b>c) {
            System.out.printf("Bigger humber is :%d\n", b);
            double x = (double) c;
            System.out.printf("Smaller number is:%f\n", x);
        }


        else {
            System.out.printf("Bigger humber is :%d\n", c);
            double x = (double) b;
            System.out.printf("Smaller number is:%f\n", x);
        }

    }
}