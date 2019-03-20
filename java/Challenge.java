package com.stackroute;

import java.util.Arrays;

public class Challenge {
    int sortArray(int[] arr, int k, int n) {
        while (k > 0) {
            Arrays.sort(arr);
            k--;
        }return arr[0];
    }
}
