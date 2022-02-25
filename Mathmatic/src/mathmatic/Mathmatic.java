/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathmatic;

/**
 *
 * @author dell-vitor
 */
public class Mathmatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = (int) Math.sqrt(25);
        System.out.println(a);
        double b = Math.sqrt(81);
        System.out.println(b);
        int x = -54;
        System.out.println(Math.abs(x));
        double salario = 5000;
        if(!(salario<4000)){
            System.out.println("isso");
        }
    }
}
