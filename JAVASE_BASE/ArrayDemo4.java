package com.JAVASE_BASE;

import java.util.Random;

/**
 * 随机打乱数组元素的顺序
 * 已知顺序：22、33、35、13、88
 * 思路：以此遍历数组元素，给予一个随机索引，该元素所在位置与索引进行交换
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        int staff_number[] = new int[]{22,33,35,13,88};
        Random r = new Random();
        int r_num,temp;
        for(int i = 0;i < staff_number.length;i++){
            r_num = r.nextInt(staff_number.length);
            if(r_num != i){
                temp = staff_number[i];
                staff_number[i] = staff_number[r_num];
                staff_number[r_num]  = temp;
            }
        }
        System.out.print("随机数组为：");
        for (int i = 0;i < staff_number.length;i++)
            System.out.print(staff_number[i] + " ");
    }
}
