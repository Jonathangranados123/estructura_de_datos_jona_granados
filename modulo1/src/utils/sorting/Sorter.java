package utils.sorting;

import java.util.Arrays;
import java.util.Random;

public abstract class Sorter {
    protected   int COMPARACIONES;
    protected int MOVIMIENTOS;


    public abstract void sort(int[] N);

    public static void getRandomArray(int n, int minVal, int maxVal) {
        Random random = new Random();
        random.ints(n, minVal, maxVal).toArray();
    }
    public static void printArray(int []N){
        System.out.println(Arrays.toString(N));
    }


   public static void swap (int []N,int i , int j){
        int temp = N[i];
        N[i]=N[j];
        N[j]=temp;

    }
    private static void printArray(Comparable[]a){

    }
    public static boolean isSorted(int[]N) {
        for (int i = 0; i < N.length - 1; i++) {
            if (N[i] > N[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int getCOMPARACIONES() {
        return COMPARACIONES;
    }



    public int getMOVIMIENTOS() {
        return MOVIMIENTOS;
    }


}

