package com.JAVASE_PRO.staticDemo1;

public class ArraysUtils {
    private ArraysUtils(){}

    //把int型数组输出
    public static String toString(int[] arr){
        String st = "[";
        for(int i = 0;i < arr.length;i++){
            if(i != arr.length - 1){
                st += arr[i] + ",";
            }else {
                st += arr[i];
            }
        }
        st += "]";
        return st;
    }

    //统计平均值

    public static double getAve(double[] arr){
        double max = arr[0];
        double min = arr[0];
        double add = arr[0];
        for(int i = 1;i < arr.length;i++){
            add += arr[i];
            max = max < arr[i] ? arr[i] : max;
            min = min > arr[i] ? arr[i] : min;
        }
        double avg = (add - max - min)/(arr.length - 2);
        return avg;
    }
}
