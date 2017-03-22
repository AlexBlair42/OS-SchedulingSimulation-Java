
public class DataFiles extends PCB{
	//variables for this class
	private float arrival;
	private float cpuTime;
	private float ioTime;
	//store the results from the three float variables in this list
	private float[] results ={arrival, cpuTime, ioTime};
	private int rand;
	
	//get and set methods for this class
	public float getArrival(){return arrival;}
	public float getCpuTime(){return cpuTime;}
	public float getIoTime(){return ioTime;}
	public int getRand(){return rand;}
	public float[] getResults(){return results;}
	
	
	public void setArrival(float a){arrival = a;}
	public void setCpuTime(float ct){cpuTime = ct;}
	public void setIoTime(float it){ioTime = it;}
	public void setRand(int r){rand = r;}
	public void setResults(float[] r){results = r;}
	
	//default contructor
	public DataFiles datafiles(){
		return this;
	}
	
	//useful contstructor
	public DataFiles datafiles(float a, float ct, float io, int r){
		setArrival(a);
		setCpuTime(ct);
		setIoTime(io);
		setRand(r);
		return this;
	}
	
	
	
	
}
