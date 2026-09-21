package Demo1;

import java.security.KeyStore;
import java.util.Scanner;

public class demo2 {
//    知识点：循环、break、方法、Math.sqrt
//
//    要求：
//
//    从键盘输入一个整数 n。
//
//    输出 1~n 之间所有素数。
//
//    每行输出 5 个素数。
//
//    示例：
//
//    text
//    请输入 n：50
//            2 3 5 7 11
//            13 17 19 23 29
//            31 37 41 43 47
    public static void main(String[] args) {
        int count2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入n:");
        int n = sc.nextInt();
        for (int i = 1;i <= n;i++){
            boolean result = justify(i);
            if(result == true){
                if (count2 != 5){
                    System.out.print(i + " ");
                }
                else {
                    System.out.println();
                    System.out.print(i + " ");
                    count2 = 0;
                }
                count2++;
            }
        }
    }
    static boolean justify(int num){
        int count1 = 0;
        if(num == 1) return false;
        else {
            for (int i = 2;i<num; i++){
                if (num % i == 0) count1++;
            }
            if (count1 == 0) return true;
            else return false;
        }
    }

}
