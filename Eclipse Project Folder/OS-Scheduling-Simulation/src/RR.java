import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RR {
	
	// Keep track of the correct statistics and CPU ticks
	int totalTime = 0;
	int avgWait;
	int avgTurn;
	int avgResp;
	int time = 0;
	int t;
	int waitTime= 0;
	int Resp;
	// A queue to hold all processes
	public Queue<Processes> RRQ = new LinkedList<Processes>(); 
	// An array to make all of the processes
	public Processes[] process = {new Processes(50, "p1"), new Processes(20, "p2"), new Processes(30, "p3"),
						new Processes(100, "p4"), new Processes(10, "p5")};
	
	/**
	 * This function executes the Round Robin Algorithm
	 */
	
	void runRR(int t_quant)
	{
		// add a process to the queue
		for (int i = 0; i < 5; i++)
		{
			RRQ.add(process[i]);
		}
		// While loop to keep running while the queue is not empty
		while (!RRQ.isEmpty())
		{
			// If the start time for a process equals 0 set the start time to total time
			if (RRQ.element().getstartTime() == 0){
			RRQ.element().setStartTime(totalTime);
			}
			// This loop will simulate the CPU doing work
			do {	
				time++;			
				totalTime++;
				// While the time is less than the time quantum or equals 0 do work
			}while (time <= t_quant -1 || RRQ.element().getTime() == 0);
			
			// Set the response time to a variable
			t = RRQ.element().getTime() - time;
			RRQ.element().setTime(t);
			// reset time to 0
			time =0;
			
			// Set the turn around time to the total time. This will need to be adjusted for the Round Robin
			RRQ.element().setTurnaround(totalTime);
			
			// Remove the process from the queue
			if(RRQ.element().getTime()<= 0){
				// Calculate wait time and put it into the waitTime variable
				waitTime = totalTime - RRQ.element().getstartTime();
				RRQ.element().setWaitTime(waitTime);
				// Calculate the response time and put it into a variable
				Resp = RRQ.element().getStaticTime() + RRQ.element().getwaitTime();
				RRQ.element().setResponse(Resp);
				// Remove the element if the time <= 0
				RRQ.remove();	
			}
			else
			{
				// Otherwise set the element to a variable
				Processes p = RRQ.element();
				// Remove the process from the queue
				RRQ.remove();			
				// Then add it to the end of the queue to continue executing until finished
				RRQ.add(p);
			}
			if (!RRQ.isEmpty())
			{
				// Set the time to the time the process waited 
				RRQ.element().setWaitTime(totalTime);
				// Set the response time 
				RRQ.element().setResponse(totalTime);
			}
		}
	}
	
	/**
	 * This function calculates the different variables needed
	 */
	void CalcStats()
	{
		for(int i = 0; i < 5; i++)
		{
			// average the wait times
			avgWait = avgWait + process[i].getwaitTime();
			// average the turn around time
			avgTurn = avgTurn + process[i].getTurnaround();
			// average the response time
			avgResp = avgResp + process[i].getResponse();
		}
		
		avgWait = avgWait/5;
		avgTurn = avgTurn/5;
		avgResp = avgResp/5;
	}
	
	/**
	 * Prints stats to the console
	 */
	void ConsoleStats(int n)
	{
		System.out.printf("RR q = %d: \n",n);
    	System.out.printf("Average Wait Time: %d ms\n",avgWait);
    	System.out.printf("Average Turnaround Time: %d ms\n",avgTurn);
    	System.out.printf("Average Response Time: %d ms\n", avgResp);
	}

}