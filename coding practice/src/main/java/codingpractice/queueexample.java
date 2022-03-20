package codingpractice;

import java.util.PriorityQueue;
import java.util.Queue;

public class queueexample {

	public static void main(String[] args) {
        Queue<Integer>obj=new PriorityQueue<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        System.out.println(obj);
obj.remove();
obj.poll();
System.out.println(obj);

        
	}

}
