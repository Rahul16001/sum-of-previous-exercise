package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] arr){

        //put your code here
        boolean [] ans = new boolean[arr.length];

        for(int i=2;i<arr.length;i++)
        {
            if(arr[i] == (arr[i-2] + arr[i-1]))
            {
                ans[i] = true;
            }
        }
        return ans;

//        throw new UnsupportedOperationException();
    }
}
