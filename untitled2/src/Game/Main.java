package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static final int N = 5;
    private static final int size = 3 + N;
    private static int[][] Q = new int[5][size];

    public static void main(String[] args) {
        setQ();
        for (int i = 0; i < size; i++) {
            System.out.print(" A" + (i + 1) + "");
        }
        System.out.println();
        show(Q);
        double[] C = getCoefficients();
        LinearCoagulation(Q, C);
        int[] C1 = getCof();
        MaxMinCoagulation(Q, C1);
    }

    private static void setQ() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < size; j++) {
                Q[i][j] = getRandomNumber(1, N + 3);
            }
        }
    }

    private static void LinearCoagulation(int[][] Q, double[] C) {
        System.out.println("___Метод лінійного згортання___ ");
        System.out.println("Вагові коефіцієнти");
        for (int i = 0; i < C.length; i++) {
            System.out.print("λ" + (i + 1) + "=" + C[i] + "; ");
        }
        System.out.println("\n");
        double[][] linearQ = new double[5][size];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < size; j++) {
                linearQ[i][j] = round(Q[i][j] * C[i], 2);
            }
        }
        show(linearQ);
        List<Double> linearC = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();
        double sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 5; j++) {
                sum += linearQ[j][i];
            }
            indexes.add(i);
            linearC.add(round(sum, 2));
            sum = 0;
        }
        System.out.print("Σ(λi×Qi)");
        for (Double aDouble : linearC) {
            System.out.print(" " + aDouble + " ");
        }
        System.out.println();
        double max = linearC.stream().max(Comparator.comparing(Double::doubleValue)).get();
        int index = linearC.indexOf(max);
        index = indexes.indexOf(index) + 1;
        System.out.println("За критерієм лінійної згортки оптимальною є альтернатива А" + index + " при Q = " + max);
        System.out.println();
    }

    private static void MaxMinCoagulation(int[][] Q, int[] C) {
        System.out.println("___Метод максимінного згортання___");
        System.out.println("Нормативні значення складових критеріїв");
        for (int i = 0; i < C.length; i++) {
            System.out.print("Q" + (i + 1) + "=" + C[i] + "; ");
        }
        System.out.println("\n");
        double[][] maxminQ = new double[5][size];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < size; j++) {
                maxminQ[i][j] = round((double) Q[i][j] / C[i], 2);
            }
        }
        show(maxminQ);
        List<Double> mins = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            double minm = maxminQ[0][i];
            for (int j = 1; j < 5; j++) {
                if (maxminQ[j][i] < minm) {
                    minm = maxminQ[j][i];
                }
            }
            mins.add(minm);
            indexes.add(i);
        }
        System.out.print("min");
        for (Double aDouble : mins) {
            System.out.print(" " + aDouble + " ");
        }
        System.out.println();
        double max = mins.stream().max(Comparator.comparing(Double::doubleValue)).get();
        int index = mins.indexOf(max);
        index = indexes.indexOf(index) + 1;
        System.out.println("За критерієм максимінної згортки оптимальною є альтернатива А" + index + " при Q = " + max);
    }

    private static double[] getCoefficients() {
        double[] coefficients = new double[5];
        double sum = 0;
        do {
            for (int i = 0; i < coefficients.length; i++) {
                coefficients[i] = round(Math.random(), 2);
            }
            sum = Arrays.stream(coefficients).sum();
        } while (sum != 1.0);
        return coefficients;
    }

    private static int[] getCof() {
        int[] coefficients = new int[5];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = getRandomNumber(1, 3 + N);
        }
        return coefficients;
    }

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    private static void show(double[][] matrix) {
        System.out.print("Q1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + matrix[i][j] + " ");
                if (j == size - 1) {
                    System.out.println();
                    if (i != 4) System.out.print("Q" + (i + 2));
                }
            }
        }
        System.out.println();
    }
}