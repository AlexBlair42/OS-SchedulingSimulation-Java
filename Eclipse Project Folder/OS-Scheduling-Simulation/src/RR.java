import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RR {
	
	// Keep track of the correct statistics and CPU ticks
	int totalTime = 0;
	int avgWait;
	int avgTurn;
	int avgResp;
	int t_quant1 = 20;
	int t_quant2 = 30;
	int t-quant3 = 40;
	// A queue to hold all processes
	public Queue<Processes> RRQ = new LinkedList<Processes>(); 
	// An array to make all of the processes
	public Processes[] process = {new Processes(50, "p1"), new Processes(20, "p2"), new Processes(30, "p3"),
						new Processes(100, "p4"), new Processes(10, "p5")};
	
	/**
	 * This function executes the Round Robin Algorithm
	 */
	
	void runRR()
	{
		// add a process to the queue
		for (int i = 0; i < 5; i++)
		{
			RRQ.add(process[i]);
		}
		// While loop to keep running while the queue is not empty
		while (!RRQ.isEmpty())
		{
			// This loop will simulate the CPU doing work
			for (int i = 0; RRQ.element().getTime() < t_quant; i++)
			{
				totalTime++;
			}
			
			// Set the turn around time to the total time. This will need to be adjusted for the Round Robin
			RRQ.element().setTurnaround(totalTime);
			
			// Remove the process from the queue
			RRQ.remove();
			
			if (!RRQ.isEmpty())
			{
				// Set the time to the time the process waited (Needs Modified)
				RRQ.element().setWaitTime(totalTime);
				// Set the response time (Needs Modified)
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
	void ConsoleStats()
	{
		System.out.println("RR: ");
    	System.out.printf("Average Wait Time: %d ms\n",avgWait);
    	System.out.printf("Average Turnaround Time: %d ms\n",avgTurn);
    	System.out.printf("Average Response Time: %d ms\n", avgResp);
	}

}