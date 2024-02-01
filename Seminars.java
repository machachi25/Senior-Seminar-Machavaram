import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;

public class Seminars
{
    String[][] stuChoices = new String[100][25];
    int i = 0; //counter for rows 
    public void splitter()
    {
        try {
            File myObj = new File("SrSeminar_RawData.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              stuChoices[i] =  data.split(",");
              System.out.println(stuChoices[i][3] +  stuChoices[i][10] +  stuChoices[i][11] + stuChoices[i][12] +  stuChoices[i][13] +  stuChoices[i][14]);
              //create student obj
                
              i++;
            }
            //for(int j =0; j < stuChoices[1].length; j++)
            //{
                //System.out.println(j + " " + stuChoices[1][j]);
            //}
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

    }
    
    /*public String toString()
          {
           String name =  stuChoices[i][3];
           String primary =  stuChoices[i][10];
           String secondary =  stuChoices[i][11];
           String tertiary =  stuChoices[i][12];
           String quaternary = stuChoices[i][13];
           String quinary = stuChoices[i][14];
           return name + " chose the seminar ids of " + primary + ", " + secondary + ", " + tertiary + ", " + quaternary + ", " + quinary;
          }*/

      public void popularity()
      {
        
      }    
}