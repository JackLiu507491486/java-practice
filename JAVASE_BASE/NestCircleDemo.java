/**
 * 在控制台用*打印4行五列的矩阵（如下）
 *     *****
 *     *****
 *     *****
 *     *****
 */
package com.JAVASE_BASE;

public class NestCircleDemo {
    public static void main(String[] args) {
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 5;j++)
                System.out.print('*');
                System.out.println();
        }
    }

}
