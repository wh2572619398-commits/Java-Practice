package Demo1.Demo7;

import java.util.ArrayList;

//泛型栈 ⭐⭐⭐
//要求：实现泛型类 MyStack<T>，支持 push、pop、peek、isEmpty、size。再用它反转字符串。

//示例：
//push: A B C
//pop: C
//peek: B
//反转字符串：cba
//提示：
// 内部可用 ArrayList<T> 或 Object[]。
//push 加到末尾，pop 删除并返回末尾。
//字符串反转：遍历字符依次 push，再不断 pop 拼接。

public class MyStack<T> {

    ArrayList<T> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(T t){
        list.add(t);
    }

    public T pop(){
        if (isEmpty()){
            throw new RuntimeException("栈为空，无法pop");
        }
        return list.remove(list.size()-1);
    }

    public T peek(){
        if (isEmpty()){
            throw new RuntimeException("栈为空，无法pop");
        }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {

        MyStack<Character> myStack = new MyStack<>();

        String letter = "abc";

        for (int i = 0; i < letter.length(); i++) {
            myStack.push(letter.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letter.length(); i++) {
            sb.append(myStack.pop());
        }

        System.out.println("反转字符串：" + sb.toString());

    }
}
