import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FCFS {

	int totalTime =0;
	int averageWaitTime;
    public Queue<Processes> queue = new LinkedList<Processes>();
	
	public Processes[] process = {new Processes(10,"p1"),new Processes(20,"p2"),
						   new Processes(30,"p3"),new Processes(25,"p4"),
						   new Processes(10,"p5")};
	

	
        void runFCFS(){
        for (int i = 0; i < 5; i++){
    		queue.add(process[i]);
    	}
		
        while(!queue.isEmpty()){
			for (int i =0; i < queue.element().getTime();i++){
				totalTime++;
			}
			queue.element().setTurnaround(totalTime);
			queue.remove();
			if(!queue.isEmpty()){
			queue.element().setWaitTime(totalTime);
			queue.element().setResponse(r);
			}
		}
	
        }
        void addStats(){
        	for (int i =0; i < 5; i++){
        		averageWaitTime =averageWaitTime+ process[i].getwaitTime();
        	}
        }
        void showStatsFCFS(){
        	System.out.println("FCFS: ");
        	System.out.printf("Average Wait Time: %d\n",averageWaitTime);
        }
}