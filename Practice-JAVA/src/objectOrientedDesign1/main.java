package objectOrientedDesign1;

public class main {
    public static void main(String[] args) {
        Student s = new Student();
        Student[] students = new Student[3];
        students[0] = new Student("1","wuhuan",60);
        students[1] = new Student("2","wuhuan1",70);
        students[2] = new Student("3","wuhuan2",80);
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum = (int) (sum + students[i].score);
        }

        //打印三个同学平均分
        double result = sum/students.length;
        System.out.println("平均分："+ result);

        //输出最高分学生的信息
        int max = (int) students[0].score;
        int temp = 0;
        for (int i = 1; i < students.length; i++) {
            if (max < students[i].score){
                max = (int) students[i].score;
                temp = i;
            }
        }
        System.out.println("最高分学生信息如下：");
        s.showInfo(students[temp].id,students[temp].name,students[temp].score);
    }
}
