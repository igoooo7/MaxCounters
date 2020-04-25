package com.igor.leskiewicz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int M = 7;
        Integer[] A = new Integer[M];
        A[0] = 3;
        A[1] = 4;
        A[2] = 4;
        A[3] = 6;
        A[4] = 1;
        A[5] = 4;
        A[6] = 4;

        int N = 5;

        Integer[] C = new Integer[N];
        Arrays.fill(C, 0);

        int max = 0;

        for (Integer i : A) {
            if (i <= N) {
                C[i-1]++;
            }
            else {
                for (Integer j : C) {
                    C[j] = max;
                }
            }

            for(Integer k : C) {
                if (k > max) { max = k; }
            }
        }

        for (Integer i : C) {
            System.out.println(i);
        }


    }

}
