import java.util.ArrayList;
import java.util.Random;


/**
 * @version 1.0
 * @author Alex Blair
 * @author Mckenna Galle
 * @author Julia Abbott
 * This project is a simulation of different scheduling algorithms for processes.
 */
public class Main {
    public static void main (String[] args)
    {
     	  for(int i = 0; i < 10; i++)  
  {
	  System.out.printf("This is time %d\n\n", i);
    	
    	FCFS run = new FCFS();
    	run.runFCFS();
    	run.addStats();
    	run.showStatsFCFS();
	System.out.printf("\n");
 	
    	RR RRrun = new RR();
    	RRrun.runRR(50);
    	RRrun.CalcStats();
    	RRrun.ConsoleStats(50);
	System.out.printf("\n");
    	
    	RR RRrun2 = new RR();
    	RRrun2.runRR(20);
    	RRrun2.CalcStats();
    	RRrun2.ConsoleStats(20);
	System.out.printf("\n");
    	
    	FeedBack FBrun = new FeedBack();
    	FBrun.runFeedback();
    	FBrun.addStats();
    	FBrun.showStatsFB();
	System.out.printf("\n");
    	
    	

    	
    	}
    }
}