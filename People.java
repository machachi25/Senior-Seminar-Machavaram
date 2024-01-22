public class People {
   private String name;
   private String email;
   
   public People(String nameOne, String emailOne)
   {
      name = nameOne;
      email = emailOne;
   }
   public void Greet()
   {
      System.out.pritnln("Hello!");
   }
   
   class Student extends People()
   {}

    
}
