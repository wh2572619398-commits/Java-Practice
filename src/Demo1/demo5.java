package Demo1;

import objectOrientedDesign1.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class demo5 {
    //练习 1：单词词频统计 ⭐⭐
    //输入一段英文文本，统计每个单词出现的次数，按次数从高到低输出。
    //要求：用 HashMap<String, Integer>，忽略大小写和标点。

    //示例：
    //输入：Hello world hello java world
    //输出：
    //hello: 2
    //world: 2
    //java: 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入英文文本：");
        String line = sc.nextLine();

        line = line.toLowerCase();
        line = line.replaceAll("[^a-z]"," ");

        String[] words = line.split(" ");

        //单词技术放入hashmap
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if(map.containsKey(words[i])) map.put(words[i],map.get(words[i])+1);
            else map.put(words[i],1);
        }

        //排序从高到低
            //转为数组
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Map.Entry<String, Integer>[] arr = new Map.Entry[map.size()];
        entrySet.toArray(arr);
            //开始冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j].getValue() < arr[j+1].getValue() ) {
                    Map.Entry<String,Integer> temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //输出
        System.out.println("输出：");
        for(Map.Entry<String, Integer> word:arr){
            System.out.println(word.getKey() + "：" + word.getValue());
        }
    }
}
