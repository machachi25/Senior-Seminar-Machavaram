import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class People 
{
   private String name;
   ArrayList<Senior> seniors = new ArrayList<Senior>();
   public People(String initName)
   {
      name = initName;
   }

   public void presentersFile()
   {
      try {
      File myObj = new File("Presenters.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        seniors.add(Senior data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
   }
}
    

