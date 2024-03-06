

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;

public class Seminars
{
    String[][] stuChoices = new String[100][25]; //2D array of the raw data
    ArrayList <Senior> roster = new ArrayList<>(); //array list of all the seniors
    int i = 0; //counter for rows 
    public void splitter() //method will be used for the parsing and splitting the raw data into the sexitons i want
    {
        try {
            File myObj = new File("SrSeminar_RawData.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              stuChoices[i] =  data.split(",");
              System.out.println(stuChoices[i][2] + stuChoices[i][3] +stuChoices[i][10] +  " " +  stuChoices[i][11] + " " +  stuChoices[i][12] +  " " +  stuChoices[i][13] +  " " +  stuChoices[i][14]);
              //create student obj
              Senior s1 = new Senior(stuChoices[i][2], stuChoices[i][3],  (stuChoices[i][10]), (stuChoices[i][11]), (stuChoices[i][12]),  (stuChoices[i][13]), (stuChoices[i][14]));//senior object
              roster.add(s1);
                
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
    
    /*public String toString() unused method/ first trial for the original idea that changed
          {
           String name =  stuChoices[i][3];
           String primary =  stuChoices[i][10];
           String secondary =  stuChoices[i][11];
           String tertiary =  stuChoices[i][12];
           String quaternary = stuChoices[i][13];
           String quinary = stuChoices[i][14];
           return name + " chose the seminar ids of " + primary + ", " + secondary + ", " + tertiary + ", " + quaternary + ", " + quinary;
          }*/

      public void popularity() //used to find the semianrs that are most requested
      {
        int[] sessions = new int[20]; //unused 1D array
        int first = 5; // were supposed to be point values for the popularity, but i have to figure out how to use them
        int second = 4;
        int third = 3;
        int fourth = 2;
        int fifth = 1;
        int count = 0; 
        
        // finds the total number of votes for each semianr ID as peoples first choice
        int lenRos = roster.size();
           for(int i = 1; i < lenRos; i++)
        { 
          sem[roster.get(i).getFirstChoice()] += 5;
          sem[roster.get(i).getSecondChoice()] += 4;
          sem[roster.get(i).getThirdChoice()] += 3;
          sem[roster.get(i).getFourthChoice()] += 2;
          sem[roster.get(i).getFifthChoice()] ++;
          
        }
        /*for(int d = 1; d < 19; d++)//for all the studetns in my array list roster
        {
          count = 0;
          for(Senior student:roster){
            if(student.getFirstChoice() == d) // d will iterate through the seminars, and if the seminar ID matches the first choice, the count will act as a vote 
            {
              //System.out.println("Adventure");
              count+=5;
            }
            int point = sessions[roster.get(d).getFirstChoice()] += 5;
          }
          System.out.println(d +  ": " +  count);
        }
        System.out.print("\n");

        for(int q = 1; q < 19; q++) // same as the first oen but with 2nd choice
        {
          count = 0;
          for(Senior kid:roster)
          {
            if(kid.getSecondChoice() == q)
            {
              count+=4;
            }
          }
          System.out.println(q + ": " + count);
        }
        System.out.println("\n");


        for(int a = 1; a < 19; a++) // same as ifrst with 3rd
        {
          count = 0;
          for(Senior person: roster)
          {
            if(person.getThirdChoice() == a)
            {
              count+=3;
            }
          }
          System.out.println(a + ": " + count);
        }
        System.out.println("\n");
        
        
        for(int e = 1; e < 19; e++)//4th column
        {
          count = 0;
          for(Senior senior: roster)
          {
            if(senior.getFourthChoice()== e)
            {
              count+=2;
            }

          }
          System.out.println(e + ": " + count);
        }
        System.out.println("\n");

        for(int k = 1; k < 19; k++)//5th choice
        {
          count = 0;
          for(Senior human: roster)
          {
            if(human.getFifthChoice() == k)
            {
              count++;
            }

          }
          System.out.println(k + ": " + count);
        }
        
       */

        /*for(int g = 0; g < roster.size(); g++)
        {
          sessions[roster.get(g).getFirstChoice()] = first+= 5;
          
        }
        for(int y = 0; y < 100; y++)
        {
          sessions[roster.get(y).getSecondChoice()] = second+=4;
        }
        for(int q = 0; q < 100; q++)
        {
          sessions[roster.get(q).getThirdChoice()] = third+=3;
        }
        for(int w = 0; w < 100; w++)
        {
          sessions[roster.get(w).getFourthChoice()] = fourth+=2;
        }
        for(int z = 0; z < 100; z++)
        {
          sessions[roster.get(z).getFifthChoice()] = fifth+=1;
        }*/
        

      }    
}
