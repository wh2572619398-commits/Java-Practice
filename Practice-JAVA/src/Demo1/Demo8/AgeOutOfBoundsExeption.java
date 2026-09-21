package Demo1.Demo8;

import java.lang.reflect.Member;
import java.rmi.registry.Registry;
import java.util.Scanner;

//异常处理
//练习 1：用户注册校验 ⭐⭐
//要求：年龄必须在 0~120，否则抛 AgeOutOfBoundsException；用户名不能为空，否则抛 IllegalArgumentException。在 main 中捕获并友好提示。
//
//示例：
//请输入用户名：张三
//请输入年龄：200
//注册失败：年龄必须在0~120之间
public class AgeOutOfBoundsExeption extends RuntimeException{

    public AgeOutOfBoundsExeption(String message){
        super(message);
    }

    public static void register(String name, int age){
        if (name == null || name == ""){
            throw new IllegalArgumentException("用户名为空，注册失败~ ");
        }

        if (age < 0 || age >120){
            throw new AgeOutOfBoundsExeption("年龄不在0~120内，注册失败");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        try {
            register(name,age);
        }
        catch (IllegalArgumentException i){
            System.out.println(i.getMessage());
        }
        catch (AgeOutOfBoundsExeption e){
            System.out.println(e.getMessage());
        }
    }
}
