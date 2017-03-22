import java.io.*;
import java.util.HashMap;
//class to retain and record target information at the end of the process
public class DataCollector extends DataFiles{
	//data structure to hold all of the information from the float[] results in the DataFiles class
	private HashMap<Integer, float[]> everyProcessResult = new HashMap<Integer, float[]>();
	
	
	//get and set methods for all variables
	public HashMap<Integer, float[]> getEveryProcessResult(){return everyProcessResult;}
	//method to add information to the HashMap
	/***
	 * 
	 * @param pec -- PEC object for the process that is being archived
	 * @param epr =-- HashMap used to hold all of the results from the various processes
	 */
	public HashMap<Integer, float[]> addEntry(PEC pec, HashMap<Integer, float[]>epr){
		//variable to hold temporary float[] results from df
		float[] tempResult = pec.getPcb().getData().getResults();
		//variable to retrieve and hold process ID for use in identification of the various processes
		int tempPID = pec.getProcess();
		
		//creating a pair and adding the entry to the HashMap
		epr.put(tempPID, tempResult);
		
		return epr;
	}
	
	public void setEveryProcess(HashMap<Integer, float[]> epr){everyProcessResult = epr;}
	//a method to create a pair to insert into the HashMap
	/***
	 * 
	 * @param pid -- the process' ID number
	 * @param df -- the DataFiles object associated with the current process
	 */
	
	
	//default constructor
	public DataCollector dataCollector(){
		return this;
	}
	
	//useful constructor
		public DataCollector dataCollector(DataFiles df){
		
		return this;
	}
		
}
