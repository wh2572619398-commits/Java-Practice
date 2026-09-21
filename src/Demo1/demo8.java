package Demo1;

//文本统计器 ⭐⭐⭐
//要求：读取 .txt 文件，统计总行数、总单词数、总字符数、出现最多的 5 个单词。
//
//示例：
//
//text
//总行数：10
//总单词数：156
//总字符数：842
//Top5：
//java: 12
//hello: 8
//...

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class demo8 {
    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        HashMap<String,Integer> wordMap = new HashMap<>();

        String path = "C:\\Users\\wh257\\Desktop\\delete_log4.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                for (String word : words){
                    if (!word.isBlank()) {
                        wordMap.put(word,wordMap.getOrDefault(word,0)+1);
                    }
                }
            }

            System.out.println("总行数：" + lineCount);
            System.out.println("总单词数：" + wordCount);
            System.out.println("总字符数" + charCount);

            //获取top前五
            System.out.println("Top前五：");
            wordMap.entrySet().stream()
                    .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()))
                    .limit(5)
                    .forEach(every -> System.out.println(every.getKey() + "：" + every.getValue()) );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

