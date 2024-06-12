package evenoddthread;

class A extends Thread{
	
	@Override
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0) {
				System.out.println(i+" ");
			}
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	
	@Override
	
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2!=0) {
				System.out.println(i+" ");
			}
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class  EvenOddThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A thread1 = new A();
		B thread2 = new B();
		
		thread1.setName("Th1");
		thread2.setName("Th2");
		
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		thread1.start();
		
		System.out.println(thread1.isAlive());
		try {
			thread1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(thread1.isAlive());
		
		thread2.start();
		
		System.out.println("number printed");
	}

}


