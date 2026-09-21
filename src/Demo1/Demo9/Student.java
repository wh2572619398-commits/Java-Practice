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

import java.io.Serializable;
import java.util.function.DoubleToLongFunction;

public class Student implements Serializable {
    public static final long serialversionUID = 1L;
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}
