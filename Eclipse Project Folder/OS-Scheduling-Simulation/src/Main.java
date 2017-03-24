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
    	
       	//create random number for process generation
       	Random rand = new Random();
       	int rand_p = rand.nextInt()% (1000 + 1);
       	
    	
    	//process for controlling when a process is created
    	ArrayList<PEC> readyProcess = new ArrayList<PEC>();
    	
    	
    	FCFS run = new FCFS();
    	run.runFCFS();
    	run.addStats();
    	run.showStatsFCFS();
 	
    	RR RRrun = new RR();
    	RRrun.runRR(50);
    	RRrun.CalcStats();
    	RRrun.ConsoleStats(50);
    	
    	RR RRrun2 = new RR();
    	RRrun2.runRR(20);
    	RRrun2.CalcStats();
    	RRrun2.ConsoleStats(20);

    	
    	
    }
}