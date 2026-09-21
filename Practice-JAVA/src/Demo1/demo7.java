package Demo1;

//IO 流与文件操作
//练习 1：文件复制工具 ⭐⭐
//要求：用字节缓冲流复制文件，统计耗时；再和普通字节流比较速度。
//示例：
//普通字节流耗时：1200ms
//缓冲流耗时：80ms
//复制完成！

import java.io.*;

public class demo7 {

    //普通字节copyByNormalStream
    //缓冲字符流copyByBufferedStream
    public static void copyByNormalStream(String fis, String fos) throws IOException {
        try (
                FileInputStream in = new FileInputStream(fis);
                FileOutputStream out = new FileOutputStream(fos)

        ) {
            byte[] buffer = new byte[100];
            int len = 0;
            while ((len = in.read(buffer)) != -1){
                out.write(buffer,0,len);
            }
        }
    }
    public static void copyByBufferedStream(String fis,String fos) throws IOException{
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fis));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fos))
        ) {
            byte[] buffer = new byte[100];
            int len = 0 ;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        }
    }


    public static void main(String[] args) throws IOException {

        demo7 tool = new demo7();

        String p1 = "C:\\Users\\wh257\\Downloads\\1.png";
        String p2 = "C:\\Users\\wh257\\Downloads\\normal.png";
        String p3 = "C:\\Users\\wh257\\Downloads\\buffer.png";

        //普通字符流
        long nt1 = System.currentTimeMillis();
        copyByNormalStream(p1,p2);
        long nt2 = System.currentTimeMillis();
        System.out.println("普通流："+ (nt2 - nt1));

        //缓冲
        long bt1 = System.currentTimeMillis();
        copyByBufferedStream(p1,p3);
        long bt2 = System.currentTimeMillis();
        System.out.println("缓冲流："+ (bt2 - bt1));

    }



}
