package nl.benno;

import nl.benno.domain.Shell;

public class App {

   public static void main(String[] args) {
      
      Shell shell = new Shell();
      shell.setName("Cardium gigas");
      shell.setWidth(3.5);
      
      System.out.println(shell);

      
   }
}
