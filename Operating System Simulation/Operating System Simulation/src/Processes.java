
public class Processes {
	int time;
	String name;
	int waitTime;
	int turnaround;
	int response;
	
	int getwaitTime(){return waitTime;}
	int getTime(){return time;}
	String getName(){return name;}
	int getTurnaround(){return turnaround;}
	int getResponse(){return response;}
	
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
	
	public Processes(int t, String n){
		time = t;
		name = n;
	}
}
