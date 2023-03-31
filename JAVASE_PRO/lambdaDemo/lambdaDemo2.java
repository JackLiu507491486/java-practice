package com.JAVASE_PRO.lambdaDemo;

import java.util.Arrays;

public class lambdaDemo2 {
    public static void main(String[] args) {
        /*还能再次简化*/
        Integer[] arr = {10,50,6,3,2,5,98,54,27,-85};
        /*Arrays.sort(arr,((Integer o1,Integer o2) -> {
            return o2 - o1;
        }));*/
        //Arrays.sort(arr,((o1, o2) -> {
        //     return o2 - o1;
        // }));
        Arrays.sort(arr,((o1,o2) -> o2 - o1));
        System.out.println(Arrays.toString(arr));
    }
}
