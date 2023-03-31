package com.JAVASE_BASE;

/**
 * 比较两个数组是否相同
 */
public class MethodDemo6 {
    public static void main(String[] args) {
        int []arr1 = {10,20,30,40};
        int []arr2 = {10,20,30,40};
        int []arr3 = {10,5};

        System.out.println(compareArray(arr1,arr2));
        System.out.println(compareArray(arr1,arr3));
    }

    public static boolean compareArray(int []arr1,int []arr2){
        if(arr1.length != arr2.length)
            return false;
        else{
            for(int i = 0;i < arr1.length;i++){
                if(arr1[i] != arr2[i])
                {
                    return false;
                }
            }
            return true;
        }
    }
}
