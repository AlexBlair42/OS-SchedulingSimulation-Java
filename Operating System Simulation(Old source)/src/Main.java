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
    	
    	
    	//creation of processes
    	for(int i = 10000; i >=0; i--){
    		
    	}
    }
}
