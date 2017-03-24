import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class FeedBack {
	int totalTime =0;
	int averageWaitTime;
	int averageTurnaround;
	int averageResponse;
	int time = 0;
	int waitTime =0;
	int t=0;
	int t_quant1 = 10;
	int t_quant2 = 20;
	int t_quant3 = 30;
	int Resp;
	
	Random o = new Random();
	// Randomize the process times
	int e = o.nextInt(60 - 10)+10;
	
	// Create 3 queues for process to run in
	public Queue<Processes> queue1 = new LinkedList<Processes>();
	public Queue<Processes> queue2 = new LinkedList<Processes>();
	public Queue<Processes> queue3 = new LinkedList<Processes>();
	
	// Create an array of processes 
	public Processes[] process = {new Processes(e,"p1"),new Processes(e,"p2"),
			   new Processes(e,"p3"),new Processes(e,"p4"),
			   new Processes(e,"p5")};
	
	
	void runFeedback(){
		for(int z = 0; z < 5; z++){
			process[z].isPositive(process[z]);
		}
		for (int i = 0; i < 5; i++){
			// Load queue 1
    		queue1.add(process[i]);
    	}
		while (!queue1.isEmpty())
		{
			if (queue1.element().getstartTime() == 0){
			    queue1.element().setStartTime(totalTime);
			}
			// This loop will simulate the CPU doing work
			do {	
				time++;			
				totalTime++;
			}while (time <= t_quant1 -1 || queue1.element().getTime() == 0);
			
			t = queue1.element().getTime() - time;
			queue1.element().setTime(t);
			time =0;
			
			// Remove the process from the queue
			if(queue1.element().getTime()<= 0){
				waitTime = totalTime - queue1.element().getstartTime();
				queue1.element().setWaitTime(waitTime);
				Resp = queue1.element().getStaticTime() + queue1.element().getwaitTime();
				queue1.element().setTurnaround(Resp);
				queue1.remove();	
			}
			else
			{
				// If process is not done add it to queue 2
				Processes p = queue1.element();
				queue1.remove();			
				queue2.add(p);
			}
			
		
		while (!queue2.isEmpty()){
			// Execute process in queue 2
			do {
				time++;
				totalTime++;
			}while(time<=t_quant2 || queue2.element().getTime() == 0); 
			
			t = queue2.element().getTime() -time;
			queue2.element().setTime(t);
			time = 0;
			
			// If process finishes remove it from queue 2
			if(queue2.element().getTime() <= 0){
				waitTime = totalTime - queue2.element().getstartTime();
				queue2.element().setWaitTime(waitTime);
				Resp = queue2.element().getStaticTime() + queue2.element().getwaitTime();
				queue2.element().setTurnaround(Resp);
				queue2.remove();
			}
			else {
				// Otherwise add it to queue 3 to continue
			 Processes p = queue2.element();
			 queue2.remove();
			 queue3.add(p);
			}
		}
		// Work through queue 3
		while(!queue3.isEmpty()){
			do{
				time++;
				totalTime++;
			}while(time<=t_quant3 || queue3.element().getTime() == 0);
			
			t = queue3.element().getTime() - time;
			queue3.element().setTime(t);
			time = 0;
			
			// If process finishes remove it from queue 3
			if(queue3.element().getTime() <= 0){
				waitTime = totalTime - queue3.element().getstartTime();
				queue3.element().setWaitTime(waitTime);
				Resp = queue3.element().getStaticTime() + queue3.element().getwaitTime();
				queue3.element().setTurnaround(Resp);
				queue3.remove();
			}
			else {
				// If the process is still not done then add it to the end of queue 1 after all other processes
				Processes p = queue3.element();
				queue3.remove();
				queue1.add(p);
				}
			}
		}
	}
	
	   void addStats(){
       	for (int i =0; i < 5; i++){
       		// add up all of the wait times for the processes 
       		averageWaitTime =averageWaitTime+ process[i].getwaitTime();
       		// adds up all of the turnaround times for the processes
       		averageTurnaround= averageTurnaround + process[i].getTurnaround();
       		// add up all of the response time for the process
       		averageResponse = averageResponse + process[i].getstartTime();
       	}
       	// Calculates the averages for the wait time, turnaround, and responses times.
       	averageWaitTime = averageWaitTime/5;
       	averageTurnaround = averageTurnaround/5;
       	averageResponse = averageResponse/5;
       }
	   void showStatsFB(){
       	System.out.println("Multilevel Feedback Queue: ");
       	System.out.printf("Average Wait Time: %d ms\n",averageWaitTime);
       	System.out.printf("Average Turnaround Time: %d ms\n",averageTurnaround);
       	System.out.printf("Average Response Time: %d ms\n", averageResponse);
       }
}