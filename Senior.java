import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senior
{
    private String nombre;

    public Senior(String initNombre)
    {
        nombre = initNombre;
    }

    public void Graduates()
    {
        try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String info = myReader.nextLine();
        seniors.add(info);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}

