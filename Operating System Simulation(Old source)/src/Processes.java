
public class Processes {
	int time;

	int getTime(){
		return time;
	}
	void setTime( int t){
		time = t;
	}
	
	Processes process(){
		return this;
	}
	Processes process(int t){
		time = t;
		return this;
		
	}
}
