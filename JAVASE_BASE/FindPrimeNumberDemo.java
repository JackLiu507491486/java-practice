package com.JAVASE_BASE;

/**
 * 查找101-200的素数
 */
public class FindPrimeNumberDemo {
    public static void main(String[] args) {
        getPrimeNumber();
    }
    public static void getPrimeNumber(){
        int n = 0;
        System.out.println("101-200的素数:");
        for(int i = 101;i <= 200;i+=2){
            int j;
            for(j = 2;j <= i/2;j++){
                if(i%j == 0)    break;
            }
            if(j == i/2 + 1) {
                System.out.print(i + "\t");
                n++;
            }
        }
        System.out.println();
        System.out.println("总共" + n +"个素数");
    }
}
