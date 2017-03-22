
public class PEC {
	//variables for this class
	private PCB pcb;
	private int processID = 0;
	
	//get and set operations for this class
	public int getProcess(){return processID;}
	public PCB getPcb(){return pcb;}
	
	public void setProcess(int p){processID = p;}
	public void setPcb(PCB bcp){pcb = bcp;}
	
	//method to increment the process id after a process is created
	public int levelUp(int pid){
		pid += 1;
		return pid;
	}
	//default constructor
	public PEC pec(){
		return this;
	}
	
	//useful constructor
	public PEC pec(PCB p, int pid ){
		setPcb(p);
		setProcess(pid);
		
		return this;
	}
}
