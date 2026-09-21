//package Demo1;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("===求和及最大值最小值===");
//        System.out.println("请输入逗号分割的多个数值");
//        String line = sc.nextLine();
//        String[] parts = line.split(",");
//        int[] arr = new int[parts.length];
//        for (int i = 0; i < parts.length; i++) {
//            arr[i] = Integer.parseInt(parts[i]);
//        }
//
//        //输入数量
//        System.out.println("总共有" + arr.length + "个数字");
//
//        Arrays.sort(arr);
//
//        //计算总成绩
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            result = result + arr[i];
//        }
//        System.out.println("总数和：" + result);
//
//        //最高分
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        System.out.println("最大值：" + max);
//
//        //最低分
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(min < arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println("最小值：" + min);
//
//        //排序后结果
//        System.out.println("排序后的结果是：");
//        for (int grade : arr){
//            System.out.print(grade + " ");
//        }
//
//
//    }
//
//}
