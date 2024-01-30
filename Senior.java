import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Senior
{
    //private String nombrePrimero;
    //private String nombreSegundo;
    private String nombre;
    private String firstChoice;
    private String secondChoice;
    private String thirdChoice;
    private String fourthChoice;
    private String fifthChoice;
    ArrayList<Senior> seniorsChoices = new ArrayList<Senior>();
    
    public Senior(String initNombre, String initFirst, String initSecond, String initThird, String initFourth, String initFifth)
    {
      nombre = initNombre.substring(0, initNombre.indexOf( " ")) +  initNombre.substring(initNombre.indexOf( " ") + 1);
      firstChoice = initFirst;
      secondChoice = initSecond;
      thirdChoice = initThird;
      fourthChoice = initFourth;
      fifthChoice = initFifth;
    }

    public void Graduates()
    {
      try {
      File myObj = new File("Kids.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String info = myReader.nextLine();
      }
      myReader.close();
     } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    public void choices()
    {
      try {
        File myObj = new File("choices.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
        String primary = myReader.nextLine();
        myReader.close();
       } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }  
    

    try {
      File myObj = new File("choices2.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
      String secondary = myReader.nextLine();
      myReader.close();
     } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    }

    try {
      File myObj = new File("choices3.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
      String tertiary = myReader.nextLine();
      }
      myReader.close();
     } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  
  } 

  try {
    File myObj = new File("choices4.txt");
    Scanner myReader = new Scanner(myObj);
    while (myReader.hasNextLine()) {
      String quaternary = myReader.nextLine();
    }
    myReader.close();
   } catch (FileNotFoundException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }
  }

  try {
    File myObj = new File("choices5.txt");
    Scanner myReader = new Scanner(myObj);
    while (myReader.hasNextLine()) {
      String quinary = myReader.nextLine();
    }
    myReader.close();
   } catch (FileNotFoundException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }
  


  public void setName(String initNombre) //
  {
    nombre = initNombre;
  }




}
}

