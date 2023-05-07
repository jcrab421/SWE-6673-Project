import java.util.Map;
import java.util.Random;

public class FileContentEditor {
		 	 		
	public void editFileContents(Map<String, String> file_Contents) {
		
		// Create a new Random object to decide which values to change
        Random random = new Random();
        final Double percentage = 0.1;
        
        // Iterate through the map and edit 10% of the "true" strings to "false"
        int trueCount = 0;
        int falseCount = 0;
        
        for (Map.Entry<String, String> entry : file_Contents.entrySet()) {
            String oldValue = entry.getValue();
            String newValue;
         // Edit 50% of "true" strings
            if (random.nextDouble() < percentage) { 
            	
                newValue = oldValue.replace("true", "false");
                falseCount++;
            } else {
                newValue = oldValue;
                trueCount++;
            }
            entry.setValue(newValue);
        }
        
        // Print the modified map and the counts
        System.out.println("Modified file contents:");
        for (Map.Entry<String, String> entry : file_Contents.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("==============================="+"\n");
        System.out.println(" Test Pass: " + trueCount);
        System.out.println(" Test Fail: " + falseCount +"\n");
    }
}