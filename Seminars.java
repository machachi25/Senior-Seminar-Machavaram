import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;

public class Seminars
{
    String[][] stuChoices = new String[100][25];

    public void splitter()
    {
        try {
            File myObj = new File("SrSeminar_RawData.csv");
            Scanner myReader = new Scanner(myObj);
            int i = 0; //counter for rows 
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              stuChoices[i] =  data.split(",");
              //create student obj
                
              i++;
            }
            for(int j =0; j < stuChoices[1].length; j++)
            {
                System.out.println(j + " " + stuChoices[1][j]);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    
}