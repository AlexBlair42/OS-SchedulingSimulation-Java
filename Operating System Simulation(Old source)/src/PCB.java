import java.util.ArrayList;
import java.util.Random;

/**
 * @version 1.0
 * @author Alex Blair
 * @author Mckenna Galle
 * @author Julia Abbott
 */
public class PCB extends PEC {
	private boolean processState = false;
	private int counter = 0;
	private DataFiles data = new DataFiles();
	
	
	//get and set methods for all variables
	public boolean getProcessState(){return processState;}
	public int getCounter(){return counter;}
	public DataFiles getData(){return data;}
	
	public void setProcessState(boolean ps){processState = ps;}
	public void setCounter(int c) {counter = c;}
	public void setData(DataFiles d){data = d;}
	
	
	//default constructor
	
	public PCB pcb(){
		return this;
	}
	
	//useful constructor
	public PCB pcb(boolean ps, int c, DataFiles d)
	{
		setProcessState(ps);
		setCounter(c);
		setData(d);
		
		return this;
	}
}

