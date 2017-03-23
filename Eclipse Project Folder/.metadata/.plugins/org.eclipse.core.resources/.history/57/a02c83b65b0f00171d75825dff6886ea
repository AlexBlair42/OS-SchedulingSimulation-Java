
public class PEC {
	//variables for this class
	PCB pcb;
	int processID = 0;
	
	//get and set operations for this class
	int getProcess(){return processID;}
	PCB getPcb(){return pcb;}
	
	void setProcess(int p){processID = p;}
	void setPcb(PCB bcp){pcb = bcp;}
	
	//method to increment the process id after a process is created
	int levelUp(int pid){
		pid += 1;
		return pid;
	}
	//default constructor
	PEC pec(){
		return this;
	}
	
	//useful constructor
	PEC pec(PCB p, int pid ){
		setPcb(p);
		setProcess(pid);
		
		return this;
	}
}