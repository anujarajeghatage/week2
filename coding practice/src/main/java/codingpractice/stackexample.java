package codingpractice;

import java.util.Stack;

//STACK WORKS AS LAST IN FIRST OUT.

public class stackexample {

	public static void main(String[] args) {
//stack=10,20,30,40,50;
		Stack<Integer>obj=new Stack<>();
		obj.push(10);
		obj.push(20);
		obj.push(30);
System.out.println(obj);
       obj.pop();
       System.out.println(obj);
obj.peek();
System.out.println(obj);
obj.search(10);
System.out.println(obj);


	}

}
