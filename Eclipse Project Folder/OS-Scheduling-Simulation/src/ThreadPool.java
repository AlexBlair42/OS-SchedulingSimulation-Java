import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;

public class ThreadPool implements ThreadFactory {
	Thread t = new Thread();
	ArrayList<Thread> threadPool= new ArrayList<Thread>();
	
	void funtion(){
	for(int i = 0; i < 100; i++)
	{
		Thread t = new Thread();
		threadPool.add(t);
	}
	}
	@Override
	public Thread newThread(Runnable arg0) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
}