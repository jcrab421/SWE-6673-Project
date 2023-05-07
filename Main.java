import java.io.*;


public class Main {

	public static void main(String[] args) {
		
		//create DataProcessor object to process coverage data.
		DataProcessor resultProcessor = new DataProcessor();
	
		String coveragefolder = "C:\\Users\\Fr3dy Q\\Documents\\Grad school work_start2018" +
                "\\SWE 6673_Software Testing Verification_Spring2023" +
                "\\SWE-6673-Project\\Swe6673Project\\Swe6673TestingProject\\CoverageData";
		
		String folderPath = coveragefolder; 
		resultProcessor.processdata(folderPath);
		
  }
}
