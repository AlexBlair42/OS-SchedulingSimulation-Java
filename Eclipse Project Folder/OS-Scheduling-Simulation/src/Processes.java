public class Processes{
	private int time;
	private String name;
	private int waitTime;
	private int turnaround;
	private int response;
	private int startTime =0;
	private int staticTime;
	
	int getwaitTime(){return waitTime;}
	int getTime(){return time;}
	String getName(){return name;}
	int getTurnaround(){return turnaround;}
	int getResponse(){return response;}
	int getstartTime(){return startTime;}
	int getStaticTime(){return staticTime;}
	
	void setTime( int t){
		time = t;
	}
	void setName(String n){
		name = n;
	}
	void setWaitTime(int w){
		waitTime =w;
	}
	void setTurnaround(int t){
		turnaround = t;
	}
	void setResponse(int r){
		response=r;
	}
	
	 void setStartTime(int s){ startTime = s;}
	
	public Processes(int t, String n){
		time = t;
		name = n;
		staticTime = t;
	}



//change negative time to positive
	public int makePositive(int t){
		t = (-1) * t;
		return t;
		
	}
	//method to check to see if the time is negative
	//calls the method makePositive if it is negative
	public void isPositive(Processes t){
		if(t.getTime() < 0)
		{
			t.setTime(t.makePositive(t.getTime()));
		}
	}
}