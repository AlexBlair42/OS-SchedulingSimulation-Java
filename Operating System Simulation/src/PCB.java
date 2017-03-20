import java.util.ArrayList;
import java.util.Random;

/**
 * @version 1.0
 * @author Alex Blair
 * @author Mckenna Galle
 * @author Julia Abbott
 */
public class PCB extends PEC {
	boolean processState = false;
	int counter = 0;
	DataFiles data;
	Random rand = new Random();
	randomZombie = rand.nextInt() % 100000000 + 1;
	
	//get and set methods for all variables
	boolean getProcessState(){return processState;}
	int getCounter(){return counter;}
	DataFiles getData(){return data;}
	
	void setProcessState(boolean ps){processState = ps;}
	void setCounter(int c) {counter = c;}
	void setData(DataFiles d){data = d;}
	
	
	//default constructor
	
	PCB pcb(){
		return this;
	}
	
	//useful constructor
	PCB pcb(boolean ps, int c, DataFiles d)
	{
		setProcessState(ps);
		setCounter(c);
		setData(d);
		
		return this;
	}
}

