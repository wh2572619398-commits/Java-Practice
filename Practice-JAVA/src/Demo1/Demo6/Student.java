package Demo1.Demo6;

//练习 2：学生成绩管理 ⭐⭐⭐
//定义 Student 类（学号、姓名、成绩）。
//用 ArrayList<Student> 存储多个学生，实现：
//
//按成绩降序排序；
//
//输出成绩最高的 3 名学生；
//
//按成绩分组：优秀（>=90）、良好（80~89）、及格（60~79）、不及格（<60）。

import javax.sound.sampled.Line;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    String id;
    String name;
    double score;

    public Student() {
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void showInfo(String id, String name, double score){
        System.out.println("学生ID："+id);
        System.out.println("学生姓名："+name);
        System.out.println("学生分数："+score);
    }

    public void showName(String name){
        System.out.println("学生姓名："+name);
    }

    public String getLevel(double score) {
        if (score >= 90) return "优秀";
        else if (score >= 80) return "良好";
        else if (score >= 60) return "及格";
        else return "不及格";
    }

    public String getNames(List<Student> students){
        StringBuilder sb = new StringBuilder();
        if (students == null || students.isEmpty()) return " ";
        else {
            for(Student student : students){
                sb.append(student.getName() + " ");
            }
            return sb.toString();
        }
    }

    //主入口
    public static void main(String[] args) {

        Student s = new Student();
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("1","wuhuan",60)) ;
        students.add(new Student("2","wuhuan2",70)) ;
        students.add(new Student("3","wuhuan3",80)) ;
        students.add(new Student("4","wuhuan4",90)) ;
        students.add(new Student("5","wuhuan5",50)) ;

        List<Student> sortedList = students.stream()
                .sorted(Comparator.comparingDouble(Student::getScore).reversed())
                .collect(Collectors.toList());

        for (Student student:sortedList){
            student.showInfo(student.getId(),student.getName(),student.getScore());
        }

        //打印前三名
        int count = 0;
        System.out.println("成绩前三名：");
        for (Student student:sortedList) {
            count++;
            if (count == 4) break;
            student.showName(student.getName());
        }

        //分组

        Map<Object, List<Student>> groupMap = students.stream()
                .collect(Collectors.groupingBy(student -> student.getLevel(student.getScore())));
        System.out.println("优秀：" + s.getNames(groupMap.get("优秀")));
        System.out.println("良好：" + s.getNames(groupMap.get("良好")));
        System.out.println("及格：" + s.getNames(groupMap.get("及格")));
        System.out.println("不及格：" + s.getNames(groupMap.get("不及格")));
    }
}
