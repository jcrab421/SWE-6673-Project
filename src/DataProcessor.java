import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class DataProcessor {
	//Create  FileContentEditor object 
	 FileContentEditor processData = new  FileContentEditor();
	 
        public void processdata(String coveragaData) {   
         String folderPath = coveragaData;
        // create a File object for the folder path
        File folder = new File(folderPath);

        // check that the folder exists and is a directory
        if (!folder.exists() || !folder.isDirectory()) {
            System.err.println("Folder does not exist or is not a directory: " + folder.getAbsolutePath());
            return;
        }

        // get a list of all datafiles in the folder
        File[] datafiles = folder.listFiles();

        // create an empty HashMap to store the contents of each file
        Map<String, String> fileContents = new HashMap<>();
        
        
        //declear and initiate file counter
        int filecounter = 0;
        
        int passedTestCounter = 0;
             
        // loop through all datafiles in the folder
        for (File file : datafiles) {
        	// create a StringBuilder to store the contents of the file
            StringBuilder testLines = new StringBuilder();
            // check that the file is a gzip file
            if (file.isFile() && file.getName().toLowerCase().endsWith(".gz")) {
            	
            	
                try {
                    // open the input file stream
                    FileInputStream myInputStream = new FileInputStream(file);
                                 
                    // wrap the FileInputStream with an InputStreamReader to convert bytes to characters
                      InputStreamReader stream_reader = new InputStreamReader(myInputStream);

                    // wrap the InputStreamReader with a BufferedReader for efficient reading of lines
                    BufferedReader bufferStream = new BufferedReader(stream_reader);

                    // read lines from the file until end of file is reached
                   String fileData;
                   
                    while ((fileData = bufferStream.readLine()) !=null) {
                    	
                    	 if(fileData.endsWith("true")) {
                    		 
                    		 testLines.append(fileData);
                    		 testLines.append("" +"\n");
                    		 //increase passedTestCounter
                    		 passedTestCounter++;
                    	      }
                    	  else {}

                      }
                     // close the resources
                    bufferStream.close();
                    stream_reader.close();
                   myInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }                             
               
            }    
            fileContents.put(file.getName(), testLines.toString());
            filecounter++;
        }   
          processData.editFileContents(fileContents);
       // System.out.println(fileContents);
          System.out.println("==============================================="+
                "\n"+" total files in  Folder: "+ filecounter  + 
                "\n==============================================");
       /*  System.out.println("==============================================="+
                         "\n"+" total Test Passes: "+ passedTestCounter  + 
                         "\n=============================================="); */
        
      }
    }
