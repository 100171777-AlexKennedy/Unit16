/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator2;

/**
 *
 * @author 100171777
 */
public class Main {
    public static void main(String[] args){
            Calculator2 c1 = new Calculator2();
            Calculator2 c2 = new Calculator2();
            
            c1.setName("Awesomeness");
            c2.setName("Bacon, Egg & Cheese");
            
            System.out.println(c1.getName() + " calculated " + c1.add(3, 4));
            System.out.println(c2.getName() + " calculated " + c2.modulus(29, 5));
     }
}