import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class People 
{
   private String firstName;
   private String lastName;
   ArrayList<People> teachers = new ArrayList<People>();
   
   public People(String initName)
   {
      firstName = initName.substring(0, initName.indexOf(" "));
      lastName = initName.substring(initName.indexOf(" " ) + 1);
      String name = firstName + " " + lastName;
   }

   public void presentersFile()
   {
      try {
      File myObj = new File("Presenters.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        teachers.add(new People(data));
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
   }
}
    