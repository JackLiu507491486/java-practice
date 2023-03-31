package com.JAVASE_BASE;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {5,3,8,2,7,9,6,1};
        for(int i = 1;i <= arr.length-1;i++){
            for(int j = 0;j < arr.length-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
