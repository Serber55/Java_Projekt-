package pl.lublin.wsei.java.cwiczenia;

import java.awt.print.Printable;
import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java world/n");

        System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota");

        System.out.println("Ala/n");
        System.out.println("ma/n");
        System.out.println("kota/n");

        // write your code here
        // test
        /* test */

        int a = 3;
        double b = 4.21;
        String s = "jakis tekst";
        System.out.printf("a = %d, b = %f, s = %20s %n", a, b, s);

        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));


        boolean first = true;
        int valueOfPow = 0;
        int valueOfArgSum = 0;
        String state = "arg";
        int iloscWierszy = 12; // Tu należy wpisać ilość wierszy

        for (int i = -1; i <= iloscWierszy; i++) {
            for (int j = 1; j <= 3; j++) {
                if (first == true) {
                    first = false;
                    System.out.print("arg \t log2(arg) \t sum(arg)");
                    j = 3;
                } else {
                    switch (state) {
                        case "arg":
                            valueOfPow = (int) Math.pow(2, i);
                            System.out.print(valueOfPow);
                            valueOfArgSum += valueOfPow;
                            state = "log";
                            break;
                        case "log":
                            System.out.print((int) (Math.log(valueOfPow) / Math.log(2)));
                            state = "sum";
                            break;
                        case "sum":
                            System.out.print(valueOfArgSum);
                            state = "arg";
                            break;
                    }
                    System.out.print("\t ");
                }


            }

            System.out.print("\n");

        }

        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        do {
            System.out.print("Podaj pierwszą liczbę");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if ((num1 == 0) || (num2 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        } while (true);




    }
    public static String leftPad (String aText, char aChar, int aWidth)
    {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length();i++)
            res = aChar + res;
        return  res;

        int[] liczby = new int[30];
        Random rnd = new Random();

        for( int i = 0; i < 30; i++)
            liczby[i] = rnd.nextInt();

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        long avg = 0;
        for(int l : liczby)
        {
            System.out.println();
            if (1 < mn) mn = 1;
            if (1 > mx) mx = 1;
            avg += 1;
        }
        System.out.printf("MIN = %d, MAX = %d, AVG = %f, mn,mx, (float)avg/liczby.length ");
    }
}


















