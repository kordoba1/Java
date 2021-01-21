package Program;

import java.util.Scanner;

public class Main {

    private static int getW_of_a(int[] mas, int x, int W) {
        mas[0] = ((Math.pow(x, 4) - (8 * Math.pow(x, 3)) + 2 * x - 12) >= 0 ? 1 : -1);
        mas[1] = ((4 * Math.pow(x, 3) - 24 * Math.pow(x, 2) + 2) >= 0 ? 1 : -1);
        mas[2] = ((24 * Math.pow(x, 2) - 3 * x + 22 ) >= 0 ? 1 : -1);
        mas[3] = ((-317 * x - 1130 ) >= 0 ? 1 : -1);
        mas[4] = 1;

        int y = 0;
        for (int i = 1; i < 5; i++)
            if (mas[i] != mas[i - 1])
                y++;
        return y;
    }

    private static void printTable(int[] mas, int x, int W) {
        System.out.print("\t" + x);
        for (int i = 0; i < mas.length; i++) {

            System.out.print("\t\t");
            if (mas[i] == 1)
                System.out.print("+");
            else
                System.out.print("-");

        }
        System.out.println("\t\t" + W);
    }



    public static void main(String[] args) {

        System.out.println("Задане рівняння f(x) = x^4 - 8x^3 + 2x - 12 = 0");
        System.out.println("f1(x) = f`(x) = 4x^3 - 24x^2 + 2");
        System.out.println("f2(x) = 24x^2 - 3x + 22");
        System.out.println("f3(x) = 317x - 1130");
        System.out.println("f4(x) = 316");



        System.out.print("Введіть проміжок на якому хочете дослідити рівнння: ");
        Scanner in = new Scanner(System.in);
        int lower_edge = in.nextInt();
        int upper_edge = in.nextInt();

        int first = lower_edge;
        int second = ++lower_edge;
        int[] mas = new int[5];
        int[] roots = new int[upper_edge * 2];
        int[] edge = new int[10];

        System.out.println("\n\t\t\t\t\t\tТаблиця зміни знаків");
        System.out.println("\t x\t   f(x)   f1(x)   f2(x)   f3(x)   f4(x)    W(x)");
        int counter = 0, edge_counter = 0;

        System.out.println("\nРезультати виконання програми: ");
        while (second <= upper_edge) {

            int W_of_A = 0;
            int W_of_B = 0;

            W_of_A = getW_of_a(mas, first, W_of_A);
            printTable(mas, first, W_of_A);

            W_of_B = getW_of_a(mas, second, W_of_B);
            roots[counter] = W_of_A - W_of_B;

            if (roots[counter] > 0) {
                edge[edge_counter++] = first;
                edge[edge_counter++] = second;
            }

            first++;
            second++;
            counter++;
        }

        System.out.println("\nРезультати виконання програми: ");
        for (int i = 0, j = 0; i < roots.length; i++) {
            if (roots[i] > 0)
                System.out.println("\n" + roots[i] + " коренів на проміжку: " + edge[j++] + " < x < " + edge[j++]);
        }
        System.out.println("\n");

    }


}

