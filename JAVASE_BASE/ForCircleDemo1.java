/**
 * 利用for循环求得1-100的和
 */
package com.JAVASE_BASE;

public class ForCircleDemo1 {
    public static void main(String[] args) {
        int sum_data = 0;
        for(int i = 1;i <= 100;i++){
            sum_data += i;
        }
        System.out.println("1-100的和为" + sum_data);
    }
}
