package Demo1;

import java.util.Scanner;

public class demo100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("星级成绩评定系统");
        while (true) {
            System.out.print("请输入成绩：");
            int score = sc.nextInt();
            if (score == -1) {
                System.out.println("程序结束！");
                break;
            } else if (score >= 80 && score <= 100) {
                System.out.println("****四星成绩");
            } else if (score >= 70 && score <= 79) {
                System.out.println("***三星成绩");
            } else if (score >= 60 && score <= 69) {
                System.out.println("**二星成绩");
            } else if (score >= 0 && score <= 59) {
                System.out.println("无星成绩");
            }
        }
    }
}
