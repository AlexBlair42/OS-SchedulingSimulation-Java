import java.util.LinkedList;
import java.util.Queue;

public class FeedBack {
	int totalTime =0;
	int averageWaitTime;
	int averageTurnaround;
	int averageResponse;
	int t_quant1 = 20;
	
	public Queue<Processes> queue1 = new LinkedList<Processes>();
	public Queue<Processes> queue2 = new LinkedList<Processes>();
	public Queue<Processes> queue3 = new LinkedList<Processes>();
	
	public Processes[] process = {new Processes(10,"p1"),new Processes(20,"p2"),
			   new Processes(30,"p3"),new Processes(25,"p4"),
			   new Processes(10,"p5")};
	
	
	void runFeeback(){
		for (int i = 0; i < 5; i++){
    		queue1.add(process[i]);
    	}
	}
		
}
