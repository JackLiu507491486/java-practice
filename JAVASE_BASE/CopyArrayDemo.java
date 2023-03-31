package com.JAVASE_BASE;

/**
 * 数组的元素复制
 */
public class CopyArrayDemo {
    public static void main(String[] args) {
        int []a1 = {1,2,3,4,5};
        int []a2 = new int[a1.length];
        copy(a1,a2);
        for(int i = 0;i < a1.length;i++) System.out.print(a1[i] + " ");
        System.out.println();
        for (int i = 0;i < a2.length;i++) System.out.print(a2[i] + " ");
    }

    public static void copy(int []a1,int []a2){
        for (int i = 0;i < a1.length;i++)
            a2[i] = a1[i];
    }
}
