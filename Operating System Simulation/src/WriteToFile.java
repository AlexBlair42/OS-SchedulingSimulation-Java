import java.io.File;
import java.io.FileOutputStream;

public class WriteToFile extends DataCollector {
	//get current working directory
	private String curdir = System.getProperty("user.dir");
	
	
	//method to write information to file
	public void WriteToChinchilla(File c, DataFiles df){
		try{
			//file to write all of our statistics to
			FileOutputStream dataChinchilla = new FileOutputStream("Process_Data.txt");
			
		}
		catch(Exception ex){
			System.out.printf("The Computer vehemently denies you the ability to do this until you appease it with new hardware.\n %s\n", ex);
		}
	}
}
