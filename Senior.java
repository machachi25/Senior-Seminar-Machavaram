import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Senior
{
    //private String nombrePrimero;
    //private String nombreSegundo;
    private String senID;
    private String nombre;
    private int firstChoice;
    private int secondChoice;
    private int thirdChoice;
    private int fourthChoice;
    private int fifthChoice;
    ArrayList<Senior> seniorsChoices = new ArrayList<Senior>();
    String[][] stuData = new String[80][25];
    
    public Senior(String senID, String nombre, String firstChoice, String secondChoice, String thirdChoice, String fourthChoice, String fifthChoice) //
    {
      this.senID = senID;
      this.nombre = nombre;
      this.firstChoice = Integer.parseInt(firstChoice);
      this.secondChoice =  Integer.parseInt(secondChoice);
      this.thirdChoice =  Integer.parseInt(thirdChoice);
      this.fourthChoice =  Integer.parseInt(fourthChoice);
      this.fifthChoice =  Integer.parseInt(fifthChoice);
    }

    public void graduates()
    {
      try {
      File myObj = new File("Kids.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {

        String info = myReader.nextLine();
        for(int i = 0; i < stuData.length; i++)
        {
           stuData[i] = info.split(",");
        }
       

      }
      myReader.close();
     } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

    public int getFirstChoice()
    {
     return firstChoice;
    }

    public void setName(String initNombre) //
    {
      nombre = initNombre;
    }
    public int getSecondChoice()
    {
      return secondChoice;
    }

    public int getThirdChoice()
    {
      return thirdChoice;
    }

    public int getFourthChoice()
    {
      return fourthChoice;
    }

    public int getFifthChoice()
    {
      return fifthChoice;
    }
}





