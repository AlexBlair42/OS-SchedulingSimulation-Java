
public class Processes {
	int time;
	String name;
	int waitTime;
	
	int getwaitTime(){return waitTime;}
	int getTime(){return time;}
	String getName(){return name;}
	void setTime( int t){
		time = t;
	}
	void setName(String n){
		name = n;
	}
	void setWaitTime(int w){
		waitTime =w;
	}
	
	public Processes(){
	}
	public Processes(int t, String n){
		time = t;
		name = n;
	}
}
