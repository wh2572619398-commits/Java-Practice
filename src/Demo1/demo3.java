package Demo1;

import java.util.Scanner;

public class demo3 {
//    请输入数组长度：5
//    请输入5个整数：
//            3 1 4 2 5
//
//    总和：15
//    平均值：3.0
//    最大值：5
//    最小值：1
//    降序排序：5 4 3 2 1
    public static void main(String[] args) {
        System.out.print("请输入数组长度：");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        //录入数组数据
        System.out.println("请输入"+ length + "个整数");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        //计算
        //1总和
        double result1;
        int sum = 0;
        System.out.print("总和：");
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];
        }
        result1 = sum;
        System.out.println(result1);

        //2平均值
        System.out.print("平均值：");
        double result2;
        result2 = sum/length;
        System.out.println(result2);

        //3最大值(冒泡排序)
        System.out.print("最大值：");
        int max = arr[0];
        for (int i = 1; i < length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

        //4最小值
        System.out.print("最小值：");
        int min = arr[0];
        for (int i = 1; i < length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);

        //降序(冒泡排序)
        System.out.println("降序排序：");
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int num:arr){
            System.out.print(num + " ");
        }

    }
}
