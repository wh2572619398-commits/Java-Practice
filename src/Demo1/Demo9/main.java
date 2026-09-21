package Demo1.Demo9;

//对象序列化 ⭐⭐⭐
//要求：创建多个 Student 对象存入 ArrayList，序列化到 students.dat，再反序列化并按成绩排序输出。
//
//示例：
//
//text
//反序列化后：
//李四 92.0
//张三 85.5
//王五 78.0

import com.sun.nio.sctp.SctpChannel;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("wuhuan",100);
        Student s2 = new Student("qujiale",80);
        ArrayList<String> students = new ArrayList<>();
        students.add(s1.toString());
        students.add(s2.toString());

        //序列化
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(students);
            System.out.println("序列化完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //反序列化
        ArrayList<String> getStudents = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            getStudents = (ArrayList<String>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("反序列化完毕");

        //排序
        System.out.println("反序列化后：");
        getStudents.stream()
                .sorted(Comparator.comparingDouble(Student::getScore).reversed())
                .forEach(stu -> System.out.println(stu.));
    }
}
