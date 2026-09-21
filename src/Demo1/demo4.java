package Demo1;

import java.util.Scanner;

public class demo4 {
    //练习 5：统计字符串中的字符类型
    //知识点：String、charAt、字符判断、循环
    //要求：
    //输入一行字符串，统计其中：
    //大写字母个数
    //小写字母个数
    //数字个数
    //空格个数
    //其他字符个数

    //示例：
    //请输入一行字符串：
    //Hello World 123!
    //大写字母：2
    //小写字母：8
    //数字：3
    //空格：2
    //其他字符：1
    public static void main(String[] args) {
        //定义计数
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int space = 0;
        int other = 0;

        //录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch <= 'Z' && ch >= 'A') upper++;
            else if (ch <= 'z' && ch >= 'a') lower++;
            else if (ch <= '9' && ch >= '0') digit++;
            else if (ch == ' ') space++;
            else other++;
        }

        //打印
        System.out.print("大写字母：");
        System.out.println(upper);

        System.out.print("小写字母：");
        System.out.println(lower);

        System.out.print("数字：");
        System.out.println(digit);

        System.out.print("空格：");
        System.out.println(space);

        System.out.print("其他字符：");
        System.out.println(other);
    }
}
