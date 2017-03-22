
public class DataFiles extends PCB{
	//variables for this class
	float arrival;
	float cpuTime;
	float ioTime;
	int rand;
	
	//get and set methods for this class
	float getArrival(){return arrival;}
	float getCpuTime(){return cpuTime;}
	float getIoTime(){return ioTime;}
	int getRand(){return rand;}
	
	void setArrival(float a){arrival = a;}
	void setCpuTime(float ct){cpuTime = ct;}
	void setIoTime(float it){ioTime = it;}
	void setRand(int r){rand = r;}
}
