package nl.benno.domain;


public class Shell {
   
   private double length;
   private double height;
   private double width;
   
   private String name;
   
   private String geology;
   
   public double getLength() {
      return length;
   }
   
   public void setLength(double length) {
      this.length = length;
   }
   
   public double getHeight() {
      return height;
   }
   
   public void setHeight(double height) {
      this.height = height;
   }
   
   public double getWidth() {
      return width;
   }
   
   public void setWidth(double width) {
      this.width = width;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   

   @Override
   public String toString() {
      return "Shell [width=" + width + ", name=" + name + ", geology=" + geology + "]";
   }

   public void setGeology(String geology) {
      this.geology = geology;
   }

   public String getGeology() {
       return this.geology;
   }

}
