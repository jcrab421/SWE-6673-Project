import java.io.*;


public class Main {

	public static void main(String[] args) {
		
		//create DataProcessor object to process coverage data.
		DataProcessor resultProcessor = new DataProcessor();
	
		String coveragefolder = ".\\SWE-6673-Project\\CoverageData";
		
		String folderPath = coveragefolder; 
		resultProcessor.processdata(folderPath);
		
  }
}
