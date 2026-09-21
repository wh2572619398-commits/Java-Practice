package Demo1;

public class demo1 {

//    九九乘法表
//            1*1=1
//            1*2=2  2*2=4
//            1*3=3  2*3=6  3*3=9
//            ...
//            1*9=9  2*9=18 ... 9*9=81
    public static void main(String[] args) {
        int count1 = 0;
        for (int num1 = 1; num1 <= 9;num1++){
            for (int num2 = 1;num2 <= num1;num2 ++)
                System.out.print(num2 + "*" + num1 + "=" + num1*num2 + " ");
                count1++;
                if (count1 == num1){
                    System.out.println("");
                }
        }
    }
}
