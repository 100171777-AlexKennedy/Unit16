/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator2;

public class Calculator2
{
   private String Name;

   
   public int add(int x, int y) {
       return x + y;
   }
    
 

   
   public int subtract(int x, int y) {
       return x - y;
   }

   
   public int multiply(int x, int y) {
       return x * y;
   }

   
   public int divide(int x, int y) {
       return x / y;
   }

   
   public int modulus(int x, int y) {
       return x % y; 
   }
   

   public void setName(String name)
   {
       this.Name = name;
   }

   public String getName()
   {
       return Name;
   }


}

