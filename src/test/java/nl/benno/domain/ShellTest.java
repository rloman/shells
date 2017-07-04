package nl.benno.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ShellTest {
   
   private Shell shell;
   
   @Before
   public void setUp() {
      
      this.shell = new Shell();
      
   }
   
   
   @Test
   public void testSetName() {
      
      this.shell.setName("Cardium gigas");
      
      String name = shell.getName();
      
      Assert.assertEquals("Cardium gigas", name);
      
   }
   
   @Test
   public void testSetWidth() {
      this.shell.setWidth(3.5);
      
      Assert.assertTrue(3.5 == shell.getWidth());
   }

}
