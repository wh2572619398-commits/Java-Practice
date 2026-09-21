package objectOrientedDesign1;
//练习 6：面向对象——学生类
//知识点：类、对象、构造方法重载、封装、对象数组
//
//要求：
//
//设计一个 Student 类，属性包括：
//
//id（学号，String）
//
//name（姓名，String）
//
//score（成绩，double）
//
//提供三个构造方法：
//
//无参构造：默认学号“未知”，姓名“未知”，成绩 0。
//
//两个参数：学号、姓名，成绩默认 0。
//
//三个参数：学号、姓名、成绩。
//
//提供 showInfo() 方法，打印学生信息。
//
//在 main 方法中创建 3 个学生对象，放入数组。
//
//计算平均分，并输出成绩最高的学生信息。
public class Student {
    String id;
    String name;
    double score;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public  Student(String id,String name){
        this.id = id;
        this.name = name;
    }

    public  Student(String id,String name,double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void showInfo(String id, String name, double score){
        System.out.println("学生ID："+id);
        System.out.println("学生姓名："+name);
        System.out.println("学生分数："+score);
    }
}
