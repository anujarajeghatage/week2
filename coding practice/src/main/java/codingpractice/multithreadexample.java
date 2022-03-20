package codingpractice;

public class multithreadexample extends Thread {

public void run()
{
	System.out.println("thread id is"+Thread.currentThread().getId());
}
class sketchbook extends Thread
{
public void run(){

{
	System.out.println("thread is for sketchbook is"+Thread.currentThread().getId());
}
}

	
	public static void main(String[] args) {
		
		multithreadexample obj=new multithreadexample();
		obj.start();
		sketchbook obj2=new sketchbook();
		obj2.sketchbook();
	}

}
}
