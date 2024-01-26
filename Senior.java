import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Senior
{
    private String nombrePrimero;
    private String nombreSegundo;
    ArrayList<Senior> seniors = new ArrayList<Senior>();
    
    public Senior(String initNombre)
    {
      nombrePrimero = initNombre.substring(0, initNombre.indexOf( " "));
      nombreSegundo = initNombre.substring(initNombre.indexOf( " ") + 1);
      String nombre = nombrePrimero + nombreSegundo;

    }

    public void Graduates()
    {
        try {
      File myObj = new File("Kids.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String info = myReader.nextLine();
        seniors.add(new Senior(info));
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}

